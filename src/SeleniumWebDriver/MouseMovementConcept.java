package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		MouseMovementConcept obj = new MouseMovementConcept();
		
		//obj.Spicejet1();
		//System.out.println("******************************");
		//Thread.sleep(2000);
		//obj.Spicejet();
		//SouthallTravel();
		//autoMationTesting();
		method1();
		
	}
	
	public static void method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Add-Ons']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Hot Meals ']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[text()=' Ahmedabad (AMD)']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[text()=' Guwahati (GAU)']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//td[@data-month='7']//a[text()='16']")).click();

		driver.findElement(By.xpath("//div[@id='Div1']//button[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//td[@data-month='0' and @data-year='2021']//a[text()='25']")).click();
		
		driver.close();
	}
	
	
	
	
	public void Spicejet1() throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		String s = driver.getTitle();
		
		System.out.println(s);
		if(s.equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets")) {
			System.out.println("title is accurate");
		}else {
			System.out.println("title is not accurate");
		}
		
		Actions action = new Actions(driver);//create the object of  action class to perfome mouse hower movements
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='SpiceMax ']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(4000);

		driver.close();
		
	}
	
	public void Spicejet() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/Default.aspx");
		String s = driver.getTitle();
		System.out.println(s);
		
		if(s.equals("spicejet")) {
			System.out.println("title is correct");
		}else {
			System.out.println("title is incorrect");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Member Login")).click();
		
		driver.navigate().back();
		
		driver.close();
		
	}
	
	public static void SouthallTravel () throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.southalltravel.co.uk/?gclid=EAIaIQobChMImeLZmqf16QIVgbTtCh2C-AT6EAAYASAAEgJybfD_BwE");
		
		Thread.sleep(2000);
		
		
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//a[text()='COVID-19 Update']"))).perform();
		driver.findElement(By.linkText("COVID-19 Package Update")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	public static void autoMationTesting() throws InterruptedException {
		//System.setProperty("webdriver.driver.geckodriver", "C:\\Selenium\\driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
		
		
		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		
		
		driver.navigate().back();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='SwitchTo']")));
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
	
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='SwitchTo']")));
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
