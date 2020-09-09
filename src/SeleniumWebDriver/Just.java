package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import sun.awt.windows.ThemeReader;
import sun.awt.www.content.audio.x_aiff;



public class Just {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/Create");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='main-sidebar']/div[@class='sidebar']/ul[@class='sidebar-menu tree']/li[4]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//span[text()='Customers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='btn bg-blue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ancde@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("unbheio");
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ujnhu");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kmdkekke");
		driver.findElement(By.xpath("//input[@id='Gender_Male']")).click();
		driver.findElement(By.xpath("//input[@id='DateOfBirth']")).sendKeys("12/09/1988");
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("gmete");
		driver.findElement(By.xpath("//input[@id='IsTaxExempt']")).click();
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@id='SelectedNewsletterSubscriptionStoreIds']"))));*/
		
		
		driver.findElement(By.xpath("//input[@class='k-input k-readonly']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Your store name']")).click();

	}

}
