package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class LandingPage extends Base{

	@FindBy(xpath="//*[contains(text(),'new arrivals')]")
	WebElement 	titleLandingPage;
	
	@FindBy(xpath="//li/a[text()='My Account']")
	WebElement myAccountTab;
	
	@FindBy(xpath="//li/a[text()='Shop']")
	WebElement shop;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnMyAccount() {
		myAccountTab.click();
		return new LoginPage();
	}
	
	public ShopPage clickOnShop() {
		return new ShopPage();
	}
	
	public String getMyStoreTitle() {
		return driver.getTitle();
	}
}
