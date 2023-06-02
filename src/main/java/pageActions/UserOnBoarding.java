package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.BMCPopup;
import pageObject.ExplorePage;
import pageObject.HomePage;
import pageObject.LocationPopup;
import pageObject.LoginAsCustodian;
import pageObject.LoginPage;
import pageObject.Logout;
import pageObject.ManageUser;
import pageObject.OtherProfile;
import pageObject.ParentProfile;
import pageObject.SchoolHeadProfile;
import pageObject.StudentProfile;
import pageObject.TeacherProfile;
import pageObject.userProfile;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

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
	
	public static void logout() throws Exception { 

		Logout log = PageFactory.initElements(driver, Logout.class);
		DikshaUtils.waitToBeClickableAndClick(log.getDigitaltextbooktab());
		DikshaUtils.waitToBeClickableAndClick(log.getCreatorIcon());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", log.getLogout());
		DikshaUtils.waitToBeClickableAndClick(log.getLogout());
	
		
		Thread.sleep(2000);
		 

		}

public static void loginAsNewCustodian() throws Exception {
		
		
		ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
	   
	//	explore.getExplorebutton().click();
	    
		Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
		Thread.sleep(1000);
		Library.custom_click(Log.getLogintab(),"Logintab");
		Thread.sleep(1000);
		Library.custom_sendkeys(Log.getUserName(),excel.getExcelData("Credentials", 60,1 ), "username");
		Library.custom_sendkeys(Log.getPassword(),excel.getExcelData("Credentials", 60,2 ), "Password");
		Library.custom_click(Log.getLogin(),"login button");
		
	//	Assert.assertTrue(Log.getCustodianheaderDropdown().isDisplayed());
}
	
	public static void loginasCustodian() throws Exception {
	
	
	ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
	LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
   
//	explore.getExplorebutton().click();
    
	Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
	Thread.sleep(1000);
	Library.custom_click(Log.getLogintab(),"Logintab");
	Thread.sleep(1000);
	Library.custom_sendkeys(Log.getUserName(),excel.getExcelData("Credentials", 5,1 ), "username");
	Library.custom_sendkeys(Log.getPassword(),excel.getExcelData("Credentials", 5,2 ), "Password");
	Library.custom_click(Log.getLogin(),"login button");
	
//	Assert.assertTrue(Log.getCustodianheaderDropdown().isDisplayed());
}

