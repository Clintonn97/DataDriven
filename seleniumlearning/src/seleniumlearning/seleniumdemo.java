package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo {
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("value in sendkeys");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("value in sendkeys");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}