package contentCreation;

import org.testng.annotations.Test;

import pageActions.CreateLessonPlan;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateLessonPlanAndPublish extends BaseClass {

	@Test
	public void VerifyCreatorCreateLessonPlanAndSendForReviewAndPublish() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentname=CreateLessonPlan.createLessonPlan();
		UploadContentMethods.LessonPlan_send_For_Review(contentname);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.LessonPlan_up_For_Review(contentname);
		
	}

}
