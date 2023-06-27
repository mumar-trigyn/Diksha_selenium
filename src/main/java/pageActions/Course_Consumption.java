package pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.solvers.BaseSecantSolver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseAssesment;
import pageObject.CourseConsumption;
import pageObject.CreateBatchForCourse;
import pageObject.LoginPage;
import pageObject.Logout;
import pageObject.UploadPdfContent;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class Course_Consumption extends BaseClass {

	public static void consume_PDF_Course_Content(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Logout log = PageFactory.initElements(driver, Logout.class);
		
		Thread.sleep(7000);
		

	     DikshaUtils.waitToBeVisibleAndClick(log.getDigitaltextbooktab());
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getShareButton());
		DikshaUtils.waitToBeClickableAndClick(cc.getStartLearning());
		
		String pagecount = cc.getPagecount().getText();
		int Count = Integer.parseInt(pagecount);
		
		for(int i=1;i<Count;i++) {

			DikshaUtils.waitToBeClickableAndClick(cc.getNextButton());
		}
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getCloseRatingPopup());
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeVisibleAndClick(cc.getCloseCongratulations());
		DikshaUtils.waitToBeClickableAndClick(cc.getBackButton());
		
		
		
	}
	
	
	public static void searchContentForConsumption(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(2000);
	    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	   
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedcourse());
	    
	}
	
	
	public static void searchContentAndConsumption(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		 Thread.sleep(3000);
		 DikshaUtils.waitToBeClickableAndSendKeys(cc.getSearchtextfield(),coursename);
		 DikshaUtils.waitToBeVisibleAndClick(cc.getSearchbutton());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(cc.getsearchedTextbook());
		
		 Thread.sleep(1000);
		 String pagecount = cc.getPagecount().getText();
			int Count = Integer.parseInt(pagecount);
			
			for(int i=1;i<Count;i++) {

				DikshaUtils.waitToBeClickableAndClick(cc.getNextButton());
			}
			
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(cc.getCloseRatingPopup());
			
	    
	}
	
	
	public static void UserDisplayCourseCardDetailsAndViewAllAndCloseButttonInMyCourseSection() throws Exception {
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		DikshaUtils.waitToBeClickableAndClick(cc.getCoursetab());
		Assert.assertTrue(cc.getViewall().isDisplayed());
        System.out.println("VieAll Tab Is Displayed In MyCourse Section");
		DikshaUtils.waitToBeClickableAndClick(cc.getViewall());
		
		Thread.sleep(2000);
		
		 Assert.assertTrue(cc.getCourseimg().isDisplayed());
		 System.out.println("Course Image Is Displayed");
		 
		Assert.assertTrue(cc.getCoursetitle().isDisplayed());
		 System.out.println("Course Title Is Displayed");
		 
		 Assert.assertTrue(cc.getCoursemedium().isDisplayed());
		 System.out.println("Course Medium Is Displayed");
		
		 Assert.assertTrue(cc.getcourseclass().isDisplayed());
		 System.out.println("Course Class Is Displayed");
		
		 
		 Assert.assertTrue(cc.getCoursepublisher().isDisplayed());
		 System.out.println("Course Publisher Is Displayed");
		 
		 Assert.assertTrue(cc.getCoursesubject().isDisplayed());
		 System.out.println("Course Subject Is Displayed");
		 
		 Thread.sleep(2000);
		 
		 Assert.assertTrue(cc.getClosetab().isDisplayed());
		 DikshaUtils.waitToBeVisibleAndClick(cc.getClosetab());
		 System.out.println("Close Button Is Displayed");
	}
	
	public static void consumeCourseContent(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Logout log = PageFactory.initElements(driver, Logout.class);
		
		Thread.sleep(7000);
		

	     DikshaUtils.waitToBeVisibleAndClick(log.getDigitaltextbooktab());
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getShareButton());
		DikshaUtils.waitToBeClickableAndClick(cc.getStartLearning());
		
		String pagecount = cc.getPagecount().getText();
		int Count = Integer.parseInt(pagecount);
		
		for(int i=1;i<Count;i++) {

			DikshaUtils.waitToBeClickableAndClick(cc.getNextButton());
		}
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getCloseRatingPopup());
		Thread.sleep(1000);
		
		WebElement ContentSavePopup= driver.findElement(By.xpath("//div[text()='Congratulations!!']"));
        String ContentsuccessfullyConsume = ContentSavePopup.getText();
        Assert.assertEquals(ContentsuccessfullyConsume, "Congratulations!!");
        System.out.println("Content Successfully Consume");
	
		
		
	}
		
	public static void consumeCourseAssesment(String coursename) throws Exception {
		
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Logout log = PageFactory.initElements(driver, Logout.class);
		CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
		
		
		Thread.sleep(5000);
		

	     DikshaUtils.waitToBeVisibleAndClick(log.getDigitaltextbooktab());
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getShareButton());
		DikshaUtils.waitToBeClickableAndClick(cc.getStartLearning());
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getQueNextButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getSubmitcourseassesmentbutton());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		DikshaUtils.waitToBeClickableAndClick(assesment.getSelectRating());
		DikshaUtils.waitToBeClickableAndClick(assesment.getSubmitButton());
		
		Thread.sleep(2000);
		WebElement ContentSavePopup= driver.findElement(By.xpath("//div[text()='Congratulations!!']"));
        String ContentsuccessfullyConsume = ContentSavePopup.getText();
        Assert.assertEquals(ContentsuccessfullyConsume, "Congratulations!!");
        System.out.println("Content Successfully Consume");
	
	}
}
