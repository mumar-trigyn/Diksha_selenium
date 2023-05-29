package pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObject.BMCPopup;
import pageObject.LocationPopup;
import pageObject.LoginPage;
import pageObject.OtherProfile;
import pageObject.ParentProfile;
import pageObject.SchoolHeadProfile;
import pageObject.StudentProfile;
import pageObject.TeacherProfile;
import utility.BaseClass;
import utility.DikshaUtils;

public class UserOnBoarding extends BaseClass {

	public static void studenticon() throws Exception {

		StudentProfile student = PageFactory.initElements(driver, StudentProfile.class);

		DikshaUtils.waitToBeClickableAndClick(student.getStudentIcon());
		DikshaUtils.waitToBeClickableAndClick(student.getContinueButton());

	}

	public static void teachericon() throws Exception {

		TeacherProfile teacher = PageFactory.initElements(driver, TeacherProfile.class);
		
		DikshaUtils.waitToBeClickableAndClick(teacher.getTeacher());
		DikshaUtils.waitToBeClickableAndClick(teacher.getContinueButton());

	}

	public static void othericon() throws Exception {

		OtherProfile other = PageFactory.initElements(driver, OtherProfile.class);
		
		DikshaUtils.waitToBeClickableAndClick(other.getOther());
		DikshaUtils.waitToBeClickableAndClick(other.getContinueButton());

	}

	public static void parenticon() throws Exception {

		ParentProfile parent = PageFactory.initElements(driver, ParentProfile.class);
		
		DikshaUtils.waitToBeClickableAndClick(parent.getParent());
		DikshaUtils.waitToBeClickableAndClick(parent.getContinueButton());

	}

	public static void schoolheadicon() throws InterruptedException {

		SchoolHeadProfile schoolhead = PageFactory.initElements(driver, SchoolHeadProfile.class);
		
		DikshaUtils.waitToBeClickableAndClick(schoolhead.getSchoolhead());
		DikshaUtils.waitToBeClickableAndClick(schoolhead.getContinueButton());

	}

	public static void bmcpopuphandle() throws InterruptedException {

		BMCPopup bmcpopup = PageFactory.initElements(driver, BMCPopup.class);

		DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getBoard());
		DikshaUtils.waitToBeClickableAndClick(bmcpopup.getCbsc());
		Thread.sleep(4000);
		DikshaUtils.waitToBeClickableAndClick(bmcpopup.getMedium());
		DikshaUtils.waitToBeClickableAndClick(bmcpopup.getEnglish());

		Actions act = new Actions(driver);
		
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getClasss());
		DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getClass2());
		
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getBMCSubmit());
		Thread.sleep(2000);

	}

	public static void locationpopuphandle() throws Exception {

		LocationPopup locationpopup = PageFactory.initElements(driver, LocationPopup.class);

		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getState());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getMaharashtraState());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getDistrict());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getAkolaDistrict());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getSubmitButton());

	}

	public static void locationpopuphandleWithGuestName() throws Exception {

		LocationPopup locationpopup = PageFactory.initElements(driver, LocationPopup.class);

		locationpopup.getGuestNameTextField().clear();
		DikshaUtils.waitToBeClickableAndSendKeys(locationpopup.getGuestNameTextField(), "Custodian");
		
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getState());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getMaharashtraState());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getDistrict());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getAkolaDistrict());
		DikshaUtils.waitToBeVisibleAndClick(locationpopup.getSubmitButton());

	}

	public static void login(String user) throws Exception {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		DikshaUtils.waitToBeVisibleAndClick(loginpage.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(loginpage.getLogintab());

		String cred[] = excel.getCredentails(user);
		String username = cred[0];
		String password = cred[1];

		DikshaUtils.waitToBeClickableAndSendKeys(loginpage.getUserName(), username);
		DikshaUtils.waitToBeClickableAndSendKeys(loginpage.getPassword(), password);
		DikshaUtils.waitToBeClickableAndClick(loginpage.getLogin());

		Thread.sleep(2000);

	}

}	

//Below code is obsolete and wouldn't be used going forward


