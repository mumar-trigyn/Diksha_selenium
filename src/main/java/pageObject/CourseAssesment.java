package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseAssesment {

	@FindBy(how=How.XPATH,using="//span[text()='Course Assessment']")
	private WebElement courseAssesmentTab;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement nameTextField;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Max no of attempts']")
	private WebElement maxAttemptTextField;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Start creating ']")
	private WebElement startCreatingButton;
	
	@FindBy(how=How.XPATH,using="//i[@id='stage']")
	private WebElement addSlideButton;
	
	@FindBy(how=How.XPATH,using="//i[@id='org.ekstep.text']")
	private WebElement addTextbutton;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='authoringTextEditor']")
	private WebElement TextareaTextfield;
	
	@FindBy(how=How.XPATH,using="//button[text()='Done']")
	private WebElement donebutton;
	
	@FindBy(how=How.XPATH,using="//i[@id='shape']")
	private WebElement addShapebutton;
	
	@FindBy(how=How.XPATH,using="//span[text()='Triangle']")
	private WebElement addingTriangleShape;
	
	@FindBy(how=How.XPATH,using="//i[@id='videoPlugin']")
	private WebElement addVideoButton;
	
	@FindBy(how=How.XPATH,using="(//img[@class='resourceMetaImage'])[1]")
	private WebElement selectVideoFromVideoList;
	
	@FindBy(how=How.XPATH,using="//button[text()='Select']")
	private WebElement selectvideoButton;
	
	@FindBy(how=How.XPATH,using="//i[@id='image']")
	private WebElement addImagebutton;
	
	@FindBy(how=How.XPATH,using="//i[@id='audio']")
	private WebElement addaudiobutton;
	
	@FindBy(how=How.XPATH,using="//a[text()='All audio']")
	private WebElement allAudiobutton;
	
	@FindBy(how=How.XPATH,using="(//div[@id='all-audio-tab']/div/div/div/div)[1]")
	private WebElement selectaudiofromlist;
	
	@FindBy(how=How.XPATH,using="//button[text()='Select']")
	private WebElement selectaudioButton;
	
	@FindBy(how=How.XPATH,using="//i[@id='question-set']")
	private WebElement addQuestionSetButton;
	
	@FindBy(how=How.XPATH,using="(//div[@data-tooltip='select question']//input[@type='checkbox'])[1]//..")
	private WebElement selectQuestionCheckBox;
	
	@FindBy(how=How.XPATH,using="//button[@class='ui blue button next-button']")
	private WebElement nextButton;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Question Set Title']")
	private WebElement questionSetTitleTextfield;
	
	@FindBy(how=How.XPATH,using="//button[@id='add-to-stage']")
	private WebElement addButton;
	
	@FindBy(how=How.XPATH,using="//i[@id='activitybrowser']")
	private WebElement addActivityButton;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Add'])[5]")
	private WebElement addtimeAndClockButton;

	
	public WebElement getAddActivityButton() {
		return addActivityButton;
	}

	public WebElement getAddtimeAndClockButton() {
		return addtimeAndClockButton;
	}

	public WebElement getCourseAssesmentTab() {
		return courseAssesmentTab;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getMaxAttemptTextField() {
		return maxAttemptTextField;
	}

	public WebElement getStartCreatingButton() {
		return startCreatingButton;
	}

	public WebElement getAddSlideButton() {
		return addSlideButton;
	}

	public WebElement getAddTextbutton() {
		return addTextbutton;
	}

	public WebElement getTextareaTextfield() {
		return TextareaTextfield;
	}

	public WebElement getDonebutton() {
		return donebutton;
	}

	public WebElement getAddShapebutton() {
		return addShapebutton;
	}

	public WebElement getAddingTriangleShape() {
		return addingTriangleShape;
	}

	public WebElement getAddVideoButton() {
		return addVideoButton;
	}

	public WebElement getselectVideoFromVideoList() {
		return selectVideoFromVideoList;
	}

	public WebElement getSelectvideoButton() {
		return selectvideoButton;
	}

	public WebElement getAddImagebutton() {
		return addImagebutton;
	}

	public WebElement getAddaudiobutton() {
		return addaudiobutton;
	}

	
	public WebElement getSelectVideoFromVideoList() {
		return selectVideoFromVideoList;
	}

	public WebElement getAllAudiobutton() {
		return allAudiobutton;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getSelectaudiofromlist() {
		return selectaudiofromlist;
	}

	public WebElement getSelectaudioButton() {
		return selectaudioButton;
	}

	public WebElement getAddQuestionSetButton() {
		return addQuestionSetButton;
	}

	public WebElement getSelectQuestionCheckBox() {
		return selectQuestionCheckBox;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getQuestionSetTitleTextfield() {
		return questionSetTitleTextfield;
	}

	public WebElement getaddButton() {
		return addButton;
	}
	
	
}
