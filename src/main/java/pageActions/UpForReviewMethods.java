package pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.UpForReview;
import utility.BaseClass;
import utility.Library;

public class UpForReviewMethods extends BaseClass {

	public static void up_For_Review(String fullname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		Library.custom_click(review.getHeaderDropdown(),"c-icon");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",review.getWorkspace());
		Thread.sleep(1000);
		Library.custom_click(review.getWorkspace(), "workspace");
		Thread.sleep(1000);
		Library.custom_click(review.getUpForReview(),"up for review");
		Thread.sleep(1000);
		Library.custom_sendkeys(review.getSearchForReview(),fullname ,"name search");
		Thread.sleep(1000);
		Library.custom_click(review.getSearchedContentForPublish(),"search content");
		Thread.sleep(1000);
		Library.custom_click(review.getClickSearchContent(), "clickSearchContent");
		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView(true);",review.getPublishTheCourse());
//		Thread.sleep(1000);
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
		
		Assert.assertTrue(review.getUpForReview().isDisplayed());
		
	}
	
}
