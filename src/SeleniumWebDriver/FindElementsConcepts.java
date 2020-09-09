package SeleniumWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//1. get the total counts of links on the page
		//2. get the text of each link on the page
		//3. with driver.findElements(By.tagName("a")); we do not use any .sendkeys or .click method.

		//List <WebElement> linklist = driver.findElements(By.tagName("iframe"));
		// size of link list:
		
		List<WebElement> test  =driver.findElements(By.tagName("input"));
		
		System.out.println(test.size());
		
		
		driver.close();
		
		
		
		
		
		

	}

}
