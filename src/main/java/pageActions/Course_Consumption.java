package pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.solvers.BaseSecantSolver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseConsumption;
import utility.BaseClass;
import utility.Library;

public class Course_Consumption extends BaseClass {

	public static void consume_PDF_Course_Content(String coursename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Thread.sleep(1000);
	    Library.custom_sendkeys(cc.getSearchtextfield(), coursename, "course name searched");
	    Thread.sleep(1000);
	    Library.custom_click(cc.getSearchbutton(), "search button");
	    Thread.sleep(1000);
	    Library.custom_click(cc.getSearchedcourse(), "searched course click");
	    Thread.sleep(1000);
	    Library.custom_click(cc.getJoincourse(), "Join course");
	    Thread.sleep(1000);
	    Library.custom_click(cc.getConsentcheckbox(), " Consent Checkbox");
		Thread.sleep(1000);
	    Library.custom_click(cc.getShareButton(), "Share Button");
		Thread.sleep(1000);
	    Library.custom_click(cc.getStartLearning(), "Start Learning");
		Thread.sleep(1000);
		
		String pagecount = cc.getPagecount().getText();
		int Count = Integer.parseInt(pagecount);
		
		for(int i=1;i<Count;i++) {
			Library.custom_click(cc.getNextButton(), "next button");	
		}
		Thread.sleep(2000);
		Library.custom_click(cc.getCloseRatingPopup(), "CloseRatingPopup");
		Thread.sleep(1000);
		Library.custom_click(cc.getCloseCongratulations(), "CloseCongratulations");
		Thread.sleep(1000);
		Library.custom_click(cc.getBackButton(), "BackButton");
		Thread.sleep(1000);
		
		
		
	}
	
	
}
