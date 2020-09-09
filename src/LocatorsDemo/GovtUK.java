package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GovtUK {
	WebDriver driver = new ChromeDriver();
	
	public void LoginGovuk() throws InterruptedException{
	driver.get("https://www.gov.uk/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("dvla");
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	Thread.sleep(4000);
	//driver.close();
	
	}
	
	public void ClickTopic() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Topic']")).click();
		Thread.sleep(4000);
		
	}
	
	public void CloseBrowser() {
		driver.close();
		
	}
	
	
	
	

}
