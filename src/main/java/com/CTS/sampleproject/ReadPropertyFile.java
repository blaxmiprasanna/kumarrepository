package com.CTS.sampleproject;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadPropertyFile {

	Properties prop;
	WebDriver driver;
	FileInputStream fis;
	String file = "C:\\Users\\blaxm\\workspace\\sampleproject\\Application.properties";

	public ReadPropertyFile() throws Exception {
		try {
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("The exception is " + e.getMessage());
		}
	}

	// public void readPropFile() throws Exception {
	// prop = new Properties();
	// fis = new FileInputStream(file);
	// prop.load(fis);
	// }

	public String getBrowserName() {
		String chromeBrowser = prop.getProperty("browser");
		return chromeBrowser;
	}

	public String getURL() {
		String applicationURL = prop.getProperty("url");
		return applicationURL;
	}

	public String getUsername() {
		String uname = prop.getProperty("username");
		return uname;
	}

	public String getPassword() {
		String pass = prop.getProperty("password");
		return pass;
	}
}
