package pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.ResourcesPom;
import pageObject.UpForReview;
import pageObject.UploadPdfContent;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class SendForReviewMethods extends BaseClass {

	public static void sendPdf_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
		DikshaUtils.waitToBeClickableAndSendKeys(Upload.getName(),randomname);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndSendKeys(Upload.getCopyright(),"2023");
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSavebutton());
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendMp4_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield");
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendEpub_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendWebm_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);

		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendH5p_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield");  
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendYoutubeContent_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield");  
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	public static void sendHtmlContent_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
     
	public static void sendMoreThan50MbContent_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}

	
	
	public static void sendCourseAssessment_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	
	public static void ECMLContent_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void TvLessonResource_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	   
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    DikshaUtils.waitToBeClickableAndClick(rs.getSelectAdditionalCategoryDropdown());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeVisibleAndClick(rs.getAdditionalCategorySelected()); 
	
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
	
	public static void sendResource_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getSendforreview());
		Upload.getName().clear();
	    Library.custom_sendkeys(Upload.getName(),randomname,"nametextfield"); 
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	   
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
	    Thread.sleep(1000);
	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
	    Thread.sleep(1000);
	    Library.custom_click(Upload.getSavebutton(),"savebutton");
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
		
	}
}
