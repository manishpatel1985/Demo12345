package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		driver.get("http://www.freecrm.com");
		
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Log In']"));
		// draw border on login button.
		drawBorder(loginbtn, driver);
		//generate alert
		generateAlert(driver, "There is an issue with login button  on login page");
		
		driver.switchTo().alert().accept();
		//click on element by javascirpt
		clickonElementByJS(loginbtn, driver);
		
	}
	
	
		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid blue'", element);
		
		}
		
		public static void generateAlert(WebDriver driver, String message) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("alert('"+message+"')");
		}
		
		public static void clickonElementByJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
			
		}


}
