package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxBrowserScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.google.co.uk/");
		
		String s = driver.getCurrentUrl();
		if(s.equals("https://www.google.co.uk/")) {
			System.out.println("login successful");
		}else {
			System.out.println("login fail");
		}
			
		Thread.sleep(3000);
		
		driver.quit();	
		

	}

}
