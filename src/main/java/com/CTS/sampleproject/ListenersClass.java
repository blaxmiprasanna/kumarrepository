package com.CTS.sampleproject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersClass extends BaseClass implements ITestListener {

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
