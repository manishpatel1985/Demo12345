package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckVisibilityElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		
		//isDisplayed()method :- it shows if that perticular element is avaiable on the page.
		boolean b1 = driver.findElement(By.xpath("//span[text()='Log In']")).isDisplayed(); //if submit button is displayed on the page it should return true.
		System.out.println(b1);
		
		// isEnabled()method :-
		boolean b2 = driver.findElement(By.xpath("//span[text()='Log In']")).isEnabled();
		System.out.println(b2);
		
		// isSelected()method :- 
		//only applicable for checkbox, dropdown, rediobutton :-
		
		
		//de-select the checkbox :-
		//just click on the same button to deselect the element.
		
		
		
		
		
		
		
		
	}

}
