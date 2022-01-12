package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.training-in-chennai.com/");
		WebElement mainmenu = driver.findElement(By.xpath("//*[@id=\'header\']/header/div[2]/div/div/div/nav/div[2]/ul/li[2]/a"));
		WebElement Submenu = driver.findElement(By.xpath("//*[@id=\'header\']/header/div[2]/div/div/div/nav/div[2]/ul/li[2]/ul/li/div/div/div[4]/ul[1]/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(mainmenu).moveToElement(Submenu).click().build().perform();
	}

}
