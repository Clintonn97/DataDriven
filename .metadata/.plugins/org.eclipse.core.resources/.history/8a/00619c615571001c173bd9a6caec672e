package seleniumlearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	


	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/clinton97/Downloads/alert.html");
		
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		//alert handling
	
		Alert A = driver.switchTo().alert();
		System.out.println(A.getText());
		Thread.sleep(2000);
		A.accept();
		
		
		
	}

}
