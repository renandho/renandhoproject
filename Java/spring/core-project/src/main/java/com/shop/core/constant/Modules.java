package com.shop.core.constant;

public enum Modules {
	SAM("System Administration"),
	WOS("Workstructure"),
	PRO("Promotion"),
	TRF("Transfer"),
	TER("Termination"),
	PAY("Payroll"),
	LOA("Loan"),
	MPP("Man Power Planning"),
	TMS("Time Management"),
	LEA("Leave"),
	BEN("Benefit"),
	REC("Recruitment"),
	BTR("Business Trip"),
	BSE("Basic Setup"),
	REP("Reporting"),
	SWF("System Workflow"),
	PEA("Personnel Administration"),
	QUE("Questionnaire"),
	ELR("Eligibility Rule"),
	OTH("Others");
	
	private String value;
	
	private Modules(String value){
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
