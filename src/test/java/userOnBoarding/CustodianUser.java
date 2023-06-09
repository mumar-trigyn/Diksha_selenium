package userOnBoarding;

import org.testng.annotations.Test;

import pageActions.Observation;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CustodianUser extends BaseClass {

	@Test
	public void VerifyCustodianUsersAreGettingSubmitDetailsOptionInHisProfile() throws Exception {
	
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Dont Use");
		UserOnBoarding.VerifyTheUserShouldBeAbleToEditTheSubmittedDetailsOptionInProfile();
		UserOnBoarding.login("AddUserCred");
		UserOnBoarding.VerifyUserShouldBeAbleToEditTheSubmittedDetails();
		
	}

	//@Test
	//Application issue:- not able to select BMC value in one click
	public void VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Dont Use");
		UserOnBoarding.VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails();
	} 
	
	@Test
	public void VerifyUserSelectsHTAndOfficialRoleUserIsGettingObservationTab() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("AddUserCred");
	   UserOnBoarding.validateObservationTab();
	   Observation.SelectRoleAsTeacher();
			
	}
	//@Test
	// for one time run only
	public void VerifyUserAddMUAUserAndAbletoSwtichTheAccount() throws Exception {
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("AddUserCred");
		UserOnBoarding.CustodianUserIsAableToAddTheMUAUser();
	   
			
	}
}

	
	
	
	
	
