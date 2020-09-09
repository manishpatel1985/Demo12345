package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HeadlessChromeBrowserTesting {
	/*headless browser means the programme will run in background and
	 chormebrowser window will not open.*/
	
	// mandatory requirements for google chrome head less browser testing.
	//1. chrome version should be greater than 59 on mac and greater than 60 on windows
	//2. u have to give window-size=1400,800
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// make object of chromeoptions class
		options.addArguments("window-size=1400,800");// add this argument
		options.addArguments("headless");// add this argument
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		System.out.println("login page title is =="+driver.getTitle());

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manishpatel1985@googlemail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Love1234hetal");
		
		System.out.println("Homepage title is == "+driver.getTitle());
		
		driver.close();
		
		
	}

}
