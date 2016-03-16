package com.shop.core.domain.transaction;

public interface CommonPromotionTrx extends CommonTrx {

	public Long getIcpStatus();
	public String getAssignmentStatus();
	public Boolean getCanBeActing();
}