public static void NewUser() throws Exception {
	
	ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
	LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
   
//	explore.getExplorebutton().click();
    
	Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
	Thread.sleep(1000);
	Library.custom_click(Log.getLogintab(),"Logintab");
	Thread.sleep(1000);
	Library.custom_sendkeys(Log.getUserName(),excel.getExcelData("Credentials", 59,1 ), "username");
	Library.custom_sendkeys(Log.getPassword(),excel.getExcelData("Credentials", 59,2 ), "Password");
	Library.custom_click(Log.getLogin(),"login button");
	
	
}


	public static void Verify_Guest_user_is_able_to_edit_BMC_Values () throws Exception {
		 
		 userProfile guest=PageFactory.initElements(driver, userProfile.class);
		 
		 DikshaUtils.waitToBeClickableAndClick(guest.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(guest.getProfilebutton());
        DikshaUtils.waitToBeClickableAndClick(guest.getLocationeditbutton());
        DikshaUtils.waitToBeVisibleAndClick(guest.getguestRole());
        DikshaUtils.waitToBeClickableAndClick(guest.getteacher());
        DikshaUtils.waitToBeVisibleAndClick(guest.getDistrict());
        DikshaUtils.waitToBeClickableAndClick(guest.getAmravati());
        DikshaUtils.waitToBeClickableAndClick(guest.getLocationSubmitButton());

		Thread.sleep(2000);
		
		String actualRoleName = guest.getTeacherprofile().getText();
       String actualDistrictName = guest.getTextAmravati().getText();
      
       Thread.sleep(2000);
       
       System.out.println(actualRoleName);
       System.out.println(actualDistrictName);

       Assert.assertEquals(actualRoleName, "Teacher");
       Assert.assertEquals(actualDistrictName, "Amravati");
       
       Thread.sleep(2000);
		
      JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",guest.getBMCeditbutton());
		Library.custom_click(guest.getBMCeditbutton(),"BMCEditbutton");
		Thread.sleep(1000);
		
		
		DikshaUtils.waitToBeVisibleAndClick(guest.getBoard());
		DikshaUtils.waitToBeClickableAndClick(guest.getIGOT_Health());
		Thread.sleep(4000);
		DikshaUtils.waitToBeClickableAndClick(guest.getMedium());
	    DikshaUtils.waitToBeClickableAndClick(guest.getGujarati());

		
		Thread.sleep(1000);
		
		 Actions act=new Actions(driver);
		 act.moveByOffset(50, 100).click().build().perform();
		 Thread.sleep(1000);
		 
		DikshaUtils.waitToBeVisibleAndClick(guest.getClasss());
		DikshaUtils.waitToBeVisibleAndClick(guest.getPharmacist());
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		Library.custom_click(guest.getBMCSubmit(),"bmcsubmit");
		Thread.sleep(2000);
	
		
		String actualBoardName = guest.getIGOT_Health().getText();
       String actualMediumName = guest.getGujarati().getText();
       String actualClassName = guest.getPharmacist().getText();
       
       System.out.println(actualBoardName);
       System.out.println(actualMediumName);
       System.out.println(actualClassName);
       
       Assert.assertEquals(actualBoardName, "IGOT-Health");
       Assert.assertEquals(actualMediumName, "Gujarati");
       Assert.assertEquals(actualClassName, "Pharmacist");    
       
	 }
	 
	 public static void VerifyTheUserShouldBeAbleToEditTheSubmittedDetailsOptionInProfile () throws Exception {
		 
		 userProfile user=PageFactory.initElements(driver, userProfile.class);
		 Logout log=PageFactory.initElements(driver, Logout.class);
		 
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	//    js.executeScript("arguments[0].scrollIntoView(true);",user.getSubmitDetails());
	     js.executeScript("window.scrollBy(0, 500)");
	     Thread.sleep(2000);
		 user.getSubmitDetails().isDisplayed();
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(user.getSubmitDetails());
		 DikshaUtils.waitToBeVisibleAndClick(user.getInstitutionTab());
		 DikshaUtils.waitToBeClickableAndClick(user.getCbscTab());
		 DikshaUtils.waitToBeClickableAndClick(user.getSubmitDetailCheckbox());
		 Thread.sleep(1000);
		 user.getProfileSubmitbutton().isDisplayed();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollTo(0, 0)");
//		 js.executeScript("arguments[0].scrollIntoView(true);",user.getCustodianheaderDropdown());
	     Thread.sleep(2000);
		 DikshaUtils.waitToBeVisibleAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(log.getLogout());
		 
		 ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		 explore.getExplorebutton().click();
		 
		 
		 
	 }
	 
	 public static void VerifyTheUserIsAbleToUpdateTheBMCAndLocationDetails () throws Exception {
		 
		
		 userProfile user=PageFactory.initElements(driver, userProfile.class);
		 HomePage home=PageFactory.initElements(driver, HomePage.class);
		 BMCPopup bmcpopup=PageFactory.initElements(driver,  BMCPopup.class);
		 Thread.sleep(1000);
		
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 DikshaUtils.waitToBeClickableAndClick(user.getLocationeditbutton());
		 DikshaUtils.waitToBeVisibleAndClick(user.getRole());
		 DikshaUtils.waitToBeClickableAndClick(user.getParent());
		 DikshaUtils.waitToBeClickableAndClick(user.getState());
		 DikshaUtils.waitToBeClickableAndClick(user.getAndhraPradesh());
		 DikshaUtils.waitToBeClickableAndClick(user.getDistrict());
		 DikshaUtils.waitToBeClickableAndClick(user.getDistrictAlluriSitaRamaRaju());
		 DikshaUtils.waitToBeClickableAndClick(user.getLocationSubmitButton());
		 Thread.sleep(2000);
		
		 String actualRoleName = user.getTextParent().getText();
	        String actualDistrictName = user.getTextDistrict().getText();
	        String actualStateName = user.getTextAP().getText();
	        
	        System.out.println(actualRoleName);
	        System.out.println(actualDistrictName);
	        System.out.println(actualStateName);
	        
	        Assert.assertEquals(actualRoleName, "Parent");
	        Assert.assertEquals(actualDistrictName, "Alluri Sita Rama Raju");
	        Assert.assertEquals(actualStateName, "Andhra Pradesh"); 
		  
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("arguments[0].scrollIntoView(true);",user.getBMCeditbutton());
	        js.executeScript("window.scrollBy(0, 500)");

		    
		// Library.custom_click(user.getBMCeditbutton(), "BMCeditbutton");
		 DikshaUtils.waitToBeClickableAndClick(user.getBMCeditbutton());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getBoard());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getCbsc());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getMedium());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getHindi());
		 Actions act=new Actions(driver);
		 act.moveByOffset(50, 100).click().build().perform();
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getClasss());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getClass4());
		 act.moveByOffset(50, 100).click().build().perform();
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getBMCSubmit());
		 Thread.sleep(2000);
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(user.getBackButton());
		 Thread.sleep(2000); 
		 DikshaUtils.waitToBeClickableAndClick(home.getHomeTab());
		 Thread.sleep(5000);
		 DikshaUtils.waitToBeClickableAndClick(home.getChnagePreferences());
		 DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getBoard());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getCbsc());
		 DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getMedium());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getEnglish());
		 act.moveByOffset(50, 100).click().build().perform();
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getClasss());
		 DikshaUtils.waitToBeClickableAndClick(bmcpopup.getClass2());
		 act.moveByOffset(50, 100).click().build().perform();
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeVisibleAndClick(bmcpopup.getBMCSubmit());
		  Thread.sleep(2000);
			
		 String actualBoardName = user.getTextCbsc().getText();
	     String actualMediumName = user.getTextEnglish().getText();
	     String actualClassName = user.getTextClass2().getText();
	        
	        System.out.println(actualBoardName);
	        System.out.println(actualMediumName);
	        System.out.println(actualClassName);
