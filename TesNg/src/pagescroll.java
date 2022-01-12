import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class pagescroll {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		
	}
	/*
	 * // @AfterMethod public void quitbrowser() { driver.quit();
	 */
		
	//}
	//@Test
	public void scrollfullheight() {
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.linkText("Companies")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	  //@Test
	  public void scrolltoviewelement() {
	  
	  WebElement element = driver.findElement(By.linkText("Marketing"));
	  ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", element);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	}
	  
	  @Test 
	  public void scrollbasedonpixel() {
	  
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	  
	 
}

