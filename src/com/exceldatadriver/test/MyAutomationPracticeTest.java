package com.exceldatadriver.test;

import com.excel.utility.GetDataFromExcelForMyAutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class MyAutomationPracticeTest {
	WebDriver driver ;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		 return GetDataFromExcelForMyAutomationPractice.getDataFromExcel().iterator();
	
		
	}
	
	@Test(dataProvider="getTestData")
	public void Login(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//a[@rel='nofollow' and @title='Log in to your customer account']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		
		//Assert.assertEquals(title, "My account - My Store");
		
		softassert.assertEquals(title, "My account - My Store","Test Case is Failed");
		
		softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
