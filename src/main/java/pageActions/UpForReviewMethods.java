package pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.Collections;
import pageObject.CreateBook;
import pageObject.UpForReview;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class UpForReviewMethods extends BaseClass {

	
		public static void up_For_Review(String fullname) throws InterruptedException {

	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       UpForReview review=PageFactory.initElements(driver, UpForReview.class);
	       ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
	       
	       DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());

	        Thread.sleep(1000);
	        DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
	        DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
	        DikshaUtils.waitToBeClickableAndSendKeys(review.getSearchForReview(),fullname);
	        DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
	        DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());;

	        int scrollX = 0; // horizontal scroll amount
	        int scrollY = 500; // vertical scroll amount
	        js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");

	        Library.custom_click(review.getPublishTheCourse(),"publish buttons");
	        Thread.sleep(1000);
	        Library.custom_click(review.getNoHateSpeech(), "NoHateSpeech");
	        Library.custom_click(review.getNoSexualContent(), "NoSexualContent");
	        Library.custom_click(review.getNoDiscrimination(), "NoDiscrimination");
	        Library.custom_click(review.getSuitableForChildren(), "SuitableForChildren");
	        Library.custom_click(review.getAppropriateTitle(), "AppropriateTitle");
	        Library.custom_click(review.getCorrectBMC(), "CorrectBMC");
	        Library.custom_click(review.getAppropriateTags(), "AppropriateTags");
	        Library.custom_click(review.getRelevantKeywords(), "RelevantKeywords");
	        Library.custom_click(review.getContentplayscorrectly(),"Contentplayscorrectly");
	        Library.custom_click(review.getContentclearOnDesk(), "ContentclearOnDesk");
	        Library.custom_click(review.getAudio(), "Audio");
	        Library.custom_click(review.getNoSpellingmistakes(), "NoSpellingmistakes");
	        Library.custom_click(review.getLanguage(), "Language");
	        Library.custom_click(review.getConfirmForPublishBook(), "Confirm Publish");
	        Thread.sleep(3000);
	        String ContentsuccessfullySavedPopup = popup.getContentPublishedPopUp().getText();
	        Assert.assertEquals(ContentsuccessfullySavedPopup, "Content published successfully...");
	        Thread.sleep(1000);
	        

	    }

	
		
		  public static void LessonPlan_up_For_Review(String fullname) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			


			DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
			DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
			review.getSearchForReview().sendKeys(fullname);
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
			DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			DikshaUtils.waitToBeVisibleAndClick(review.getpublishLessonPlan());
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(review.getconfirmForPublishLessonPlan());
			
			
		}
		
		  public static void Collections_up_For_Review(String fullname) throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UpForReview review=PageFactory.initElements(driver, UpForReview.class);
				Collections collections=PageFactory.initElements(driver, Collections.class);
				ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
				
				DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
				Thread.sleep(1000);
				DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
				DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
				review.getSearchForReview().sendKeys(fullname);
				DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
				DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
				Thread.sleep(2000);
//				driver.switchTo().frame(0);
//				Thread.sleep(2000);
				DikshaUtils.waitToBeVisibleAndClick(collections.getpublishCollections());
				 Thread.sleep(1000);
				 Library.custom_click(collections.getNoHateSpeech(), "NoHateSpeech");
			     Library.custom_click(collections.getNoSexualContent(), "NoSexualContent");
			     Library.custom_click(collections.getNoDiscrimination(), "NoDiscrimination");
			     Library.custom_click(collections.getSuitableForChildren(), "SuitableForChildren");
			     Library.custom_click(collections.getAppropriateTitle(), "AppropriateTitle");
			     Library.custom_click(collections.getCorrectBMC(), "CorrectBMC");
			     Library.custom_click(collections.getAppropriateTags(), "AppropriateTags");
			     Library.custom_click(collections.getRelevantKeywords(), "RelevantKeywords");
			     Library.custom_click(collections.getContentplayscorrectly(),"Contentplayscorrectly");
			     Library.custom_click(collections.getCanseethecontent(), "Canseethecontent ");
			     Library.custom_click(collections.getAudio(), "Audio");
			     Library.custom_click(collections.getNoSpellingmistakes(), "NoSpellingmistakes");
			     Library.custom_click(collections.getLanguage(), "Language");
			     DikshaUtils.waitToBeClickableAndClick(collections.getYesTab());
			     Thread.sleep(3000);
			     String ContentsuccessfullySavedPopup = popup.getBookPublishedPopUp().getText();
			        Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is published");
			        Thread.sleep(1000);
						 
		  } 
		  
		  public static void eTextbook_up_For_Review(String fullname) throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UpForReview review=PageFactory.initElements(driver, UpForReview.class);
				Collections collections=PageFactory.initElements(driver, Collections.class);
				ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
				
				DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
				Thread.sleep(1000);
				DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
				DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
				review.getSearchForReview().sendKeys(fullname);
				DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
				DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
				Thread.sleep(2000);
