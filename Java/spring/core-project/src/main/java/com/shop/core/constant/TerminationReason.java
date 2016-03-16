package com.shop.core.constant;

public enum TerminationReason {
	MUTASI_AFFCO_OUT("MUTASI AFFCO OUT"),
	TRANSFER_OUT_WITHIN_GROUP("TRANSFER OUT WITHIN GROUP"),
	PROBATION_FAILED("PROBATION FAILED"),
	INTERNAL_MARIED("INTERNAL MARIED"),
	MENGUNDURKAN_DIRI("MENGUNDURKAN DIRI"),
	TRAINEE_FAILED("TRAINEE FAILED");
	
	private String value;
	
	private TerminationReason(String value){
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
