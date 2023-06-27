package pageActions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.reactivex.rxjava3.functions.Action;
import pageObject.CourseConsumption;
import pageObject.CreateBatchForCourse;
import pageObject.LoginPage;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class TPDMethods extends BaseClass {

	public static void createBatchAndVerify(String course) throws InterruptedException {
		
		CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
		 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		 
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
		
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
		 Thread.sleep(2000);
			Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
			Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
		
		Date.setTodayDate(driver);
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.sendKeys("\b").perform();
		Thread.sleep(1000);
		action.sendKeys("3").perform();
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
		
		Date.setTomorrowDate(driver);
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
		wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getBackAfterCreateBatchButton());
		DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
		DikshaUtils.waitForElementToBeVisible(createBatch.getViewDashboardButton());
		Assert.assertTrue(createBatch.getViewDashboardButton().isDisplayed());
		
	}
	
	
	
		public static void createBatch(String course) throws InterruptedException {
		
		CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
		 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		 
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
		
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
	   
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
		 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
		 Thread.sleep(2000);
			Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
			Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
		
		Date.setTodayDate(driver);
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.sendKeys("\b").perform();
		Thread.sleep(1000);
		action.sendKeys("3").perform();
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
		
		Date.setTomorrowDate(driver);
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
		wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(createBatch.getBackAfterCreateBatchButton());

		
	}
	
		public static void createBatchAndAddCertificate(String course) throws InterruptedException {
			
			CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
			 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			 
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
			 Thread.sleep(1000);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		   
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
			 Thread.sleep(1000);
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
			 Thread.sleep(2000);
				Library.custom_click(createBatch.getIssueCertificateYes(), "IssueCertificateNo");
				Thread.sleep(2000);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
			
			Date.setTodayDate(driver);
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.sendKeys("\b").perform();
			Thread.sleep(1000);
			action.sendKeys("3").perform();
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
			
			Date.setTomorrowDate(driver);
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
			wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
			Thread.sleep(5000);
			DikshaUtils.waitToBeVisibleAndClick(createBatch.getClosePopup());
		}
		
		
		
		public static void verifyOneBatchInCourse(String course) throws InterruptedException {
			
			CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
			 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			 
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		   
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
			 Thread.sleep(2000);
				Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
				Thread.sleep(2000);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
			
			Date.setTodayDate(driver);
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.sendKeys("\b").perform();
			Thread.sleep(1000);
			action.sendKeys("3").perform();
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
			
			Date.setTomorrowDate(driver);
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
			wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getOngoingBatchButton());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getUpcomingBatchButton());
			DikshaUtils.waitForElementToBeVisible(createBatch.getNoBatchFoundMsg());
			Assert.assertTrue(createBatch.getNoBatchFoundMsg().isDisplayed());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getUpcomingBatchButton());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getExpiredBatchButton());
			DikshaUtils.waitForElementToBeVisible(createBatch.getNoBatchFoundMsg());
			Assert.assertTrue(createBatch.getNoBatchFoundMsg().isDisplayed());
			
		}
		
		public static void userEnrollsInCourse(String coursename) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
			
			Thread.sleep(2000);
		    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
		    Thread.sleep(5000);
		    Library.custom_click(cc.getSearchbutton(), "search button");
		    Thread.sleep(1000);
		  
		    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedcourse());
		    Thread.sleep(2000);
		    Library.custom_click(cc.getJoincourse(), "Join course");
		    Thread.sleep(2000);
		    //Library.custom_click(cc.getConsentcheckbox(), " Consent Checkbox");
		    DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
			Thread.sleep(2000);
		    Library.custom_click(cc.getShareButton(), "Share Button");
			DikshaUtils.waitForElementToBeVisible(cc.getStartLearning());
			Assert.assertTrue(cc.getStartLearning().isDisplayed());
			
		}
		
		public static void userUnenrollsInCourse(String coursename) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
			Thread.sleep(2000);
			 int scrollX = 0; // horizontal scroll amount
		     int scrollY = 400; // vertical scroll amount
		     JavascriptExecutor js=(JavascriptExecutor)driver;
		     js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
		  	Thread.sleep(5000);
		     DikshaUtils.waitToBeClickableAndClick(cc.getLeaveCoursetab());  
		  	Thread.sleep(2000);
		     DikshaUtils.waitToBeClickableAndClick(cc.getConfirmLeavebutton());  
		 	Thread.sleep(2000);
		     WebElement unenrollPopup= driver.findElement(By.xpath("//strong[text()='updated successfully']"));
				String unenroll = unenrollPopup.getText();
				Assert.assertEquals(unenroll , "updated successfully");
		     
		}
	
		public static void openDiscussionForum(String course) throws InterruptedException {
			
			CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
			 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			 
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		   
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
			 Thread.sleep(2000);
			 Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
			 Thread.sleep(2000);
			 DikshaUtils.waitForElementToBeClickable(createBatch.getEnableDiscussionsButton());
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getEnableDiscussionsButton());	
			 Thread.sleep(2000);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
			
			Date.setTodayDate(driver);
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.sendKeys("\b").perform();
			Thread.sleep(1000);
			action.sendKeys("3").perform();
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
			
			Date.setTomorrowDate(driver);
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
			wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getBackAfterCreateBatchButton());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			DikshaUtils.waitForElementToBeVisible(createBatch.getViewDashboardButton());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getViewDashboardButton());
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getSelectBatchDropdown());
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getBatchSelected());
			Thread.sleep(2000);
			DikshaUtils.waitForElementToBeVisible(createBatch.getDiscussionForumIcon());
			Assert.assertTrue(createBatch.getDiscussionForumIcon().isDisplayed());
			
			
		}
		
