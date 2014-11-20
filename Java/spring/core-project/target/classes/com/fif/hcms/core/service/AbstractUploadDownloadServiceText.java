package com.fif.hcms.core.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.zkoss.util.media.Media;

import com.fif.hcms.core.constant.UploadErrorStatus;
import com.fif.hcms.core.domain.UploadElement;
import com.fif.hcms.core.domain.UploadStage;
import com.fif.hcms.core.dto.UploadElementDTO;
import com.fif.hcms.core.validation.UploadDownloadFileValidator;
import com.fif.hcms.core.validation.ValidationException;

@Transactional
public abstract class AbstractUploadDownloadServiceText<S extends UploadStage> extends AbstractUploadDownloadService<S> {

	private Logger logger = LoggerFactory.getLogger(AbstractUploadDownloadServiceText.class);
	
	protected abstract void headerInformation(String headerData) throws Exception;
	protected abstract S convertToStageObject(String line) throws Exception;
	
	@Transactional
	@Override
	public UploadElementDTO process(Media media, boolean isHeader, Object... args) throws Exception {
		UploadDownloadFileValidator uploadDownloadFileValidator = new UploadDownloadFileValidator();
		uploadDownloadFileValidator.setExtension("txt");
		uploadDownloadFileValidator.validate(media);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(media.getStreamData()));
		String line = br.readLine();
		int rowNumber = 1;
		if(isHeader) {
			headerInformation(line);
			line = br.readLine();
			rowNumber++;
		}
		
		initBeforeProcessData(args);
		String batchNumber = insertBatchUpload(args);
		Long uploadId = insertUploadElement(batchNumber);
		
		S stageObject = null;
		
		while(line != null) {
			try {
				stageObject = convertToStageObject(line);
				stageObject.setRowNumber(rowNumber);
				stageObject.setRawData(line);
				stageObject.setIsClosed(false);
				stageObject.setUploadId(uploadId);
				stageObject.setCreatedBy(null);
				stageObject.setCreationDate(new Date());
				stageObject.setLastUpdatedBy(null);
				stageObject.setLastUpdateDate(new Date());
				validate(stageObject);
				insertStageUpload(stageObject);
			} catch (ValidationException e) {
				logger.error(e.getMessage());
				setErrorDomain(uploadId, line, e.getMessage(), rowNumber, UploadErrorStatus.PROCESS);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				setErrorDomain(uploadId, line, e.getMessage(), rowNumber, UploadErrorStatus.PROCESS);
			}
			line = br.readLine();
			rowNumber++;
		}
		insertSuccessRowAndFailedRow(batchNumber, uploadId);
		UploadElement uploadElement = getUploadElementByUploadId(uploadId);
		postUpload(uploadElement);
		return getUploadElementDto(uploadId);
	}
	
}
