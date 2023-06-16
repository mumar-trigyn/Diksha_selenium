package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.SendForReviewMethods;
import pageActions.TPDMethods;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class Demo_Run extends BaseClass {
	
	ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
//@Test
public void run() throws Exception {
    UserOnBoarding.schoolheadicon();
	UserOnBoarding.bmcpopuphandle();
	UserOnBoarding.locationpopuphandle();
	UserOnBoarding.login("Creator");
	String contentName=UploadContentMethods.UploadPdf();
	SendForReviewMethods.sendPdf_For_Review(contentName);
	UserOnBoarding.logout();
	DikshaUtils.waitToBeClickableAndClick(explore.getExplorebutton());
	UserOnBoarding.login("Reviewer");
	UpForReviewMethods.up_For_Review(contentName);
	UserOnBoarding.logout();
	DikshaUtils.waitToBeClickableAndClick(explore.getExplorebutton());
	UserOnBoarding.login("Creator");

	String course=Course_Creation.UploadContentFromLibrary(contentName);
	UserOnBoarding.logout();
	DikshaUtils.waitToBeClickableAndClick(explore.getExplorebutton());
	UserOnBoarding.login("Reviewer");
	UploadContentMethods.publishCourseFromUpForReview(course);
	UserOnBoarding.logout();
	DikshaUtils.waitToBeClickableAndClick(explore.getExplorebutton());
	UserOnBoarding.login("Creator");
	TPDMethods.createBatch(course);
	UserOnBoarding.logout();
	UserOnBoarding.loginasCustodian();
	Course_Consumption.consume_PDF_Course_Content(course);
		
   }


	
}


