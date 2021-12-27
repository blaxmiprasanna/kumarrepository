package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckItemInShoppingCart extends BaseClass{
	
	WebDriver driver;
	ValidateItemInCart validateItem;
	Cart cart;
	
	@BeforeMethod
	public void startUp() throws Exception{
		try {
			driver = setUp();
			entercredentials();
			validateItem = new ValidateItemInCart(driver);
			Assert.assertEquals(validateItem.webShopLogout.getLogoutText(), "Log out");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void validateItemsInCart(){
		try {
			cart = new Cart(driver);
			validateItem.shoppingCart.clickShoppingCart();
			if (cart.emptyMessage.shoppingCartIsEmpty.isDisplayed()) {
				validateItem.books.clickBooksLink();
				validateItem.booksAddToCart.clickOnAddToCart();
				cart.removeFromCart.isdisplayed();
			} else {
				validateItem.books.clickBooksLink();
				validateItem.booksAddToCart.clickOnAddToCart();
				cart.removeFromCart.isdisplayed();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod()
	public void tearDown() throws InterruptedException{
		Thread.sleep(9000);
		teardown();
	}

}
