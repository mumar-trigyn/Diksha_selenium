package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.Course_Consumption;
import pageActions.Course_Creation;
<<<<<<< HEAD
import pageActions.CreateCollections;
import pageActions.CreateLessonPlan;
=======
import pageActions.SendForReviewMethods;
>>>>>>> 0d237f4723870fc7bef0eaa76331575d25487258
import pageActions.TPD;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
<<<<<<< HEAD
import pageObject.LoginAsCustodian;
=======
>>>>>>> 0d237f4723870fc7bef0eaa76331575d25487258
import utility.BaseClass;
import utility.DikshaUtils;

public class Demo_Run extends BaseClass {



//@Test
//public void run() throws Exception {
//    UserOnBoarding.schoolheadicon();
//	UserOnBoarding.bmcpopuphandle();
//	UserOnBoarding.locationpopuphandle();
//	UserOnBoarding.loginascreator();
//	String contentName=UploadContentMethods.UploadPdf();
//	UploadContentMethods.sendPdf_For_Review(contentName);
//	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasreviewer();
//	UpForReviewMethods.up_For_Review(contentName);
//	UserOnBoarding.logout_As_Reviewer();
//	UserOnBoarding.reLoginAsCreator();
//
//	String course=Course_Creation.UploadContentFromLibrary(contentName);
//	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasreviewer();
//	UploadContentMethods.publishCourseFromUpForReview(course);
//	UserOnBoarding.logout_As_Reviewer();
//	UserOnBoarding.reLoginAsCreator();
//	TPD.createBatch(course);
//	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasCustodian();
//	Course_Consumption.consume_PDF_Course_Content(course);
//		
//   }
//	
	
	
	

	
	ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
@Test
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
	TPD.createBatch(course);
	UserOnBoarding.logout();
	UserOnBoarding.loginasCustodian();
	Course_Consumption.consume_PDF_Course_Content(course);
		
   }

	
}


