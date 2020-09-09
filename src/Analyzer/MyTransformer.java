package Analyzer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.util.RetryAnalyzerCount;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformer implements IAnnotationTransformer { // to give retry logic at run time
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,Method testMethod) {
		
	annotation.setRetryAnalyzer(RetryAnalyzerCount.class);	
		
	}
	
	
	
	
	

}
