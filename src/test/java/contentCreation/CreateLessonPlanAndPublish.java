package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.CreateLessonPlan;
import pageActions.UpForReviewMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
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
		Thread.sleep(1000);
		ExplorePage explore=PageFactory.initElements(driver,ExplorePage.class);
		explore.getExplorebutton().click();
		UserOnBoarding.login("Reviewer");
//		UserOnBoarding.logout_As_Creator();
//		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.LessonPlan_up_For_Review(contentname);
		
	}

}
