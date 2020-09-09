package com.excel.utility;

import java.util.ArrayList;

public class GetDataFromExcelForMyAutomationPractice {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
			reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\automationpractice.xlsx");
			
			for(int rowNum =2; rowNum<=reader.getRowCount("Sheet1");rowNum++) {
				
				String username = reader.getCellData("Sheet1", "username", rowNum);
				String password = reader.getCellData("Sheet1", "password", rowNum);
				
				Object ob[]= {username,password};
				mydata.add(ob);
				
				
			}
			return mydata;
			
	}
	

}
