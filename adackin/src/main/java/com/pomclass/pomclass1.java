package com.pomclass;

import org.openqa.selenium.WebDriver;

import com.hotel.adackin.bassclass;

public class pomclass1 extends bassclass {
	
	
		public static WebDriver driver;
		
		public pomclass1(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			
			
			driver = getdriver("chrome");
			geturl("http://adactinhotelapp.com/");
			
			
			
			pomclass2 obj1 = new pomclass2(driver);
			
		}
		
		
		
		
	}


