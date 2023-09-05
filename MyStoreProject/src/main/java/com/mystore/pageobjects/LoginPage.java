package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class LoginPage extends Base{

	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public MyAccountPage login(String user,String pswd) {
		userName.sendKeys(user);
		password.sendKeys(pswd);
		loginButton.click();
		return new MyAccountPage();
	}
}
