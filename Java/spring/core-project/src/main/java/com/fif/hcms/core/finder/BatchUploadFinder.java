package com.fif.hcms.core.finder;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fif.hcms.core.domain.BatchUpload;

public interface BatchUploadFinder {

	public void insert(@Param("tableName") String tableName, @Param("batchUpload") BatchUpload batchUpload);
	public void updateById(@Param("tableName") String tableName, @Param("batchUpload") BatchUpload batchUpload);
	public List<BatchUpload> selectByExample(@Param("batchUploadTable") String batchUploadTable, @Param("elementTable") String elementTable, @Param("criteria") BatchUpload batchUpload);
	public BatchUpload getBatchUploadByBatchNumber(@Param("tableName") String tableName, @Param("batchNumber") String batchNumber);
	
}
