package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CalenderSelectbyJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		SpiceJetDatepicket();
		//SouthallTravelDate();
	}
	
	public static void SpiceJetDatepicket() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String datevalue = "30-12-2020";
		
		selectDatebyJS(driver, date, datevalue);
		
		Thread.sleep(6000);
		
		driver.close();
		
		
		
		
	}
	
	public static void selectDatebyJS(WebDriver driver, WebElement element, String datevalue) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');",element);
		
	}
	
	public static void SouthallTravelDate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.southalltravel.co.uk/");
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"deptdt\"]"));
		
		String datevalue = "12/30/2020";
		
		selectDatebyJS(driver, date, datevalue);
		
		
	}

}
