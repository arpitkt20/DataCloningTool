package com.dataCloningTool.model;

import java.util.Date;

public class EdiInvoiceHeaderModel {

	public String customerNumber = null;
	public String customerBillGroup = null;
	public String customerDistrict = null;
	public String invoiceNumber = null;
	public Date invoiceDate = null;
	public String invoiceType = null;
	public double invoiceAmt = 0;
	public String custStatus = null;
	public Date CRTD_TMPSTMP = null;
	public Date LSTUPD_TMPSTMP;
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerBillGroup() {
		return customerBillGroup;
	}
	public void setCustomerBillGroup(String customerBillGroup) {
		this.customerBillGroup = customerBillGroup;
	}
	public String getCustomerDistrict() {
		return customerDistrict;
	}
	public void setCustomerDistrict(String customerDistrict) {
		this.customerDistrict = customerDistrict;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public double getInvoiceAmt() {
		return invoiceAmt;
	}
	public void setInvoiceAmt(double invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}
	public String getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	public Date getCRTD_TMPSTMP() {
		return CRTD_TMPSTMP;
	}
	public void setCRTD_TMPSTMP(Date cRTD_TMPSTMP) {
		CRTD_TMPSTMP = cRTD_TMPSTMP;
	}
	public Date getLSTUPD_TMPSTMP() {
		return LSTUPD_TMPSTMP;
	}
	public void setLSTUPD_TMPSTMP(Date lSTUPD_TMPSTMP) {
		LSTUPD_TMPSTMP = lSTUPD_TMPSTMP;
	}
}
