package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice {
	
	public static void main(String[] args) {
		
			//syntax for open a browser
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		//to maximise the browser
		
		driver.manage().window().maximize();
		
		//to give url
		
		//there is two option
		//1st"
		driver.get("https://www.facebook.com");
		//2nd option
		driver.navigate().to("https://www.facebook.com");
		
		//to give a input for a text field
		

		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("javaaselenium");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("fabsbdfiol");
		
		driver.findElement(By.name("login")).click();
		
		
	
				
       
	
	}

}
