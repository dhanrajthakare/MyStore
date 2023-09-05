package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class CheckoutPage extends Base{
	
	@FindBy(xpath="//h3[text()='Billing Details']")
	WebElement chkoutTitle;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
		
	public String getTitle() {
		return chkoutTitle.getText();
	}
}
