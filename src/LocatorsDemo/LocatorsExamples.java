package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.cssSelector("input[type='text'][id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
		//driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
		
		//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		//driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		
	
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		
		
		Thread.sleep(4000);
		
		driver.close();
		
		

	}

}
