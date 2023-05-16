package folder;



import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import PageObject.UpForReview;
import PageObject.UploadPdfContent;
import Utility.BaseClass;
import Utility.Library;

public class UploadContent extends BaseClass {
           

		

	public static String UploadPdf() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
		Library.custom_click(Upload.getWorkspace(), "workspace");
		Thread.sleep(2000);
		Library.custom_click(Upload.getUploadcontent(), "upload content");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		Library.custom_click(Upload.getContenttypetab(),"select content type");
		Thread.sleep(1000);
		Library.custom_click(Upload.geteTextbook(),"etextbook selected");
		Thread.sleep(1000);
	
	    Library.custom_sendkeys(Upload.getBrowserbutton(),"D:\\Diksha_Prepod\\src\\main\\resources\\The-Prince-grahamcolor.pdf", "file uploaded");
	    Thread.sleep(5000);
	    Library.custom_click(Upload.getSave(),"savebutton");
	    Thread.sleep(2000);
	    Library.custom_click(Upload.getClose(), "close");
	    Thread.sleep(5000);
	    String randomname="PDF_Sample_"+RandomStringUtils.randomAlphabetic(6);
	    
	    excel.updateData("TestData","PDF" ,randomname, "");
	    
	    
	    return randomname;
	}
	
	public static void sendPdf_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
	   Thread.sleep(1000);
	   
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
		
	}
	
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
		
	}
	
	public static void publishCourseFromUpForReview(String coursename) throws InterruptedException {
UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		Library.custom_click(review.getHeaderDropdown(), "HeaderDropdown");
		Thread.sleep(1000);
		Library.custom_click(review.getWorkspace(),"Workspace");
		Thread.sleep(1000);
		Library.custom_click(review.getUpForReview(),"UpForReview");
		Thread.sleep(1000);
		Library.custom_sendkeys(review.getSearchForReview(), coursename, "SearchForReview");
		Thread.sleep(1000);
		Library.custom_click(review.getSearchedContentForPublish(), "SearchedContentForPublish");
		Thread.sleep(1000);
		Library.custom_click(review.getTaboncourse(), "Taboncourse");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		Library.custom_click(review.getPublishTheCourse(), "PublishTheCourse");
		Thread.sleep(1000);
		Library.custom_click(review.getConfirmpublishTheCourse(),"ConfirmForPublishCourse");
		Thread.sleep(1000);
		
	}
}

