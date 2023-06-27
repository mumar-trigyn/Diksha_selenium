package pageActions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseCreation;
import pageObject.CreateBook;
import pageObject.LoginPage;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;


public class Course_Creation extends BaseClass {

 public static String UploadContentFromLibrary(String contentName) throws Exception {
			
	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
	 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	 ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
	 
	 DikshaUtils.waitToBeClickableAndClick(content.getHeaderDropdown());
	 DikshaUtils.waitToBeClickableAndClick(content.getWorkspace());
	 DikshaUtils.waitToBeClickableAndClick(content.getCoursetab());
	 DikshaUtils.waitToBeClickableAndClick(content.getAddCourseTitle());
	 content.getAddCourseTitle().clear();
	 String randomname=DikshaUtils.set_Content_Name("Course_");
	 DikshaUtils.waitToBeClickableAndSendKeys(content.getAddCourseTitle(),randomname);
		
	 String id= DikshaUtils.generate_Do_id();
	 excel.updateData("TestData","Course" ,randomname, id);
       
     int scrollX = 0; // horizontal scroll amount
     int scrollY = 200; // vertical scroll amount
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
     DikshaUtils.waitToBeClickableAndClick(content.getCourseadditionalCategory());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectAdditionalCategory());
     DikshaUtils.waitToBeClickableAndClick(content.getCourseType());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectcourseType());
     DikshaUtils.waitToBeClickableAndClick(content.getSubjectCovered());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject());
     
     JavascriptExecutor js1=(JavascriptExecutor)driver;
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectBoardForcourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoardForcourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoard());
     
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectMediumForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectMediumForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectMedium());
     
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectClassForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectClassForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectclass());
	
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectSubjectForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubjectForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject2());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getSelectCopyRightYear(),"2023");
     
     js.executeScript("window.scrollTo(0, 0)");
     
     DikshaUtils.waitToBeClickableAndClick(content.getSaveAsDraft());
     Thread.sleep(5000);
     String ContentsuccessfullySavedPopup = popup.getSaveAsDraftPopUp().getText();
     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
     Thread.sleep(1000);
     
     DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getChildDesc1(),"Created via Automation");
     DikshaUtils.waitToBeClickableAndClick(content.getAddFromLibraryButton());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getSearchContentFromLibrary(),contentName);
	
     content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
     DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
     Thread.sleep(2000);
     String ContentsuccessfullyaddPopup = popup.getContentAddFromLibraryPopup().getText();
     Assert.assertEquals(ContentsuccessfullyaddPopup, "Content is added to the folder");
     Thread.sleep(2000);
     
     DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
     DikshaUtils.waitToBeClickableAndClick(content.getSubmitForreviewButton());
     DikshaUtils.waitToBeClickableAndClick(content.getTermsAndConditionCheckbox());
     DikshaUtils.waitToBeClickableAndClick(content.getNewCoursesubmitButton());
     Thread.sleep(2000);
     String ContentsendPopup = popup.getSendForReviewPopUp().getText();
     Assert.assertEquals(ContentsendPopup, "Content is sent for review");
     Thread.sleep(2000);
		
		return randomname;
		
	}
 
 	public static String checkUploadContentFromLibrary(String contentName) throws Exception {
		
	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
	 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	 ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
	 
	 DikshaUtils.waitToBeClickableAndClick(content.getHeaderDropdown());
	 DikshaUtils.waitToBeClickableAndClick(content.getWorkspace());
	 DikshaUtils.waitToBeClickableAndClick(content.getCoursetab());
	 DikshaUtils.waitToBeClickableAndClick(content.getAddCourseTitle());
	 content.getAddCourseTitle().clear();
	 String randomname=DikshaUtils.set_Content_Name("Course_");
	 DikshaUtils.waitToBeClickableAndSendKeys(content.getAddCourseTitle(),randomname);
		
	 String id= DikshaUtils.generate_Do_id();
	 excel.updateData("TestData","Course" ,randomname, id);
        
     int scrollX = 0; // horizontal scroll amount
     int scrollY = 200; // vertical scroll amount
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
     DikshaUtils.waitToBeClickableAndClick(content.getCourseadditionalCategory());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectAdditionalCategory());
     DikshaUtils.waitToBeClickableAndClick(content.getCourseType());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectcourseType());
     DikshaUtils.waitToBeClickableAndClick(content.getSubjectCovered());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject());
     
     JavascriptExecutor js1=(JavascriptExecutor)driver;
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectBoardForcourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoardForcourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoard());
     
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectMediumForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectMediumForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectMedium());
     
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectClassForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectClassForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectclass());
	
     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectSubjectForCourse());
     
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubjectForCourse());
     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject2());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getSelectCopyRightYear(),"2023");
     
     js.executeScript("window.scrollTo(0, 0)");
     
     DikshaUtils.waitToBeClickableAndClick(content.getSaveAsDraft());
     Thread.sleep(5000);
     String ContentsuccessfullySavedPopup = popup.getSaveAsDraftPopUp().getText();
     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
     Thread.sleep(1000);
     
     DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getChildDesc1(),"Created via Automation");
     DikshaUtils.waitToBeClickableAndClick(content.getAddFromLibraryButton());
     DikshaUtils.waitToBeClickableAndSendKeys(content.getSearchContentFromLibrary(),contentName);
	
     content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
     DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
     Thread.sleep(2000);
     String ContentsuccessfullyaddPopup = popup.getContentAddFromLibraryPopup().getText();
     Assert.assertEquals(ContentsuccessfullyaddPopup, "Content is added to the folder");
     Thread.sleep(2000);

		
		return randomname;
	
	}
 	public static String addCourseAssessmentInCourse(String contentName) throws Exception {
		
 		 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
 		 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
 		ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
 		
 		 DikshaUtils.waitToBeClickableAndClick(content.getHeaderDropdown());
 		 DikshaUtils.waitToBeClickableAndClick(content.getWorkspace());
 		 DikshaUtils.waitToBeClickableAndClick(content.getCoursetab());
 		 DikshaUtils.waitToBeClickableAndClick(content.getAddCourseTitle());
 		 content.getAddCourseTitle().clear();
 		 String randomname=DikshaUtils.set_Content_Name("Course_");
 		 DikshaUtils.waitToBeClickableAndSendKeys(content.getAddCourseTitle(),randomname);
 			
 		 String id= DikshaUtils.generate_Do_id();
 		 excel.updateData("TestData","Course" ,randomname, id);
 	       
 	     int scrollX = 0; // horizontal scroll amount
 	     int scrollY = 200; // vertical scroll amount
 	     JavascriptExecutor js=(JavascriptExecutor)driver;
 	     js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
 	     DikshaUtils.waitToBeClickableAndClick(content.getCourseadditionalCategory());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectAdditionalCategory());
 	     DikshaUtils.waitToBeClickableAndClick(content.getCourseType());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectcourseType());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSubjectCovered());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject());
 	     
 	     JavascriptExecutor js1=(JavascriptExecutor)driver;
 	     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectBoardForcourse());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoardForcourse());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectBoard());
 	     
 	     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectMediumForCourse());
 	     
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectMediumForCourse());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectMedium());
 	     
 	     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectClassForCourse());
 	     
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectClassForCourse());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectclass());
 		
 	     js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectSubjectForCourse());
 	     
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubjectForCourse());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject2());
 	     DikshaUtils.waitToBeClickableAndSendKeys(content.getSelectCopyRightYear(),"2023");
 	     
 	     js.executeScript("window.scrollTo(0, 0)");
 	     
 	     DikshaUtils.waitToBeClickableAndClick(content.getSaveAsDraft());
 	    Thread.sleep(5000);
 	     String ContentsuccessfullySavedPopup = popup.getSaveAsDraftPopUp().getText();
 	     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
 	     Thread.sleep(1000);
 	     
 	     DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
 	     DikshaUtils.waitToBeClickableAndSendKeys(content.getChildDesc1(),"Created via Automation");
 	     DikshaUtils.waitToBeClickableAndClick(content.getAddFromLibraryButton());
 	     DikshaUtils.waitToBeClickableAndSendKeys(content.getSearchContentFromLibrary(),contentName);
 		
 	     content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
 	     Thread.sleep(3000);
 	     DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
 	     DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
 	    Thread.sleep(2000);
 	     String ContentsuccessfullyaddPopup = popup.getContentAddFromLibraryPopup().getText();
 	     Assert.assertEquals(ContentsuccessfullyaddPopup, "Content is added to the folder");
 	     Thread.sleep(2000);
 	     DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
 	     DikshaUtils.waitToBeClickableAndClick(content.getSubmitForreviewButton());
 	     DikshaUtils.waitToBeClickableAndClick(content.getTermsAndConditionCheckbox());
 	     DikshaUtils.waitToBeClickableAndClick(content.getNewCoursesubmitButton());
 	    Thread.sleep(2000);
 	     String ContentsendPopup = popup.getSendForReviewPopUp().getText();
 	     Assert.assertEquals(ContentsendPopup, "Content is sent for review");
 	     Thread.sleep(2000);
 			return randomname;
 			
 		}
 
 	public static String CreateCourseUsingTextbookAndSendForReview () throws Exception{
 		 
 		 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
 		 CreateBook create=PageFactory.initElements(driver, CreateBook.class);
 		ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
 		
 		    DikshaUtils.waitToBeClickableAndClick(content.getHeaderDropdown());
 		    DikshaUtils.waitToBeClickableAndClick(content.getWorkspace());
 	        DikshaUtils.waitToBeClickableAndClick(content.getCoursetab());
 			DikshaUtils.waitToBeClickableAndClick(content.getAddCourseTitle());
 			content.getAddCourseTitle().clear();
 			Thread.sleep(1000);
 	        String randomname=DikshaUtils.set_Content_Name("CourseUsingTextbook_");
 			content.getAddCourseTitle().sendKeys(randomname);
 			
 			JavascriptExecutor js=(JavascriptExecutor)driver;
 			  js.executeScript("window.scrollBy(0, 700)");
 			DikshaUtils.waitToBeClickableAndClick(content.getCourseType());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectcourseType());
 			Thread.sleep(1000);
 			DikshaUtils.waitToBeClickableAndClick(content.getSubjectCovered());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject());
 		 
 			
 			JavascriptExecutor js1=(JavascriptExecutor)driver;
 	        js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectBoardForcourse());
 			
 	        DikshaUtils.waitToBeClickableAndClick(content.getSelectBoardForcourse());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectBoard());
 			
 			js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectMediumForCourse());
 			
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectMediumForCourse());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectMedium());
 			js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectClassForCourse());
 			
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectClassForCourse());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectclass());
 			
 			js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectSubjectForCourse());
 			
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectSubjectForCourse());
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectSubject2());
 			
 			Library.custom_sendkeys(content.getSelectCopyRightYear(),"2023","SelectCopyRightYear");
 			Thread.sleep(1000);
 			js.executeScript("window.scrollTo(0, 0)");
 			DikshaUtils.waitToBeClickableAndClick(content.getSaveAsDraft());
 			Thread.sleep(5000);
 		     String ContentsuccessfullySavedPopup = popup.getSaveAsDraftPopUp().getText();
 		     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
 		     Thread.sleep(1000);
 			DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
 			DikshaUtils.waitToBeClickableAndClick(content.getChildDesc1());
 			DikshaUtils.waitToBeClickableAndClick(content.getAddFromLibraryButton());
 			
 			DikshaUtils.waitToBeClickableAndClick(content.getSearchContentFromLibrary());
 			content.getSearchContentFromLibrary().sendKeys("textbook");
 			content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
 			Thread.sleep(2000);
 			DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
 			DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
 			 Thread.sleep(2000);
 		     String ContentsuccessfullyaddPopup = popup.getContentAddFromLibraryPopup().getText();
 		     Assert.assertEquals(ContentsuccessfullyaddPopup, "Content is added to the folder");
 		     Thread.sleep(2000);
 			DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
 			DikshaUtils.waitToBeClickableAndClick(content.getSubmitForreviewButton());
 			DikshaUtils.waitToBeVisibleAndClick(content.getTermsAndConditionCheckbox());
 			DikshaUtils.waitToBeClickableAndClick(content.getNewCoursesubmitButton());
 			Thread.sleep(2000);
 		     String ContentsendPopup = popup.getSendForReviewPopUp().getText();
 		     Assert.assertEquals(ContentsendPopup, "Content is sent for review");
 		     Thread.sleep(2000);
 			
 			return randomname;
 			
 			
 			
 	   }
 	
}
