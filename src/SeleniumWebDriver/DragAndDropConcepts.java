package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);  //use only if frames are availabe in the page. to find 
		// if frame is there right click on the web page and select view page source
		// press ctrl+f and search for iframe tag if there is one frame its 0 but
		// if there is more than one frame start first frame is 0 then 1 and 2.
		// as per new guideline form www developer are not putting frames in the webpage.
		
		Actions a = new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
