package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.HomePage;
import pageObject.LocationPopup;
import pageObject.userProfile;
import utility.BaseClass;
import utility.DikshaUtils;

public class Observation extends BaseClass {

	public static void validateObservationTab() throws Exception {
		 
		 userProfile user=PageFactory.initElements(driver,userProfile.class);
		 HomePage home=PageFactory.initElements(driver, HomePage.class);
		 LocationPopup locationpopup=PageFactory.initElements(driver, LocationPopup.class);
		 Thread.sleep(1000);
		
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(locationpopup.getLocationeditbutton());
		 DikshaUtils.waitToBeVisibleAndClick(locationpopup.getRole());
		 DikshaUtils.waitToBeClickableAndClick(locationpopup.getHTOfficial());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeVisibleAndClick(locationpopup.getSubRole());
		 DikshaUtils.waitToBeVisibleAndClick(locationpopup.getHeadmaster());
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 1000)");
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(locationpopup.getPersonalDetailSubmitButton());
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(user.getBackButton());
		 Thread.sleep(2000);
		 home.getObservationTab().isDisplayed();
		 	 	 
	 }
	
	public static void SelectRoleAsTeacher() throws Exception{
		
		
		 userProfile user=PageFactory.initElements(driver,userProfile.class);
		 HomePage home=PageFactory.initElements(driver, HomePage.class);
		 LocationPopup locationpopup=PageFactory.initElements(driver, LocationPopup.class);
		 Thread.sleep(1000);
		
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(locationpopup.getLocationeditbutton());
		 DikshaUtils.waitToBeVisibleAndClick(locationpopup.getRole());
		 DikshaUtils.waitToBeVisibleAndClick(locationpopup.getTeacher());
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 1000)");
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(locationpopup.getPersonalDetailSubmitButton());
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(user.getBackButton());
		 Thread.sleep(2000);
		 
	  //  Assert.assertFalse(!home.getObservationTab().isDisplayed());
		 
		 
		
	}
	
	
	
}