package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		/*Test1();
		System.out.println("******************************");
		Thread.sleep(2000);
		Test2();
		System.out.println("******************************");
		Thread.sleep(2000);
		Test3();
		System.out.println("******************************");
		Thread.sleep(2000);
		Test4();
		System.out.println("******************************");
		Thread.sleep(2000);*/
		Santander();
	}
	
	public static void Test1() {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
	
		// now to switch from partent window to child window we have
		// one method call driver.getWindowHandles()
		
		Set<String> obj1 =  driver.getWindowHandles();// to find window id of parent window and child window.
		//the value of window id are not stored on a index basis in the set object.
		// so we can not use for loop to get the id.
		
		// to get value of the set object we need to use iterator.
		Iterator<String>it = obj1.iterator();
		
	
		String Parentwindowid = it.next();
		System.out.println("Parent window id"+Parentwindowid);
		
		String Childwindowid = it.next();
		System.out.println("Childwindow id"+Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		String s = driver.getTitle();
		if(s.equals("PopupTest Tuesday June, 09 2020")) {
			System.out.println("Programme is Correct");
		}else {
			System.out.println("Programme is not Correct");
		}
		System.out.println("ChildWindowId title is "+s);
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		String s1= driver.getTitle();
		System.out.println("Parent Window id title is"+s1);
		driver.close();
		
		
	}
	
	public static void Test2() {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set<String> obj2 = driver.getWindowHandles();
		
		Iterator<String>obj1 = obj2.iterator();
		
		String ParentWindowid = obj1.next();
		System.out.println("ParentWindowid is"+ParentWindowid);
		
		String ChildWindowId= obj1.next();
		System.out.println("ChildWindowId is "+ ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		String a = driver.getTitle();
		System.out.println("ChildWindow title is "+ a);
		driver.close();
		
		driver.switchTo().window(ParentWindowid);
		String a1 = driver.getTitle();
		System.out.println("ParentWindowtitle is"+a1);
		driver.close();
		
		
	}
	
	public static void Test3() {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		//a[text()='Good PopUp #3']
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		Set<String> obj3 = driver.getWindowHandles();
		
		Iterator<String>it = obj3.iterator();
		
		String Parentwindowid= it.next();
		System.out.println("parentwindowid"+Parentwindowid);
		
		String Childwindowid = it.next();
		System.out.println("Childwindowid"+Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		String w = driver.getTitle();
		System.out.println("Childwindow title is "+ w);
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		String w1= driver.getTitle();
		System.out.println("Parentwindow title is "+w1);
		driver.close();
	}
	
	public static void Test4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #4']")).click();
		
		Set<String>obj = driver.getWindowHandles();
		
		Iterator<String>it = obj.iterator();
		
		String Parentwindowid = it.next();
		System.out.println("Parentwindowid is "+Parentwindowid);
		
		String Childwindowid = it.next();
		System.out.println("Childwindowid is "+ Childwindowid);
		
		driver.switchTo().window(Childwindowid);
		String a = driver.getTitle();
		System.out.println("Childwindow title is "+a);
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		String a1=driver.getTitle();
		System.out.println("Parentwindow title is "+a1);
		driver.close();
		
		
	}
	
	public static void clickOn1(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void Santander() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.santander.co.uk/");
		
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log on']")).click();
		
		Set<String>handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();
		String Childwindowid = it.next();
		System.out.println(Childwindowid);
		String Parentwindowid = it.next();
		System.out.println(Parentwindowid);
		
		driver.switchTo().window(Childwindowid);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(Parentwindowid);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
