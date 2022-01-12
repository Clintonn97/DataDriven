package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class controllpart2 {

	
	
	
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/clinton97/Downloads/hjkhk.html");
		driver.findElement(By.xpath("/html/body/form[1]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		WebElement obj = driver.findElement(By.id("s1"));
		obj.click();
		obj.sendKeys("Mercedes");
		obj.sendKeys(Keys.ENTER);
	}
}
