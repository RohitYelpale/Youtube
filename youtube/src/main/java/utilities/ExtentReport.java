package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	public static ExtentReports getExtentReport() {
		
				ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
				ExtentReports extent = new ExtentReports();
				htmlReporter.config().setReportName("YouTube Automation Results");
				htmlReporter.config().setDocumentTitle("YouTube Automation Test Results");
				extent.attachReporter(htmlReporter);
				
				return extent;
	}

}
