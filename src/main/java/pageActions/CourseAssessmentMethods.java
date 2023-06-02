package pageActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageObject.CourseAssesment;
import pageObject.UploadPdfContent;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;

public class CourseAssessmentMethods extends BaseClass {

	public static String createAssessmentWithAllTypeContent() throws InterruptedException, Exception {
		
		CourseAssesment assesment=PageFactory.initElements(driver, CourseAssesment.class);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(assesment.getCourseAssesmentTab());
		String randomName=DikshaUtils.set_Content_Name("CourseAssessment_");
		excel.updateData("TestData","CourseAssessment" ,randomName, "");
		DikshaUtils.waitToBeClickableAndSendKeys(assesment.getNameTextField(), randomName);
		DikshaUtils.waitToBeClickableAndSendKeys(assesment.getMaxAttemptTextField(), "3");
		DikshaUtils.waitToBeVisibleAndClick(assesment.getStartCreatingButton());
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
	    
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddSlideButton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddActivityButton());
	    DikshaUtils.waitToBeClickableAndClick(assesment.getAddtimeAndClockButton());
	    
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	   
	    return randomName;
	    
	}
}
