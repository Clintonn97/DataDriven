package seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumpractice3 {
	
	public static void main(String[] args) {
		
		//syntax for open a browser
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.training-in-chennai.com/");
		//implicit wait
		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    //explicit weight
	
	    WebDriverWait wait = new WebDriverWait(driver,30);   //WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'header\']/header/div[2]/div/div/div/nav/div[2]/ul/li[3]/a")));
        
        
		WebElement obj = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div[2]/div/div/div/nav/div[2]/ul/li[2]/a"));
		WebElement obj1 = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div[2]/div/div/div/nav/div[2]/ul/li[2]/ul/li/div/div/div[4]/ul[1]/li[3]/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(obj).moveToElement(obj1).click().build().perform();
		
		
		
	}

}
