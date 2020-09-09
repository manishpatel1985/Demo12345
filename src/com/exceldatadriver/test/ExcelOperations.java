package com.exceldatadriver.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
	
	Xls_Reader reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\rediffmailtest.xlsx");

	reader.addSheet("HomePage");
	if(!reader.isSheetExist("HomePage")) {
		reader.addSheet("HomePage");
	}
		
	int colcount= reader.getColumnCount("RegTestData");
	System.out.println("Total columus count present in the regdata sheet is===>"+colcount);
		
		
	}

}
