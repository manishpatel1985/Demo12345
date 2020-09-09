package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script5OrangeHrm {

	

	public void Login() throws InterruptedException {
		
		
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.orangehrm.com/?gclid=EAIaIQobChMIl7Hcg67j6QIV1GDmCh2Jww02EAAYASAAEgL7V_D_BwE");
		
		String s = driver.getTitle();
		
		if(s.equals("HR Management System | HR Management Software | OrangeHRM")) {
			System.out.println("login sucess");
		} else {
			System.out.println("login not done");
		}
		
		System.out.println(s);
		
		driver.findElement(By.xpath("//span[@class='home-btn']//a[contains(@class,'btn-orange trial-btn pulse')][contains(text(),'FREE 30 Day Trial')]")).click();
		
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("manish patel");
		
		Thread.sleep(4000);
		
		driver.quit();
	
	}
	
	
		
		
	}
	
	

