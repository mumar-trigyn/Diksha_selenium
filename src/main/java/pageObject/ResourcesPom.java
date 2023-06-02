package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourcesPom {

	@FindBy(how=How.XPATH,using="//span[text()='Resource']")
	private WebElement resourceTab;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement resourceNameTextfield;
	
	@FindBy(how=How.XPATH,using="(//div[contains(text(), 'Select one')])[1]")
	private WebElement selectContentType;
	
	@FindBy(how=How.XPATH,using="(//span[text()='Explanation Content'])[1]")
	private WebElement contentTypeSelected;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Start creating ']")
	private WebElement startCreatingButton;

	@FindBy(how=How.XPATH,using="//div[text()='Select Additional Category']")
	private WebElement selectAdditionalCategoryDropdown;
	
	@FindBy(how=How.XPATH,using="//div[text()='TV Lesson']")
	private WebElement additionalCategorySelected;
	
	@FindBy(how=How.XPATH,using="//button[@id='create-question-button']")
	private WebElement createQuestionButton;
	
	@FindBy(how=How.XPATH,using="(//div[@class='ui small primary button'])[2]")
	private WebElement selectMCQButton;
	
	@FindBy(how=How.XPATH,using="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement enterTheQuestionTextfield;
	
	@FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[1]")
	private WebElement answerNo1Textfield;
	
	@FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[2]")
	private WebElement answerNo2Textfield;
	
	@FindBy(how=How.XPATH,using="//input[@id='0']")
	private WebElement tickCorrectAnswer;
	
	@FindBy(how=How.XPATH,using="//button[@id='next-button']")
	private WebElement nextButton;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Board/Syllabus'])[2]")
	private WebElement selectBoardSyllabus;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Board/Syllabus']/../div/div)[2]")
	private WebElement boardSelected;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Medium'])[2]")
	private WebElement selectMedium;
	
	@FindBy(how=How.XPATH,using="(//div[text()='English'])[2]")
	private WebElement mediumSelected;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Grade'])")
	private WebElement selectGrade;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Class 1'])[2]")
	private WebElement gradeSelected;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Subject'])[2]")
	private WebElement selectSubject;
	
	@FindBy(how=How.XPATH,using="(//div[text()='EVS'])[2]")
	private WebElement subjectSelected;
	
	@FindBy(how=How.XPATH,using="(//div[text()='Select Level'])[2]")
	private WebElement selectLevel;
	
	@FindBy(how=How.XPATH,using="(//div[text()='EASY'])[2]")
	private WebElement LevelSelected;
	
	@FindBy(how=How.XPATH,using="(//button[@id='save-question-button'])[1]")
	private WebElement saveAndCreateButton;
	
	@FindBy(how=How.XPATH,using="(//button[@id='cancel-button'])")
	private WebElement cancelButton;
	
	
	@FindBy(how=How.XPATH,using="//button[@class='ui blue button next-button']")
	private WebElement nextButtonAfterClickingCheckbox;
	
	@FindBy(how=How.XPATH,using="//button[text()='Edit']")
	private WebElement editQuestionSetButton;
	
	@FindBy(how=How.XPATH,using="(//div[@class='qb-question-action three wide column'])[51]/child::span[2]")
	private WebElement editQuestionButton;
	
	@FindBy(how=How.XPATH,using="(//div[@class='qb-question-action three wide column'])[1]//child::span[2]")
	private WebElement copyQuestionButton;
	
	@FindBy(how=How.XPATH,using="//button[text()='Add answer ']")
	private WebElement addAnswerButton;
	
	@FindBy(how=How.XPATH,using="(//div[@title='Set Answer'])[3]")
	private WebElement answerNo3Textfield;
	
	@FindBy(how=How.XPATH,using="//i[@class='cursor-pointer close link icon']")
	private WebElement crossIcon;
	
	
	
	public WebElement getCopyQuestionButton() {
		return copyQuestionButton;
	}

	public WebElement getCrossIcon() {
		return crossIcon;
	}

	public WebElement getAddAnswerButton() {
		return addAnswerButton;
	}

	public WebElement getAnswerNo3Textfield() {
		return answerNo3Textfield;
	}

	public WebElement getEditQuestionSetButton() {
		return editQuestionSetButton;
	}

	public WebElement getEditQuestionButton() {
		return editQuestionButton;
	}

	public WebElement getCreateQuestionButton() {
		return createQuestionButton;
	}

	public WebElement getSelectMCQButton() {
		return selectMCQButton;
	}

	public WebElement getEnterTheQuestionTextfield() {
		return enterTheQuestionTextfield;
	}

	public WebElement getAnswerNo1Textfield() {
		return answerNo1Textfield;
	}

	public WebElement getAnswerNo2Textfield() {
		return answerNo2Textfield;
	}

	public WebElement getTickCorrectAnswer() {
		return tickCorrectAnswer;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getSelectBoardSyllabus() {
		return selectBoardSyllabus;
	}

	public WebElement getBoardSelected() {
		return boardSelected;
	}

	public WebElement getSelectMedium() {
		return selectMedium;
	}

	public WebElement getMediumSelected() {
		return mediumSelected;
	}

	public WebElement getSelectGrade() {
		return selectGrade;
	}

	public WebElement getGradeSelected() {
		return gradeSelected;
	}

	public WebElement getSelectSubject() {
		return selectSubject;
	}

	public WebElement getSubjectSelected() {
		return subjectSelected;
	}

	public WebElement getSelectLevel() {
		return selectLevel;
	}

	public WebElement getLevelSelected() {
		return LevelSelected;
	}

	public WebElement getSaveAndCreateButton() {
		return saveAndCreateButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getNextButtonAfterClickingCheckbox() {
		return nextButtonAfterClickingCheckbox;
	}

	public WebElement getSelectAdditionalCategoryDropdown() {
		return selectAdditionalCategoryDropdown;
	}

	public WebElement getAdditionalCategorySelected() {
		return additionalCategorySelected;
	}

	public WebElement getResourceTab() {
		return resourceTab;
	}

	public WebElement getResourceNameTextfield() {
		return resourceNameTextfield;
	}

	public WebElement getSelectContentType() {
		return selectContentType;
	}

	public WebElement getContentTypeSelected() {
		return contentTypeSelected;
	}

	public WebElement getStartCreatingButton() {
		return startCreatingButton;
	}

	
	
	
	
}
