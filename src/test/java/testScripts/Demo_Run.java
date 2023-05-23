package testScripts;

import org.testng.annotations.Test;

import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.TPD;
import pageActions.UploadContent;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class Demo_Run extends BaseClass {
@Test
public void run() throws Exception {
	
	UserOnBoarding.loginascreator();
//	String contentName=UploadContent.UploadPdf();
//	UploadContent.sendPdf_For_Review(contentName);
//	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasreviewer();
//	UploadContent.up_For_Review(contentName);
//	UserOnBoarding.logout_As_Reviewer();
//	UserOnBoarding.reLoginAsCreator();
//	
//	String course=Course_Creation.UploadContentFromLibrary(contentName);
//	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasreviewer();
//	UploadContent.publishCourseFromUpForReview(course);
//	UserOnBoarding.logout_As_Reviewer();
//	UserOnBoarding.reLoginAsCreator();
//	TPD.createBatch(course);
//	UserOnBoarding.logout_As_Creator();
//	
//	UserOnBoarding.loginasCustodian();
//	Course_Consumption.consume_PDF_Course_Content(course);
//	
	
	
}
}
