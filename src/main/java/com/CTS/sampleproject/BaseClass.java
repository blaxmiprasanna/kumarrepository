package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseClass {

	WebDriver driver;
//	public ExtentReports report;
//	public ExtentTest logger;

	public WebDriver setUp() throws Exception {
		driver = InvokeBrowser.invokeBrowser(HelperClass.getPropertyFileData().getBrowserName());
//		report = new ExtentReports("./reports/BaseClass.html");
//		logger = report.startTest("start the browser");
//		logger.log(LogStatus.INFO, "open the browser");
		driver.get(HelperClass.getPropertyFileData().getURL());
//		logger.log(LogStatus.INFO, "hit the URL");
		return driver;
	}

	public void entercredentials() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getLogin().clickLoginLink();
//		logger.log(LogStatus.INFO, "click on the login link");
		loginPage.getLEmail().enterEmail();
		loginPage.getPassword().enterPassword();
		loginPage.getLoginButton().clickLoginButton();
//		logger.log(LogStatus.INFO, "enter username,password and click on login button");
	}

	public void teardown() {
		// if (results.getStatus() == ITestResult.FAILURE) {
		// ScreenShot.takeSCreenShot(results.getName(), driver);
		// }
		driver.quit();
		// logger.log(LogStatus.INFO, "close the browser");
		// report.endTest(logger);
		// report.flush();
	}

}
