package com.fif.hcms.core.constant;

public enum StaticParameterKey {
	STATIC_PARAM_BRANCH("Branch"),
	STATIC_BRANCH_NAME("Branch Name"),
	STATIC_ORG_NAME("Organization Name"),
	STATIC_PARAM_ORGANIZATION("Organization"),
	STATIC_PARAM_EMPLOYEE("Employee"),
	
	/*Add BY Rim 14060510275024_Perbaikan Report HCMS Fase 1 - Time Service*/ 
	STATIC_PARAM_EMPLOYEE_COMMON("Employee"),
	STATIC_PARAM_BRANCH_COMMON("Branch"),
	/*End Add By RIM --> 4060510275024_Perbaikan Report HCMS Fase 1 - Time Service */
	
	STATIC_EMPLOYEE_NAME("Employee Name"),
	STATIC_PARAM_WITHOUT_POS("Without POS"),
	STATIC_PERSON_ID("Person Id"),
	STATIC_DATE("Effective On Date"),
	STATIC_TIME("Invoke Time"),
	COMPANY_ID("Company Id"),
	AUTHORIZED_ORGANIZATIONS("Authorized Organizations"),
	ORG_QUERY("In Organizations"),
	SECURITY_PROFILE("Security Profile"),
	USER_ID("User Id"),
	SUBREPORT_DIR("SUBREPORT_DIR"),
	BUSINESS_GROUP_ID("BUSINESS_GROUP_ID"),
	RESOURCES_DIR("RESOURCES_DIR");
	
	private String value;
	
	private StaticParameterKey(String value){
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
