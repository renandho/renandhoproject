package com.shop.core.service;

import java.io.InputStream;
import java.util.List;

import org.zkoss.util.media.Media;

import com.shop.core.constant.UploadErrorStatus;
import com.shop.core.domain.BatchUpload;
import com.shop.core.domain.UploadError;
import com.shop.core.domain.UploadStage;
import com.shop.core.dto.UploadElementDTO;

public interface UploadDownloadService<S extends UploadStage> {

	public void downloadTemplate(Object... args) throws Exception;
	public UploadElementDTO process(Media media, boolean isHeader, Object... args) throws Exception;
	public UploadElementDTO process(InputStream inputStream, boolean isHeader, Object... args) throws Exception;
	public void cancelBatch(BatchUpload batchUpload);
	public void closeBatch(BatchUpload batchUpload);
	public void downloadFailedRecords(Long uploadId);
	public List<UploadError> getFailedRows(Long uploadId);
	public List<BatchUpload> findBatchUploadByExample(BatchUpload batchUpload);
	public List<UploadElementDTO> findUploadElementByExample(UploadElementDTO uploadElementDto);
	public BatchUpload getOpenStatusObject(Object... args);
	public List<UploadError> getUploadError(String batchNumber, UploadErrorStatus uploadErrorStatus);
	public void downloadFailedRecords(String batchNumber, UploadErrorStatus uploadErrorStatus);
	
	
	
}