//	        
//	        Assert.assertEquals(actualBoardName, "CBSE/NCERT");
//	        Assert.assertEquals(actualMediumName, "English");
//	        Assert.assertEquals(actualClassName, "Class 2"); 
//		  
//		 	 	 	 
	 }
	 
	 public static void VerifyUserShouldBeAbleToEditTheSubmittedDetails() throws Exception {
		 

		 userProfile user=PageFactory.initElements(driver,userProfile.class);
		 Thread.sleep(1000);
		
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 1200)");
	    //js.executeScript("arguments[0].scrollIntoView(true);",user.getBeforeUpdateButton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeClickableAndClick(user.getBeforeUpdateButton());
		 DikshaUtils.waitToBeClickableAndClick(user.getId());
		 DikshaUtils.waitToBeClickableAndClick(user.getAfterUpdateButton());
		 Thread.sleep(1000);
		 js.executeScript("arguments[0].scrollIntoView(true);",user.getUpdateIdText());
		 Thread.sleep(1000);
		
		 String actualIdName =user.getUpdateIdText().getText();
		 Assert.assertEquals(actualIdName, "Akash123");
		 
	 
	 }
	 
	 public static void validateObservationTab() throws Exception {
		 
		 userProfile user=PageFactory.initElements(driver,userProfile.class);
		 HomePage home=PageFactory.initElements(driver, HomePage.class);
		 Thread.sleep(1000);
		
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(user.getProfilebutton());
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(user.getLocationeditbutton());
		 DikshaUtils.waitToBeVisibleAndClick(user.getRole());
		 DikshaUtils.waitToBeClickableAndClick(user.getHTOfficial());
		 Thread.sleep(2000);
//		 DikshaUtils.waitToBeVisibleAndClick(user.getSubRole());
//		 DikshaUtils.waitToBeVisibleAndClick(user.getprinciple());
		 DikshaUtils.waitToBeClickableAndClick(user.getPersonalDetailSubmitButton());
		 Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(2000);
		 DikshaUtils.waitToBeClickableAndClick(user.getBackButton());
		 Thread.sleep(2000);
		 home.getObservationTab().isDisplayed();
		 	 	 
	 }
	 
	 public static String addUser() throws Exception {
		
		 ManageUser adduser=PageFactory.initElements(driver,ManageUser.class);
		
		 DikshaUtils.waitToBeClickableAndClick(adduser.getEnterName());
		 String name=DikshaUtils.set_Content_Name("Abc_");
		 adduser.getEnterName().sendKeys(name);
		 DikshaUtils.waitToBeClickableAndClick(adduser.getAddUserTab());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeVisibleAndClick(adduser.getAddUserTab());
		 
		 return name;
	 }
	 
	 
	 public static void CustodianUserIsAableToAddTheMUAUser() throws Exception {
		
		 userProfile user=PageFactory.initElements(driver,userProfile.class);
		 ManageUser adduser=PageFactory.initElements(driver,ManageUser.class);
		 
		 DikshaUtils.waitToBeClickableAndClick(user.headerDropdown());
		 DikshaUtils.waitToBeClickableAndClick(adduser.getAddAnotherUserTab());
		  
		 for(int i=0;i<30;i++) {
			 
			 UserOnBoarding.addUser();
		 }
		 	 
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
