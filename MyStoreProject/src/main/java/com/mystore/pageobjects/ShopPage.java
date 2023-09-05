package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

public class ShopPage extends Base{

	@FindBy(xpath="//ul[contains(@class,'products')]//li[1]//a[text()='Add to basket']")
	WebElement addToBasket;
	
	@FindBy(xpath="//li/a[contains(@class,'wpmenucart')]")
	WebElement viewCart;
	
	public ShopPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToBasket() {
		addToBasket.click();
	}
	
	public BasketPage clickOnViewCart() {
		viewCart.click();
		return new BasketPage();
	}
}
