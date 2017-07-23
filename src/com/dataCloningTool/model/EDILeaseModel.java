package com.dataCloningTool.model;

import java.sql.Date;
import java.sql.Timestamp;

public class EDILeaseModel {

	public String billingDistrict;
	public String customerNumber;
	public double mergeGroupCode;
	public double hubNumber;
	public Date billingDate;
	public String billInAdvance;
	public String unitNumber;
	public String alternateUnitNumber;
	public String unitVlass;
	public String unitUsage;
	public double numberOfMonthsToCharge;
	public double numberOfWeeksToCharge;
	public double numberOfDaysToCharge;
	public double startingMileage;
	public double endingMileage;
	public double totalUsage;
	public double revenueMileageRate1;
	public double mileageRate1;
	public double mileageRate1Charge;
	public double fixedCharge;
	public double extraAdjustmentCcharge;
	public double salesTax1;
	public double totalCharge1;
	public double revenueMileageRate2;
	public double mileageRate2;
	public double mileageRate2Charge;
	public double salesTax2;
	public double totalCharge2;
	public double revenueMileageRate3;
	public double mileageRate3;
	public double mileageRate3Charge;
	public double salesTax3;
	public double totalCharge3;
	public String calculationCode;
	public String mileageFrequency;
	public double mileageLimit1;
	public double allowGuarMilesToDate;
	public double penaltyMileage;
	public double penaltyMileageRate;
	public double penaltyCharge;
	public double penaltyTax;
	public double penaltyTotal;
	public double stateTaxCode;
	public double salesTaxCode;
	public Date extraStartingDate;
	public Date extraEndingDate;
	public String purchaseOrderNumber;
	public Date inServiceFromDate;
	public Date inServiceToDate;
	public Date outOfServiceDate;
	public String invoiceNumber;
	public String customerPrime;
	public String customerBillGroup;
	public Date invoiceDate;
	public String consStmtNumber;
	public String billToCityName;
	public String billToStateName;
	public String customerName;
	public String districtName;
	public String billToAddress1;
	public String billToZipCode;
	public String billToAttention;
	public String billToAddress2;
	public String remittanceName;
	public String line1;
	public String line2;
	public String city;
	public String state;
	public String zip;
	public String country;
	public String usedLanguage;
	public String telephone;
	public String billingFrequency;
	public double descrSpecialTaxes;
	public double taxCharge;
	public double taxRate;
	public double countryTaxRate;
	public double cityRaxRate;
	public String companyCode;
	public Date billingPeriodDate;
	public String contactStateCode;
	public String stateAbbreviation;
	public double usageCode;
	public double classCode;
	public Date anniversaryDate;
	public Date periodStartDate;
	public double proRatedMileage;
	public double totalMileage;
	public String mainTelephoneNumber;
	public String admin;
	public String subCenter;
	public String ediCrossReferenceNumber;
	public Timestamp dataLoadDate;
	public double invoiceAmt;
	public double contractMileageCharge;
	public double extendedRntlMileageCharge;
	public double extraMileageCharge;
	public double interimMileageCharge;
	public double conSubMileageCharge;
	public double conTripMileageVharge;
	public String vehicleVategory;
	public String customerUnitNumber;
	public String vin;
	public double ltdMilesDriven;
	public String vehicleModel;
	public String unitType;
	public double vehicleModelYear;
	public String doPtlInterCo;
	public String microControlNumber;
	public String profitCenter;
	public String electronicInvoiceFlag;
	public double intrmSubMileageCharge;
	public double intrmTripMileageCharge;
	public double exrntlSubMileageCharge;
	public double exrntlTripMileageCharge;
	public double fuelAdjAmt;
	public double transxnType;
	public String subType;
	public String customData4;
	public String specialTaxesDescription;
	public double allowGuarMileageLimit;
	public double deficientRemainingMiles;
	public double chargeRate;
	public String areaNumber;
	public String regionNumber;
	public double grossVehicleWeight;
	public String vehicleLicenseNumber;
	public double extendedLineAmtCharges;
	public String vehicleManufacturer;
	public String vehicleDescription;
	public String vehicleLiftGate;
	public int suppLeaseId;
	public double contractKey;
	public double rnetSeqNumber;
	public String raNumber;
	
	
	public String getBillingDistrict() {
		return billingDistrict;
	}
	public void setBillingDistrict(String billingDistrict) {
		this.billingDistrict = billingDistrict;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public double getMergeGroupCode() {
		return mergeGroupCode;
	}
	public void setMergeGroupCode(double mergeGroupCode) {
		this.mergeGroupCode = mergeGroupCode;
	}
	public double getHubNumber() {
		return hubNumber;
	}
	public void setHubNumber(double hubNumber) {
		this.hubNumber = hubNumber;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public String getBillInAdvance() {
		return billInAdvance;
	}
	public void setBillInAdvance(String billInAdvance) {
		this.billInAdvance = billInAdvance;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getAlternateUnitNumber() {
		return alternateUnitNumber;
	}
	public void setAlternateUnitNumber(String alternateUnitNumber) {
		this.alternateUnitNumber = alternateUnitNumber;
	}
	public String getUnitVlass() {
		return unitVlass;
	}
	public void setUnitVlass(String unitVlass) {
		this.unitVlass = unitVlass;
	}
	public String getUnitUsage() {
		return unitUsage;
	}
	public void setUnitUsage(String unitUsage) {
		this.unitUsage = unitUsage;
	}
	public double getNumberOfMonthsToCharge() {
		return numberOfMonthsToCharge;
	}
	public void setNumberOfMonthsToCharge(double numberOfMonthsToCharge) {
		this.numberOfMonthsToCharge = numberOfMonthsToCharge;
	}
	public double getNumberOfWeeksToCharge() {
		return numberOfWeeksToCharge;
	}
	public void setNumberOfWeeksToCharge(double numberOfWeeksToCharge) {
		this.numberOfWeeksToCharge = numberOfWeeksToCharge;
	}
	public double getNumberOfDaysToCharge() {
		return numberOfDaysToCharge;
	}
	public void setNumberOfDaysToCharge(double numberOfDaysToCharge) {
		this.numberOfDaysToCharge = numberOfDaysToCharge;
	}
	public double getStartingMileage() {
		return startingMileage;
	}
	public void setStartingMileage(double startingMileage) {
		this.startingMileage = startingMileage;
	}
	public double getEndingMileage() {
		return endingMileage;
	}
	public void setEndingMileage(double endingMileage) {
		this.endingMileage = endingMileage;
	}
	public double getTotalUsage() {
		return totalUsage;
	}
	public void setTotalUsage(double totalUsage) {
		this.totalUsage = totalUsage;
	}
	public double getRevenueMileageRate1() {
		return revenueMileageRate1;
	}
	public void setRevenueMileageRate1(double revenueMileageRate1) {
		this.revenueMileageRate1 = revenueMileageRate1;
	}
	public double getMileageRate1() {
		return mileageRate1;
	}
	public void setMileageRate1(double mileageRate1) {
		this.mileageRate1 = mileageRate1;
	}
	public double getMileageRate1Charge() {
		return mileageRate1Charge;
	}
	public void setMileageRate1Charge(double mileageRate1Charge) {
		this.mileageRate1Charge = mileageRate1Charge;
	}
	public double getFixedCharge() {
		return fixedCharge;
	}
	public void setFixedCharge(double fixedCharge) {
		this.fixedCharge = fixedCharge;
	}
	public double getExtraAdjustmentCcharge() {
		return extraAdjustmentCcharge;
	}
	public void setExtraAdjustmentCcharge(double extraAdjustmentCcharge) {
		this.extraAdjustmentCcharge = extraAdjustmentCcharge;
	}
	public double getSalesTax1() {
		return salesTax1;
	}
	public void setSalesTax1(double salesTax1) {
		this.salesTax1 = salesTax1;
	}
	public double getTotalCharge1() {
		return totalCharge1;
	}
	public void setTotalCharge1(double totalCharge1) {
		this.totalCharge1 = totalCharge1;
	}
	public double getRevenueMileageRate2() {
		return revenueMileageRate2;
	}
	public void setRevenueMileageRate2(double revenueMileageRate2) {
		this.revenueMileageRate2 = revenueMileageRate2;
	}
	public double getMileageRate2() {
		return mileageRate2;
	}
	public void setMileageRate2(double mileageRate2) {
		this.mileageRate2 = mileageRate2;
	}
	public double getMileageRate2Charge() {
		return mileageRate2Charge;
	}
	public void setMileageRate2Charge(double mileageRate2Charge) {
		this.mileageRate2Charge = mileageRate2Charge;
	}
	public double getSalesTax2() {
		return salesTax2;
	}
	public void setSalesTax2(double salesTax2) {
		this.salesTax2 = salesTax2;
	}
	public double getTotalCharge2() {
		return totalCharge2;
	}
	public void setTotalCharge2(double totalCharge2) {
		this.totalCharge2 = totalCharge2;
	}
	public double getRevenueMileageRate3() {
		return revenueMileageRate3;
	}
	public void setRevenueMileageRate3(double revenueMileageRate3) {
		this.revenueMileageRate3 = revenueMileageRate3;
	}
	public double getMileageRate3() {
		return mileageRate3;
	}
	public void setMileageRate3(double mileageRate3) {
		this.mileageRate3 = mileageRate3;
	}
	public double getMileageRate3Charge() {
		return mileageRate3Charge;
	}
	public void setMileageRate3Charge(double mileageRate3Charge) {
		this.mileageRate3Charge = mileageRate3Charge;
	}
	public double getSalesTax3() {
		return salesTax3;
	}
	public void setSalesTax3(double salesTax3) {
		this.salesTax3 = salesTax3;
	}
	public double getTotalCharge3() {
		return totalCharge3;
	}
	public void setTotalCharge3(double totalCharge3) {
		this.totalCharge3 = totalCharge3;
	}
	public String getCalculationCode() {
		return calculationCode;
	}
	public void setCalculationCode(String calculationCode) {
		this.calculationCode = calculationCode;
	}
	public String getMileageFrequency() {
		return mileageFrequency;
	}
	public void setMileageFrequency(String mileageFrequency) {
		this.mileageFrequency = mileageFrequency;
	}
	public double getMileageLimit1() {
		return mileageLimit1;
	}
	public void setMileageLimit1(double mileageLimit1) {
		this.mileageLimit1 = mileageLimit1;
	}
	public double getAllowGuarMilesToDate() {
		return allowGuarMilesToDate;
	}
	public void setAllowGuarMilesToDate(double allowGuarMilesToDate) {
		this.allowGuarMilesToDate = allowGuarMilesToDate;
	}
	public double getPenaltyMileage() {
		return penaltyMileage;
	}
	public void setPenaltyMileage(double penaltyMileage) {
		this.penaltyMileage = penaltyMileage;
	}
	public double getPenaltyMileageRate() {
		return penaltyMileageRate;
	}
	public void setPenaltyMileageRate(double penaltyMileageRate) {
		this.penaltyMileageRate = penaltyMileageRate;
	}
	public double getPenaltyCharge() {
		return penaltyCharge;
	}
	public void setPenaltyCharge(double penaltyCharge) {
		this.penaltyCharge = penaltyCharge;
	}
	public double getPenaltyTax() {
		return penaltyTax;
	}
	public void setPenaltyTax(double penaltyTax) {
		this.penaltyTax = penaltyTax;
	}
	public double getPenaltyTotal() {
		return penaltyTotal;
	}
	public void setPenaltyTotal(double penaltyTotal) {
		this.penaltyTotal = penaltyTotal;
	}
	public double getStateTaxCode() {
		return stateTaxCode;
	}
	public void setStateTaxCode(double stateTaxCode) {
		this.stateTaxCode = stateTaxCode;
	}
	public double getSalesTaxCode() {
		return salesTaxCode;
	}
	public void setSalesTaxCode(double salesTaxCode) {
		this.salesTaxCode = salesTaxCode;
	}
	public Date getExtraStartingDate() {
		return extraStartingDate;
	}
	public void setExtraStartingDate(Date extraStartingDate) {
		this.extraStartingDate = extraStartingDate;
	}
	public Date getExtraEndingDate() {
		return extraEndingDate;
	}
	public void setExtraEndingDate(Date extraEndingDate) {
		this.extraEndingDate = extraEndingDate;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public Date getInServiceFromDate() {
		return inServiceFromDate;
	}
	public void setInServiceFromDate(Date inServiceFromDate) {
		this.inServiceFromDate = inServiceFromDate;
	}
	public Date getInServiceToDate() {
		return inServiceToDate;
	}
	public void setInServiceToDate(Date inServiceToDate) {
		this.inServiceToDate = inServiceToDate;
	}
	public Date getOutOfServiceDate() {
		return outOfServiceDate;
	}
	public void setOutOfServiceDate(Date outOfServiceDate) {
		this.outOfServiceDate = outOfServiceDate;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerPrime() {
		return customerPrime;
	}
	public void setCustomerPrime(String customerPrime) {
		this.customerPrime = customerPrime;
	}
	public String getCustomerBillGroup() {
		return customerBillGroup;
	}
	public void setCustomerBillGroup(String customerBillGroup) {
		this.customerBillGroup = customerBillGroup;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getConsStmtNumber() {
		return consStmtNumber;
	}
	public void setConsStmtNumber(String consStmtNumber) {
		this.consStmtNumber = consStmtNumber;
	}
	public String getBillToCityName() {
		return billToCityName;
	}
	public void setBillToCityName(String billToCityName) {
		this.billToCityName = billToCityName;
	}
	public String getBillToStateName() {
		return billToStateName;
	}
	public void setBillToStateName(String billToStateName) {
		this.billToStateName = billToStateName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getBillToAddress1() {
		return billToAddress1;
	}
	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}
	public String getBillToZipCode() {
		return billToZipCode;
	}
	public void setBillToZipCode(String billToZipCode) {
		this.billToZipCode = billToZipCode;
	}
	public String getBillToAttention() {
		return billToAttention;
	}
	public void setBillToAttention(String billToAttention) {
		this.billToAttention = billToAttention;
	}
	public String getBillToAddress2() {
		return billToAddress2;
	}
	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}
	public String getRemittanceName() {
		return remittanceName;
	}
	public void setRemittanceName(String remittanceName) {
		this.remittanceName = remittanceName;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUsedLanguage() {
		return usedLanguage;
	}
	public void setUsedLanguage(String usedLanguage) {
		this.usedLanguage = usedLanguage;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBillingFrequency() {
		return billingFrequency;
	}
	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}
	public double getDescrSpecialTaxes() {
		return descrSpecialTaxes;
	}
	public void setDescrSpecialTaxes(double descrSpecialTaxes) {
		this.descrSpecialTaxes = descrSpecialTaxes;
	}
	public double getTaxCharge() {
		return taxCharge;
	}
	public void setTaxCharge(double taxCharge) {
		this.taxCharge = taxCharge;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getCountryTaxRate() {
		return countryTaxRate;
	}
	public void setCountryTaxRate(double countryTaxRate) {
		this.countryTaxRate = countryTaxRate;
	}
	public double getCityRaxRate() {
		return cityRaxRate;
	}
	public void setCityRaxRate(double cityRaxRate) {
		this.cityRaxRate = cityRaxRate;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public Date getBillingPeriodDate() {
		return billingPeriodDate;
	}
	public void setBillingPeriodDate(Date billingPeriodDate) {
		this.billingPeriodDate = billingPeriodDate;
	}
	public String getContactStateCode() {
		return contactStateCode;
	}
	public void setContactStateCode(String contactStateCode) {
		this.contactStateCode = contactStateCode;
	}
	public String getStateAbbreviation() {
		return stateAbbreviation;
	}
	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}
	public double getUsageCode() {
		return usageCode;
	}
	public void setUsageCode(double usageCode) {
		this.usageCode = usageCode;
	}
	public double getClassCode() {
		return classCode;
	}
	public void setClassCode(double classCode) {
		this.classCode = classCode;
	}
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}
	public Date getPeriodStartDate() {
		return periodStartDate;
	}
	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}
	public double getProRatedMileage() {
		return proRatedMileage;
	}
	public void setProRatedMileage(double proRatedMileage) {
		this.proRatedMileage = proRatedMileage;
	}
	public double getTotalMileage() {
		return totalMileage;
	}
	public void setTotalMileage(double totalMileage) {
		this.totalMileage = totalMileage;
	}
	public String getMainTelephoneNumber() {
		return mainTelephoneNumber;
	}
	public void setMainTelephoneNumber(String mainTelephoneNumber) {
		this.mainTelephoneNumber = mainTelephoneNumber;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getSubCenter() {
		return subCenter;
	}
	public void setSubCenter(String subCenter) {
		this.subCenter = subCenter;
	}
	public String getEdiCrossReferenceNumber() {
		return ediCrossReferenceNumber;
	}
	public void setEdiCrossReferenceNumber(String ediCrossReferenceNumber) {
		this.ediCrossReferenceNumber = ediCrossReferenceNumber;
	}
	public Timestamp getDataLoadDate() {
		return dataLoadDate;
	}
	public void setDataLoadDate(Timestamp dataLoadDate) {
		this.dataLoadDate = dataLoadDate;
	}
	public double getInvoiceAmt() {
		return invoiceAmt;
	}
	public void setInvoiceAmt(double invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}
	public double getContractMileageCharge() {
		return contractMileageCharge;
	}
	public void setContractMileageCharge(double contractMileageCharge) {
		this.contractMileageCharge = contractMileageCharge;
	}
	public double getExtendedRntlMileageCharge() {
		return extendedRntlMileageCharge;
	}
	public void setExtendedRntlMileageCharge(double extendedRntlMileageCharge) {
		this.extendedRntlMileageCharge = extendedRntlMileageCharge;
	}
	public double getExtraMileageCharge() {
		return extraMileageCharge;
	}
	public void setExtraMileageCharge(double extraMileageCharge) {
		this.extraMileageCharge = extraMileageCharge;
	}
	public double getInterimMileageCharge() {
		return interimMileageCharge;
	}
	public void setInterimMileageCharge(double interimMileageCharge) {
		this.interimMileageCharge = interimMileageCharge;
	}
	public double getConSubMileageCharge() {
		return conSubMileageCharge;
	}
	public void setConSubMileageCharge(double conSubMileageCharge) {
		this.conSubMileageCharge = conSubMileageCharge;
	}
	public double getConTripMileageVharge() {
		return conTripMileageVharge;
	}
	public void setConTripMileageVharge(double conTripMileageVharge) {
		this.conTripMileageVharge = conTripMileageVharge;
	}
	public String getVehicleVategory() {
		return vehicleVategory;
	}
	public void setVehicleVategory(String vehicleVategory) {
		this.vehicleVategory = vehicleVategory;
	}
	public String getCustomerUnitNumber() {
		return customerUnitNumber;
	}
	public void setCustomerUnitNumber(String customerUnitNumber) {
		this.customerUnitNumber = customerUnitNumber;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public double getLtdMilesDriven() {
		return ltdMilesDriven;
	}
	public void setLtdMilesDriven(double ltdMilesDriven) {
		this.ltdMilesDriven = ltdMilesDriven;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public double getVehicleModelYear() {
		return vehicleModelYear;
	}
	public void setVehicleModelYear(double vehicleModelYear) {
		this.vehicleModelYear = vehicleModelYear;
	}
	public String getDoPtlInterCo() {
		return doPtlInterCo;
	}
	public void setDoPtlInterCo(String doPtlInterCo) {
		this.doPtlInterCo = doPtlInterCo;
	}
	public String getMicroControlNumber() {
		return microControlNumber;
	}
	public void setMicroControlNumber(String microControlNumber) {
		this.microControlNumber = microControlNumber;
	}
	public String getProfitCenter() {
		return profitCenter;
	}
	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}
	public String getElectronicInvoiceFlag() {
		return electronicInvoiceFlag;
	}
	public void setElectronicInvoiceFlag(String electronicInvoiceFlag) {
		this.electronicInvoiceFlag = electronicInvoiceFlag;
	}
	public double getIntrmSubMileageCharge() {
		return intrmSubMileageCharge;
	}
	public void setIntrmSubMileageCharge(double intrmSubMileageCharge) {
		this.intrmSubMileageCharge = intrmSubMileageCharge;
	}
	public double getIntrmTripMileageCharge() {
		return intrmTripMileageCharge;
	}
	public void setIntrmTripMileageCharge(double intrmTripMileageCharge) {
		this.intrmTripMileageCharge = intrmTripMileageCharge;
	}
	public double getExrntlSubMileageCharge() {
		return exrntlSubMileageCharge;
	}
	public void setExrntlSubMileageCharge(double exrntlSubMileageCharge) {
		this.exrntlSubMileageCharge = exrntlSubMileageCharge;
	}
	public double getExrntlTripMileageCharge() {
		return exrntlTripMileageCharge;
	}
	public void setExrntlTripMileageCharge(double exrntlTripMileageCharge) {
		this.exrntlTripMileageCharge = exrntlTripMileageCharge;
	}
	public double getFuelAdjAmt() {
		return fuelAdjAmt;
	}
	public void setFuelAdjAmt(double fuelAdjAmt) {
		this.fuelAdjAmt = fuelAdjAmt;
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
	public String getSpecialTaxesDescription() {
		return specialTaxesDescription;
	}
	public void setSpecialTaxesDescription(String specialTaxesDescription) {
		this.specialTaxesDescription = specialTaxesDescription;
	}
	public double getAllowGuarMileageLimit() {
		return allowGuarMileageLimit;
	}
	public void setAllowGuarMileageLimit(double allowGuarMileageLimit) {
		this.allowGuarMileageLimit = allowGuarMileageLimit;
	}
	public double getDeficientRemainingMiles() {
		return deficientRemainingMiles;
	}
	public void setDeficientRemainingMiles(double deficientRemainingMiles) {
		this.deficientRemainingMiles = deficientRemainingMiles;
	}
	public double getChargeRate() {
		return chargeRate;
	}
	public void setChargeRate(double chargeRate) {
		this.chargeRate = chargeRate;
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
	public double getExtendedLineAmtCharges() {
		return extendedLineAmtCharges;
	}
	public void setExtendedLineAmtCharges(double extendedLineAmtCharges) {
		this.extendedLineAmtCharges = extendedLineAmtCharges;
	}
	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}
	public void setVehicleManufacturer(String vehicleManufacturer) {
		this.vehicleManufacturer = vehicleManufacturer;
	}
	public String getVehicleDescription() {
		return vehicleDescription;
	}
	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}
	public String getVehicleLiftGate() {
		return vehicleLiftGate;
	}
	public void setVehicleLiftGate(String vehicleLiftGate) {
		this.vehicleLiftGate = vehicleLiftGate;
	}
	public int getSuppLeaseId() {
		return suppLeaseId;
	}
	public void setSuppLeaseId(int suppLeaseId) {
		this.suppLeaseId = suppLeaseId;
	}
	public double getContractKey() {
		return contractKey;
	}
	public void setContractKey(double contractKey) {
		this.contractKey = contractKey;
	}
	public double getRnetSeqNumber() {
		return rnetSeqNumber;
	}
	public void setRnetSeqNumber(double rnetSeqNumber) {
		this.rnetSeqNumber = rnetSeqNumber;
	}
	public String getRaNumber() {
		return raNumber;
	}
	public void setRaNumber(String raNumber) {
		this.raNumber = raNumber;
	}
}
