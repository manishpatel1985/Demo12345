package com.testNg;

import org.testng.annotations.*;

public class TestNgBasics {
	//pre-condition annotations-starting with @Before
	/*setup sytem property for chrome
	launch Browser
	Login to website
	Enter URL
	Google title test
	logout method
	Close Browser
	delete all cookies
	 */
	
//@BeforeSuite == setup sytem property for chrome
//@BeforeTest== launch Browser
//@BeforeClass== Login to website
	
//@BeforeMethod== Enter URL
//@Test==Google Logo Test
//@AfterMethod==logout method
	
//@BeforeMethod== Enter URL
//@Test==Google title test 
//@AfterMethod==logout method
	
//@BeforeMethod== Enter URL
//@Test==search test
//@AfterMethod==logout method
//@AfterClass==Close Browser
//@AfterTest==delete all cookies
	 
	@BeforeSuite  //1
	public void setup() {
		System.out.println("@BeforeSuite == setup sytem property for chrome");
		
	}
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("@BeforeTest== launch Browser");
		
	}
	
	@BeforeClass //3
	public void loign() {
		System.out.println("@BeforeClass== Login to website");
		
	}
	
	@BeforeMethod//4
	public void enterUrl() {
		
		System.out.println("@BeforeMethod== Enter URL");
		
	}
	
	
	
	//test case - starting with @Test
	@Test //5
	public void googleTitle() {
		System.out.println("@Test==Google title test ");
		
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test==search test");
		int a = 9/0;
	}
	
	@Test
	public void googleTestLogo() {
		System.out.println("@Test==Google Logo Test");
		
	}
	
	//Post Condition- starting with @After
	@AfterMethod//6
	public void Logout() {
		
		System.out.println("@AfterMethod==logout method");
		
	}
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@AfterClass==Close Browser");
		
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("@AfterTest==delete all cookies");
		
	}
	
	
	
	
	
}
