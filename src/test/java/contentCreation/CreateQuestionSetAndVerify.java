package contentCreation;

import org.testng.annotations.Test;

import pageActions.CreateCollections;
import pageActions.CreateQuestionSet;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateQuestionSetAndVerify extends BaseClass {

	 @Test
     public void VerifyCreatorCreateTwoTypesOfQuestionSetAndSendForReview() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String QuestionSet=CreateQuestionSet.CreateTwoTypesOfQuestionSetAndSendForReview();
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		
		UpForReviewMethods.QuestionSet_up_For_Review(QuestionSet);
	 }
	
	
}
