package pageActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Resources;

import pageObject.CourseAssesment;
import pageObject.ResourcesPom;
import pageObject.UploadPdfContent;

import utility.BaseClass;
import utility.DikshaUtils;

public class ResourcesMethods extends BaseClass {

	public static String resourceWithECMLContent() throws Exception {
		
		ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(rs.getResourceTab());
		
		String randomName=DikshaUtils.set_Content_Name("TvLessonResource_");
		excel.updateData("TestData","TvLessonResource" ,randomName, "");
		
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getResourceNameTextfield(),randomName);
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectContentType());
		DikshaUtils.waitToBeClickableAndClick(rs.getContentTypeSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getStartCreatingButton());
		Thread.sleep(8000);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddTextbutton());
		DikshaUtils.waitToBeVisibleAndClick(assesment.getAddTextbutton());
		DikshaUtils.waitToBeClickableAndSendKeys(assesment.getTextareaTextfield(), "Done Via Automation");
		DikshaUtils.waitToBeClickableAndClick(assesment.getDonebutton());
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddShapebutton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddingTriangleShape());
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddVideoButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getselectVideoFromVideoList());
		DikshaUtils.waitToBeClickableAndClick(assesment.getSelectvideoButton());
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddImagebutton());
		DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddaudiobutton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAllAudiobutton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getSelectaudiofromlist());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getSelectaudioButton());
	    
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddQuestionSetButton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getSelectQuestionCheckBox1());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getNextButton());
	    DikshaUtils.waitToBeClickableAndSendKeys(assesment.getQuestionSetTitleTextfield(),"QA Questions");
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddButton());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	   
	    return randomName;
		
	}
	
	public static String resourceWithTVLesson() throws Exception {
		
		ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(rs.getResourceTab());
		
		String randomName=DikshaUtils.set_Content_Name("ECML_");
	//	excel.updateData("TestData","ECMLResource" ,randomName, "");
		
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getResourceNameTextfield(),randomName);
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectContentType());
		DikshaUtils.waitToBeVisibleAndClick(rs.getContentTypeSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getStartCreatingButton());
		Thread.sleep(8000);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddVideoButton());
		DikshaUtils.waitToBeClickableAndClick(assesment.getselectVideoFromVideoList());
		DikshaUtils.waitToBeClickableAndClick(assesment.getSelectvideoButton());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	   
	    return randomName;
		
		
	}
	
		public static String createAndEditQuestionsInQuestionSet() throws Exception {
		
		ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(rs.getResourceTab());
		
		String randomName=DikshaUtils.set_Content_Name("Resource_");
		excel.updateData("TestData","Resource" ,randomName, "");
		
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getResourceNameTextfield(),randomName);
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectContentType());
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(rs.getContentTypeSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getStartCreatingButton());
		Thread.sleep(8000);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		DikshaUtils.waitToBeClickableAndClick(assesment.getAddQuestionSetButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getCreateQuestionButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectMCQButton());
		Thread.sleep(2000);
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(iframe1);
	
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(rs.getEnterTheQuestionTextfield());
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getEnterTheQuestionTextfield(),"Capital of India");
	
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@class='iziModal-iframe']"));
		driver.switchTo().frame(iframe2);
		
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", rs.getTickCorrectAnswer());
		
		
		DikshaUtils.waitToBeClickableAndClick(rs.getTickCorrectAnswer());
		
		DikshaUtils.waitToBeClickableAndClick(rs.getAnswerNo1Textfield());
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getAnswerNo1Textfield(),"Delhi");
		
		DikshaUtils.waitToBeClickableAndClick(rs.getAnswerNo2Textfield());
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getAnswerNo2Textfield(),"Mumbai");
		DikshaUtils.waitToBeClickableAndClick(rs.getNextButton());
	
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectBoardSyllabus());
		DikshaUtils.waitToBeClickableAndClick(rs.getBoardSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectMedium());
		DikshaUtils.waitToBeClickableAndClick(rs.getMediumSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectGrade());
		DikshaUtils.waitToBeClickableAndClick(rs.getGradeSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectSubject());
		DikshaUtils.waitToBeClickableAndClick(rs.getSubjectSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getSelectLevel());
		DikshaUtils.waitToBeClickableAndClick(rs.getLevelSelected());
		DikshaUtils.waitToBeClickableAndClick(rs.getSaveAndCreateButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getCancelButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getNextButtonAfterClickingCheckbox());
		
		DikshaUtils.waitToBeClickableAndSendKeys(assesment.getQuestionSetTitleTextfield(),"QA Questions");
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddButton());
//	    Thread.sleep(2000);
//	    driver.switchTo().frame(iframe);
//	    Thread.sleep(2000);
	    
	    DikshaUtils.waitToBeClickableAndClick(rs.getEditQuestionSetButton());
		Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(rs.getEditQuestionButton());
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", rs.getAddAnswerButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getAddAnswerButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getAnswerNo3Textfield());
		DikshaUtils.waitToBeClickableAndSendKeys(rs.getAnswerNo3Textfield(),"Bangalore");
		DikshaUtils.waitToBeClickableAndClick(rs.getNextButton());
	
		DikshaUtils.waitToBeClickableAndClick(rs.getSaveAndCreateButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getCancelButton());
		DikshaUtils.waitToBeClickableAndClick(rs.getCrossIcon());
		DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	
	    
		
		return randomName;
}
		
		public static String shuffleAndCopyQuestionsInQuestionSet() throws Exception {
			
			ResourcesPom rs=PageFactory.initElements(driver, ResourcesPom.class);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
			
			DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
			DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(rs.getResourceTab());
			
			String randomName=DikshaUtils.set_Content_Name("Resource_");
		//	excel.updateData("TestData","Resource" ,randomName, "");
			
			DikshaUtils.waitToBeClickableAndSendKeys(rs.getResourceNameTextfield(),randomName);
			DikshaUtils.waitToBeClickableAndClick(rs.getSelectContentType());
			Thread.sleep(1000);
			DikshaUtils.waitToBeVisibleAndClick(rs.getContentTypeSelected());
			DikshaUtils.waitToBeClickableAndClick(rs.getStartCreatingButton());
			Thread.sleep(8000);
			WebElement iframe = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(iframe);
			
			DikshaUtils.waitToBeClickableAndClick(assesment.getAddQuestionSetButton());
			DikshaUtils.waitToBeClickableAndClick(rs.getCopyQuestionButton());
			Thread.sleep(5000);
			DikshaUtils.waitToBeClickableAndClick(rs.getNextButton());
			
			DikshaUtils.waitToBeClickableAndClick(rs.getSelectBoardSyllabus());
			DikshaUtils.waitToBeClickableAndClick(rs.getBoardSelected());
			DikshaUtils.waitToBeClickableAndClick(rs.getSelectMedium());
			DikshaUtils.waitToBeClickableAndClick(rs.getMediumSelected());
			DikshaUtils.waitToBeClickableAndClick(rs.getSelectGrade());
			DikshaUtils.waitToBeClickableAndClick(rs.getGradeSelected());
			DikshaUtils.waitToBeClickableAndClick(rs.getSelectSubject());
			DikshaUtils.waitToBeClickableAndClick(rs.getSubjectSelected());
			
			DikshaUtils.waitToBeClickableAndClick(rs.getSubmitButton());
			Thread.sleep(1000);
			DikshaUtils.waitToBeClickableAndClick(assesment.getSelectQuestionCheckBox2());
			DikshaUtils.waitToBeClickableAndClick(assesment.getNextButton());
			DikshaUtils.waitToBeClickableAndSendKeys(assesment.getQuestionSetTitleTextfield(),"QA Questions");
			Thread.sleep(3000);
	//		DikshaUtils.waitToBeClickableAndClick(rs.getShuffleQuestionsButton());
		    DikshaUtils.waitToBeClickableAndClick(assesment.getAddButton());
		    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
		
			return randomName;
			
		}
		
		
		
		
		
		
		
	
}
