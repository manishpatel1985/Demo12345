package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ReadProp1 {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get("https://www.rediff.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
		System.out.println("Title is correct");
	}else {
		System.out.println("title is not correct");
	}
	
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	
	
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys("manishpatel");
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys("manish_11223");
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input.btn_checkavail")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).sendKeys("hello_123+");
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).sendKeys("hello_123+");
	
	driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).sendKeys("hetal.patel1208@gmail.com");
	
	//driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(16) > td:nth-child(2) > table > tbody > tr > td:nth-child(1) > input")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@src='http://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
	
	driver.findElement(By.cssSelector("#country_id > ul > li:nth-child(3)")).click();
	
	driver.findElement(By.id("mobno")).sendKeys("7888463799");
	
	Select selectdate = new Select(driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(1)")));
	
	selectdate.selectByValue("12");
	
	Select selectmonth = new Select(driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(2)")));
	
	selectmonth.selectByValue("05");
	
	Select selectyear = new Select(driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(3)")));
	
	selectyear.selectByValue("1981");
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(25) > td:nth-child(3) > input[type=radio]:nth-child(1)")).click();
	
	Select selectcountry = new Select(driver.findElement(By.id("country")));
	
	selectcountry.selectByVisibleText("United Kingdom");
	
	driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(33) > td:nth-child(3) > input")).sendKeys("YEHW");
	
	driver.findElement(By.id("Register")).click();
	Thread.sleep(4000);
	driver.close();
	
	
	}

}
