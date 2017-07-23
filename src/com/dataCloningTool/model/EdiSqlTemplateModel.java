package com.dataCloningTool.model;

public class EdiSqlTemplateModel {

	public int templateId = 0;
	public double templateVersion = 0;
	public String tenokateFormat = null;
	public String templateSql = null;
	public String templateComment = null;
	public String templateStatus = null;
	public double createdDate = 0;
	public double changedDate = 0;
	public String createdBy = null;
	public String changedBy = null;
	public double templateEffectiveDate = 0;
	public String customHeader = null;
	public String invoiceType = null;
	public String templateType = null;
	public String scfTemplateId = null;
	public String unformattedTemplateSql = null;
	
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	public double getTemplateVersion() {
		return templateVersion;
	}
	public void setTemplateVersion(double templateVersion) {
		this.templateVersion = templateVersion;
	}
	public String getTenokateFormat() {
		return tenokateFormat;
	}
	public void setTenokateFormat(String tenokateFormat) {
		this.tenokateFormat = tenokateFormat;
	}
	public String getTemplateSql() {
		return templateSql;
	}
	public void setTemplateSql(String templateSql) {
		this.templateSql = templateSql;
	}
	public String getTemplateComment() {
		return templateComment;
	}
	public void setTemplateComment(String templateComment) {
		this.templateComment = templateComment;
	}
	public String getTemplateStatus() {
		return templateStatus;
	}
	public void setTemplateStatus(String templateStatus) {
		this.templateStatus = templateStatus;
	}
	public double getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(double createdDate) {
		this.createdDate = createdDate;
	}
	public double getChangedDate() {
		return changedDate;
	}
	public void setChangedDate(double changedDate) {
		this.changedDate = changedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}
	public double getTemplateEffectiveDate() {
		return templateEffectiveDate;
	}
	public void setTemplateEffectiveDate(double templateEffectiveDate) {
		this.templateEffectiveDate = templateEffectiveDate;
	}
	public String getCustomHeader() {
		return customHeader;
	}
	public void setCustomHeader(String customHeader) {
		this.customHeader = customHeader;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getScfTemplateId() {
		return scfTemplateId;
	}
	public void setScfTemplateId(String scfTemplateId) {
		this.scfTemplateId = scfTemplateId;
	}
	public String getUnformattedTemplateSql() {
		return unformattedTemplateSql;
	}
	public void setUnformattedTemplateSql(String unformattedTemplateSql) {
		this.unformattedTemplateSql = unformattedTemplateSql;
	}
}
