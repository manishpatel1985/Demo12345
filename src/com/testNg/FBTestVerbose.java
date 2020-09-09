package com.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTestVerbose {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void FBTitleTest() {
		String title = driver.getTitle();
		System.out.println("Home Page Title is====>"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test
	public void FBTitleTest1() {
		String title = driver.getTitle();
		System.out.println("Home Page Title is====>"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test
	public void FBTitleTest2() {
		String title = driver.getTitle();
		System.out.println("Home Page Title is====>"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
