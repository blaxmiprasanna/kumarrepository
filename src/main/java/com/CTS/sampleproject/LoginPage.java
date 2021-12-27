package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectmodel.Email;
import pageobjectmodel.LoginButton;
import pageobjectmodel.LoginLink;
import pageobjectmodel.Password;

public class LoginPage {

	WebDriver driver;
	LoginLink login;
	Email email;
	Password password;
	LoginButton loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.login = PageFactory.initElements(driver, LoginLink.class);
		this.email = PageFactory.initElements(driver, Email.class);
		this.password = PageFactory.initElements(driver, Password.class);
		this.loginButton = PageFactory.initElements(driver, LoginButton.class);
	}

	public LoginLink getLogin() {
		return login;
	}

	public Email getLEmail() {
		return email;
	}

	public Password getPassword() {
		return password;
	}

	public LoginButton getLoginButton() {
		return loginButton;
	}
}
