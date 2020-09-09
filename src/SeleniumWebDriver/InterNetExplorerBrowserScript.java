package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InterNetExplorerBrowserScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		String s = driver.getTitle();
		if(s.equals("Facebook – log in or sign up")) {
			System.out.println("login sucess");
		} else {
			System.out.println("login fail");
		}
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
		

	}

}
