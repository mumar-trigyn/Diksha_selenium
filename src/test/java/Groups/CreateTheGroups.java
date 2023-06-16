package Groups;

import org.testng.annotations.Test;

import pageActions.CreateGroups;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class CreateTheGroups extends BaseClass {

	@Test
	public void VerifyUserIsAbleToCreateNewGroups() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("NewUser");
		CreateGroups.UserIsAbleTOCreateNewGroupsAndVerify();
			
	}
	
//	@Test
	public void  VerifyUserDisplayedWithEnableDiscussionsOption() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("NewUser");
		CreateGroups.VerifyUserDisplayedEnableDiscussionsOption();	
	}
	
//	@Test
	public void  VerifyUserDisplayedwithDisableDiscussionsOption() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("NewUser");
		CreateGroups.VerifyUserDisplayedDisableDiscussionsOption();
		
		
	}
	
	//@Test
	public void  VerifyCloseOptionDisplayedAfterOpenDiscussionForumOption() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("NewUser");
		CreateGroups.VerifyCloseOptionIsDisplayed();
		
			
	}
	
//	@Test
	public void VerifyGroupAdminTrackConsumtionOfCoursesOfTheGroupMembers() throws Exception {
		
		UserOnBoarding.studenticon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("NewUser");
		CreateGroups.VerifyGroupAdminTrackConsumptionOfCourse();
			
		
	}
	
	
}
