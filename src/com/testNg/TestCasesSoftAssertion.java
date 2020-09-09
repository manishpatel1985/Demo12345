package com.testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCasesSoftAssertion {
	
	SoftAssert softAssert = new SoftAssert();// create the object of SoftAssert Class
	/* hard assertion :- hard validation :-if hard assertion is failed it will immediately test case will be marked as failed and test case will be terminated.
	 * Soft Assertion :- soft validation:- if soft assetion is failed  the test case will not be marked as passed as well as next lines will be executed.
	 * assertAll(); is used to mark test case is failed, if any soft assertion is getting is failed.
	 * soft assertion is used for test cases where u know the test cases is getting failed 
		 but u want to excute the next code of line.
	*/
	@Test
	public void testMethod() {
		System.out.println("OpenBrowser");
		
		softAssert.assertEquals(true, true); // hard assertion :- means if any perticular line is failed then next correspoding lines in programme/scripts will not be executed.
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click on sign in button");
		
		softAssert.assertEquals(true, false);//soft assertion
		
		System.out.println("validate home page");
		softAssert.assertEquals(true, false);//soft assertion
		
		System.out.println("Go to deals page");
		System.out.println("create a deal");
		
		System.out.println("Go to contacts page");
		System.out.println("create a contact");
		
		softAssert.assertAll(); // write this sentence after every test case in order to mark the test case is failed or pass. 
		//if you do not write this statement the softAssert.assertEquals statement will pass the test cases.
		
		
	}
	
	
	
	

}
