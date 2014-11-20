package com.fif.hcms.core.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.exception.SuperCsvException;
import org.supercsv.io.dozer.CsvDozerBeanReader;
import org.supercsv.io.dozer.ICsvDozerBeanReader;
import org.supercsv.prefs.CsvPreference;
import org.zkoss.util.media.Media;

import com.fif.hcms.core.constant.UploadErrorStatus;
import com.fif.hcms.core.domain.UploadElement;
import com.fif.hcms.core.domain.UploadStage;
import com.fif.hcms.core.dto.UploadElementDTO;
import com.fif.hcms.core.validation.UploadDownloadFileValidator;
import com.fif.hcms.core.validation.ValidationException;

//@Transactional
public abstract class AbstractUploadDownloadServiceCSV<S extends UploadStage> extends AbstractUploadDownloadService<S> {
	
	private Logger logger = LoggerFactory.getLogger(AbstractUploadDownloadServiceCSV.class);
	
	@SuppressWarnings("unchecked")
	private Class<S> stagePersistentClass = (Class<S>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	protected ICsvDozerBeanReader beanReader = null;
	
	protected abstract String[] getFieldMapping(Object... args);
	protected abstract CellProcessor[] getProcessors(Object... args);
	protected abstract List<String> getHeaders(Object... args);
	
	@Override
	public UploadElementDTO process(Media media, boolean isHeader, Object... args) throws Exception {
		UploadDownloadFileValidator uploadDownloadFileValidator = new UploadDownloadFileValidator();
		uploadDownloadFileValidator.setExtension("csv");
		uploadDownloadFileValidator.validate(media);
		
		return process(media.getStreamData(), isHeader, args);
	}
	
	
	public UploadElementDTO process(InputStream inputStream, boolean isHeader, Object... args) throws Exception {
		
		beanReader = new CsvDozerBeanReader(new BufferedReader(new InputStreamReader(inputStream)), CsvPreference.STANDARD_PREFERENCE);

		initBeforeProcessData(args);
		
		if(isHeader) {
			String[] headers = beanReader.getHeader(true);
			List<String> headersTemplate = getHeaders(args);
			if(headersTemplate != null && !headersTemplate.isEmpty()) {
				for(int i=0; i<headers.length; i++) {
					if(!headers[i].equals(headersTemplate.get(i))) {
						Map<String, String> errors = new HashMap<String, String>();
						errors.put(UploadDownloadFileValidator.HEADER_TEMPLATE, "Template is invalid.");
						throw new ValidationException(errors);
					}
				}
			}
			if(headers.length != getProcessors(args).length) {
				Map<String, String> errors = new HashMap<String, String>();
				errors.put(UploadDownloadFileValidator.NUMBER_OF_COLUMN, "Number Of Column Not Valid.");
				throw new ValidationException(errors);
			}
		}
		
		String batchNumber = insertBatchUpload(args);
		Long uploadId = insertUploadElement(batchNumber);
		beanReader.configureBeanMapping(stagePersistentClass, getFieldMapping(args));
		
		S stageObject = null;
		
		boolean isRead = true;
		while(isRead) {
			try {
				while((stageObject = beanReader.read(stagePersistentClass, getProcessors(args))) != null) {
					stageObject.setUploadId(uploadId);
					try {
						stageObject.setRowNumber(beanReader.getRowNumber());
						stageObject.setRawData(beanReader.getUntokenizedRow());
						stageObject.setIsClosed(false);
						stageObject.setCreatedBy(null);
						stageObject.setCreationDate(new Date());
						stageObject.setLastUpdatedBy(null);
						stageObject.setLastUpdateDate(new Date());
						validate(stageObject, args);
						insertStageUpload(stageObject);
					} catch (ValidationException e) {
						logger.error(e.getMessage());
						setErrorDomain(uploadId, beanReader.getUntokenizedRow(), e.getMessage(), beanReader.getRowNumber(), UploadErrorStatus.PROCESS);
					} catch (Exception e) {
						logger.error(e.getMessage(), e);
						setErrorDomain(uploadId, beanReader.getUntokenizedRow(), e.getMessage(), beanReader.getRowNumber(), UploadErrorStatus.PROCESS);
					}
				}
				isRead = false;
			} catch (SuperCsvException e) {
				logger.error(e.getMessage(), e);
				setErrorDomain(uploadId, beanReader.getUntokenizedRow(), e.getMessage(), beanReader.getRowNumber(), UploadErrorStatus.PROCESS);
			}
		}
		insertSuccessRowAndFailedRow(batchNumber, uploadId);
		UploadElement uploadElement = getUploadElementByUploadId(uploadId);
		postUpload(uploadElement, args);
		return getUploadElementDto(uploadId);
	}
	
}
