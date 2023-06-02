package contentCreation;

import org.testng.annotations.Test;

import pageActions.CourseAssessmentMethods;
import pageActions.SendForReviewMethods;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateCourseAssessmentAndSendForReview extends BaseClass {

	@Test
	public void CreateAssessmentAndSendForReview() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=CourseAssessmentMethods.createAssessmentWithAllTypeContent();
		SendForReviewMethods.sendCourseAssessment_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
	
	
}
