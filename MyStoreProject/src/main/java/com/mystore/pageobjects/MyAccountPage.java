package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class MyAccountPage extends Base{
	
	@FindBy(xpath="//li/a[text()='Dashboard']")
	WebElement dashboard;
	
	@FindBy(xpath="//li/a[text()='Orders']")
	WebElement orders;
	
	@FindBy(xpath="//li/a[text()='Addresses']")
	WebElement address;
	
	@FindBy(xpath="//li/a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//li/a[text()='Shop']")
	WebElement shopLink;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSection(String section) {
		switch(section) {
			case "Dashboard" :  dashboard.click();
								break;
			case "Orders" :  orders.click();
								break;
			case "Addresses" :  address.click();
								break;
			case "Logout" :  logout.click();
								break;
		}
	}	
	
	public ShopPage clickOnShop() throws InterruptedException {
		Thread.sleep(300);
		shopLink.click();
		return new ShopPage();
	}
}
