package pageActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.reactivex.rxjava3.functions.Action;
import pageObject.CreateBatchForCourse;
import pageObject.LoginPage;
import utility.BaseClass;
import utility.Library;

public class TPD extends BaseClass {

	public static void createBatch(String course) throws InterruptedException {
		
		CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
		 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
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
		Library.custom_click(createBatch.getStartDate(), "Start date");
		Date.setTodayDate(driver);
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.sendKeys("\b").perform();
		Thread.sleep(1000);
		action.sendKeys("3").perform();
		Thread.sleep(1000);
	    Library.custom_click(createBatch.getEndDate(), "EndDate");
	    Thread.sleep(1000);
		Date.setTomorrowDate(driver);
		Thread.sleep(1000);
		Library.custom_click(createBatch.getCourseterms(), "course terms");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
		Thread.sleep(1000);
		Library.custom_click(createBatch.getCreateButton(), "Create button");
		Thread.sleep(2000);
		Library.custom_click(createBatch.getBackAfterCreateBatchButton(), "BackAfterCreateBatchButton");
		
		Assert.assertTrue(loginpage.getHeaderDropdown().isDisplayed());
	}
}
