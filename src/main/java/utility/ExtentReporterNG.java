package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	
	public static ExtentReports getReportObject()
	{
//		//String path =System.getProperty("user.dir")+"//reports//index.html";
//		String path =System.getProperty("C:/Users/eryog/eclipse-workspace/SwagLabAutomation/report/index.html");
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Results");
//		reporter.config().setDocumentTitle("Test Results");
//		
//		ExtentReports extent =new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester", "Rahul Shetty");
//		
//		return extent;
		
		
		//String path = System.getProperty("C:/Users/eryog/eclipse-workspace/SwagLabAutomation/reports/index.html");
		String path = System.getProperty("user.dir") + "/reports/index.html";

	    ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    reporter.config().setReportName("Web Automation Results");
	    reporter.config().setDocumentTitle("Test Results");

	    ExtentReports extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Rahul Shetty");

	    return extent;
		
		
		
	}
}
