import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class testngdemo1 {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	}
	@AfterSuite
	public void logout() {
		
	//driver.quit();
	}
	
	@Test
	public void draganddrop() {
		
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(
		 * ".demo-frame")));
		 * 
		 * WebElement Sourcelocator =
		 * driver.findElement(By.cssSelector(".ui-draggable")); WebElement
		 * Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		 * draganddrop2(Sourcelocator,Destinationlocator);
		 */
		
		
		  WebDriverWait wait = new WebDriverWait(driver,15);
		  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame"))); //.ui-draggable, .ui-droppable.ui-draggable, .ui-droppable
		  WebElement dragable = driver.findElement(By.cssSelector(".ui-draggable"));
		  WebElement dropable = driver.findElement(By.cssSelector(".ui-droppable"));
		  
		  draganddrop2(dragable, dropable);
		 
	}
	public void draganddrop2(WebElement SourceElement, WebElement DistinationElement) {
		(new Actions (driver)).dragAndDrop(SourceElement, DistinationElement).perform();//dragAndDrop is inbuilt function in action.
		
		
	}
	

}
