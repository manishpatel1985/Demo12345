package com.testNg;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int a= 9/0;
		System.out.println(a);
	}
	
	@Test()//dependsOnMethods="loginTest"
	public void homePageTest() {
		System.out.println("Home Page Test");
	}
	
	

}
