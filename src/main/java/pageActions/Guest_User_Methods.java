package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.Filter;
import pageObject.FiltersInDiffrentTabs;
import pageObject.GuestProfileSection;
import pageObject.LoginAsCustodian;
import pageObject.UserHomeTab;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class Guest_User_Methods extends BaseClass {

	
	public static void validateLocationAndBMC() throws InterruptedException {
		
		GuestProfileSection guest=PageFactory.initElements(driver, GuestProfileSection.class);
		
		DikshaUtils.waitToBeVisibleAndClick(guest.getProfileIcon());
		
		Library.custom_click(guest.getProfileTab(), "ProfileTab");
		Thread.sleep(2000);
		String actualProfileName = guest.getProfileName().getText();
		String actualRoleName = guest.getRole().getText();
		String actualDistrictName = guest.getDistrict().getText();
		String actualStateName = guest.getState().getText();
		String actualBoardName = guest.getBoard().getText();
		String actualMediumName = guest.getMedium().getText();
		String actualClassName = guest.getClasss().getText();
	
		Assert.assertEquals(actualProfileName, "Custodian");
		Assert.assertEquals(actualRoleName, "Teacher");
		Assert.assertEquals(actualDistrictName, "Akola");
		Assert.assertEquals(actualStateName, "Maharashtra");
		Assert.assertEquals(actualBoardName, "CBSE/NCERT");
		Assert.assertEquals(actualMediumName, "English");
		Assert.assertEquals(actualClassName, "Class 2");
	}
	
	public static void validateBMCSForDiffrentTabs() throws Exception {
		FiltersInDiffrentTabs filter=PageFactory.initElements(driver, FiltersInDiffrentTabs.class);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Assert.assertTrue(filter.getBoard().isDisplayed());
		Assert.assertTrue(filter.getMedium().isDisplayed());
		Assert.assertTrue(filter.getClasss().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(filter.getSubject().isDisplayed());
		Assert.assertTrue(filter.getPublishedusertype().isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
		Library.custom_click(filter.getCoursesTab(), "courseTab Click");
		Thread.sleep(2000);
		Assert.assertTrue(filter.getBoard().isDisplayed());
		Assert.assertTrue(filter.getMedium().isDisplayed());
		Assert.assertTrue(filter.getClasss().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(filter.getSubject().isDisplayed());
		Assert.assertTrue(filter.getPublishedusertype().isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
		Library.custom_click(filter.getTvClassesTab(), "TvClassesTab Click");
		Thread.sleep(2000);
		Assert.assertTrue(filter.getBoard().isDisplayed());
		Assert.assertTrue(filter.getMedium().isDisplayed());
		Assert.assertTrue(filter.getClasss().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(filter.getSubject().isDisplayed());
		Assert.assertTrue(filter.getPublishedusertype().isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		
	}
	
	public static void validateDiffrentSectionsUnderHomeTab() throws Exception {
		LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
		UserHomeTab home=PageFactory.initElements(driver, UserHomeTab.class);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Library.custom_click(home.gethomeTab(), "Home tab Click");
		Thread.sleep(2000);
		Assert.assertTrue(home.getBrowseBySubject().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getBrowseByCategories().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getBrowseByOtherCategories().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getRecentlyPublishedCourse().isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		
		Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
		Thread.sleep(1000);
		Library.custom_click(Log.getLogintab(),"Logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(Log.getUserName(),excel.getExcelData("Credentials", 5,1 ), "username");
		Library.custom_sendkeys(Log.getPassword(),excel.getExcelData("Credentials", 5,2 ), "Password");
		Library.custom_click(Log.getLogin(),"login button");
		Thread.sleep(2000);
		Assert.assertTrue(Log.getHeaderDropdown().isDisplayed());
		
		Library.custom_click(home.gethomeTab(), "Home tab Click");
		Thread.sleep(2000);
		Assert.assertTrue(home.getContinueLearning().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getBrowseBySubject().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getBrowseByCategories().isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		Assert.assertTrue(home.getRecentlyPublishedCourse().isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		
	
	}
	
	public static void VerifyProfileBMCValueForAnotherTab() throws Exception {
		
		FiltersInDiffrentTabs filter=PageFactory.initElements(driver, FiltersInDiffrentTabs.class);
		Filter filtertab=PageFactory.initElements(driver, Filter.class);
		LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
		UserHomeTab home=PageFactory.initElements(driver, UserHomeTab.class);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		DikshaUtils.waitToBeClickableAndClick(home.gethomeTab());
		DikshaUtils.waitToBeClickableAndClick(filter.getDigitalTextbookTab());
		
		
		Assert.assertTrue( filtertab.getMedium().isDisplayed());
		Assert.assertTrue( filtertab.getMediumhindi().isDisplayed());
	    Assert.assertTrue( filtertab.getClasss().isDisplayed());
	    Assert.assertTrue( filtertab.getSelectclasss1().isDisplayed());
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick( filtertab.getMedium());
		DikshaUtils.waitToBeClickableAndClick( filtertab.getMediumhindi());
		DikshaUtils.waitToBeClickableAndClick( filtertab.getClasss());
		DikshaUtils.waitToBeClickableAndClick( filtertab.getSelectclasss2());
		Thread.sleep(1000);
		
		Library.custom_click(filter.getCoursesTab(), "courseTab Click");
		
		
		Thread.sleep(1000);
		Assert.assertTrue( filtertab.getMedium().isDisplayed());
		Assert.assertTrue( filtertab.getMediumhindi().isDisplayed());
	    Assert.assertTrue( filtertab.getClasss().isDisplayed());
	    Assert.assertTrue( filtertab.getSelectclasss1().isDisplayed());
		Thread.sleep(1000);
		
				
		
	}
	
	
}
