package observation;

import org.testng.annotations.Test;

import pageActions.Observation;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class VerifyRoles extends BaseClass {

	
	@Test
	public void VerifyUserSelectsRoleHeadTeacherAndOfficial() throws Exception{
		
		
		UserOnBoarding.schoolheadicon();
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Public User1");
		Observation.validateObservationTab();
		Observation.SelectRoleAsTeacher();
		
		
		
		
		
		
		
	}
		
}
