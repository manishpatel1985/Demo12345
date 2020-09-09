package SeleniumWebDriver;

import com.excel.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforexpath_company = "//*[@id=\"customers\"]/tbody/tr[" ;
		String afterxpath_company= "]/td[1]" ;
		
		
		String beforexpath_contacts = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath_contacts = "]/td[2]" ;
		
		
		String beforexpath_coutry = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath_country = "]/td[3]" ;
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size()-1);
		rows.size();
		
		Xls_Reader reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\June2020SeleniumWebdriver\\src\\com\\testdata\\rediffmailtest.xlsx");
		reader.addSheet("TableData");
		reader.addColumn("TableData", "companyname");
		reader.addColumn("TableData", "contactsname");
		reader.addColumn("TableData", "countryname");
		
		
		for(int i=2;i<=rows.size();i++) {
			
			String actualxpath_company = beforexpath_company+i+afterxpath_company;
			String companyname = driver.findElement(By.xpath(actualxpath_company)).getText();
			System.out.println(companyname);
			reader.setCellData("TableData", "companyname", i, companyname);
			
			String actualxpath_contacts = beforexpath_contacts + i + afterxpath_contacts;
			String contactsname = driver.findElement(By.xpath(actualxpath_contacts)).getText();
			System.out.println(contactsname);
			
			reader.setCellData("TableData", "contactsname", i, contactsname);
			
			String actualxpath_countyr = beforexpath_coutry+i+afterxpath_country;
			String countryname = driver.findElement(By.xpath(actualxpath_countyr)).getText();
			System.out.println(countryname);
			
			reader.setCellData("TableData", "countryname", i, countryname);
			
			
		}
		
		
		
		

	}

}
