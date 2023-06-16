package pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.solvers.BaseSecantSolver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseConsumption;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class Course_Consumption extends BaseClass {

	public static void consume_PDF_Course_Content(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    //Library.custom_click(cc.getConsentcheckbox(), " Consent Checkbox");
	  //  DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		
		Thread.sleep(2000);
	    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	   
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchedcourse());
	    
	}
}
