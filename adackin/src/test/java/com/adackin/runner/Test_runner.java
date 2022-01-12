package com.adackin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hotel.adackin.bassclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\test\\java\\com\\adackin\\featurefile\\com.feature",glue = "com.adackin.stepdefinition")
public class Test_runner {
	
	public static WebDriver driver;
	private void Set_up() {
		// TODO Auto-generated method stub
        
		
		driver = bassclass.getdriver("chrome");
	}
	private void tear_down() throws InterruptedException{
		// TODO Auto-generated method stub
        Thread.sleep(5000);
	}
	
}


