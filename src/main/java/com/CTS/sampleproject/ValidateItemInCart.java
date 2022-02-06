package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectmodel.AbstractComponent;
import pageobjectmodel.Books;
import pageobjectmodel.BooksAddToCart;
import pageobjectmodel.RemoveFromCart;
import pageobjectmodel.ShoppingCart;
import pageobjectmodel.EmptyMessage;
import pageobjectmodel.UpdateCart;
import pageobjectmodel.WebShopLogout;

public class ValidateItemInCart  {
	
	WebDriver driver;
	public ShoppingCart shoppingCart;
	public Books books;
	public BooksAddToCart booksAddToCart;
	public WebShopLogout webShopLogout;

	public ValidateItemInCart(WebDriver driver) {
		this.driver = driver;
		this.books = PageFactory.initElements(driver, Books.class);
		this.booksAddToCart = PageFactory.initElements(driver, BooksAddToCart.class);
		this.shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
		this.webShopLogout = PageFactory.initElements(driver, WebShopLogout.class);
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public Books getBooks() {
		return books;
	}

	public BooksAddToCart getBooksAddToCart() {
		return booksAddToCart;
	}

	public WebShopLogout getWebShopLogout() {
		return webShopLogout;
	}
}
