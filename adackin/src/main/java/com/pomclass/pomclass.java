package com.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomclass {
	
	@FindBy(xpath="//*[@id=\'username\']")
	
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	

}
