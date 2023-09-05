package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class BasketPage extends Base{

	@FindBy(xpath="//a[contains(text(),'Proceed to Checkout')]")
	WebElement checkoutBtn;
	
	public BasketPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutPage clickOnCheckout() {
		checkoutBtn.click();
		return new CheckoutPage();
	}
}
