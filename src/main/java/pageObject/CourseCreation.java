package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseCreation {

	 

		
		@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
		private WebElement headerDropdown;
		
		@FindBy(how=How.XPATH,using="//*[contains(text(),'Workspace')]")
		private WebElement Workspace;
		
		@FindBy(how=How.XPATH,using="(//span[contains(text(),'Course')])[1]")
		private WebElement coursetab;
		
		@FindBy(how=How.XPATH,using="(//input[@type='text'])[1]")
		private WebElement addCourseTitle;
		
		@FindBy(how=How.XPATH,using="(//div[@class='list-border'])[1]//following::li[text()='Select Additional Category']")
		private WebElement courseadditionalCategory;
		
		@FindBy(how=How.XPATH,using="//label[contains(text(),'Textbook')]")
		private WebElement selectAdditionalCategory;
		
		@FindBy(how=How.XPATH,using="(//select[@id='sb-dropdown'])[2]")
		private WebElement courseType;
		
		@FindBy(how=How.XPATH,using="//option[text()='Continuous Professional Development']")
		private WebElement selectcourseType;
		
		@FindBy(how=How.XPATH,using="//label[contains(text(),'Subjects covered in the course')]//following::select[1]")
		private WebElement subjectCovered;
		
		@FindBy(how=How.XPATH,using="//option[contains(text(),'English') or contains(text(),'EVS')]")
		private WebElement selectSubject;
		
		@FindBy(how=How.XPATH,using="(//select[@id='sb-dropdown'])[3]")
		private WebElement selectBoardForcourse;
		
		@FindBy(how=How.XPATH,using="(//label[contains(@data-title,'Board')])//following::option[2]")
		private WebElement selectBoard;
		
		@FindBy(how=How.XPATH,using="//li[contains(text(),'Select Medium')]")
		private WebElement selectMediumForCourse;
		
		@FindBy(how=How.XPATH,using="//label[contains(text(),'Medium(s) of the audience')]//following::label[contains(text(),'English')]")
		private WebElement selectMedium;
		
		@FindBy(how=How.XPATH,using="//li[contains(text(),'Select Class')]")
		private WebElement selectClassForCourse;
		
		@FindBy(how=How.XPATH,using="//label[contains(text(),'Class(es) of the audience')]//following::label[3]")
		private WebElement selectclass;
		
		@FindBy(how=How.XPATH,using="//li[contains(text(),'Select Subject')]")
		private WebElement selectSubjectForCourse;
		
		@FindBy(how=How.XPATH,using="//label[contains(text(),'Subject(s) of the audience')]//following::label[2]")
		private WebElement selectSubject2;
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Copyright Year']")
		private WebElement selectCopyRightYear;
		
		@FindBy(how=How.XPATH,using="//button[@class='sb-btn sb-btn-normal sb-btn-outline-primary mr-10 ng-star-inserted']")
		private WebElement saveAsDraft;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Add Child')]")
		private WebElement addChild;
		
		@FindBy(how=How.XPATH,using="//label[text()='Description']//following::textarea")
		private WebElement childDesc1;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Add from library')]")
		private WebElement addFromLibraryButton;
		
		@FindBy(how=How.XPATH,using="//input[@id='searchInputField']")
		private WebElement searchContentFromLibrary;
		
		@FindBy(how=How.XPATH,using="(//button[contains(text(),'Select content')])[1]")
		private WebElement selectButton;
		
		@FindBy(how=How.XPATH,using="//button[@id='addResource']")
		private WebElement addContent;
		
		@FindBy(how=How.XPATH,using="//button[contains(@class,'sb-btn sb-btn-primary sb-btn-xs back-btn px-0')]")
		private WebElement contentFromLibrayBackButton;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Send for Review')]")
		private WebElement submitForreviewButton;
		
		@FindBy(how=How.XPATH,using="//span[contains(text(),'I agree that by submitting / publishing this Content,')]")
		private WebElement termsAndConditionCheckbox;
		
		@FindBy(how=How.XPATH,using="(//button[@type='button'])[7]")
		private WebElement NewCoursesubmitButton;
		
		@FindBy(how=How.XPATH,using="//span[@class='fancytree-expander fa fa-caret-right']")
		private WebElement courseUnitExpandButton;

		@FindBy(how=How.XPATH,using="//span[contains(text(),'PDF_')]")
		private WebElement verifyContentUnderCourse;
		
		
		public WebElement getVerifyContentUnderCourse() {
			return verifyContentUnderCourse;
		}


		public WebElement getCourseUnitExpandButton() {
			return courseUnitExpandButton;
		}


		public WebElement getHeaderDropdown() {
			return headerDropdown;
		}


		public WebElement getWorkspace() {
			return Workspace;
		}


		public WebElement getCoursetab() {
			return coursetab;
		}


		public WebElement getAddCourseTitle() {
			return addCourseTitle;
		}


		public WebElement getCourseadditionalCategory() {
			return courseadditionalCategory;
		}


		public WebElement getSelectAdditionalCategory() {
			return selectAdditionalCategory;
		}


		public WebElement getCourseType() {
			return courseType;
		}

		public WebElement getSelectcourseType() {
			return selectcourseType;
		}


		public WebElement getSubjectCovered() {
			return subjectCovered;
		}


		public WebElement getSelectSubject() {
			return selectSubject;
		}


		public WebElement getSelectBoardForcourse() {
			return selectBoardForcourse;
		}


		public WebElement getSelectBoard() {
			return selectBoard;
		}


		public WebElement getSelectMediumForCourse() {
			return selectMediumForCourse;
		}


		public WebElement getSelectMedium() {
			return selectMedium;
		}


		public WebElement getSelectClassForCourse() {
			return selectClassForCourse;
		}


		public WebElement getSelectclass() {
			return selectclass;
		}


		public WebElement getSelectSubjectForCourse() {
			return selectSubjectForCourse;
		}


		public WebElement getSelectSubject2() {
			return selectSubject2;
		}


		public WebElement getSelectCopyRightYear() {
			return selectCopyRightYear;
		}


		public WebElement getSaveAsDraft() {
			return saveAsDraft;
		}


		public WebElement getAddChild() {
			return addChild;
		}


		public WebElement getChildDesc1() {
			return childDesc1;
		}


		public WebElement getAddFromLibraryButton() {
			return addFromLibraryButton;
		}


		public WebElement getSearchContentFromLibrary() {
			return searchContentFromLibrary;
		}


		public WebElement getSelectButton() {
			return selectButton;
		}


		public WebElement getAddContent() {
			return addContent;
		}


		public WebElement getContentFromLibrayBackButton() {
			return contentFromLibrayBackButton;
		}


		public WebElement getSubmitForreviewButton() {
			return submitForreviewButton;
		
		}


		public WebElement getTermsAndConditionCheckbox() {
			return termsAndConditionCheckbox;
		}



		public WebElement getNewCoursesubmitButton() {
			return NewCoursesubmitButton;
		}
}
