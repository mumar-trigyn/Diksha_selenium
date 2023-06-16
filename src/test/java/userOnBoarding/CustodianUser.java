package userOnBoarding;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.Observation;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class CustodianUser extends BaseClass {

	@Test
	public void VerifyCustodianUsersAreGettingSubmitDetailsOptionInHisProfile() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		UserOnBoarding.VerifyTheUserShouldBeAbleToEditTheSubmittedDetailsOptionInProfile();
		UserOnBoarding.logout();
		ExplorePage explore=PageFactory.initElements(driver,ExplorePage.class);
		DikshaUtils.waitToBeVisibleAndClick(explore.getExplorebutton());
		UserOnBoarding.login("Public User2");
	//	UserOnBoarding.loginAsNewCustodian();
		UserOnBoarding.VerifyUserShouldBeAbleToEditTheSubmittedDetails();
		
	}

	@Test
	public void VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
//		UserOnBoarding.loginasCustodian();
		UserOnBoarding.VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails();
	} 
	
	@Test
	public void VerifyUserSelectsHTAndOfficialRoleUserIsGettingObservationTab() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User2");
	   Observation.validateObservationTab();
			
	}
	@Test
	public void VerifyUserAddMUAUserAndAbletoSwtichTheAccount() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User2");
		UserOnBoarding.CustodianUserIsAableToAddTheMUAUser();
	   
			
	}
}

	
	
	
	
	