//				driver.switchTo().frame(0);
//				Thread.sleep(2000);
				DikshaUtils.waitToBeVisibleAndClick(collections.getpublishCollections());
				 Thread.sleep(1000);
				 Library.custom_click(collections.getNoHateSpeech(), "NoHateSpeech");
			     Library.custom_click(collections.getNoSexualContent(), "NoSexualContent");
			     Library.custom_click(collections.getNoDiscrimination(), "NoDiscrimination");
			     Library.custom_click(collections.getSuitableForChildren(), "SuitableForChildren");
			     Library.custom_click(collections.getAppropriateTitle(), "AppropriateTitle");
			     Library.custom_click(collections.getCorrectBMC(), "CorrectBMC");
			     Library.custom_click(collections.getAppropriateTags(), "AppropriateTags");
			     Library.custom_click(collections.getRelevantKeywords(), "RelevantKeywords");
			     Library.custom_click(collections.getContentplayscorrectly(),"Contentplayscorrectly");
			     Library.custom_click(collections.getCanseethecontent(), "Canseethecontent ");
			     Library.custom_click(collections.getAudio(), "Audio");
			     Library.custom_click(collections.getNoSpellingmistakes(), "NoSpellingmistakes");
			     Library.custom_click(collections.getLanguage(), "Language");
			     DikshaUtils.waitToBeClickableAndClick(collections.getYesTab());
			     Thread.sleep(3000);
			        String ContentsuccessfullySavedPopup = popup.getBookPublishedPopUp().getText();
			        Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is published");
			        Thread.sleep(1000);
						 
		  }  
		  
		  
		  public static void eTextbookPreviewAndRejectFrom_up_For_Review(String fullname) throws Exception {
			  
			  UpForReview review=PageFactory.initElements(driver, UpForReview.class);

				DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
				Thread.sleep(1000);
				DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
				DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
				review.getSearchForReview().sendKeys(fullname);
				DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
				DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
				Thread.sleep(2000);
				driver.navigate().refresh();
				driver.navigate().refresh();
				DikshaUtils.waitToBeClickableAndClick(review.getRejectTheContent());
				DikshaUtils.waitToBeClickableAndSendKeys(review.getAddReviewComment(), "Feedback");
				DikshaUtils.waitToBeClickableAndClick(review.getSubmitReviewButton());
			  
	            Thread.sleep(1000);
			   	WebElement RejectPopup= driver.findElement(By.xpath("//strong[text()='Content is sent back for corrections']"));
				String reject = RejectPopup.getText();
				Assert.assertEquals(reject , "Content is sent back for corrections");
				Thread.sleep(1000);
			  
			  
		  }
		  
	 public static void ReviwerViewCollaboratorAddedToeTextbookFrom_up_For_Review(String fullname) throws Exception {
			  
                UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			  CreateBook create=PageFactory.initElements(driver, CreateBook.class);
			  
				DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
				Thread.sleep(1000);
				DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
				DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
				review.getSearchForReview().sendKeys(fullname);
				DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
				DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
				DikshaUtils.waitToBeClickableAndClick(create.getViewCollaborator());
	 
	 
	    }  
		
	 public static void eTextbookAddedInCourse_up_For_Review(String fullname) throws Exception {
		 
		 UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			Collections collections=PageFactory.initElements(driver, Collections.class);
			ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
			
			DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
			DikshaUtils.waitToBeClickableAndClick(review.getSearchForReview());
			review.getSearchForReview().sendKeys(fullname);
			DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
			DikshaUtils.waitToBeClickableAndClick(review.getClickSearchContent());
			Thread.sleep(2000);
			DikshaUtils.waitToBeVisibleAndClick(collections.getpublishCollections());
			DikshaUtils.waitToBeVisibleAndClick(collections.getYesTab());
			 Thread.sleep(3000);
		        String ContentsuccessfullySavedPopup = popup.getBookPublishedPopUp().getText();
		        Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is published");
		        Thread.sleep(1000);
		 
		 
	 }
	 
 public static void QuestionSet_up_For_Review(String fullname) throws Exception {
		 
		 UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			Collections collections=PageFactory.initElements(driver, Collections.class);
		
			driver.get("https://diksha.gov.in/workspace/edit/Course/"+fullname+"/upForReview/Review#no");
			
			DikshaUtils.waitToBeVisibleAndClick(collections.getpublishCollections());
			 Thread.sleep(1000);
			 Library.custom_click(collections.getNoHateSpeech(), "NoHateSpeech");
		     Library.custom_click(collections.getNoSexualContent(), "NoSexualContent");
		     Library.custom_click(collections.getNoDiscrimination(), "NoDiscrimination");
		     Library.custom_click(collections.getSuitableForChildren(), "SuitableForChildren");
		     Library.custom_click(collections.getAppropriateTitle(), "AppropriateTitle");
		     Library.custom_click(collections.getCorrectBMC(), "CorrectBMC");
		     Library.custom_click(collections.getAppropriateTags(), "AppropriateTags");
		     Library.custom_click(collections.getRelevantKeywords(), "RelevantKeywords");
		     Library.custom_click(collections.getContentplayscorrectly(),"Contentplayscorrectly");
		     Library.custom_click(collections.getCanseethecontent(), "Canseethecontent ");
		     Library.custom_click(collections.getAudio(), "Audio");
		     Library.custom_click(collections.getNoSpellingmistakes(), "NoSpellingmistakes");
		     Library.custom_click(collections.getLanguage(), "Language");
		     DikshaUtils.waitToBeClickableAndClick(collections.getYesTab());
		     Thread.sleep(5000);
 
    }
 }
