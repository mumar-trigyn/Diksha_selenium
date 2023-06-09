package pageActions;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.UpForReview;
import pageObject.UploadPdfContent;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class UploadContentMethods extends BaseClass {
           

		

		public static String UploadPdf() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
		Upload.getBrowserbutton().sendKeys(System.getProperty("user.dir")+"\\src\\main\\resources\\pdf_13.pdf");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("PDF_Content");
	    excel.updateData("TestData","PDF" ,randomName, "");
	   
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    
	    
	    return randomName;
	}
	
	
		public static String UploadMp4() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\poem.mp4", "Mp4 uploaded");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	  
	    String randomName=DikshaUtils.set_Content_Name("Mp4_Content");
	    excel.updateData("TestData","Mp4" ,randomName, "");
	   
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    
	    
	    return randomName;
	}
	
		public static String UploadMorethan50MbContent() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
			DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
			DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
			Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\Class 1 English  (Marigold Book) _ Syllabus Overview.mp4", "Mp4 uploaded");
		    Thread.sleep(60000);
		    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
		    
		    
		    
		    String randomName=DikshaUtils.set_Content_Name("Mp4_Content");
		    excel.updateData("TestData","Mp4" ,randomName, "");
		   
		    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
		    
		    
		    return randomName;
		}
		
		
		
	public static String UploadWebm() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\file_example_WEBM_480_900KB (1).webm", "Webm uploaded");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("Webm_Content");
	    excel.updateData("TestData","Webm" ,randomName, "");
	    
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    return randomName;
	}
	
	
public static String UploadEpub() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\A-Room-with-a-View-morrison (1).epub", "Epub uploaded");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("Epub_Content");
	    excel.updateData("TestData","Epub" ,randomName, "");
	    
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    return randomName;
	}
	
	
	
	public static String UploadH5p() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\boardgame.h5p", "h5p uploaded");
	    Thread.sleep(60000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());

	    String randomName=DikshaUtils.set_Content_Name("H5p_Content");
	    excel.updateData("TestData","h5p" ,randomName, "");
	    
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    return randomName;
	}
	
	
	
   			public static String UploadYoutubeContent() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
			DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
			DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
			  Robot robot= new Robot();
			 DikshaUtils.waitToBeClickableAndClick(Upload.getContentURL());
			 Library.custom_sendkeys(Upload.getContentURL(), "https://youtu.be/K4TOrB7at0Y", "url uploaded");
		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
			Thread.sleep(2000);
			Library.custom_click(Upload.getUploadButtonAfterUrl(), "select button");
			Thread.sleep(2000);
			DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
		    
		    String randomName=DikshaUtils.set_Content_Name("YT_Content");
		    excel.updateData("TestData","YT" ,randomName, "");
		    
		    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
		    return randomName;
		}
			
		 public static String UploadHtmlContent() throws Exception {
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
				
				DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
				DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
				Thread.sleep(1000);
				driver.switchTo().frame(0);
				DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
				DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
				Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\HTMLContent_test.zip", "html uploaded");
				Thread.sleep(3000);
			    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
			    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
			    
			    String randomName=DikshaUtils.set_Content_Name("html_Content");
			    excel.updateData("TestData","html" ,randomName, "");
			    
			    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
			    return randomName;
			}
					
	
	public static void publishCourseFromUpForReview(String coursename) throws InterruptedException {
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
		DikshaUtils.waitToBeClickableAndSendKeys(review.getSearchForReview(),coursename);
		DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
		DikshaUtils.waitToBeClickableAndClick(review.getTaboncourse());
		driver.navigate().refresh();
		driver.navigate().refresh();
		DikshaUtils.waitToBeVisibleAndClick(review.getPublishTheCourse());
		DikshaUtils.waitToBeClickableAndClick(review.getConfirmpublishTheCourse());
		 Thread.sleep(3000);
	     String ContentsuccessfullySavedPopup = popup.getCoursePublishedPopUp().getText();
	     Assert.assertEquals(ContentsuccessfullySavedPopup, "Content is published");
	     Thread.sleep(1000);

		Thread.sleep(1000);
	
	}
	

	public static void LessonPlan_send_For_Review(String name) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
		Thread.sleep(1000);
		Upload.getName().sendKeys(name);
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
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getYearDropdown());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getYearDropdown());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getYearVlaue());
	    
	    
//	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getCopyright());
//	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getCopyright());
	    Upload.getCopyright().sendKeys("2023");
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSavebutton());
//	    Library.custom_sendkeys(Upload.getCopyright(),"2023", "copyright year");
//	    Thread.sleep(1000);
//	    Library.custom_click(Upload.getSavebutton(),"savebutton");
//	    Thread.sleep(5000);
	       	
	}
		

}



