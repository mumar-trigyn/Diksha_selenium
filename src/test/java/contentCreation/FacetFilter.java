package contentCreation;

import org.testng.annotations.Test;


import pageActions.Guest_User_Methods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class FacetFilter extends BaseClass {

	@Test
	public void VerifyFiltersResetToProfileBMCValueswhenNavigatedToOtherTab() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		Guest_User_Methods.VerifyProfileBMCValueForAnotherTab();
	
	
	}
	
}
