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

public class BrokenLinksConcept {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		//BrokenLinks();
		//BrokenLinks1();
		//brokenLinks2();
		//brokenLinks3();
		linksBorken();
	}
	public static void BrokenLinks() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com");
		
		List<WebElement>linklist= driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total number of link and Img are ==>"+linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0; i<linklist.size(); i++) {
			//System.out.println(linklist.get(i).getAttribute("href"));
		if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript")&& (!linklist.get(i).getAttribute("href").contains("mailto")))) {
			activelinks.add(linklist.get(i));
			
			
		}
		}	
		System.out.println("size of active links and images ==>"+activelinks.size());
		
		for (int j =0;j<activelinks.size();j++) {
			
		System.out.println(activelinks.get(j).getAttribute("href"));
		HttpURLConnection connection =(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"====>"+response);
			
			
			
		}
		
	}
	
	
	public static void BrokenLinks1() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total number of links and images are ==>"+linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++) {
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript")&& (!linklist.get(i).getAttribute("href").contains("mailto")))) {
				activelinks.add(linklist.get(i));
		}
		}
		
		System.out.println("Total number of active links and images are==>"+activelinks.size());
		
		for(int j=0;j<activelinks.size();j++) {
			HttpURLConnection connection = (HttpURLConnection)	new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href")+"===>"+response);
			
			
			
		}
		
	
	}
	
	public static void brokenLinks2() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// make object of chromeoptions class
		options.addArguments("window-size=1400,800");// add this argument
		options.addArguments("headless");// add this argument
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.guru99.com/");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total number of links and images are===>"+linklist.size());
		
		List<WebElement>activelinks = new ArrayList<WebElement>();
		
		for (int i=0;i<linklist.size();i++) {
			//System.out.println(linklist.get(i).getAttribute("href"));
		if(linklist.get(i).getAttribute("href") != null && (!linklist.get(i).getAttribute("href").contains("javascript"))){
			activelinks.add(linklist.get(i));
			}
			}
		System.out.println("Total number of Active links and images are ===>"+activelinks.size());
		
		
		for(int j=0;j<activelinks.size();j++) {
		HttpURLConnection	connect =	(HttpURLConnection)new URL (activelinks.get(j).getAttribute("href")).openConnection();
		connect.connect();
		connect.getResponseMessage();
		connect.disconnect();
		
		System.out.println(activelinks.get(j).getAttribute("href")+"===>"+connect.getResponseMessage());
		
		
		}
		}
	
		public static void brokenLinks3() throws MalformedURLException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();// make object of chromeoptions class
			options.addArguments("window-size=1400,800");// add this argument
			options.addArguments("headless");// add this argument
			WebDriver driver= new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.get("https://www.qtpselenium.com/");
			
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total number fo links and img are===>"+linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++) {
			//System.out.println(linklist.get(i).getAttribute("href"));
			
		if(linklist.get(i).getAttribute("href")!= null &&(!linklist.get(i).getAttribute("href").contains("mailto"))&& (!linklist.get(i).getAttribute("href").contains("javascript"))) {
			activelinks.add(linklist.get(i));//we have filter out links with null attibutes
		}
		}
		System.out.println("Total number of active links and img are===>"+activelinks.size());
		
		for(int j=0; j<activelinks.size();j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL (activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response= connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"===>"+response);
			
		}
			
		}
		
		public static void linksBorken() throws MalformedURLException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.guru99.com/");
			
		List<WebElement>linklist= driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total number of links are===>"+linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i =0;i<linklist.size();i++) {
			if(linklist.get(i).getAttribute("href")!= null &&(!linklist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linklist.get(i));
			}
			}
		
			System.out.println("Total number of activelinks are ===>"+activelinks.size());
			
		for(int j=0;j<activelinks.size();j++) {
			
			HttpURLConnection	connection= (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href")+"===>"+connection.getResponseMessage());
			
			
		}
		
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

