package TestCases;

import org.testng.annotations.Test;

import Utility.BaseClass;
import folder.Course_Creation;
import folder.TPD;
import folder.UploadContent;
import folder.UserOnBoarding;

public class Demo_Run extends BaseClass {
@Test
public void run() throws Exception {
	
	UserOnBoarding.loginascreator();
	String contentName=UploadContent.UploadPdf();
	UploadContent.sendPdf_For_Review(contentName);
	UserOnBoarding.logout_As_Creator();
	UserOnBoarding.loginasreviewer();
	UploadContent.up_For_Review(contentName);
	UserOnBoarding.logout_As_Reviewer();
	UserOnBoarding.reLoginAsCreator();
	String course=Course_Creation.UploadContentFromLibrary(contentName);
	UserOnBoarding.logout_As_Creator();
//	UserOnBoarding.loginasreviewer();
//	UploadContent.publishCourseFromUpForReview(course);
//	UserOnBoarding.logout_As_Reviewer();
//	UserOnBoarding.reLoginAsCreator();
	
			
//	TPD.createBatch(course);
	
	
	
	
	
	
}
}
