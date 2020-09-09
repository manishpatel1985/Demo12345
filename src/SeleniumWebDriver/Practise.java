package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practise {

	public static void main(String[] args) throws MalformedURLException, IOException {
		guru99();
		//Ndtv();
		/*System.setProperty("webdriver.chrome.drivere", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.santander.co.uk/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log on')]")).click();
		
		Set<String>handle = driver.getWindowHandles();
		Iterator<String>it =handle.iterator();
		String Parentwindowid= it.next();
		System.out.println("ParentWindowId is = "+Parentwindowid);
		if(Parentwindowid.contains("CDwindow-5222DB259C96182E54A4CE1B1D81C88F")) {
			System.out.println("Id is Accutate");
		}else {
			System.out.println("id is not accurate");
		}
		
		String Childwindowid = it.next();
		System.out.println("ChildwindowId is = "+Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		System.out.println("Childwindowtitle is =="+driver.getTitle());
		if(driver.getTitle().contains("Personal Online Banking: Log on or sign up")) {
			System.out.println("title is accurate");
		}else {
			System.out.println("title is not accurate");
		}
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		System.out.println("Parentwindowtitle is =="+driver.getTitle());
		driver.close();
		
		*/

	}
	
	public static void Ndtv() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// make object of chromeoptions class
		options.addArguments("window-size=1400,800");// add this argument
		options.addArguments("headless");// add this argument
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		//System.out.println("Total number of links and images are===>"+linklist.size());
		
		List<WebElement>activelink = new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++) {
			//System.out.println(linklist.get(i).getAttribute("href"));
		if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript"))&&(!linklist.get(i).getAttribute("href").contains("mailto"))) {
			activelink.add(linklist.get(i));
			
		}
		
		}
		System.out.println("Total number of active links and images are==>"+activelink.size());
		
		for(int j=0;j<activelink.size();j++) {
		//System.out.println(activelink.get(j).getAttribute("href"));
		
		HttpURLConnection connection = (HttpURLConnection)new URL(activelink.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();

		System.out.println(activelink.get(j).getAttribute("href")+"====>"+response);
		}
		
	}
	
	public static void guru99() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.guru99.com/");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total number of links and images are===>"+linklist.size());
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++) {
			//System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript"))&&(!linklist.get(i).getAttribute("href").contains("mailto"))){
				activelinks.add(linklist.get(i));
			}
		}
		
		System.out.println("Total number of active links and images are===>"+activelinks.size());
		
		for(int j=0;j<activelinks.size();j++) {
			HttpURLConnection connection =(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"===>"+response);
			
		}
		
		
	}
	
	
	
	
	}	


