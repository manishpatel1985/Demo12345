package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		// to read the properties file we need to make the object of properties class.
		Properties prop = new Properties();
		
		// give the path of the file u need to read.
		FileInputStream ip = new FileInputStream("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\SeleniumWebDriver\\Registration.properties");
		
		// to load the file use prop.load method.
		prop.load(ip);
		
		// to read property from th file use prop.getProperty method.
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		String url = prop.getProperty("URL");
		System.out.println(url);
		//######################################################################
		
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browserName.contains("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(url);
		
		
		
	}
	
	

}