public static void addMentor(String course) throws InterruptedException {
			
			CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
			 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			 
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			
			 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateBatchButton()));
		   
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateBatchButton());
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getBatchName(),"Batch 1");
			 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getDescription(),"This course is created via Automation");
			 Thread.sleep(2000);
			 Library.custom_click(createBatch.getIssueCertificateNo(), "IssueCertificateNo");
			 Thread.sleep(2000);
			 DikshaUtils.waitForElementToBeClickable(createBatch.getEnableDiscussionsButton());
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getEnableDiscussionsButton());	
			 Thread.sleep(2000);
			 DikshaUtils.waitToBeClickableAndClick(createBatch.getStartDate());
			
			Date.setTodayDate(driver);
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.sendKeys("\b").perform();
			Thread.sleep(1000);
			action.sendKeys("3").perform();
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(createBatch.getEndDate());
			
			Date.setTomorrowDate(driver);
			Thread.sleep(1000);
			 int scrollX = 0; // horizontal scroll amount
		     int scrollY = 100; // vertical scroll amount
		     JavascriptExecutor js=(JavascriptExecutor)driver;
		     js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
			DikshaUtils.waitToBeClickableAndClick(createBatch.getSelectMentorDropdown());
		
			js.executeScript("arguments[0].scrollIntoView(true);",createBatch.getMentorSelected());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getMentorSelected());
			action.sendKeys(Keys.TAB).perform();
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCourseterms());
			wait.until(ExpectedConditions.elementToBeClickable(createBatch.getCreateButton()));
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getCreateButton());
			Thread.sleep(2000);
			DikshaUtils.waitToBeVisibleAndClick(createBatch.getBackAfterCreateBatchButton());
			Thread.sleep(5000);
		}
		
	public static void verifyAddMentor(String course) throws InterruptedException {
		
	CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
	
	 
	 DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
	 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
	 DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
	 Thread.sleep(2000);
	 Assert.assertTrue(createBatch.getViewDashboardButton().isDisplayed());
	
}

		public static void mentorEditTheCourse(String course) throws InterruptedException {
	
			CreateBatchForCourse createBatch=PageFactory.initElements(driver, CreateBatchForCourse.class);
	
	 
			DikshaUtils.waitToBeClickableAndSendKeys(createBatch.getSearchtextfield(),course);
			DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchbutton());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getSearchedcourse());
			Thread.sleep(2000);
			Assert.assertTrue(createBatch.getViewDashboardButton().isDisplayed());
			DikshaUtils.waitToBeClickableAndClick(createBatch.getEditBatchButton());
	 
	 
}


}