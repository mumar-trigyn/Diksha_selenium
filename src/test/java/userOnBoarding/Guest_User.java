package userOnBoarding;

import org.testng.annotations.Test;

import pageActions.Guest_User_Methods;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class Guest_User extends BaseClass {

	//@Test
	public void verifyBMC_and_LocationPopUp_In_Profile_Section() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandleWithGuestName();
		Guest_User_Methods.validateLocationAndBMC();
		
	}
//	@Test
	public void verifyBMCS_Values_In_Diffrent_Tabs() throws Exception {
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		Guest_User_Methods.validateBMCSForDiffrentTabs();
		
	}
	@Test
	public void verifyDiffrentSectionsInHomeTab() throws Exception {
		
		UserOnBoarding.teachericon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		Guest_User_Methods.validateDiffrentSectionsUnderHomeTab();
		
		
	}
	
	//@Test
	public void VerifyIfTheGuestUserEditBMCValuesAndSave() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.Verify_Guest_user_is_able_to_edit_BMC_Values();
		
	}
	
	
}
