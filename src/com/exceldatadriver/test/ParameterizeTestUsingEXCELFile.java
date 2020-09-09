package com.exceldatadriver.test;

import com.excel.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ParameterizeTestUsingEXCELFile {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
	
	//getting the data from excel :-	
	Xls_Reader reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\rediffmailtest.xlsx");
	int rowCount = reader.getRowCount("RegTestData");	
	
	//reader.addColumn("RegTestData", "Status");
	
	//Parameterization:-
	for(int rowNum= 2; rowNum<=rowCount; rowNum++) {
	System.out.println("==========");
	String firstname =	reader.getCellData("RegTestData", "firstname", rowNum);
	System.out.println(firstname);
	
	String chooseid = reader.getCellData("RegTestData", "chooseid", rowNum);
	System.out.println(chooseid);
	
	String password = reader.getCellData("RegTestData", "password", rowNum);
	System.out.println(password);
	
	String retypepassword = reader.getCellData("RegTestData", "retypepassword", rowNum);
	System.out.println(retypepassword);
	
	String alternateemailid = reader.getCellData("RegTestData", "alternateemailid", rowNum);
	System.out.println(alternateemailid);
	
	String mobileno = reader.getCellData("RegTestData", "mobileno", rowNum);
	System.out.println(mobileno);
	
	//enter the data by using selenium code:-
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(firstname);
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(chooseid);
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(password);
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys(retypepassword);
	
	driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys(alternateemailid);
	
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(mobileno);
	
	//reader.setCellData("RegTestData", "Status", rowNum, "Pass");//write the data into cell


	
	
	}
	
	}

}
