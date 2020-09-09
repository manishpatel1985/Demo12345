package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HtmalUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
		//There are two main advantages of using htmlunit driver
		//1. Testing is happening in background . There is no browser launching.
		//2. Test case execution happens very fast so it will improve overall performance as well.
		//3. Actions class can not be perfomed.
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		
		System.out.println("Before login title is =="+driver.getTitle());
		
		driver.findElement(By.cssSelector("body > div.page > header > div > nav > div.rd-navbar-inner > div > div.rd-navbar-nav-wrap.toggle-original-elements > ul > a > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#ui > div > div > form > div > div:nth-child(1) > div > input[type=text]")).sendKeys("manishpatel1985@googlemail.com");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Love1234hetal");
		driver.findElement(By.xpath("//div[text()='Login'//*[@id=\"ui\"]/div/div/form/div/div[3]]")).click();
		
		System.out.println("After login title is == "+driver.getTitle());
		
	}

}
