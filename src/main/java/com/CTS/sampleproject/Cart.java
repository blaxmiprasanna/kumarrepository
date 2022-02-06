package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectmodel.Books;
import pageobjectmodel.BooksAddToCart;
import pageobjectmodel.EmptyMessage;
import pageobjectmodel.RemoveFromCart;
import pageobjectmodel.ShoppingCart;
import pageobjectmodel.UpdateCart;
import pageobjectmodel.WebShopLogout;

public class Cart {
	
	public RemoveFromCart removeFromCart;
	public UpdateCart updateCart;
	public EmptyMessage emptyMessage;
	public WebDriver driver;
	
	public Cart(WebDriver driver) {
		this.driver = driver;
		this.removeFromCart=PageFactory.initElements(driver, RemoveFromCart.class);
		this.updateCart=PageFactory.initElements(driver, UpdateCart.class);
		this.emptyMessage=PageFactory.initElements(driver,EmptyMessage.class);
	}
	
	public RemoveFromCart getRemoveFromCart(){
		return removeFromCart;
	}
	public UpdateCart getUpdateCart(){
		return updateCart;
		
	}
}
