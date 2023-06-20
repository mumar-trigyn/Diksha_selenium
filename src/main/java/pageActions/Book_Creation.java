package pageActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseConsumption;
import pageObject.CourseCreation;
import pageObject.CreateBatchForCourse;
import pageObject.CreateBook;
import pageObject.Draft;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.UpForReview;
import utility.BaseClass;
import utility.DikshaUtils;

public class Book_Creation extends BaseClass {

	
public static void VerifyCreatorAbleToGenerateAndDownloadQRCode() throws Exception {
		
		CreateBook create=PageFactory.initElements(driver, CreateBook.class);
		
		        DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
			    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
			    DikshaUtils.waitToBeClickableAndClick(create.getBook());
				
				String Name=DikshaUtils.set_Content_Name("eTextbook_");
				excel.updateData("TestData","CourseAssessment" ,Name, "");
				
				DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
				DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
				DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
		        DikshaUtils.waitToBeVisibleAndClick(create.getQRCodeDropdown());
				DikshaUtils.waitToBeVisibleAndClick(create.getGenerateQRCode());
				DikshaUtils.waitToBeClickableAndSendKeys(create.getNoOfQRCode(), "2");
				DikshaUtils.waitToBeVisibleAndClick(create.getRequestButton());
				DikshaUtils.waitToBeVisibleAndClick(create.getQRCodeDropdown());
				DikshaUtils.waitToBeVisibleAndClick(create.getDownloadQRCode());
	
	}
	
	
	public static void VerifyCreatorAbleToValidateQRCode() throws Exception {
		
		
		CreateBook create=PageFactory.initElements(driver, CreateBook.class);
		
        DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
		
		String Name=DikshaUtils.set_Content_Name("eTextbook_");
		excel.updateData("TestData","CourseAssessment" ,Name, "");
		
		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
		
		Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",create.getYesQRCodeRequired());
		 js.executeScript("window.scrollBy(0,900)");
		 Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick(create.getYesQRCodeRequired());
		DikshaUtils.waitToBeClickableAndSendKeys(create.getEnterQRCode(), "V9X1R7");
	    DikshaUtils.waitToBeClickableAndClick(create.getQRCodeBlueTick());
	   
	    Thread.sleep(1000);
	    Assert.assertTrue(create.getConfirmQRCodeBlueTick().isDisplayed());
		
	    DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
	    
	    DikshaUtils.waitToBeClickableAndClick(create.getYesQRCodeRequired());
		DikshaUtils.waitToBeClickableAndSendKeys(create.getEnterQRCode(), "B5P3M2");
	    DikshaUtils.waitToBeClickableAndClick(create.getQRCodeBlueTick());
	   
	    Thread.sleep(1000);
	    Assert.assertTrue(create.getConfirmQRCodeBlueTick().isDisplayed());
		
	
		
	}
	
