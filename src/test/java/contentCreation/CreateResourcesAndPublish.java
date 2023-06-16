package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.ResourcesMethods;
import pageActions.SendForReviewMethods;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class CreateResourcesAndPublish extends BaseClass{
	
   //  @Test
	public void verifyECMLResource() throws Exception {
		
		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);

		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName=	ResourcesMethods.resourceWithECMLContent();
		SendForReviewMethods.ECMLContent_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.up_For_Review(contentName);
		
	}
	
   //  @Test
 	public void verifyTvLessonResource() throws Exception {
 		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
 		UserOnBoarding.teachericon();
 		UserOnBoarding.bmcpopuphandle();
 		UserOnBoarding.locationpopuphandle();
 		UserOnBoarding.login("Creator");
 		String contentName=	ResourcesMethods.resourceWithTVLesson();
 		SendForReviewMethods.TvLessonResource_For_Review(contentName);
 		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
 		UpForReviewMethods.up_For_Review(contentName);
 		
 	}
 	@Test
     public void verifyCreateEditQuestionSetInResources() throws Exception {
    	 ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
  		UserOnBoarding.teachericon();
  		UserOnBoarding.bmcpopuphandle();
  		UserOnBoarding.locationpopuphandle();
  		UserOnBoarding.login("Creator");
 		String contentName=	ResourcesMethods.createAndEditQuestionsInQuestionSet();
 		SendForReviewMethods.sendResource_For_Review(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
  		UpForReviewMethods.up_For_Review(contentName); 		
  		
  		
  	}
     
   //  @Test
     public void verifyShuffleCopyQuestionSetInResources() throws Exception {
    	 ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
  		UserOnBoarding.teachericon();
  		UserOnBoarding.bmcpopuphandle();
  		UserOnBoarding.locationpopuphandle();
  		UserOnBoarding.login("Creator");
 		String contentName=	ResourcesMethods.shuffleAndCopyQuestionsInQuestionSet();
// 		SendForReviewMethods.sendResource_For_Review(contentName);
//		UserOnBoarding.logout();
//		UserOnBoarding.login("Reviewer");
//  		UpForReviewMethods.up_For_Review(contentName); 		
//  		
  		
  	}
     

}
