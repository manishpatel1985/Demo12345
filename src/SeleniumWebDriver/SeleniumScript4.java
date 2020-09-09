package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumScript4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.orangehrm.com/?gclid=EAIaIQobChMIl7Hcg67j6QIV1GDmCh2Jww02EAAYASAAEgL7V_D_BwE");
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
		driver.findElement(By.xpath("//span[@class='home-btn']//a[contains(@class,'btn-orange trial-btn pulse')][contains(text(),'FREE 30 Day Trial')]")).click();
		
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("manish");
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
