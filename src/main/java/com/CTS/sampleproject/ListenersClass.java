package com.CTS.sampleproject;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersClass implements ITestListener {

	WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	

	public void onFinish(ITestContext results) {
		
		report.endTest(logger);
		
		report.flush();
	}

	public void onStart(ITestContext results) {

		report = new ExtentReports("./reports/BaseClass.html");
		logger = report.startTest("start the browser");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		

	}

	public void onTestFailure(ITestResult results) {
		BaseClass baseClass = new BaseClass();
		
		try {
			driver = baseClass.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ScreenShot.takeSCreenShot(results.getName(), driver);
		
		logger.log(LogStatus.FAIL, "The test case"+ results.getName()+"is failed");

	}

	public void onTestSkipped(ITestResult results) {

		logger.log(LogStatus.SKIP, "The test case"+ results.getName()+"is skipped");
		
	}

	public void onTestStart(ITestResult results) {

	}

	public void onTestSuccess(ITestResult results) {

	}

}
