package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener{
    ExtentTest test;
	ExtentReports  extent=ExtendReportGenerator.getReport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
//	
	
	public void onTestStart(ITestResult result) {
	Library.test=extent.createTest(result.getTestClass().getName()+"-"+result.getMethod().getMethodName());
	
	
	extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS,"Test Case Pass");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshots());
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL,"Test Case Fail");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshots());
		
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Skip");
		
	}
	
	public void getResult(ITestResult result) {
	
		if(result.getStatus()==ITestResult.FAILURE) {
		extenttest.get().log(Status.FAIL, result.getThrowable());
	}
}
	

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	public static String getScreenshots() {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
			
	}
	

}
//package utility;
//
// 
//
//import java.io.File;
//
//import java.io.IOException;
//
//import java.text.SimpleDateFormat;
//
//import java.util.Date;
//
// 
//
//import org.openqa.selenium.OutputType;
//
//import org.openqa.selenium.TakesScreenshot;
//
//import org.testng.ITestContext;
//
//import org.testng.ITestListener;
//
//import org.testng.ITestResult;
//
// 
//
//import com.aventstack.extentreports.ExtentReports;
//
//import com.aventstack.extentreports.ExtentTest;
//
//import com.aventstack.extentreports.MediaEntityBuilder;
//
//import com.aventstack.extentreports.Status;
//
////import com.aventstack.extentreports.markuputils.MarkupHelper;
//
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
// 
//
//public class Listeners extends BaseClass implements ITestListener{
//
//ExtentTest test;
//
//ExtentReports extent=ExtendReportGenerator.getReport();
//
//ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
//
//// new reporter variables
//
//public static ExtentSparkReporter htmlReporter;
//
//public static ExtentReports exReport ;
//
//public static ExtentTest exTestReporter;
//
// 
//
// 
//
//public void onTestStart(ITestResult result) {
//
////Library.test=extent.createTest(result.getTestClass().getName()+"-"+result.getMethod().getMethodName());
//
////extenttest.set(Library.test);
//
// 
//
////Spark reporter initialization
//
//String reportPath=(System.getProperty("user.dir")+"/Reports/");
//
//Date currentDate = new Date();
//
//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//String formattedDate = dateFormat.format(currentDate);
//
//Date currentTime = new Date();
//
//SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
//
//String reportTime = timeFormat.format(currentTime);
//
//String formattedTime = reportTime.replace(":", ".");
//
// 
//
////ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath+"Extentreport_"+formattedDate+"_"+formattedTime+".html");
//
//htmlReporter = new ExtentSparkReporter(reportPath+"Extentreport_"+formattedDate+"_"+formattedTime+".html");
//
//exReport = new ExtentReports();
//
//exReport.attachReporter(htmlReporter);
//
//htmlReporter.config().setDocumentTitle("Automation Report");
//
//final File CONF = new File(System.getProperty("user.dir")+"/config/extent-config.xml");
//
// 
//
//try {
//
//htmlReporter.loadXMLConfig(CONF);
//
//} catch (IOException e) {
//
//// TODO Auto-generated catch block
//
//e.printStackTrace();
//
//}
//
// 
//
// 
//
// 
//
//exTestReporter = exReport.createTest(result.getMethod().getMethodName());
//
//// Log the custom table at the start of each test case
//
//// MyCustomLog customLog = new MyCustomLog();
//
////String[][] data = customLog.getCustomLogData();
//
////exTestReporter.info(MarkupHelper.createTable(data));
//
//}
//
// 
//
// 
//
//public void onTestSuccess(ITestResult result) {
//
//// extenttest.get().log(Status.PASS, "Test Case Pass");
//
//// extenttest.get().addScreenCaptureFromBase64String(getScreenshots());
//
// 
//
////spark reporter
//
//exTestReporter.log(Status.PASS, "ee", "aa", "Step passed");
//
// 
//
//// MyCustomLog customLog = new MyCustomLog();
//
//// String[][] data = customLog.getCustomLogData();
//
//// exTestReporter.info(MarkupHelper.createTable(data));
//
// 
//
//}
//
// 
//
//public void onTestFailure(ITestResult result) {
//
//// extenttest.get().log(Status.FAIL, "Test Case Fail");
//
//// extenttest.get().addScreenCaptureFromBase64String(getScreenshots());
//
// 
//
////spark reporter
//
////Throwable details = result.getThrowable();
//
//exTestReporter.log(Status.FAIL,"expected", "actual", result.getThrowable());
//
//exTestReporter.addScreenCaptureFromBase64String(getScreenshots());
//
// 
//
//// MyCustomLog customLog = new MyCustomLog();
//
//// String[][] data = customLog.getCustomLogData();
//
//// exTestReporter.info(MarkupHelper.createTable(data));
//
// 
//
//}
//
// 
//
//public void onTestSkipped(ITestResult result) {
//
//// extenttest.get().log(Status.SKIP, "Test Case Skip");
//
// 
//
////spark reporter
//
//exTestReporter.log(Status.SKIP, "Step skipped");
//
// 
//
//}
//
// 
//
//// public void getResult(ITestResult result) {
//
////
//
//// if(result.getStatus()==ITestResult.FAILURE) {
//
//// //extenttest.get().log(Status.FAIL, result.getThrowable());
//
//// exTestReporter.log(Status.FAIL, result.getThrowable());
//
////
//
//// }
//
////
//
//// }
//
// 
//
// 
//
//public void onFinish(ITestContext context) {
//
////extent.flush();
//
// 
//
////spark reporter
//
//exReport.flush();
//
// 
//
//}
//
// 
//
//public static String getScreenshots() {
//
// 
//
//TakesScreenshot ts=(TakesScreenshot) driver;
//
//return ts.getScreenshotAs(OutputType.BASE64);
//
// 
//
//}
//
// 
//
// 
//
//}






