package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practise1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.southalltravel.co.uk/");
		driver.findElement(By.id("DestinationFrom1")).sendKeys("lhr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='London Heathrow Airport (']")).click();

		driver.findElement(By.xpath("//input[@id='DestinationTo']")).sendKeys("ahm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sardar Vallabhbhai Patel Intl  (AMD), India']")).click();
		driver.findElement(By.xpath("//input[@id='deptdt']")).click();
		Thread.sleep(2000);
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		selectmonth.selectByVisibleText("Dec");
		
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		selectyear.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//a[contains(text(),'24')]")).click();
		
		driver.findElement(By.id("rtndt")).click();
		Thread.sleep(2000);
		
		WebElement returnmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		WebElement returnyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select selectreturnmonth = new Select(returnmonth);
		selectreturnmonth.selectByVisibleText("Jan");
		
		Thread.sleep(4000);
		
		Select selectreturnyear = new Select(returnyear);
		selectreturnyear.selectByVisibleText("2021");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'24')]")).click();
		
		Select selectadult = new Select(driver.findElement(By.id("AdultCnt")));
		selectadult.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//span[contains(text(),'Direct Flights')]")).click();
		
		Select selectairline = new Select(driver.findElement(By.xpath("//select[@id='AirLineCode1']")));
		selectairline.selectByVisibleText("Air India");
		
		Select selectcabliclass = new Select(driver.findElement(By.id("Flightclass")));
		selectcabliclass.selectByVisibleText("Economy");
		
		driver.findElement(By.xpath("//input[@id='button_flight_search']")).click();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}

}
