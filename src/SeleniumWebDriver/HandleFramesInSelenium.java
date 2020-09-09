package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/demos/");
		
		//driver.switchTo().frame(0); //to swtich from page to frame inside web page.
		
		driver.findElement(By.linkText("Development")).click();
		
		//driver.close();
		
		

	}

}
