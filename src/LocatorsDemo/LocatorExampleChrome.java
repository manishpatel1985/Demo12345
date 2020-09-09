package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExampleChrome {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//By Topic = By.cssSelector("button.app-c-expander__button.js-button");
		
		driver.get("https://www.gov.uk/");
		
		driver.manage().window().maximize();
		

	driver.findElement(By.cssSelector("input[type='search']")).sendKeys("dvla");
	
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	
	driver.findElement(By.xpath("//button[text()='Topic']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Driver and Vehicle Licensing Agency")).click();
	
	Thread.sleep(4000);
	
	driver.quit();
	
	
	}
}
