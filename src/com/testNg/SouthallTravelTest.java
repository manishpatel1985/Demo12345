package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class SouthallTravelTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		/*op.addArguments("window-size=1400,800");// add this argument
		op.addArguments("headless");// add this argument
*/		driver= new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.southalltravel.co.uk/");
		driver.findElement(By.xpath("//button[@class='cks']")).click();
	}
	
	@Test(priority=1)
	public void getTitle() {
	String Title=driver.getTitle();
	/*if(s.equals("Cheap Flights and Holidays - Call 0208 843 4444 - Southall Travel")) {
		System.out.println("Title accurate");
		}else {
			System.out.println("title not accurate ");
		}*/
	Assert.assertEquals(Title , "Cheap Flights and Holidays - Call 0208 843 4444 - Southall Travel");
	
	}

	
	@Test(priority=2)
	public void selectTicket() throws InterruptedException {
		driver.findElement(By.id("DestinationFrom1")).sendKeys("LHR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'London Heathrow Airport (')]")).click();
		driver.findElement(By.id("DestinationTo")).sendKeys("amd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sardar Vallabhbhai Patel Intl  (')]")).click();
		
	}
	
	@Test(priority=3)
	public void selectDeparturedate() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='depdateit']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//td[@data-month='11' and @data-year='2020']//a[text()='15']")).click();
	}
	
	@Test(priority=4)
	public void selectArrivalDate() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='retdateit']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//td[@data-month='0']//a[text()='15']")).click();
	}
	
	@Test(priority=5)
	public void mouseMovement() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='COVID-19 Update']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COVID-19 Package Update")).click();
	}
	
	@Test(priority=6)
	public void selectAirline() throws InterruptedException {
		Select select = new Select(driver.findElement(By.xpath("//select[@id='AirLineCode1']")));
		select.selectByVisibleText("British Airways");
		Thread.sleep(2000);
		
	}
	@Test(priority=7)
	public void selectCabinClass() throws InterruptedException {
		Select select = new  Select(driver.findElement(By.xpath("//select[@id='Flightclass']")));
		select.selectByVisibleText("First");
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void clickOnSearch() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='BtnSearch']")).click();
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
