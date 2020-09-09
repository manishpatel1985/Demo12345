package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicXpathExampleFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String s= driver.getCurrentUrl();
		if(s.equals("https://www.facebook.com/")) {
			System.out.println("login suceess");
		} else {
			System.out.println("login fail");
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hetalpatel1208@outlook.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Love1234hetal");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("nehapatel");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_oBH8EPLzLiD sx_390be8']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();

		driver.close();
		
		
		
	}

}
