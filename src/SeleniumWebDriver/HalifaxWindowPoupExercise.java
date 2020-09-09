package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HalifaxWindowPoupExercise {

	public static void main(String[] args) throws InterruptedException {
	
		//halifax();
		
		//System.out.println("*****************");
		
		//Thread.sleep(1000);
		
		//haliFax1();
		
		Satnander();
		
		
	}
	
	public static void halifax() throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.halifax.co.uk/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Financial Services Compensation Scheme - Click to open a new window']")).click();
		
		
		Set<String> id = driver.getWindowHandles();
		
		Iterator<String> it = id.iterator();
		
		String ParentWindowid = it.next();
		
		System.out.println("Parentwindowid is "+ParentWindowid);
		
		String Childwindowid = it.next();
		
		System.out.println("ChildWindowid is"+Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		System.out.println("Childwindow title is"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(ParentWindowid);
		System.out.println("Parentwindow title is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void haliFax1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.nationwide.co.uk/");
		
		driver.findElement(By.xpath("//a[@class='twitter']")).click();
		
		Set<String>set = driver.getWindowHandles();
		Iterator<String>it = set.iterator();
		
		String Parentwindowid = it.next();
		String a = driver.getTitle();
		System.out.println("Parentwindow id is = "+ a);
		
		String childwindowid = it.next();
		String b=driver.getTitle();
		System.out.println("Childwindowid is ="+b);
		
		driver.switchTo().window(childwindowid);
		String c = driver.getTitle();
		System.out.println("Childwindow title is ="+c);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		String d = driver.getTitle();
		System.out.println("Parentwindow title is ="+d);
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	public static void Satnander() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notificatios");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.santander.co.uk/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//a[text()='Log on']")).click();
		
		Set<String>handle = driver.getWindowHandles();
		
		Iterator<String>it = handle.iterator();
		
		String Parentwindowid = it.next();
		
		System.out.println("Parentwindow id is=="+Parentwindowid);
		
		String Childwindowid = it.next();
		
		System.out.println("Childwindow id is=="+Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		driver.findElement(By.id("splash-97123-close-button")).click();
		Thread.sleep(2000);
		
		System.out.println("Childwindow title is =="+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		System.out.println("Parentwindow title is== "+driver.getTitle());
		driver.close();
		
	}
	
	

}
