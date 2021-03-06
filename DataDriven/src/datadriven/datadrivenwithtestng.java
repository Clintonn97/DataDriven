package datadriven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class datadrivenwithtestng {
	static String driverpath="D:\\driver\\chromedriver.exe";
	public static WebDriver driver;
	public WebDriverWait wait;
	String appurl="https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join";
	By byemail =By.xpath("//*[@id=\'email-or-phone\']");
	By bypassword = By.xpath("//*[@id=\"password\"]");
	
	@BeforeSuite
	
	public void testsetup() {
		System.setProperty("webdriver.chrome.driver",driverpath );
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		wait = new WebDriverWait(driver,10);
		
			}
	//using datadriven in @DataProvider
    @DataProvider(name = "logindata")
    public Object [][]logindata(){
    	Object [][] arrayobject = getexceldata("D:\\sample test data.xls","Sheet1");
    	return arrayobject;
    	
    }
    public String [][]getexceldata(String filename, String Sheetname){
    	String [][]arrayexceldata = null;
    	try {
    		File file = new File(filename);
    		Workbook book = Workbook.getWorkbook(file);
    		Sheet sheet = book.getSheet(Sheetname);
    		int noofcols = sheet.getColumns();
    		int noofrows = sheet.getRows();
    		arrayexceldata =  new String[noofrows-1][noofcols];
    		for(int i=1;i<noofrows;i++) {
    			for(int j=0;j<noofcols;j++) {
    				arrayexceldata[i-1][j]=sheet.getCell(j,i).getContents();
    				
    			}
    		}
    	}
    	catch (Throwable r) {
    		System.out.println("somethingwentwronggg");
    		
    	}
    	return arrayexceldata;
    	
    }
    @Test(dataProvider = "logindata")
    public void registration(String Username, String Password) {
    	driver.get(appurl);
    	driver.findElement(byemail).sendKeys(Username);
    	driver.findElement(bypassword).sendKeys(Password);
    	driver.navigate().refresh();
    }
    
    

}
