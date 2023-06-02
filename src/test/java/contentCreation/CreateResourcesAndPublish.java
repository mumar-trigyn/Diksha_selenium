package contentCreation;

import org.testng.annotations.Test;

import pageActions.ResourcesMethods;
import pageActions.SendForReviewMethods;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateResourcesAndPublish extends BaseClass{
   //  @Test
	public void verifyECMLResource() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=	ResourcesMethods.resourceWithECMLContent();
		SendForReviewMethods.ECMLContent_For_Review(contentName);
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.up_For_Review(contentName);
		
	}
	
   //  @Test
 	public void verifyTvLessonResource() throws Exception {
 		
 		UserOnBoarding.teachericon();
 		UserOnBoarding.bmcpopuphandle();
 		UserOnBoarding.locationpopuphandle();
 		UserOnBoarding.login("Creator");
 		String contentName=	ResourcesMethods.resourceWithTVLesson();
 		SendForReviewMethods.TvLessonResource_For_Review(contentName);
 		UserOnBoarding.logout_As_Creator();
 		UserOnBoarding.loginasreviewer();
 		UpForReviewMethods.up_For_Review(contentName);
 		
 	}
     @Test
     public void verifyCreateEditQuestionSetInResources() throws Exception {
  		
  		UserOnBoarding.teachericon();
  		UserOnBoarding.bmcpopuphandle();
  		UserOnBoarding.locationpopuphandle();
  		UserOnBoarding.login("Creator");
  		
  		//work in progress
  		String contentName=	ResourcesMethods.createAndEditQuestionsInQuestionSet();
//  		SendForReviewMethods.TvLessonResource_For_Review(contentName);
//  		UserOnBoarding.logout_As_Creator();
//  		UserOnBoarding.loginasreviewer();
//  		UpForReviewMethods.up_For_Review(contentName); 		
  		
  		
  	}
     
     
     
     
     
     
}