	public static String VerifyCreatorAbleToAddCollaboratorInTextbook() throws Exception {
		
		CreateBook create=PageFactory.initElements(driver, CreateBook.class);
		
        DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
		
		String Name=DikshaUtils.set_Content_Name("eTextbook_");
		
		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
		    js.executeScript("window.scrollBy(0, 900)");
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
		    
		    js.executeScript("arguments[0].scrollIntoView(true);", create.getCopyright());
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeClickableAndClick(create.getCopyright());
		    create.getCopyright().sendKeys("2023");
		    js.executeScript("window.scrollTo(0, 0)");
			DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		   	Thread.sleep(5000);
			DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
		   
		   
		   	
			WebElement ContentSavePopup= driver.findElement(By.xpath("//strong[text()='Content is saved']"));
			String ContentsuccessfullySavedPopup = ContentSavePopup.getText();
			Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
			Thread.sleep(1000);
		   	
			DikshaUtils.waitToBeClickableAndClick(create.getAddCollaborator());
			DikshaUtils.waitToBeClickableAndSendKeys(create.getSearchCollaborator(),"ContentCreator2.0");
			Thread.sleep(1000);
			create.getSearchCollaborator().sendKeys(Keys.ENTER);
			DikshaUtils.waitToBeVisibleAndClick(create.getSelectContentCollaborator());
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView(true);", create.getDoneButton());
		    Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(create.getDoneButton());
           
			Thread.sleep(1000);
			WebElement CollaboratorPopup= driver.findElement(By.xpath("//strong[text()='Collaborators updated successfully']"));
			String CollaboratorssuccessfullyPopup = CollaboratorPopup.getText();
			Assert.assertEquals(CollaboratorssuccessfullyPopup, "Collaborators updated successfully");
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
			DikshaUtils.waitToBeClickableAndClick(create.getTermsAndConditionCheckbox());
			DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
			Thread.sleep(5000);
		
			excel.updateData("TestData","Collections" ,Name, "");
			
			return Name;
		
	}
	
public static String VerifyCreatorAbleToAddCollaboratorInLiveTextbook() throws Exception {
		
		CreateBook create=PageFactory.initElements(driver, CreateBook.class);
		
        DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
		
		String Name=DikshaUtils.set_Content_Name("eTextbook_");
		
		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
		    js.executeScript("window.scrollBy(0, 900)");
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
		    
		    js.executeScript("arguments[0].scrollIntoView(true);", create.getCopyright());
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeClickableAndClick(create.getCopyright());
		    create.getCopyright().sendKeys("2023");
			DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
		    js.executeScript("window.scrollTo(0, 0)");
		   	DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		   	Thread.sleep(1000);
		   	
			WebElement ContentSavePopup= driver.findElement(By.xpath("//strong[text()='Content is saved']"));
			String ContentsuccessfullySavedPopup = ContentSavePopup.getText();
			Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is saved");
			Thread.sleep(1000);
			
			DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
			DikshaUtils.waitToBeClickableAndClick(create.getTermsAndConditionCheckbox());
			DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
			Thread.sleep(1000);
		
			excel.updateData("TestData","Collections" ,Name, "");
			
			return Name;
		
	}
	
     public static String CreatebookAndSaveAsDraft() throws Exception {
    	 
    	 CreateBook create=PageFactory.initElements(driver, CreateBook.class);
    	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
    	 
         DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
 	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
 	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
 		
 		String Name=DikshaUtils.set_Content_Name("eTextbook_");
 		
 		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
 		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
 		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
 		
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
 		    js.executeScript("window.scrollBy(0, 900)");
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
 		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
 		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
 		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
 		    
 		    js.executeScript("arguments[0].scrollIntoView(true);", create.getCopyright());
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeClickableAndClick(create.getCopyright());
 		    create.getCopyright().sendKeys("2023");
 		   js.executeScript("window.scrollTo(0, 0)");
		   	DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		    Thread.sleep(5000);
 			DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
 			DikshaUtils.waitToBeVisibleAndClick(content.getAddFromLibraryButton());
 			
			DikshaUtils.waitToBeVisibleAndClick(content.getSearchContentFromLibrary());
			content.getSearchContentFromLibrary().sendKeys("textbook");
			content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
			DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
			DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
			DikshaUtils.waitToBeVisibleAndClick(create.getSaveAsDraft());
			DikshaUtils.waitToBeVisibleAndClick(create.getBackButton());
			Thread.sleep(5000);
		
 		  
 		   excel.updateData("TestData","Collections" ,Name, "");
			
			return Name;
 	 
     }

