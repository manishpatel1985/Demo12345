package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String s = driver.getTitle();
		if(s.equals("Google")) {
			System.out.println("login success");
		} else {
			System.out.println("login fail");
		}
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
