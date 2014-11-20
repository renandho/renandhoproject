package com.fif.hcms.core.upload;

import java.util.List;

import com.fif.hcms.core.dto.UploadDTO;
import com.fif.hcms.core.dto.UploadErrorDTO;
import com.fif.hcms.core.validation.ValidationException;

public interface UploadService<T> {
	
	void insertHeaderUpload(UploadDTO uploadDTO);
	
	void updateHeaderUpload(UploadDTO uploadDTO);
	
	void insertDetailUpload(T subject, Long uploadId);
	
	void deleteDetailUpload(Long uploadId);
	
	void insertDetailError(UploadErrorDTO subject);
	
	void deleteDetailError(Long uploadId);
	
	void insertHeader(T subject, Long id);
	
	void insertDetail(T subject, Long headerId, Integer versionNumber);
	
	void validate(T subject) throws ValidationException;
	
	Long getIdGenerator(); 
	
	Integer getCountValidRow(String tableName, Long uploadId);
	
	Integer getCountErrorRow(String tableName, Long uploadId);
	
	List<T> findAllByUploadId(Long uploadId);
	
	String getBatchNumber();
	
}
