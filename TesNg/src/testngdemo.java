import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
	
	WebDriver driver;
	@BeforeSuite
	public void A(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("selenium");
		
		
	
	}
	@BeforeTest
    public void B(){
		
		driver.get("https://www.facebook.com/");
    	System.out.println("testng");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
	@BeforeClass
    public void c() {
		
		driver.manage().window().maximize();
		System.out.println("api");
		
    	
    }
	@BeforeMethod
   public void d() {
		driver.navigate().refresh();
		System.out.println("maven");
		
	   
   }
	//@Test(priority=2)
	@Test(enabled=true)
   public void e() {
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("5664");
				System.out.println("ecclipse");
		
	   
   }
	//@Test(priority=1)
	@Test(enabled=false)
	public void e1() {
		
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("5644464");
		
	}
	@AfterMethod
   public void f() {
		driver.navigate().refresh();
		System.out.println("java");
		
	   
	   
   }
	
	@AfterSuite
	   public void g() {
		
		// driver.quit();
			System.out.println("java1");
	}
}

    
  