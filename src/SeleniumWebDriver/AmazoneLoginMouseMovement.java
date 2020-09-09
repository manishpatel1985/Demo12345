package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AmazoneLoginMouseMovement {

	public static void main(String[] args) throws InterruptedException, IOException {
		Amazone1();
		
		
	}
	
	public static void Amazone1() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\SeleniumWebDriver\\configue.properties");
		prop.load(ip);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		String s = driver.getCurrentUrl();
		if(s.equals("https://www.amazon.co.uk/")) {
			System.out.println("Loging Sucess");
		}else {
			System.out.println("login fail");
		}
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.cssSelector("#continue")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Manish']"))).build().perform();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#nav-item-signout > span")).click();
		
		
		Thread.sleep(2000);
		
		
		driver.close();
	}
	
	

}
