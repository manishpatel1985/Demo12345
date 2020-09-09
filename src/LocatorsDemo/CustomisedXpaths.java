package LocatorsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomisedXpaths {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.half.ebay.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();// using contains method find link webelement
		
		//driver.findElement(By.xpath("//a[text()='Sign in'] ")).click();//with using contain method find link webelement
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}

}
