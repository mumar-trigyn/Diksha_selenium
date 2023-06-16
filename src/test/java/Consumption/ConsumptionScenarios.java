package Consumption;

import org.testng.annotations.Test;

import pageActions.Course_Consumption;
import pageActions.UserOnBoarding;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.ExcelDataProvider;

public class ConsumptionScenarios extends BaseClass {

	@Test
		public void seachBookWithNameAndDoid() throws Exception {
			UserOnBoarding.schoolheadicon();
			UserOnBoarding.bmcpopuphandle();
			UserOnBoarding.locationpopuphandle();
			UserOnBoarding.login("Creator");
			UserOnBoarding.logout();
			UserOnBoarding.login("Public User1");
			 String name = excel.getContentName("PDF");
			 String id =excel.getDoID("Course");
			Course_Consumption.searchContentForConsumption(id);
			
		}
	
}
