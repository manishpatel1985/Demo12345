package com.excel.utility;

import java.util.ArrayList;

public class GetDataFromExcelUtility {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\rediffmailtest.xlsx");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum= 2; rowNum<= reader.getRowCount("RegTestData");rowNum++) {
			
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
			String chooseid = reader.getCellData("RegTestData", "chooseid", rowNum);
			String password = reader.getCellData("RegTestData", "password", rowNum);
			String retypepassword = reader.getCellData("RegTestData", "retypepassword", rowNum);
			String alternateemailid = reader.getCellData("RegTestData", "alternateemailid", rowNum);
			String mobileno = reader.getCellData("RegTestData", "mobileno", rowNum);
			
			Object ob[]=  {firstname,chooseid,password,retypepassword,alternateemailid,mobileno};
			mydata.add(ob);
			
		}
		return mydata;
		
		
	}
	
	
	
}
