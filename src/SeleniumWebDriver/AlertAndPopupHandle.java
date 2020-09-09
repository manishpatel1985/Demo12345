package SeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertAndPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		RediffLoginAlert();
		//Alert1();
		
	}
	
	public static void RediffLoginAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//hread.sleep(4000);
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		
		Thread.sleep(4000);
		
		driver.close();
	}
	
	public static void Alert1() throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert a = driver.switchTo().alert();
		
		String s = a.getText();
		
		System.out.println(a.getText());
		if(s.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert msg");
		}else {
			System.out.println("in correct Alert msg");
		}
		
		Thread.sleep(4000);
		
		a.accept();// click on ok button
		
		//a.dismiss();// for click on cancel button
		
		driver.close();

	}
	
	

}
