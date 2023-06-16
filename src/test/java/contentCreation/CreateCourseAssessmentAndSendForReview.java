package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.CourseAssessmentMethods;
import pageActions.SendForReviewMethods;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class CreateCourseAssessmentAndSendForReview extends BaseClass {
	ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
	@Test
	public void CreateAssessmentAndSendForReview() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=CourseAssessmentMethods.createAssessmentWithAllTypeContent();
		SendForReviewMethods.sendCourseAssessment_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.up_For_Review(contentName);
		
	}
	
	
}
