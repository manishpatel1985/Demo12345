package com.exceldatadriver.test;

import com.excel.utility.GetDataFromExcelUtilityForFreeCrmTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class FreeCrmTestWithDataProvider {
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
	ArrayList<Object[]> testdata=	GetDataFromExcelUtilityForFreeCrmTest.getTestDataFromExcel();
	return testdata.iterator();
	}
	
	
	@Test(dataProvider="getTestData")
	public void crmLogin(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String title= driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
