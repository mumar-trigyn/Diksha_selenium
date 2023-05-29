package pageActions;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.UpForReview;
import pageObject.UploadPdfContent;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class UploadContentMethods extends BaseClass {
           

		

	public static String UploadPdf() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		//Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
		Thread.sleep(1000);
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
	
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\pdf_13.pdf", "file uploaded");
	    Thread.sleep(5000);
	    Library.custom_click(Upload.getSave(),"savebutton");
	    Thread.sleep(2000);
	    Library.custom_click(Upload.getClose(), "close");
	    Thread.sleep(3000);
	    
	    
	    
	    String randomName=DikshaUtils.set_Content_Name("PDF_Content");
	    excel.updateData("TestData","PDF" ,randomName, "");
	   
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    
	    
	    return randomName;
	}
	
	public static void sendPdf_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
		Thread.sleep(1000);
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
	
	
	
	
	
	public static String UploadMp4() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		Thread.sleep(1000);
		Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
		Thread.sleep(1000);
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
	
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\poem.mp4", "Mp4 uploaded");
	    Thread.sleep(5000);
	    Library.custom_click(Upload.getSave(),"savebutton");
	    Thread.sleep(2000);
	    Library.custom_click(Upload.getClose(), "close");
	    Thread.sleep(3000);
	    
	    
	    
	    String randomName=DikshaUtils.set_Content_Name("Mp4_Content");
	    excel.updateData("TestData","Mp4" ,randomName, "");
	   
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    
	    
	    return randomName;
	}
	
	public static void sendMp4_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
	   Thread.sleep(1000);
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
	
	public static String UploadEpub() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		Thread.sleep(1000);
		Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
		Thread.sleep(1000);
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
	
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\A-Room-with-a-View-morrison (1).epub", "Epub uploaded");
	    Thread.sleep(5000);
	    Library.custom_click(Upload.getSave(),"savebutton");
	    Thread.sleep(2000);
	    Library.custom_click(Upload.getClose(), "close");
	    Thread.sleep(3000);
	    String randomName=DikshaUtils.set_Content_Name("Epub_Content");
	    excel.updateData("TestData","Epub" ,randomName, "");
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    return randomName;
	}
	
	public static void sendEpub_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
	   Thread.sleep(1000);
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
	
   public static String UploadWebm() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		Thread.sleep(1000);
		Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
		Thread.sleep(1000);
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
	
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\file_example_WEBM_480_900KB (1).webm", "Webm uploaded");
	    Thread.sleep(5000);
	    Library.custom_click(Upload.getSave(),"savebutton");
	    Thread.sleep(2000);
	    Library.custom_click(Upload.getClose(), "close");
	    Thread.sleep(3000);
	    String randomName=DikshaUtils.set_Content_Name("Webm_Content");
	    excel.updateData("TestData","Webm" ,randomName, "");
	    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
	    return randomName;
	}
	
	public static void sendWebm_For_Review(String randomname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
	   Thread.sleep(1000);
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
	
	  public static String UploadH5p() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			Thread.sleep(1000);
			Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
			Thread.sleep(1000);
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
		
		    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\boardgame.h5p", "h5p uploaded");
		    Thread.sleep(60000);
		   
		    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    //Library.custom_click(Upload.getSave(),"savebutton");
		    Thread.sleep(2000);
		    Library.custom_click(Upload.getClose(), "close");
		    Thread.sleep(3000);
		    String randomName=DikshaUtils.set_Content_Name("h5p_Content");
		    excel.updateData("TestData","h5p" ,randomName, "");
		    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
		    return randomName;
		}
		
		public static void sendH5p_For_Review(String randomname) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			Thread.sleep(2000);
			Library.custom_click(Upload.getSendforreview(),"send for review");
			Thread.sleep(2000);
			Upload.getName().clear();
		   Thread.sleep(1000);
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
		
public static String UploadYoutubeContent() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			Thread.sleep(1000);
			Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
			Thread.sleep(1000);
			Library.custom_click(Upload.getWorkspace(), "workspace");
			Thread.sleep(2000);
			 DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
			//Library.custom_click(Upload.getUploadcontent(), "upload content");
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			Thread.sleep(1000);
			Library.custom_click(Upload.getContenttypetab(),"select content type");
			Thread.sleep(1000);
			Library.custom_click(Upload.geteTextbook(),"etextbook selected");
			Thread.sleep(1000);
			  Robot robot= new Robot();
			 DikshaUtils.waitToBeClickableAndClick(Upload.getContentURL());
			 Library.custom_sendkeys(Upload.getContentURL(), "https://youtu.be/K4TOrB7at0Y", "url uploaded");
			//DikshaUtils.waitToBeClickableAndSendKeys(Upload.getContentURL(),"https://youtu.be/K4TOrB7at0Y");
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
			Thread.sleep(2000);
			Library.custom_click(Upload.getUploadButtonAfterUrl(), "select button");
			Thread.sleep(2000);

			
		    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    //Library.custom_click(Upload.getSave(),"savebutton");
		    Thread.sleep(2000);
		    Library.custom_click(Upload.getClose(), "close");
		    Thread.sleep(3000);
		    String randomName=DikshaUtils.set_Content_Name("YT_Content");
		    excel.updateData("TestData","YT" ,randomName, "");
		    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
		    return randomName;
		}
		
		public static void sendYoutubeContent_For_Review(String randomname) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			UpForReview review=PageFactory.initElements(driver, UpForReview.class);
			Thread.sleep(2000);
			Library.custom_click(Upload.getSendforreview(),"send for review");
			Thread.sleep(2000);
			Upload.getName().clear();
		   Thread.sleep(1000);
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
		
		 public static String UploadHtmlContent() throws Exception {
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
				
				Thread.sleep(1000);
				Library.custom_click(Upload.getHeaderDropdown(), "Guest icon");
				Thread.sleep(1000);
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
			
			    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\HTMLContent_test.zip", "html uploaded");
			    Thread.sleep(5000);
			   
			    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
			    //Library.custom_click(Upload.getSave(),"savebutton");
			    Thread.sleep(2000);
			    Library.custom_click(Upload.getClose(), "close");
			    Thread.sleep(3000);
			    String randomName=DikshaUtils.set_Content_Name("html_Content");
			    excel.updateData("TestData","html" ,randomName, "");
			    Assert.assertTrue(Upload.getSendforreview().isDisplayed());
			    return randomName;
			}
			
			public static void sendHtmlContent_For_Review(String randomname) throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
				UpForReview review=PageFactory.initElements(driver, UpForReview.class);
				Thread.sleep(2000);
				Library.custom_click(Upload.getSendforreview(),"send for review");
				Thread.sleep(2000);
				Upload.getName().clear();
			   Thread.sleep(1000);
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
		
	
	public static void publishCourseFromUpForReview(String coursename) throws InterruptedException {
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
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
		
		int i=3;
		while(!review.getPublishTheCourse().isDisplayed()) {
			driver.navigate().refresh();
			Thread.sleep(2000);
			if(review.getPublishTheCourse().isDisplayed()&& i<4)
			Library.custom_click(review.getPublishTheCourse(), "PublishTheCourse");
			i++;
			break;
		}
		
		Library.custom_click(review.getPublishTheCourse(), "PublishTheCourse");
		Thread.sleep(1000);
		Library.custom_click(review.getConfirmpublishTheCourse(),"ConfirmForPublishCourse");
		Thread.sleep(1000);
		
		Assert.assertTrue(review.getHeaderDropdown().isDisplayed());
	}
}

