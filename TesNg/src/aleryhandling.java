import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class aleryhandling {
	
	  WebDriver driver;
	  
	  @BeforeSuite
	public void alerthandling() {

  
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("file:///C:/Users/clinton97/Downloads/alert.html");
		driver.manage().window().maximize();
		
		
	}
      @Test
      public void alerthandling1() {
    	  driver.findElement(By.xpath("/html/body/fieldset/button")).click();
    	  Alert obj = driver.switchTo().alert();
    	  System.out.println(obj.getText());
    	  obj.accept();
    	  
    	  
      }
      
}