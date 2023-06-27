package pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.solvers.BaseSecantSolver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseConsumption;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class CourseConsumptionMethods extends BaseClass {

	
	
	
	
	public static void consume_PDF_Course_Content(String coursename) throws InterruptedException {
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    Library.custom_click(cc.getConsentcheckbox(), " Consent Checkbox");
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
		DikshaUtils.waitToBeClickableAndClick(cc.getCloseCongratulations());
		DikshaUtils.waitToBeClickableAndClick(cc.getBackButton());
		
		Assert.assertTrue(cc.getcontinuelearningtab().isDisplayed());
		
	}
	
	
	public static void searchContentForConsumption(String coursename) throws InterruptedException {
		
		 ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(5000);
		cc.getSearchtextfield().clear();
		 Thread.sleep(1000);
	    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
	    Thread.sleep(5000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedTvLesson());
	    Thread.sleep(4000);
	    WebElement frame = driver.findElement(By.xpath("//iframe[@id='contentPlayer']"));
	   driver.switchTo().frame(frame);
	   Thread.sleep(4000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getClickNextButton());
	    driver.switchTo().defaultContent();
	    DikshaUtils.waitToBeClickableAndClick(cc.getCloseRatingPopup());
	    Thread.sleep(1000);
	    driver.switchTo().frame(frame);
	     String ContentconsumedPopup = popup.getTvLessonCompleted().getText();
	     Assert.assertEquals(ContentconsumedPopup, "You just completed");
	     driver.switchTo().defaultContent();
	     Thread.sleep(1000);
	     
	     DikshaUtils.waitToBeClickableAndClick(cc.getBackButton());
	    
	}
	public static void searchEtextbookForConsumption(String coursename) throws InterruptedException {
		
		 ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(5000);
		cc.getSearchtextfield().clear();
		 Thread.sleep(1000);
	    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
	    Thread.sleep(5000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedETextbook());
	    Thread.sleep(4000);
	    String pagecount = cc.getPagecount().getText();
		int Count = Integer.parseInt(pagecount);
		
		for(int i=1;i<Count;i++) {

			DikshaUtils.waitToBeClickableAndClick(cc.getNextButton());
		}
	
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getCloseRatingPopup());
	     String ContentconsumedPopup = popup.getETextbookCompleted().getText();
	     Assert.assertEquals(ContentconsumedPopup, "You just completed");
	     driver.switchTo().defaultContent();
	     Thread.sleep(1000);
	     
	     DikshaUtils.waitToBeClickableAndClick(cc.getBackButton());
	    
	}
	public static void validateBatchExpiryDate() throws InterruptedException {
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Thread.sleep(3000);
		Assert.assertTrue(cc.getBatchExpiryMsg().isDisplayed());
		
	}
	
}
