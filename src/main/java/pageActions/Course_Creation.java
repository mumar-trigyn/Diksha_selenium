package pageActions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseCreation;
import pageObject.LoginPage;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;


public class Course_Creation extends BaseClass {

 public static String UploadContentFromLibrary(String contentName) throws Exception {
			
	 CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
	 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	 
		Library.custom_click(content.getHeaderDropdown(), "HeaderDropdown");
		Library.custom_click(content.getWorkspace(), "workspace");
		Thread.sleep(3000);
		Library.custom_click(content.getCoursetab(), "Coursetab");
		Thread.sleep(3000);
		Library.custom_click(content.getAddCourseTitle(), "Addcoursetitle");
		Thread.sleep(1000);
		content.getAddCourseTitle().clear();
		Thread.sleep(1000);
        String randomname=DikshaUtils.set_Content_Name("Course_");
		Library.custom_sendkeys(content.getAddCourseTitle(),randomname,"course name");
		Thread.sleep(1000);
		
      
        String id= DikshaUtils.generate_Do_id();
    
       excel.updateData("TestData","Course" ,randomname, id);
        
        
     
        
        int scrollX = 0; // horizontal scroll amount
		int scrollY = 200; // vertical scroll amount
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
        
		Library.custom_click(content.getCourseadditionalCategory(), "CourseadditionalCategory");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectAdditionalCategory(), "SelectAdditionalCategory");
		Thread.sleep(1000);
		Library.custom_click(content.getCourseType(), "CourseType");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectcourseType(), "SelectcourseType");
		Thread.sleep(1000);
		Library.custom_click(content.getSubjectCovered(), "SubjectCovered");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectSubject(), "SelectSubject");
		Thread.sleep(1000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectBoardForcourse());
		
		Library.custom_click(content.getSelectBoardForcourse(), "SelectBoardForcourse");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectBoard(), "SelectBoard");
		Thread.sleep(1000);

		js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectMediumForCourse());
		Library.custom_click(content.getSelectMediumForCourse(), "SelectMediumForCourse");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectMedium(), "SelectMedium");
		Thread.sleep(1000);
		js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectClassForCourse());
		Library.custom_click(content.getSelectClassForCourse(), "SelectClassForCourse");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectclass(), "Selectclass");
		Thread.sleep(1000);
		js1.executeScript("arguments[0].scrollIntoView(true);",content.getSelectSubjectForCourse());
		Library.custom_click(content.getSelectSubjectForCourse(), "SelectSubjectForCourse");
		Thread.sleep(1000);
		Library.custom_click(content.getSelectSubject2(), "SelectSubject2");
		Thread.sleep(1000);
		Library.custom_sendkeys(content.getSelectCopyRightYear(),"2023","SelectCopyRightYear");
		Thread.sleep(1000);
		Library.custom_click(content.getSaveAsDraft(),"SaveAsDraft");
		Thread.sleep(3000);
		Library.custom_click(content.getAddChild(),"SelectBoardForcourse");
		Thread.sleep(1000);
		Library.custom_sendkeys(content.getChildDesc1(),"CdildDesc","ChildDesc1");
		Thread.sleep(3000);
		
		Library.custom_click(content.getAddFromLibraryButton(), "AddFromLibraryButton");
		Thread.sleep(3000);
		Library.custom_sendkeys(content.getSearchContentFromLibrary(), contentName,"SearchContentFromLibrary");
		Thread.sleep(3000);
		content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Library.custom_click(content.getSelectButton(),"SelectButton");
		Thread.sleep(3000);
		
		Library.custom_click(content.getAddContent(),"AddContent");
		Thread.sleep(4000);
		Library.custom_click(content.getContentFromLibrayBackButton(), "ContentFromLibrayBackButton");
		Thread.sleep(3000);
		Library.custom_click(content.getSubmitForreviewButton(),"SubmitForreviewButton");
		Thread.sleep(3000);
		Library.custom_click(content.getTermsAndConditionCheckbox(), "TermsAndConditionCheckbox");
		Thread.sleep(3000);
		Library.custom_click(content.getNewCoursesubmitButton(),"SubmitForreviewButton");
		Thread.sleep(4000);
	
		Assert.assertTrue(loginpage.getHeaderDropdown().isDisplayed());
		
		return randomname;
		

            
	}
}
