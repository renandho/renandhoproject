package com.fif.hcms.core.domain;

import java.io.Serializable;

public class Supplier implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.ADDRESS
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.CITY
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.PHONE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.FAX
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String fax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexBankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexBankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCNO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexAccno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCONAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexAcconame;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_TYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String isSuplOpexType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_BRANCH_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private Long suplOpexBranchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_SUBTYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexSubtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplOpexBank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_OPEX_VENDOR_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private Long suplOpexVendorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_ENABLED_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String isSuplEnabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_ACCT_ACTIVE_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String isSuplAcctActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_CURRENCY_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String suplCurrencyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.SUPL_PRIMARY_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String isSuplPrimary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.NPWP_NO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private String npwpNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MST_SUPPLIERS_V.ORG_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private Long orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MST_SUPPLIERS_V
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_CODE
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexCode() {
        return suplOpexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_CODE
     *
     * @param suplOpexCode the value for MST_SUPPLIERS_V.SUPL_OPEX_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexCode(String suplOpexCode) {
        this.suplOpexCode = suplOpexCode == null ? null : suplOpexCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_NAME
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexName() {
        return suplOpexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_NAME
     *
     * @param suplOpexName the value for MST_SUPPLIERS_V.SUPL_OPEX_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexName(String suplOpexName) {
        this.suplOpexName = suplOpexName == null ? null : suplOpexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.ADDRESS
     *
     * @return the value of MST_SUPPLIERS_V.ADDRESS
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.ADDRESS
     *
     * @param address the value for MST_SUPPLIERS_V.ADDRESS
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.CITY
     *
     * @return the value of MST_SUPPLIERS_V.CITY
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.CITY
     *
     * @param city the value for MST_SUPPLIERS_V.CITY
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.PHONE
     *
     * @return the value of MST_SUPPLIERS_V.PHONE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.PHONE
     *
     * @param phone the value for MST_SUPPLIERS_V.PHONE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.FAX
     *
     * @return the value of MST_SUPPLIERS_V.FAX
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.FAX
     *
     * @param fax the value for MST_SUPPLIERS_V.FAX
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_CODE
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_BANK_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexBankCode() {
        return suplOpexBankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_CODE
     *
     * @param suplOpexBankCode the value for MST_SUPPLIERS_V.SUPL_OPEX_BANK_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexBankCode(String suplOpexBankCode) {
        this.suplOpexBankCode = suplOpexBankCode == null ? null : suplOpexBankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_NAME
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_BANK_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexBankName() {
        return suplOpexBankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK_NAME
     *
     * @param suplOpexBankName the value for MST_SUPPLIERS_V.SUPL_OPEX_BANK_NAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexBankName(String suplOpexBankName) {
        this.suplOpexBankName = suplOpexBankName == null ? null : suplOpexBankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCNO
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_ACCNO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexAccno() {
        return suplOpexAccno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCNO
     *
     * @param suplOpexAccno the value for MST_SUPPLIERS_V.SUPL_OPEX_ACCNO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexAccno(String suplOpexAccno) {
        this.suplOpexAccno = suplOpexAccno == null ? null : suplOpexAccno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCONAME
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_ACCONAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexAcconame() {
        return suplOpexAcconame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_ACCONAME
     *
     * @param suplOpexAcconame the value for MST_SUPPLIERS_V.SUPL_OPEX_ACCONAME
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexAcconame(String suplOpexAcconame) {
        this.suplOpexAcconame = suplOpexAcconame == null ? null : suplOpexAcconame.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_TYPE
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_TYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getIsSuplOpexType() {
        return isSuplOpexType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_TYPE
     *
     * @param isSuplOpexType the value for MST_SUPPLIERS_V.SUPL_OPEX_TYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setIsSuplOpexType(String isSuplOpexType) {
        this.isSuplOpexType = isSuplOpexType == null ? null : isSuplOpexType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BRANCH_ID
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_BRANCH_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public Long getSuplOpexBranchId() {
        return suplOpexBranchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BRANCH_ID
     *
     * @param suplOpexBranchId the value for MST_SUPPLIERS_V.SUPL_OPEX_BRANCH_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexBranchId(Long suplOpexBranchId) {
        this.suplOpexBranchId = suplOpexBranchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_SUBTYPE
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_SUBTYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexSubtype() {
        return suplOpexSubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_SUBTYPE
     *
     * @param suplOpexSubtype the value for MST_SUPPLIERS_V.SUPL_OPEX_SUBTYPE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexSubtype(String suplOpexSubtype) {
        this.suplOpexSubtype = suplOpexSubtype == null ? null : suplOpexSubtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_BANK
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplOpexBank() {
        return suplOpexBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_BANK
     *
     * @param suplOpexBank the value for MST_SUPPLIERS_V.SUPL_OPEX_BANK
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexBank(String suplOpexBank) {
        this.suplOpexBank = suplOpexBank == null ? null : suplOpexBank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_VENDOR_ID
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_OPEX_VENDOR_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public Long getSuplOpexVendorId() {
        return suplOpexVendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_OPEX_VENDOR_ID
     *
     * @param suplOpexVendorId the value for MST_SUPPLIERS_V.SUPL_OPEX_VENDOR_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplOpexVendorId(Long suplOpexVendorId) {
        this.suplOpexVendorId = suplOpexVendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_ENABLED_FLAG
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_ENABLED_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getIsSuplEnabled() {
        return isSuplEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_ENABLED_FLAG
     *
     * @param isSuplEnabled the value for MST_SUPPLIERS_V.SUPL_ENABLED_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setIsSuplEnabled(String isSuplEnabled) {
        this.isSuplEnabled = isSuplEnabled == null ? null : isSuplEnabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_ACCT_ACTIVE_FLAG
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_ACCT_ACTIVE_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getIsSuplAcctActive() {
        return isSuplAcctActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_ACCT_ACTIVE_FLAG
     *
     * @param isSuplAcctActive the value for MST_SUPPLIERS_V.SUPL_ACCT_ACTIVE_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setIsSuplAcctActive(String isSuplAcctActive) {
        this.isSuplAcctActive = isSuplAcctActive == null ? null : isSuplAcctActive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_CURRENCY_CODE
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_CURRENCY_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getSuplCurrencyCode() {
        return suplCurrencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_CURRENCY_CODE
     *
     * @param suplCurrencyCode the value for MST_SUPPLIERS_V.SUPL_CURRENCY_CODE
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setSuplCurrencyCode(String suplCurrencyCode) {
        this.suplCurrencyCode = suplCurrencyCode == null ? null : suplCurrencyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.SUPL_PRIMARY_FLAG
     *
     * @return the value of MST_SUPPLIERS_V.SUPL_PRIMARY_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getIsSuplPrimary() {
        return isSuplPrimary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.SUPL_PRIMARY_FLAG
     *
     * @param isSuplPrimary the value for MST_SUPPLIERS_V.SUPL_PRIMARY_FLAG
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setIsSuplPrimary(String isSuplPrimary) {
        this.isSuplPrimary = isSuplPrimary == null ? null : isSuplPrimary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.NPWP_NO
     *
     * @return the value of MST_SUPPLIERS_V.NPWP_NO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public String getNpwpNo() {
        return npwpNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.NPWP_NO
     *
     * @param npwpNo the value for MST_SUPPLIERS_V.NPWP_NO
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setNpwpNo(String npwpNo) {
        this.npwpNo = npwpNo == null ? null : npwpNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MST_SUPPLIERS_V.ORG_ID
     *
     * @return the value of MST_SUPPLIERS_V.ORG_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MST_SUPPLIERS_V.ORG_ID
     *
     * @param orgId the value for MST_SUPPLIERS_V.ORG_ID
     *
     * @mbggenerated Fri Jun 07 10:20:59 ICT 2013
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}