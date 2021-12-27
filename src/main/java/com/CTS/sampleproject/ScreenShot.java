package com.CTS.sampleproject;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void takeSCreenShot(String testcasename,WebDriver driver ){
		
		try {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File src = screenShot.getScreenshotAs(OutputType.FILE);
			String des = "C:\\Users\\blaxm\\Downloads\\CucumberProject\\srktesting\\target\\" + testcasename
					+ System.currentTimeMillis() + ".png";
			FileHandler.copy(src, new File(des));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
