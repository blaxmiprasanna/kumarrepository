package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToDemoWebShop extends BaseClass{
	
	WebDriver driver;
	
	
	@Test
	public void loginToDemoWebShop(){
		
		try {
			driver = setUp();
			entercredentials();
			ValidateItemInCart validateItem=new ValidateItemInCart(driver);
			Assert.assertEquals(validateItem.webShopLogout.getLogoutText(), "Log out");
			teardown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