     public static void EditTheBookFromDraft(String fullname) throws Exception {
    	 
    	 Draft draft=PageFactory.initElements(driver, Draft.class);
    	 CreateBook create=PageFactory.initElements(driver, CreateBook.class);
    	 
    	 DikshaUtils.waitToBeClickableAndClick( draft.getHeaderDropdown());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", draft.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick( draft.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick( draft.getDraft());
			DikshaUtils.waitToBeClickableAndClick( draft.getSearchForPublished());
			draft.getSearchForPublished().sendKeys(fullname);
			DikshaUtils.waitToBeClickableAndClick(draft.getSearchIcon());
			Thread.sleep(2000);
            DikshaUtils.waitToBeClickableAndClick(draft.getClickSearchContent());
			Thread.sleep(2000);
			DikshaUtils.waitToBeVisibleAndClick(create.getAddChild());
			Thread.sleep(2000);
		     DikshaUtils.waitToBeVisibleAndClick(create.getYesQRCodeRequired());
		     Thread.sleep(2000);
		     DikshaUtils.waitToBeClickableAndSendKeys(create.getEnterQRCode(), "B5P3M2");
		     Thread.sleep(2000);
             DikshaUtils.waitToBeVisibleAndClick(create.getQRCodeBlueTick());
			 Thread.sleep(2000);
			 js.executeScript("window.scrollTo(0, 0)");
	 		 DikshaUtils.waitToBeVisibleAndClick(create.getSaveAsDraft());
	 		 Thread.sleep(2000);
	 		 DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
	 		 Thread.sleep(4000);
		     DikshaUtils.waitToBeVisibleAndClick(create.getTermsAndConditionCheckbox());
			 DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
			 DikshaUtils.waitToBeClickableAndClick( draft.getDeleteContentFromDraft());
			 DikshaUtils.waitToBeClickableAndClick( draft.getConfirmDeleteContentFromDraft());
     }
     
     public static String CreateBookAndSendForReview() throws Exception {
    	 
    	 CreateBook create=PageFactory.initElements(driver, CreateBook.class);
    	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
    	 
         DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
 	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
 	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
 		
 		String Name=DikshaUtils.set_Content_Name("eTextbook_");
 		
 		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
 		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
 		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
 		
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
 		    js.executeScript("window.scrollBy(0, 900)");
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
 		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
 		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
 		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
 		    
 		    js.executeScript("arguments[0].scrollIntoView(true);", create.getCopyright());
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeClickableAndClick(create.getCopyright());
 		    create.getCopyright().sendKeys("2023");
 		   js.executeScript("window.scrollTo(0, 0)");
		   	DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		    Thread.sleep(5000);
 			DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
 			DikshaUtils.waitToBeVisibleAndClick(content.getAddFromLibraryButton());
 			
			DikshaUtils.waitToBeVisibleAndClick(content.getSearchContentFromLibrary());
			content.getSearchContentFromLibrary().sendKeys("textbook");
			content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
			DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
			DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
    	 
            DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
			DikshaUtils.waitToBeClickableAndClick(create.getTermsAndConditionCheckbox());
			DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
			Thread.sleep(5000);
		
			excel.updateData("TestData","Collections" ,Name, "");
			
			return Name;
    	 
    	 
     }
     
