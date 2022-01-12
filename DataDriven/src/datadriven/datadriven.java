package datadriven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriven {

	public void registration() throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		File object = new File("D:\\sample test data.xls");
		
		Workbook workbook = Workbook.getWorkbook(object);	
		
		Sheet sheet = workbook.getSheet("Sheet1");
		System.out.println("number of rows in excel sheet: "+sheet.getRows());
		System.out.println("number of column in excel sheet:"+sheet.getColumns());
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
		
		for (int i=1;i<sheet.getRows();i++) {
			try {
				String Username = sheet.getCell(0,i).getContents();
				String Password = sheet.getCell(1,i).getContents();
				driver.findElement(By.xpath("//*[@id=\'email-or-phone\']")).sendKeys(Username);
				driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(Password);
				driver.navigate().refresh();
				
			}
			catch(Throwable r) {
				System.out.println("something went wronggggg");
				driver.navigate().refresh();
			}
		}
		
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		
		datadriven obj =new datadriven();
		obj.registration();
		
	}
}

