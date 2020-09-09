package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HandleDropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//Select();
		//Select1();
		
		Practice();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//create the object of the select class
		// give the element in constructor of the object
		Select sle = new Select(driver.findElement(By.id("Skills")));
		sle.selectByVisibleText("Android");
		
		WebElement firstele = sle.getFirstSelectedOption();
		System.out.println("first element"+firstele.getText());
		
		List<WebElement> listoptions = sle.getOptions();
		for (WebElement webElement : listoptions) {
			System.out.println("options - "+webElement.getText());
		}
		
		Thread.sleep(4000);
		driver.close();
	}
	
	
	public static  void Select () throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		//select.selectByVisibleText("Australia");
		List<WebElement> list = select.getOptions();
		System.out.println(list.size());
		/*for (int i=0;i<list.size();i++) {
			System.out.println("All the options are===>"+list.get(i).getText());
		}*/
		
		for ( WebElement webElement : list) {
			if(webElement.getText().contains("China")) {
				webElement.click();
			}
			//System.out.println("All the options are===>"+webElement.getText());
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	public static void Select1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Select select = new Select(driver.findElement(By.id("Skills")));
		//select.selectByVisibleText("Client Support");
		List<WebElement>list = select.getOptions();
		
		for (WebElement webElement : list) {// this is an advanced for loop.
			//System.out.println("All available options are  == "+ webElement.getText());
			if(webElement.getText().contains("Client Support")) {
				webElement.click();
				break;
			}
		}
		driver.close();
	}
	
	
	public static void Practice() throws InterruptedException, IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\SeleniumWebDriver\\configue.properties");
		prop.load(ip);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Widgets']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' Accordion ']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Widgets']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' AutoComplete ']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Widgets']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Datepicker ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//td[@data-month='6' and @data-year='2020']//a[text()='30']")).click();
		
		driver.navigate().back();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Widgets']"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()=' Slider ']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(prop.getProperty("Lastname"));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea[@rows='3']")).sendKeys(prop.getProperty("Address"));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("email"));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(prop.getProperty("phone"));
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		
		Thread.sleep(1000);
		
		Select selectskills = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		selectskills.selectByVisibleText("Analytics");
		
		Select selectcountry = new  Select(driver.findElement(By.xpath("//select[@id='countries']")));
		selectcountry.selectByVisibleText("United Kingdom");
		
		Select selectanothercountry = new  Select(driver.findElement(By.xpath("//select[@id='country']")));
		selectanothercountry.selectByVisibleText("New Zealand");
		
		
		
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		selectyear.selectByVisibleText("1988");
		
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		selectmonth.selectByVisibleText("February");
		
		Select selectday = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		selectday.selectByVisibleText("14");
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(prop.getProperty("confrimpassword"));
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
