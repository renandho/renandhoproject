package com.fif.hcms.core.finder;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fif.hcms.core.constant.UploadErrorStatus;
import com.fif.hcms.core.domain.UploadElement;
import com.fif.hcms.core.domain.UploadError;

public interface UploadErrorFinder {

	public void insert(@Param("tableName") String tableName, @Param("sequenceName") String sequenceName, @Param("uploadError") UploadError uploadError);
	public void deleteByExample(@Param("tableName") String tableName, @Param("criteria") UploadError criteria);
	public void deleteByUploadElements(@Param("tableName") String tableName, @Param("uploadElements") List<UploadElement> uploadElements);
	public List<UploadError> selectByExample(@Param("tableName") String tableName, @Param("criteria") UploadError citeria);
	public int countByExample(@Param("tableName") String tableName, @Param("criteria") UploadError citeria);
	public void updateStatusToClosedUploadErrorByUploadId(@Param("tableName") String tableName, @Param("uploadId") Long uploadId);
	public void deleteUploadErrorByUploadId(@Param("tableName") String tableName, @Param("uploadId") Long uploadId);
	public List<UploadError> getUploadError(@Param("tableNameUploadElement") String tableNameUploadElement, @Param("tableNameUploadError") String tableNameUploadError, @Param("batchNumber") String batchNumber, @Param("status") UploadErrorStatus uploadErrorStatus);
	
}
