package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.Collections;
import pageObject.CourseCreation;
import pageObject.LessonPlan;
import pageObject.UploadPdfContent;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class CreateCollections extends BaseClass {

	public static String CreateCollectionsFromBook() throws Exception {
		
		CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
		Collections collections=PageFactory.initElements(driver, Collections.class);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
		
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(collections.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(collections.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(collections.getCollections());
		DikshaUtils.waitToBeClickableAndClick(collections.getNameFeild());
		String name=DikshaUtils.set_Content_Name("Collections_");
		collections.getNameFeild().sendKeys(name);
		DikshaUtils.waitToBeClickableAndClick(collections.getCollectionType());
		DikshaUtils.waitToBeClickableAndClick(collections.getTextbook());
		DikshaUtils.waitToBeClickableAndClick(collections.getStartCreatingTab());
		Thread.sleep(3000);
		
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		   // js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
		    js.executeScript("window.scrollBy(0, 900)");
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeVisibleAndClick(collections.getSelectBoardSyllabus());
		    DikshaUtils.waitToBeClickableAndClick(collections.getBoardSelected());
		    DikshaUtils.waitToBeClickableAndClick(collections.getSelectMedium());
		    DikshaUtils.waitToBeClickableAndClick(collections.getMediumSelected());
		    DikshaUtils.waitToBeClickableAndClick(collections.getSelectClass());
		    DikshaUtils.waitToBeClickableAndClick(collections.getClassSelected());
		    DikshaUtils.waitToBeClickableAndClick(collections.getSelectSubject());
		    DikshaUtils.waitToBeClickableAndClick(collections.getSubjectSelected());
		    
		    js.executeScript("arguments[0].scrollIntoView(true);", collections.getCopyright());
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeClickableAndClick(collections.getCopyright());
		    collections.getCopyright().sendKeys("2023");
		    js.executeScript("window.scrollTo(0, 0)");
		   	DikshaUtils.waitToBeClickableAndClick(collections.getSaveAsDraft());
		   	Thread.sleep(5000);
		     String ContentsuccessfullySavedPopup = popup.getSaveAsDraftPopUp().getText();
		     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
		     Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
			DikshaUtils.waitToBeVisibleAndClick(content.getAddFromLibraryButton());
		
			DikshaUtils.waitToBeVisibleAndClick(content.getSearchContentFromLibrary());
			content.getSearchContentFromLibrary().sendKeys("textbook");
			content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
			DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
			DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
			DikshaUtils.waitToBeClickableAndClick(content.getSubmitForreviewButton());
			DikshaUtils.waitToBeClickableAndClick(content.getTermsAndConditionCheckbox());
			DikshaUtils.waitToBeClickableAndClick(content.getNewCoursesubmitButton());
			Thread.sleep(2000);
		     String ContentsendPopup = popup.getSendForReviewPopUp().getText();
		     Assert.assertEquals(ContentsendPopup, "Content is sent for review");
		     Thread.sleep(2000);
		
			 excel.updateData("TestData","Collections" ,name, "");
			
		return name;
	}
	
	
}
