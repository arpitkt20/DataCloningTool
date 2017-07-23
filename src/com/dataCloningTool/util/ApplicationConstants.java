package com.dataCloningTool.util;

public class ApplicationConstants {

	public static final String LOG4J_PROPERTIES = "log4j.properties";
	public static String APPLICATION_CONTEXT = "conf/xml/applicationContext.xml";
	public static final String BLANK = "";
	public static final String SAME_DB_ERROR_MSG = "Source and Destination DB cannot be same";
	public static final String MANDATORY_COLUMNS_ERROR_MSG = "All Columns are mandatory";
	public static final String USER_ID = "UserId:";
	public static final String DB = "DB:";
	public static final String PASSWORD = "Password:";
	public static final String SCHEMA = "Schema:";
	public static final String CUSTOMER_IDS = "Customer Ids:";
	public static final String CLONE = "Clone";
	public static final String CLEAR = "Clear";
	public static final String SRC_DB = "<Source DataBase>";
	public static final String DEST_DB = "<Destination DataBase>";
	public static final String PRODUCTION = "Prod"; 
	public static final String QA = "QA";
	public static final String DEV = "Dev";
	public static final String CUSTOMER_ID_NOTE = "*Note: Provide comma separated Ids in case of multiple customer setups (eg: 1001,1002,1003)";

	public static final String CLONE_DATA_PROPERTIES = "conf/cloneData.properties";
	public static final String INVALID_DATE_FORMAT = "Given date format is invalid. Valid format yyyy-MM-DD";
	public static final String INVALID_CUSTOMER_ID = "customerId is not present or invalid.";
	public static final String SUCCESS = "SUCCESS";
}
