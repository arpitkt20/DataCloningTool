package com.dataCloningTool.model;

import java.sql.Date;
import java.sql.Timestamp;

public class EdiMaintenanceModel {

	public String customerCorp;
	public String customerDistrict;
	public String customerNumber;
	public String groupSeprator;
	public String unitNumber;
	public String customerUnitNumber;
	public String activityType;
	public String roNumber;
	public Date roDate;
	public String componentCode;
	public String description;
	public String billingComments;
	public String roSubLoc;
	public String serviceLocName;
	public Date periodEndDate;	
	public double mileagePegCharge;
	public double fixedPegCharge;
	public double markupParts;
	public double markupVendor;
	public double epaAmt;
	public double garageSuppAmt;
	public String poNumber;
	public String snetWoNo;
	public double snetJobidNo;
	public double roMileage;
	public String glAcct;
	public String glSubAcct;
	public double laborHours;
	public String invNum;
	public Date dueDt;
	public double xTxnAmt;
	public Date invoiceDate;
	public Date inServiceDate;
	public Date billingStartDate;
	public Date billingEndDate;
	public Date cancellationDate;
	public double stateTaxTate;
	public double countryTaxTate;
	public double cityTaxTate;
	public String stateAbbreviation;
	public String customerPrime;
	public String billGroup;
	public String roDistrict;
	public String districtName;
	public String billToCompanyName;
	public String billToAddress2;
	public String billDist;
	public String billToAddress1;
	public String billToCity;
	public String billToState;
	public String billToZip;
	public String billToAttention;
	public double partsCharges;
	public double laborCharges;
	public double ousideVendorCharges;
	public double pegCharges;
	public double misCharges;
	public double fixedCharges;
	public double taxCharges;
	public String roExistsFlag;
	public String pegExistsFlag;
	public String mscExistsFlag;
	public double stateCode;
	public double taxCode;
	public double stateSalesTax;
	public double countySalesTax;
	public double citySalesTax;
	public String exceededLimit;
	public String miscellaneousDesc;
	public double miscellaneousAmt;
	public double stateUseTax;
	public double countryUseTax;
	public double cityUseTax;
	public String adminNumber;
	public String serviceLocPhone;
	public String billLoc;
	public String customerCrossRef;
	public Timestamp dataLoadDate;
	public String complaint;
	public String cause;
	public String correction;
	public String partsNumber;
	public String partsDesc;
	public double partsUnitPrice;
	public double partsQuantity;
	public String partsUnitCurrencyCode;
	public double partsTotalCharge;
	public String partsTotalCurrencyCode;
	public double roCenturyDate;
	public double periodEndCenturyDate;
	public double totalPegToApply;
	public double laborCharge;
	public double otherCharges;
	public double salesTaxAmt;
	public double totalCharges;
	public double invoiceDueDateCentury;
	public double invoiceDateCentury;
	public double inServiceDateCentury;
	public double billingStartDateCentury;
	public double billingEndDateCentury;
	public double cancellationDateCentury;	
	public String oilQty;
	public String roadCall;
	public String adjustmentReference;
	public String statementNumber;
	public String consToCustDist;
	public String pegInvoiceNumber;
	public String vehicleModel;
	public String vehicleManufacturer;
	public double vehicleModelYear;
	public String vehicleSize;
	public String unitDesc;
	public String vin;
	public String actCodeDesc;
	public String vendorName;
	public String city;
	public String state;
	public String vendorPhone;
	public String accident;
	public String sysCd;
	public String assyCd;
	public String partCd;
	public String actionCd;
	public String warrantyRebill;
	public double sActlTime;
	public String profileId;
	public String profileName;
	public String jobDesc;
	public String jobNotes;
	public String curWorkLoc;
	public Timestamp woStart;
	public Timestamp woCreated;
	public Timestamp arrival;
	public Timestamp promised;
	public String scheduled;
	public double quantity;
	public String partNumber;
	public double oilQuantity;
	public double mileage;
	public String microControlNum;
	public String doPtlInterCo;
	public double markupLabour;
	public double markupHourlyLabour;
	public double transxnType;
	public String subType;
	public String customData4;
	public Timestamp workOrderCompleteTime;
	public String lineDesc;
	public double untTaxCh;
	public String docSourceCode;
	public double roSeq;
	public String roJobWorkAccCode;
	public Timestamp roJobStartDate;
	public double roJobOldWorkCode;
	public String roJobRepairPriorityClass;
	public String roJobRepairReasonCode;
	public String roJobDoNotBill;
	public String invoiceTaxCode1;
	public String invoiceTaxCode2;
	public String invoiceaxCode3;
	public String invoiceTaxCode4;
	public String invoiceTaxCode5;
	public String invoiceTaxCode6;
	public double invoiceTaxAmt1;
	public double invoiceTaxAmt2;
	public double invoiceTaxAmt3;
	public double invoiceTaxAmt4;
	public double invoiceTaxAmt5;
	public double invoiceTaxAmt6;
	public double laborOr;
	public String costTaxYn;
	public String partsTaxYn;
	public String warrantyVlaimNo;
	public String areaNumber;
	public String regionNumber;
	public double grossVehicleWeight;
	public String vehicleLicenseNumber;
	public String foreignUnit;
	public String documentType;
	public String vehicleCategory;
	public String vehicleDesc;
	public String leaseType;
	public String vehicleUse;
	public int suppMaintenanceId;
	public String dbmFlag;
	public double vendorId;
	public String outsideChargeCode;
	public String in_or_out;
	
	
	public String getCustomerCorp() {
		return customerCorp;
	}
	public void setCustomerCorp(String customerCorp) {
		this.customerCorp = customerCorp;
	}
	public String getCustomerDistrict() {
		return customerDistrict;
	}
	public void setCustomerDistrict(String customerDistrict) {
		this.customerDistrict = customerDistrict;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getGroupSeprator() {
		return groupSeprator;
	}
	public void setGroupSeprator(String groupSeprator) {
		this.groupSeprator = groupSeprator;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getCustomerUnitNumber() {
		return customerUnitNumber;
	}
	public void setCustomerUnitNumber(String customerUnitNumber) {
		this.customerUnitNumber = customerUnitNumber;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getRoNumber() {
		return roNumber;
	}
	public void setRoNumber(String roNumber) {
		this.roNumber = roNumber;
	}
	public Date getRoDate() {
		return roDate;
	}
	public void setRoDate(Date roDate) {
		this.roDate = roDate;
	}
	public String getComponentCode() {
		return componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBillingComments() {
		return billingComments;
	}
	public void setBillingComments(String billingComments) {
		this.billingComments = billingComments;
	}
	public String getRoSubLoc() {
		return roSubLoc;
	}
	public void setRoSubLoc(String roSubLoc) {
		this.roSubLoc = roSubLoc;
	}
	public String getServiceLocName() {
		return serviceLocName;
	}
	public void setServiceLocName(String serviceLocName) {
		this.serviceLocName = serviceLocName;
	}
	public Date getPeriodEndDate() {
		return periodEndDate;
	}
	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}
	public double getMileagePegCharge() {
		return mileagePegCharge;
	}
	public void setMileagePegCharge(double mileagePegCharge) {
		this.mileagePegCharge = mileagePegCharge;
	}
	public double getFixedPegCharge() {
		return fixedPegCharge;
	}
	public void setFixedPegCharge(double fixedPegCharge) {
		this.fixedPegCharge = fixedPegCharge;
	}
	public double getMarkupParts() {
		return markupParts;
	}
	public void setMarkupParts(double markupParts) {
		this.markupParts = markupParts;
	}
	public double getMarkupVendor() {
		return markupVendor;
	}
	public void setMarkupVendor(double markupVendor) {
		this.markupVendor = markupVendor;
	}
	public double getEpaAmt() {
		return epaAmt;
	}
	public void setEpaAmt(double epaAmt) {
		this.epaAmt = epaAmt;
	}
	public double getGarageSuppAmt() {
		return garageSuppAmt;
	}
	public void setGarageSuppAmt(double garageSuppAmt) {
		this.garageSuppAmt = garageSuppAmt;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getSnetWoNo() {
		return snetWoNo;
	}
	public void setSnetWoNo(String snetWoNo) {
		this.snetWoNo = snetWoNo;
	}
	public double getSnetJobidNo() {
		return snetJobidNo;
	}
	public void setSnetJobidNo(double snetJobidNo) {
		this.snetJobidNo = snetJobidNo;
	}
	public double getRoMileage() {
		return roMileage;
	}
	public void setRoMileage(double roMileage) {
		this.roMileage = roMileage;
	}
	public String getGlAcct() {
		return glAcct;
	}
	public void setGlAcct(String glAcct) {
		this.glAcct = glAcct;
	}
	public String getGlSubAcct() {
		return glSubAcct;
	}
	public void setGlSubAcct(String glSubAcct) {
		this.glSubAcct = glSubAcct;
	}
	public double getLaborHours() {
		return laborHours;
	}
	public void setLaborHours(double laborHours) {
		this.laborHours = laborHours;
	}
	public String getInvNum() {
		return invNum;
	}
	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}
	public Date getDueDt() {
		return dueDt;
	}
	public void setDueDt(Date dueDt) {
		this.dueDt = dueDt;
	}
	public double getxTxnAmt() {
		return xTxnAmt;
	}
	public void setxTxnAmt(double xTxnAmt) {
		this.xTxnAmt = xTxnAmt;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Date getInServiceDate() {
		return inServiceDate;
	}
	public void setInServiceDate(Date inServiceDate) {
		this.inServiceDate = inServiceDate;
	}
	public Date getBillingStartDate() {
		return billingStartDate;
	}
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	public Date getBillingEndDate() {
		return billingEndDate;
	}
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	public Date getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	public double getStateTaxTate() {
		return stateTaxTate;
	}
	public void setStateTaxTate(double stateTaxTate) {
		this.stateTaxTate = stateTaxTate;
	}
	public double getCountryTaxTate() {
		return countryTaxTate;
	}
	public void setCountryTaxTate(double countryTaxTate) {
		this.countryTaxTate = countryTaxTate;
	}
	public double getCityTaxTate() {
		return cityTaxTate;
	}
	public void setCityTaxTate(double cityTaxTate) {
		this.cityTaxTate = cityTaxTate;
	}
	public String getStateAbbreviation() {
		return stateAbbreviation;
	}
	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}
	public String getCustomerPrime() {
		return customerPrime;
	}
	public void setCustomerPrime(String customerPrime) {
		this.customerPrime = customerPrime;
	}
	public String getBillGroup() {
		return billGroup;
	}
	public void setBillGroup(String billGroup) {
		this.billGroup = billGroup;
	}
	public String getRoDistrict() {
		return roDistrict;
	}
	public void setRoDistrict(String roDistrict) {
		this.roDistrict = roDistrict;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getBillToCompanyName() {
		return billToCompanyName;
	}
	public void setBillToCompanyName(String billToCompanyName) {
		this.billToCompanyName = billToCompanyName;
	}
	public String getBillToAddress2() {
		return billToAddress2;
	}
	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}
	public String getBillDist() {
		return billDist;
	}
	public void setBillDist(String billDist) {
		this.billDist = billDist;
	}
	public String getBillToAddress1() {
		return billToAddress1;
	}
	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}
	public String getBillToCity() {
		return billToCity;
	}
	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}
	public String getBillToState() {
		return billToState;
	}
	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}
	public String getBillToZip() {
		return billToZip;
	}
	public void setBillToZip(String billToZip) {
		this.billToZip = billToZip;
	}
	public String getBillToAttention() {
		return billToAttention;
	}
	public void setBillToAttention(String billToAttention) {
		this.billToAttention = billToAttention;
	}
	public double getPartsCharges() {
		return partsCharges;
	}
	public void setPartsCharges(double partsCharges) {
		this.partsCharges = partsCharges;
	}
	public double getLaborCharges() {
		return laborCharges;
	}
	public void setLaborCharges(double laborCharges) {
		this.laborCharges = laborCharges;
	}
	public double getOusideVendorCharges() {
		return ousideVendorCharges;
	}
	public void setOusideVendorCharges(double ousideVendorCharges) {
		this.ousideVendorCharges = ousideVendorCharges;
	}
	public double getPegCharges() {
		return pegCharges;
	}
	public void setPegCharges(double pegCharges) {
		this.pegCharges = pegCharges;
	}
	public double getMisCharges() {
		return misCharges;
	}
	public void setMisCharges(double misCharges) {
		this.misCharges = misCharges;
	}
	public double getFixedCharges() {
		return fixedCharges;
	}
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	public double getTaxCharges() {
		return taxCharges;
	}
	public void setTaxCharges(double taxCharges) {
		this.taxCharges = taxCharges;
	}
	public String getRoExistsFlag() {
		return roExistsFlag;
	}
	public void setRoExistsFlag(String roExistsFlag) {
		this.roExistsFlag = roExistsFlag;
	}
	public String getPegExistsFlag() {
		return pegExistsFlag;
	}
	public void setPegExistsFlag(String pegExistsFlag) {
		this.pegExistsFlag = pegExistsFlag;
	}
	public String getMscExistsFlag() {
		return mscExistsFlag;
	}
	public void setMscExistsFlag(String mscExistsFlag) {
		this.mscExistsFlag = mscExistsFlag;
	}
	public double getStateCode() {
		return stateCode;
	}
	public void setStateCode(double stateCode) {
		this.stateCode = stateCode;
	}
	public double getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(double taxCode) {
		this.taxCode = taxCode;
	}
	public double getStateSalesTax() {
		return stateSalesTax;
	}
	public void setStateSalesTax(double stateSalesTax) {
		this.stateSalesTax = stateSalesTax;
	}
	public double getCountySalesTax() {
		return countySalesTax;
	}
	public void setCountySalesTax(double countySalesTax) {
		this.countySalesTax = countySalesTax;
	}
	public double getCitySalesTax() {
		return citySalesTax;
	}
	public void setCitySalesTax(double citySalesTax) {
		this.citySalesTax = citySalesTax;
	}
	public String getExceededLimit() {
		return exceededLimit;
	}
	public void setExceededLimit(String exceededLimit) {
		this.exceededLimit = exceededLimit;
	}
	public String getMiscellaneousDesc() {
		return miscellaneousDesc;
	}
	public void setMiscellaneousDesc(String miscellaneousDesc) {
		this.miscellaneousDesc = miscellaneousDesc;
	}
	public double getMiscellaneousAmt() {
		return miscellaneousAmt;
	}
	public void setMiscellaneousAmt(double miscellaneousAmt) {
		this.miscellaneousAmt = miscellaneousAmt;
	}
	public double getStateUseTax() {
		return stateUseTax;
	}
	public void setStateUseTax(double stateUseTax) {
		this.stateUseTax = stateUseTax;
	}
	public double getCountryUseTax() {
		return countryUseTax;
	}
	public void setCountryUseTax(double countryUseTax) {
		this.countryUseTax = countryUseTax;
	}
	public double getCityUseTax() {
		return cityUseTax;
	}
	public void setCityUseTax(double cityUseTax) {
		this.cityUseTax = cityUseTax;
	}
	public String getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getServiceLocPhone() {
		return serviceLocPhone;
	}
	public void setServiceLocPhone(String serviceLocPhone) {
		this.serviceLocPhone = serviceLocPhone;
	}
	public String getBillLoc() {
		return billLoc;
	}
	public void setBillLoc(String billLoc) {
		this.billLoc = billLoc;
	}
	public String getCustomerCrossRef() {
		return customerCrossRef;
	}
	public void setCustomerCrossRef(String customerCrossRef) {
		this.customerCrossRef = customerCrossRef;
	}
	public Timestamp getDataLoadDate() {
		return dataLoadDate;
	}
	public void setDataLoadDate(Timestamp dataLoadDate) {
		this.dataLoadDate = dataLoadDate;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getCorrection() {
		return correction;
	}
	public void setCorrection(String correction) {
		this.correction = correction;
	}
	public String getPartsNumber() {
		return partsNumber;
	}
	public void setPartsNumber(String partsNumber) {
		this.partsNumber = partsNumber;
	}
	public String getPartsDesc() {
		return partsDesc;
	}
	public void setPartsDesc(String partsDesc) {
		this.partsDesc = partsDesc;
	}
	public double getPartsUnitPrice() {
		return partsUnitPrice;
	}
	public void setPartsUnitPrice(double partsUnitPrice) {
		this.partsUnitPrice = partsUnitPrice;
	}
	public double getPartsQuantity() {
		return partsQuantity;
	}
	public void setPartsQuantity(double partsQuantity) {
		this.partsQuantity = partsQuantity;
	}
	public String getPartsUnitCurrencyCode() {
		return partsUnitCurrencyCode;
	}
	public void setPartsUnitCurrencyCode(String partsUnitCurrencyCode) {
		this.partsUnitCurrencyCode = partsUnitCurrencyCode;
	}
	public double getPartsTotalCharge() {
		return partsTotalCharge;
	}
	public void setPartsTotalCharge(double partsTotalCharge) {
		this.partsTotalCharge = partsTotalCharge;
	}
	public String getPartsTotalCurrencyCode() {
		return partsTotalCurrencyCode;
	}
	public void setPartsTotalCurrencyCode(String partsTotalCurrencyCode) {
		this.partsTotalCurrencyCode = partsTotalCurrencyCode;
	}
	public double getRoCenturyDate() {
		return roCenturyDate;
	}
	public void setRoCenturyDate(double roCenturyDate) {
		this.roCenturyDate = roCenturyDate;
	}
	public double getPeriodEndCenturyDate() {
		return periodEndCenturyDate;
	}
	public void setPeriodEndCenturyDate(double periodEndCenturyDate) {
		this.periodEndCenturyDate = periodEndCenturyDate;
	}
	public double getTotalPegToApply() {
		return totalPegToApply;
	}
	public void setTotalPegToApply(double totalPegToApply) {
		this.totalPegToApply = totalPegToApply;
	}
	public double getLaborCharge() {
		return laborCharge;
	}
	public void setLaborCharge(double laborCharge) {
		this.laborCharge = laborCharge;
	}
	public double getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
	}
	public double getSalesTaxAmt() {
		return salesTaxAmt;
	}
	public void setSalesTaxAmt(double salesTaxAmt) {
		this.salesTaxAmt = salesTaxAmt;
	}
	public double getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(double totalCharges) {
		this.totalCharges = totalCharges;
	}
	public double getInvoiceDueDateCentury() {
		return invoiceDueDateCentury;
	}
	public void setInvoiceDueDateCentury(double invoiceDueDateCentury) {
		this.invoiceDueDateCentury = invoiceDueDateCentury;
	}
	public double getInvoiceDateCentury() {
		return invoiceDateCentury;
	}
	public void setInvoiceDateCentury(double invoiceDateCentury) {
		this.invoiceDateCentury = invoiceDateCentury;
	}
	public double getInServiceDateCentury() {
		return inServiceDateCentury;
	}
	public void setInServiceDateCentury(double inServiceDateCentury) {
		this.inServiceDateCentury = inServiceDateCentury;
	}
	public double getBillingStartDateCentury() {
		return billingStartDateCentury;
	}
	public void setBillingStartDateCentury(double billingStartDateCentury) {
		this.billingStartDateCentury = billingStartDateCentury;
	}
	public double getBillingEndDateCentury() {
		return billingEndDateCentury;
	}
	public void setBillingEndDateCentury(double billingEndDateCentury) {
		this.billingEndDateCentury = billingEndDateCentury;
	}
	public double getCancellationDateCentury() {
		return cancellationDateCentury;
	}
	public void setCancellationDateCentury(double cancellationDateCentury) {
		this.cancellationDateCentury = cancellationDateCentury;
	}
	public String getOilQty() {
		return oilQty;
	}
	public void setOilQty(String oilQty) {
		this.oilQty = oilQty;
	}
	public String getRoadCall() {
		return roadCall;
	}
	public void setRoadCall(String roadCall) {
		this.roadCall = roadCall;
	}
	public String getAdjustmentReference() {
		return adjustmentReference;
	}
	public void setAdjustmentReference(String adjustmentReference) {
		this.adjustmentReference = adjustmentReference;
	}
	public String getStatementNumber() {
		return statementNumber;
	}
	public void setStatementNumber(String statementNumber) {
		this.statementNumber = statementNumber;
	}
	public String getConsToCustDist() {
		return consToCustDist;
	}
	public void setConsToCustDist(String consToCustDist) {
		this.consToCustDist = consToCustDist;
	}
	public String getPegInvoiceNumber() {
		return pegInvoiceNumber;
	}
	public void setPegInvoiceNumber(String pegInvoiceNumber) {
		this.pegInvoiceNumber = pegInvoiceNumber;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}
	public void setVehicleManufacturer(String vehicleManufacturer) {
		this.vehicleManufacturer = vehicleManufacturer;
	}
	public double getVehicleModelYear() {
		return vehicleModelYear;
	}
	public void setVehicleModelYear(double vehicleModelYear) {
		this.vehicleModelYear = vehicleModelYear;
	}
	public String getVehicleSize() {
		return vehicleSize;
	}
	public void setVehicleSize(String vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	public String getUnitDesc() {
		return unitDesc;
	}
	public void setUnitDesc(String unitDesc) {
		this.unitDesc = unitDesc;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getActCodeDesc() {
		return actCodeDesc;
	}
	public void setActCodeDesc(String actCodeDesc) {
		this.actCodeDesc = actCodeDesc;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public String getAccident() {
		return accident;
	}
	public void setAccident(String accident) {
		this.accident = accident;
	}
	public String getSysCd() {
		return sysCd;
	}
	public void setSysCd(String sysCd) {
		this.sysCd = sysCd;
	}
	public String getAssyCd() {
		return assyCd;
	}
	public void setAssyCd(String assyCd) {
		this.assyCd = assyCd;
	}
	public String getPartCd() {
		return partCd;
	}
	public void setPartCd(String partCd) {
		this.partCd = partCd;
	}
	public String getActionCd() {
		return actionCd;
	}
	public void setActionCd(String actionCd) {
		this.actionCd = actionCd;
	}
	public String getWarrantyRebill() {
		return warrantyRebill;
	}
	public void setWarrantyRebill(String warrantyRebill) {
		this.warrantyRebill = warrantyRebill;
	}
	public double getsActlTime() {
		return sActlTime;
	}
	public void setsActlTime(double sActlTime) {
		this.sActlTime = sActlTime;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobNotes() {
		return jobNotes;
	}
	public void setJobNotes(String jobNotes) {
		this.jobNotes = jobNotes;
	}
	public String getCurWorkLoc() {
		return curWorkLoc;
	}
	public void setCurWorkLoc(String curWorkLoc) {
		this.curWorkLoc = curWorkLoc;
	}
	public Timestamp getWoStart() {
		return woStart;
	}
	public void setWoStart(Timestamp woStart) {
		this.woStart = woStart;
	}
	public Timestamp getWoCreated() {
		return woCreated;
	}
	public void setWoCreated(Timestamp woCreated) {
		this.woCreated = woCreated;
	}
	public Timestamp getArrival() {
		return arrival;
	}
	public void setArrival(Timestamp arrival) {
		this.arrival = arrival;
	}
	public Timestamp getPromised() {
		return promised;
	}
	public void setPromised(Timestamp promised) {
		this.promised = promised;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public double getOilQuantity() {
		return oilQuantity;
	}
	public void setOilQuantity(double oilQuantity) {
		this.oilQuantity = oilQuantity;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getMicroControlNum() {
		return microControlNum;
	}
	public void setMicroControlNum(String microControlNum) {
		this.microControlNum = microControlNum;
	}
	public String getDoPtlInterCo() {
		return doPtlInterCo;
	}
	public void setDoPtlInterCo(String doPtlInterCo) {
		this.doPtlInterCo = doPtlInterCo;
	}
	public double getMarkupLabour() {
		return markupLabour;
	}
	public void setMarkupLabour(double markupLabour) {
		this.markupLabour = markupLabour;
	}
	public double getMarkupHourlyLabour() {
		return markupHourlyLabour;
	}
	public void setMarkupHourlyLabour(double markupHourlyLabour) {
		this.markupHourlyLabour = markupHourlyLabour;
	}
	public double getTransxnType() {
		return transxnType;
	}
	public void setTransxnType(double transxnType) {
		this.transxnType = transxnType;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getCustomData4() {
		return customData4;
	}
	public void setCustomData4(String customData4) {
		this.customData4 = customData4;
	}
	public Timestamp getWorkOrderCompleteTime() {
		return workOrderCompleteTime;
	}
	public void setWorkOrderCompleteTime(Timestamp workOrderCompleteTime) {
		this.workOrderCompleteTime = workOrderCompleteTime;
	}
	public String getLineDesc() {
		return lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
	}
	public double getUntTaxCh() {
		return untTaxCh;
	}
	public void setUntTaxCh(double untTaxCh) {
		this.untTaxCh = untTaxCh;
	}
	public String getDocSourceCode() {
		return docSourceCode;
	}
	public void setDocSourceCode(String docSourceCode) {
		this.docSourceCode = docSourceCode;
	}
	public double getRoSeq() {
		return roSeq;
	}
	public void setRoSeq(double roSeq) {
		this.roSeq = roSeq;
	}
	public String getRoJobWorkAccCode() {
		return roJobWorkAccCode;
	}
	public void setRoJobWorkAccCode(String roJobWorkAccCode) {
		this.roJobWorkAccCode = roJobWorkAccCode;
	}
	public Timestamp getRoJobStartDate() {
		return roJobStartDate;
	}
	public void setRoJobStartDate(Timestamp roJobStartDate) {
		this.roJobStartDate = roJobStartDate;
	}
	public double getRoJobOldWorkCode() {
		return roJobOldWorkCode;
	}
	public void setRoJobOldWorkCode(double roJobOldWorkCode) {
		this.roJobOldWorkCode = roJobOldWorkCode;
	}
	public String getRoJobRepairPriorityClass() {
		return roJobRepairPriorityClass;
	}
	public void setRoJobRepairPriorityClass(String roJobRepairPriorityClass) {
		this.roJobRepairPriorityClass = roJobRepairPriorityClass;
	}
	public String getRoJobRepairReasonCode() {
		return roJobRepairReasonCode;
	}
	public void setRoJobRepairReasonCode(String roJobRepairReasonCode) {
		this.roJobRepairReasonCode = roJobRepairReasonCode;
	}
	public String getRoJobDoNotBill() {
		return roJobDoNotBill;
	}
	public void setRoJobDoNotBill(String roJobDoNotBill) {
		this.roJobDoNotBill = roJobDoNotBill;
	}
	public String getInvoiceTaxCode1() {
		return invoiceTaxCode1;
	}
	public void setInvoiceTaxCode1(String invoiceTaxCode1) {
		this.invoiceTaxCode1 = invoiceTaxCode1;
	}
	public String getInvoiceTaxCode2() {
		return invoiceTaxCode2;
	}
	public void setInvoiceTaxCode2(String invoiceTaxCode2) {
		this.invoiceTaxCode2 = invoiceTaxCode2;
	}
	public String getInvoiceaxCode3() {
		return invoiceaxCode3;
	}
	public void setInvoiceaxCode3(String invoiceaxCode3) {
		this.invoiceaxCode3 = invoiceaxCode3;
	}
	public String getInvoiceTaxCode4() {
		return invoiceTaxCode4;
	}
	public void setInvoiceTaxCode4(String invoiceTaxCode4) {
		this.invoiceTaxCode4 = invoiceTaxCode4;
	}
	public String getInvoiceTaxCode5() {
		return invoiceTaxCode5;
	}
	public void setInvoiceTaxCode5(String invoiceTaxCode5) {
		this.invoiceTaxCode5 = invoiceTaxCode5;
	}
	public String getInvoiceTaxCode6() {
		return invoiceTaxCode6;
	}
	public void setInvoiceTaxCode6(String invoiceTaxCode6) {
		this.invoiceTaxCode6 = invoiceTaxCode6;
	}
	public double getInvoiceTaxAmt1() {
		return invoiceTaxAmt1;
	}
	public void setInvoiceTaxAmt1(double invoiceTaxAmt1) {
		this.invoiceTaxAmt1 = invoiceTaxAmt1;
	}
	public double getInvoiceTaxAmt2() {
		return invoiceTaxAmt2;
	}
	public void setInvoiceTaxAmt2(double invoiceTaxAmt2) {
		this.invoiceTaxAmt2 = invoiceTaxAmt2;
	}
	public double getInvoiceTaxAmt3() {
		return invoiceTaxAmt3;
	}
	public void setInvoiceTaxAmt3(double invoiceTaxAmt3) {
		this.invoiceTaxAmt3 = invoiceTaxAmt3;
	}
	public double getInvoiceTaxAmt4() {
		return invoiceTaxAmt4;
	}
	public void setInvoiceTaxAmt4(double invoiceTaxAmt4) {
		this.invoiceTaxAmt4 = invoiceTaxAmt4;
	}
	public double getInvoiceTaxAmt5() {
		return invoiceTaxAmt5;
	}
	public void setInvoiceTaxAmt5(double invoiceTaxAmt5) {
		this.invoiceTaxAmt5 = invoiceTaxAmt5;
	}
	public double getInvoiceTaxAmt6() {
		return invoiceTaxAmt6;
	}
	public void setInvoiceTaxAmt6(double invoiceTaxAmt6) {
		this.invoiceTaxAmt6 = invoiceTaxAmt6;
	}
	public double getLaborOr() {
		return laborOr;
	}
	public void setLaborOr(double laborOr) {
		this.laborOr = laborOr;
	}
	public String getCostTaxYn() {
		return costTaxYn;
	}
	public void setCostTaxYn(String costTaxYn) {
		this.costTaxYn = costTaxYn;
	}
	public String getPartsTaxYn() {
		return partsTaxYn;
	}
	public void setPartsTaxYn(String partsTaxYn) {
		this.partsTaxYn = partsTaxYn;
	}
	public String getWarrantyVlaimNo() {
		return warrantyVlaimNo;
	}
	public void setWarrantyVlaimNo(String warrantyVlaimNo) {
		this.warrantyVlaimNo = warrantyVlaimNo;
	}
	public String getAreaNumber() {
		return areaNumber;
	}
	public void setAreaNumber(String areaNumber) {
		this.areaNumber = areaNumber;
	}
	public String getRegionNumber() {
		return regionNumber;
	}
	public void setRegionNumber(String regionNumber) {
		this.regionNumber = regionNumber;
	}
	public double getGrossVehicleWeight() {
		return grossVehicleWeight;
	}
	public void setGrossVehicleWeight(double grossVehicleWeight) {
		this.grossVehicleWeight = grossVehicleWeight;
	}
	public String getVehicleLicenseNumber() {
		return vehicleLicenseNumber;
	}
	public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
		this.vehicleLicenseNumber = vehicleLicenseNumber;
	}
	public String getForeignUnit() {
		return foreignUnit;
	}
	public void setForeignUnit(String foreignUnit) {
		this.foreignUnit = foreignUnit;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getVehicleDesc() {
		return vehicleDesc;
	}
	public void setVehicleDesc(String vehicleDesc) {
		this.vehicleDesc = vehicleDesc;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}
	public String getVehicleUse() {
		return vehicleUse;
	}
	public void setVehicleUse(String vehicleUse) {
		this.vehicleUse = vehicleUse;
	}
	public int getSuppMaintenanceId() {
		return suppMaintenanceId;
	}
	public void setSuppMaintenanceId(int suppMaintenanceId) {
		this.suppMaintenanceId = suppMaintenanceId;
	}
	public String getDbmFlag() {
		return dbmFlag;
	}
	public void setDbmFlag(String dbmFlag) {
		this.dbmFlag = dbmFlag;
	}
	public double getVendorId() {
		return vendorId;
	}
	public void setVendorId(double vendorId) {
		this.vendorId = vendorId;
	}
	public String getOutsideChargeCode() {
		return outsideChargeCode;
	}
	public void setOutsideChargeCode(String outsideChargeCode) {
		this.outsideChargeCode = outsideChargeCode;
	}
	public String getIn_or_out() {
		return in_or_out;
	}
	public void setIn_or_out(String in_or_out) {
		this.in_or_out = in_or_out;
	}
}
