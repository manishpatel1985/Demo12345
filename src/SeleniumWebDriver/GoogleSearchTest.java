package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		//SearchTesting();
		//SearchSelanium();
		//India();
		//Australia();
		//EspnCricinfo();
		//airChina();
		//airbnb();
		donaldTrup();
	}	
	
	public static void SearchTesting () {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[(text()= 'testing')]"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing for key workers")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
	
	}
	
	public static void SearchSelanium() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.co.uk");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::span[(text()= 'selenium')]"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("selenium testing")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.close();
		
	}
	
	public static void India() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ankita patel");
		List<WebElement>list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[(text()='ankita patel')]"));
		System.out.println("total list are ="+list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("ankita patel facebook")) {
			list.get(i).click();
			break;
		}
		}
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}
	
	public static void Australia() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Australia");
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[text()='australia']"));
		System.out.println(list.size());

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("australia time now")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
}
	
	public static void EspnCricinfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.co.uk");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Cricinfo");
		Thread.sleep(2000);
		List<WebElement>list =driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='sbl1']//span[text()='cricinfo']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("cricinfo england")) {
				list.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void airChina() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Air China");
		List<WebElement>list = driver.findElements(By.xpath("//ul[@class='erkvQe']//span[text()='air china']"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains("air china flights")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.navigate().back();
		driver.close();
		/*for (WebElement webElement : list) {
			if(webElement.getText().contains("air china flights")) {
				webElement.click();
				break;
			}
		}*/
	}
	
	public static void airbnb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("airbnb");
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(list.size());
		
		/*for (WebElement webElement : list) {
			
			if(webElement.getText().contains("airbnb london")) {
				webElement.click();
				break;
			}
			
		}
		*/
		
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getText().equals("airbnb london")) {
				list.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		
		
	}
	
	
	public static void donaldTrup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("donald trump");
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if (webElement.getText().contains("donald trump net worth")) {
				webElement.click();
				break;
			}
			}
			Thread.sleep(2000);
			driver.navigate().back();
			driver.close();
			}
	

		}
