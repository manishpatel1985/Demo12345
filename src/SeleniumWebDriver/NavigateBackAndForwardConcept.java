package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigateBackAndForwardConcept {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.ebay.com/");
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.close();

	}

}
