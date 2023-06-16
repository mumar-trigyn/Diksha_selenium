package contentCreation;

import org.testng.annotations.Test;

import pageActions.CreateCollections;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateCollectionsAndPublish extends BaseClass {

	
	  @Test
      public void VerifyCreatorCreateCollectionsAndSendForReviewAndPublish() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String collection=CreateCollections.CreateCollectionsFromBook();
		UserOnBoarding.logout_As_Creator();
		UserOnBoarding.loginasreviewer();
		UpForReviewMethods.Collections_up_For_Review(collection);
			
	}
}
