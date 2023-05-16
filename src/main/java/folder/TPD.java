package folder;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.CreateBatchForCourse;
import Utility.BaseClass;
import Utility.Library;

public class TPD extends BaseClass {

	public static void createBatch(String course) throws InterruptedException {
		
		CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
		
		Library.custom_sendkeys(createBatch.getSearchtextfield(),course , "Searchtextfield");
		Thread.sleep(2000);
		Library.custom_click(createBatch.getSearchbutton(), "search button");
		Thread.sleep(2000);
		Library.custom_click(createBatch.getSearchedcourse(), "Searchedcourse");
		Thread.sleep(2000);
		
	   WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		Library.custom_click(createBatch.getCreateBatchButton(), "CreateBatchButton");
		Thread.sleep(1000);
		Library.custom_sendkeys(createBatch.getBatchName(), "Batch 1", "BatchName");
		Thread.sleep(2000);
		
	    Library.custom_sendkeys(createBatch.getDescription(), "This course is created via Automation", "Description");
	    Thread.sleep(2000);
		Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Library.custom_sendkeys(createBatch.getStartDate(), excel.getExcelData(\"Sheet 2\", 1, 1), \"Start Date\");");
		Library.custom_sendkeys(createBatch.getStartDate(), excel.getExcelData("Sheet 2", 1, 1), "Start Date");
		Library.custom_sendkeys(createBatch.getEndDate(), excel.getExcelData("Sheet 2", 1, 0), course);
		//js.executeScript("Library.custom_sendkeys(createBatch.getEndDate(), excel.getExcelData(\"Sheet 2\", 1, 0), course);");
		Library.custom_click(createBatch.getCourseterms(), "course terms");
		Library.custom_click(createBatch.getCreateButton(), "Create button");
	}
}
