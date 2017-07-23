package com.dataCloningTool.entry;

import java.sql.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dataCloningTool.model.InputModel;
import com.dataCloningTool.service.CommonService;
import com.dataCloningTool.util.ApplicationConstants;

@Component
public class CloneData {

	
	@Autowired
	CommonService commonService;
	
	public String clone (InputModel input){
		
		String msg = "Executed";
		//TODO - Logics for data replication
		String [] customerIds = input.getCustomerIds().split(",");
		
		for (String customerId : customerIds) {

			// check whether customerId is present in the source or not, if not
			// return the error msg.
			msg = validateCustomerId(Integer.parseInt(customerId));
			if(!(msg.equalsIgnoreCase(ApplicationConstants.BLANK))){
				break;
			}
			// delete the data from the tables for that particular date range
			msg = clearOldData(Integer.parseInt(customerId),input.getCopyFromDate(),input.getCopyToDate());
			if(!(msg.equalsIgnoreCase(ApplicationConstants.BLANK))){
				break;
			}
			// fetch the data from src DB for that particular range.

			// insert the data for that particular range
		}
		return msg;
		
	}
	
	private String clearOldData(int parseInt, Date copyFromDate, Date copyToDate) {
		// TODO Auto-generated method stub
		return null;
	}

	private String validateCustomerId(int custId) {
		String msg ="";
		int state =  commonService.validateCustomerId(custId);
		if(state != 1){
			msg = String.valueOf(custId) + "" + ApplicationConstants.INVALID_CUSTOMER_ID;
		}
		return msg;
	}
}
