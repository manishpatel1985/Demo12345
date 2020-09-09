package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CalenderSelectConcept {

	public static void main(String[] args) throws InterruptedException {
		//Calender();
		//SouthallTravelDatePick();
		JqueryDatePicker();
	}
	
	public static void Calender() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
		//driver.close();
		clickon(driver, driver.findElement(By.name("email")), 20);
		driver.findElement(By.name("email")).sendKeys("hirenmehta2002@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hiren2020");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[@class='calendar icon']")).click();
		
		driver.findElement(By.xpath("//i[@class='chevron right icon']")).click();
		driver.findElement(By.xpath("//i[@class='chevron right icon']")).click();
		driver.findElement(By.xpath("//i[@class='chevron right icon']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ui > div > div.ui.fluid.container > div.ui.fluid.container > div > div.ui.fluid.container.main-content > div > div.ui.segment.calendar-wrapper > div > div.rbc-month-view > div:nth-child(5) > div.rbc-row-content > div > div:nth-child(3) > a")).click();
		Thread.sleep(2000);
		driver.close();
		}
	
	public static void clickon(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	
	public static void SouthallTravelDatePick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.southalltravel.co.uk/");
		driver.findElement(By.id("deptdt")).click();
		
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		selectmonth.selectByVisibleText("Sep");
		
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		selectyear.selectByVisibleText("2020");
		driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='21']")).click();
		Thread.sleep(2000);
		driver.close();
		}
	
	
	public static void JqueryDatePicker() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='21']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
