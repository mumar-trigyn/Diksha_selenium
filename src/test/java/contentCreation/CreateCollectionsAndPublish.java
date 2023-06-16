package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.CreateCollections;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class CreateCollectionsAndPublish extends BaseClass {

	
	  @Test
      public void VerifyCreatorCreateCollectionsAndSendForReviewAndPublish() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String collection=CreateCollections.CreateCollectionsFromBook();
		UserOnBoarding.logout();
		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		DikshaUtils.waitToBeVisibleAndClick(explore.getExplorebutton());
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.Collections_up_For_Review(collection);
			
	}
}