     public static void CopyThePublishedBookAndSendForReview(String Fullname) throws Exception {
    	 
     CreateBook create=PageFactory.initElements(driver, CreateBook.class);
     CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
     HomePage home=PageFactory.initElements(driver, HomePage.class);
        
        Thread.sleep(1000);
        DikshaUtils.waitToBeVisibleAndClick(create.getDigitalTextbook());    
        DikshaUtils.waitToBeClickableAndSendKeys(home.getSearchtextfield(),Fullname);
		DikshaUtils.waitToBeClickableAndClick(home.getSearchbutton());
		DikshaUtils.waitToBeVisibleAndClick(home.getsearchedTextbook());    
         Thread.sleep(1000);
         
 	   
 	    DikshaUtils.waitToBeClickableAndClick(create.getCopyButton());
 	    JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
		    js.executeScript("window.scrollBy(0, 900)");
		    Thread.sleep(1000);
		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
		
		js.executeScript("window.scrollTo(0, 0)");
		DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		 Thread.sleep(5000);
		DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
	    DikshaUtils.waitToBeVisibleAndClick(content.getAddFromLibraryButton());
			
		DikshaUtils.waitToBeVisibleAndClick(content.getSearchContentFromLibrary());
		content.getSearchContentFromLibrary().sendKeys("textbook");
		content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
		DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
		DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
	 
        DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
		DikshaUtils.waitToBeClickableAndClick(create.getTermsAndConditionCheckbox());
		DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
		Thread.sleep(5000);
	
    	 	 
     }
    
public static String CreateBookAddCollaboratorAndSendForReview() throws Exception {
    	 
    	 CreateBook create=PageFactory.initElements(driver, CreateBook.class);
    	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
    	 
         DikshaUtils.waitToBeClickableAndClick(create.getHeaderDropdown());
 	    DikshaUtils.waitToBeClickableAndClick(create.getWorkspace());
 	    DikshaUtils.waitToBeClickableAndClick(create.getBook());
 		
 		String Name=DikshaUtils.set_Content_Name("eTextbook_");
 		
 		DikshaUtils.waitToBeClickableAndSendKeys(create.getBookname(), Name);
 		DikshaUtils.waitToBeVisibleAndClick(create.getBookname());
 		DikshaUtils.waitToBeVisibleAndClick(create.getStartCreating());
 		
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		// js.executeScript("arguments[0].scrollIntoView(true);",Upload.getSelectBoardSyllabus());
 		    js.executeScript("window.scrollBy(0, 900)");
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeVisibleAndClick(create.getSelectBoardSyllabus());
 		    DikshaUtils.waitToBeClickableAndClick(create.getBoardSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectMedium());
 		    DikshaUtils.waitToBeClickableAndClick(create.getMediumSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectClass());
 		    DikshaUtils.waitToBeClickableAndClick(create.getClassSelected());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSelectSubject());
 		    DikshaUtils.waitToBeClickableAndClick(create.getSubjectSelected());
 		    
 		    js.executeScript("arguments[0].scrollIntoView(true);", create.getCopyright());
 		    Thread.sleep(1000);
 		    DikshaUtils.waitToBeClickableAndClick(create.getCopyright());
 		    create.getCopyright().sendKeys("2023");
 		   js.executeScript("window.scrollTo(0, 0)");
		   	DikshaUtils.waitToBeClickableAndClick(create.getSaveAsDraft());
		    Thread.sleep(5000);
		   	DikshaUtils.waitToBeClickableAndClick(create.getAddChild());
 			DikshaUtils.waitToBeVisibleAndClick(content.getAddFromLibraryButton());
 			DikshaUtils.waitToBeVisibleAndClick(content.getSearchContentFromLibrary());
			content.getSearchContentFromLibrary().sendKeys("textbook");
			content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
			DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
			DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
			
			DikshaUtils.waitToBeClickableAndClick(create.getAddCollaborator());
			DikshaUtils.waitToBeClickableAndSendKeys(create.getSearchCollaborator(),"ContentCreator2.0");
			Thread.sleep(1000);
			create.getSearchCollaborator().sendKeys(Keys.ENTER);
			Thread.sleep(1000);
            DikshaUtils.waitToBeVisibleAndClick(create.getSelectContentCollaborator());
			
			js.executeScript("arguments[0].scrollIntoView(true);",create.getDoneButton());
		    Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(create.getDoneButton());
           
			Thread.sleep(1000);
			WebElement CollaboratorPopup= driver.findElement(By.xpath("//strong[text()='Collaborators updated successfully']"));
			String CollaboratorssuccessfullyPopup = CollaboratorPopup.getText();
			Assert.assertEquals(CollaboratorssuccessfullyPopup, "Collaborators updated successfully");
			Thread.sleep(1000);
			
    	    DikshaUtils.waitToBeClickableAndClick(create.getSubmitForreviewButton());
			DikshaUtils.waitToBeClickableAndClick(create.getTermsAndConditionCheckbox());
			DikshaUtils.waitToBeClickableAndClick(create.getNewCoursesubmitButton());
			Thread.sleep(5000);
		
			excel.updateData("TestData","Collections" ,Name, "");
			
			return Name;
    	 
    	 
     }
     
   
}