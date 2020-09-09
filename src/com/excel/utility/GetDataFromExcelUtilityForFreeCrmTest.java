package com.excel.utility;

import java.util.ArrayList;

public class GetDataFromExcelUtilityForFreeCrmTest {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getTestDataFromExcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
		reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\FreeCrmData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int rowCount = 	reader.getRowCount("Sheet1");
		
		for(int rowNum= 2;rowNum<=rowCount;rowNum++) {
			
		String username= reader.getCellData("Sheet1", "username", rowNum);
		String password = reader.getCellData("Sheet1", "password", rowNum);
		
		Object ob[]= {username,password};
		mydata.add(ob);
			
			
		}
		return mydata;
		
	}
	

}