/*	public static void loginascreator() throws Exception {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		Library.custom_click(loginpage.getHeaderDropdown(), "headerdropdown");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogintab(), "logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getUserName(), excel.getExcelData("Credentials", 1, 1), "username");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 1, 2), "password");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogin(), "login");
		Thread.sleep(1000);

		// Library.assert_Is_Displayed(loginpage.getHeaderDropdown(),"Creator icon" );

		Assert.assertTrue(loginpage.getHeaderDropdown().isDisplayed());
		Thread.sleep(2000);

	}

	public static void loginasreviewer() throws Exception {

		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		Thread.sleep(1000);
		explore.getExplorebutton().click();
		Thread.sleep(1000);

		Library.custom_click(loginpage.getHeaderDropdown(), "headerdropdown");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogintab(), "logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getUserName(), excel.getExcelData("Credentials", 2, 1), "username");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 2, 2), "password");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogin(), "login");
		Thread.sleep(1000);

		Assert.assertTrue(loginpage.getHeaderDropdown().isDisplayed());

	}

	public static void createBook() throws Exception {

		CreateBook createbook = PageFactory.initElements(driver, CreateBook.class);

		Library.custom_click(createbook.getHeaderDropdown(), "headerdropdown");
		Thread.sleep(1000);
		Library.custom_click(createbook.getWorkspace(), "workspace");
		Thread.sleep(4000);
		// createbook.getBook().click();
		Library.custom_click(createbook.getBook(), "book");
		Thread.sleep(4000);

		String randomname = RandomStringUtils.randomAlphabetic(10);
		Library.custom_sendkeys(createbook.getBookname(), randomname, "bookname");
//			createbook.getBookname().sendKeys(randomname);
		Thread.sleep(4000);
		Library.custom_click(createbook.getStartCreating(), "startcreating");
		Thread.sleep(1000);

	}

	public static void logout_As_Creator() throws Exception {

		Logout log = PageFactory.initElements(driver, Logout.class);
		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);

		Library.custom_click(log.getDigitaltextbooktab(), "Digital textbook tab");
		Thread.sleep(1000);
		Library.custom_click(log.getCreatorIcon(), "c icon");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", log.getLogout());
		Library.custom_click(log.getLogout(), "logout");

		Assert.assertTrue(explore.getExplorebutton().isDisplayed());

	}

	public static void logout_As_Reviewer() throws Exception {

		Logout log = PageFactory.initElements(driver, Logout.class);
		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);

		Library.custom_click(log.getDigitaltextbooktab(), "Digital textbook tab");
		Thread.sleep(1000);
		Library.custom_click(log.getCreatorIcon(), "c icon");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", log.getLogout());
		Library.custom_click(log.getLogout(), "logout");

		Assert.assertTrue(explore.getExplorebutton().isDisplayed());

	}

	public static void loginasCustodian() throws Exception {

		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);
		LoginAsCustodian Log = PageFactory.initElements(driver, LoginAsCustodian.class);

		explore.getExplorebutton().click();

		Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
		Thread.sleep(1000);
		Library.custom_click(Log.getLogintab(), "Logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(Log.getUserName(), excel.getExcelData("Credentials", 5, 1), "username");
		Library.custom_sendkeys(Log.getPassword(), excel.getExcelData("Credentials", 5, 2), "Password");
		Library.custom_click(Log.getLogin(), "login button");
		Thread.sleep(2000);
		Assert.assertTrue(Log.getHeaderDropdown().isDisplayed());
	}

	public static void reLoginAsCreator() throws InterruptedException {

		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);
		explore.getExplorebutton().click();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		Library.custom_click(loginpage.getHeaderDropdown(), "headerdropdown");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogintab(), "logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getUserName(), excel.getExcelData("Credentials", 1, 1), "username");
		Thread.sleep(1000);
		Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 1, 2), "password");
		Thread.sleep(1000);
		Library.custom_click(loginpage.getLogin(), "login");
		Thread.sleep(1000);

		Assert.assertTrue(loginpage.getHeaderDropdown().isDisplayed());

	}

*/
