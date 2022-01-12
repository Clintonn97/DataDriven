package seleniumlearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice5 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/clinton97/Downloads/alert.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		
		//Alert is a keyword then we have to decalre a variable
		Alert A = driver.switchTo().alert();
		
		System.out.println(A.getText());
		A.accept();
		
		
		
		
	}
	
	

}
