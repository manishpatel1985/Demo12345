package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// we have @Parameters annotations and stored data in .xml file.
public class ParameterTestUsingXMLFile {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"})
		public void setUp(String url) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"emailid","password"})
	public void crmLoginTest(String emailid, String password) {
		driver.findElement(By.xpath("//li//a[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	

}
