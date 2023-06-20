package userOnBoarding;

import org.testng.annotations.Test;

import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CustodianUser extends BaseClass {

	@Test
	public void VerifyCustodianUsersAreGettingSubmitDetailsOptionInHisProfile() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		UserOnBoarding.VerifyTheUserShouldBeAbleToEditTheSubmittedDetailsOptionInProfile();
		UserOnBoarding.login("Public User2");
		UserOnBoarding.VerifyUserShouldBeAbleToEditTheSubmittedDetails();
		
	}

	@Test
	public void VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User2");
		UserOnBoarding.VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails();
	} 
	
	@Test
	public void VerifyUserSelectsHTAndOfficialRoleUserIsGettingObservationTab() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User2");
	   UserOnBoarding.validateObservationTab();
			
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

	
	
	
	
	
