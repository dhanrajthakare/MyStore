package com.mystore.testcases;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.Base;
import org.testng.annotations.Parameters;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.BasketPage;
import com.mystore.pageobjects.CheckoutPage;
import com.mystore.pageobjects.LandingPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.MyAccountPage;
import com.mystore.pageobjects.ShopPage;
import com.mystore.utility.ExcelLibrary;

public class LandingPageTest extends Base{
	LandingPage landPage;
	LoginPage login;
	MyAccountPage myAccount;
	ShopPage shopPage;
	BasketPage basket;
	CheckoutPage chkout;
	
	  @Parameters("browser")
	  @BeforeMethod (groups= {"smoke"})
	  public void setup(String browserName) { 
		  System.out.println("Before mehtod");
		  launchApp(browserName); 
	  }
	  
	  
	  @AfterMethod (groups= {"smoke"})
	  public void tearDown() { 
		  System.out.println("After mehtod");
		  driver.quit(); 
	  }
	  
	  @Test(groups= {"smoke"})
	  public void validateTitle() {
		  landPage = new  LandingPage(); 
		  String actualTitle = landPage.getMyStoreTitle();
		  Assert.assertEquals(actualTitle,"Automation Practice Site"); 
	  }
	  
	  @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	  public void loginToApplication(String uname, String pwd) throws InterruptedException { 
		  landPage = new LandingPage(); 
		  login = landPage.clickOnMyAccount(); 
		  myAccount = login.login(uname,pwd);
		  shopPage = myAccount.clickOnShop(); 
		  shopPage.clickOnAddToBasket(); 
		  basket = shopPage.clickOnViewCart(); 
		  chkout = basket.clickOnCheckout();
		  Assert.assertEquals(chkout.getTitle(),"Billing Details"); 
		}
	 
}
