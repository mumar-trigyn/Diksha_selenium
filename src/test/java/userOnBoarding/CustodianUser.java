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
		UserOnBoarding.NewUser();
		UserOnBoarding.VerifyTheUserShouldBeAbleToEditTheSubmittedDetailsOptionInProfile();
		UserOnBoarding.loginAsNewCustodian();
		UserOnBoarding.VerifyUserShouldBeAbleToEditTheSubmittedDetails();
		
	}

	@Test
	public void VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginasCustodian();
		UserOnBoarding.VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails();
	} 
	
	@Test
	public void VerifyUserSelectsHTAndOfficialRoleUserIsGettingObservationTab() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginAsNewCustodian();
	   UserOnBoarding.validateObservationTab();
			
	}
	@Test
	public void VerifyUserAddMUAUserAndAbletoSwtichTheAccount() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.loginAsNewCustodian();;
		UserOnBoarding.CustodianUserIsAableToAddTheMUAUser();
	   
			
	}
}

	
	
	
	
	
