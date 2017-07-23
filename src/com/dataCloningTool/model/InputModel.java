package com.dataCloningTool.model;

import java.sql.Date;

public class InputModel {

	private String srcDb;
	private String srcUserId;
	private String srcPass;
	private String srcSchema;
	
	private Date copyFromDate;
	private Date copyToDate;
	
	private String destDb;
	private String destUserId;
	private String destPass;
	private String destSchema;
	
	private String customerIds;

	public String getSrcUserId() {
		return srcUserId;
	}

	public void setSrcUserId(String srcUserId) {
		this.srcUserId = srcUserId;
	}

	public String getSrcPass() {
		return srcPass;
	}

	public void setSrcPass(String srcPass) {
		this.srcPass = srcPass;
	}

	public String getSrcSchema() {
		return srcSchema;
	}

	public void setSrcSchema(String srcSchema) {
		this.srcSchema = srcSchema;
	}

	public String getDestUserId() {
		return destUserId;
	}

	public void setDestUserId(String destUserId) {
		this.destUserId = destUserId;
	}

	public String getDestPass() {
		return destPass;
	}

	public void setDestPass(String destPass) {
		this.destPass = destPass;
	}

	public String getDestSchema() {
		return destSchema;
	}

	public void setDestSchema(String destSchema) {
		this.destSchema = destSchema;
	}

	public String getCustomerIds() {
		return customerIds;
	}

	public void setCustomerIds(String customerIds) {
		this.customerIds = customerIds;
	}

	public String getSrcDb() {
		return srcDb;
	}

	public void setSrcDb(String srcDb) {
		this.srcDb = srcDb;
	}

	public String getDestDb() {
		return destDb;
	}

	public void setDestDb(String destDb) {
		this.destDb = destDb;
	}

	public Date getCopyFromDate() {
		return copyFromDate;
	}

	public void setCopyFromDate(Date copyFromDate) {
		this.copyFromDate = copyFromDate;
	}

	public Date getCopyToDate() {
		return copyToDate;
	}

	public void setCopyToDate(Date copyToDate) {
		this.copyToDate = copyToDate;
	}
}
