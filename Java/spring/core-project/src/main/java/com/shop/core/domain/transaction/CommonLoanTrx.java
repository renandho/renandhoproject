package com.shop.core.domain.transaction;

public interface CommonLoanTrx extends CommonTrx {

	public Long getLoanType();
	
	public Boolean isAffco();
}
