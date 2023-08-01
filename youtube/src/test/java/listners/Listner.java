package listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import utilities.ExtentReport;

public class Listner extends Base implements ITestListener {
	ExtentReports extentReport = ExtentReport.getExtentReport();
	ExtentTest extentTest;
	WebDriver driver;

	public void onTestStart(ITestResult result) {

		extentTest = extentReport.createTest(result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Passed");
		
	}
	public void onTestFailure(ITestResult result) {

		extentTest.log(Status.FAIL, "Test Failed");
		String testName = result.getName();
		String screenshotPath = null;
		try {
			screenshotPath = takeScreenShot(testName, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(screenshotPath, testName);

	}

	public void onFinish(ITestContext context) {

		extentReport.flush();

	}

}
