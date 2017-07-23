package com.dataCloningTool.util;

import java.util.regex.Pattern;

import com.dataCloningTool.model.InputModel;


public class CloneDataUtil {

	public static boolean validateDate(String fromDt,String toDt){
		Pattern pattern = Pattern.compile("^(19|20)\\d\\d[-](0[1-9]|1[012])[-](0[1-9]|[12][0-9]|3[01])$");
		return (!((pattern.matcher(fromDt).matches()) && (pattern.matcher(toDt).matches())));
	}
	public static String modifyDBProp (InputModel input){
	
		return ApplicationConstants.SUCCESS;
	}
}
