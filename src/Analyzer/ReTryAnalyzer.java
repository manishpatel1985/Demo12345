package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer {
	
	int counter = 0;
	int retryLimit =3;
	
	public boolean retry(ITestResult result) { // to give retry logic at @test level.
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false ;
	}
	
	
	

}
