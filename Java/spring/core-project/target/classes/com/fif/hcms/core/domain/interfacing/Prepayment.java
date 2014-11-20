package com.fif.hcms.core.domain.interfacing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Prepayment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String invoiceNumber;
	private Integer invoiceSequenceNumber;
	private String supplierCode;
	private String supplierType;
	private String supplierSubType;
	private Date prepaymentDate;
	private String referenceNumber;
	private String prepyamentDescription;
	private String currency;
	private String segment1;
	private String segment2;
	private String segment3;
	private String segment4;
	private String segment5;
	private String segment6;
	private String segment7;
	private String segment8;
	private BigDecimal amountDebet;
	private BigDecimal amountCredit;
	private String createdBy;
	private Date createdDate;
	private String companyCode;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Integer getInvoiceSequenceNumber() {
		return invoiceSequenceNumber;
	}
	public void setInvoiceSequenceNumber(Integer invoiceSequenceNumber) {
		this.invoiceSequenceNumber = invoiceSequenceNumber;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}
	public String getSupplierSubType() {
		return supplierSubType;
	}
	public void setSupplierSubType(String supplierSubType) {
		this.supplierSubType = supplierSubType;
	}
	public Date getPrepaymentDate() {
		return prepaymentDate;
	}
	public void setPrepaymentDate(Date prepaymentDate) {
		this.prepaymentDate = prepaymentDate;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getPrepyamentDescription() {
		return prepyamentDescription;
	}
	public void setPrepyamentDescription(String prepyamentDescription) {
		this.prepyamentDescription = prepyamentDescription;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSegment1() {
		return segment1;
	}
	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}
	public String getSegment2() {
		return segment2;
	}
	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}
	public String getSegment3() {
		return segment3;
	}
	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}
	public String getSegment4() {
		return segment4;
	}
	public void setSegment4(String segment4) {
		this.segment4 = segment4;
	}
	public String getSegment5() {
		return segment5;
	}
	public void setSegment5(String segment5) {
		this.segment5 = segment5;
	}
	public String getSegment6() {
		return segment6;
	}
	public void setSegment6(String segment6) {
		this.segment6 = segment6;
	}
	public String getSegment7() {
		return segment7;
	}
	public void setSegment7(String segment7) {
		this.segment7 = segment7;
	}
	public String getSegment8() {
		return segment8;
	}
	public void setSegment8(String segment8) {
		this.segment8 = segment8;
	}
	public BigDecimal getAmountDebet() {
		return amountDebet;
	}
	public void setAmountDebet(BigDecimal amountDebet) {
		this.amountDebet = amountDebet;
	}
	public BigDecimal getAmountCredit() {
		return amountCredit;
	}
	public void setAmountCredit(BigDecimal amountCredit) {
		this.amountCredit = amountCredit;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	

	
}
