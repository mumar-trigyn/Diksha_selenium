package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatePopUp {

	@FindBy(how=How.XPATH,using="//strong[text()='Content is saved']")
	private WebElement saveAsDraftPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Content saved successfully!']")
	private WebElement saveLessonPlanPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Content published successfully...']")
	private WebElement contentPublishedPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Content is published']")
	private WebElement coursePublishedPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Content is added to the folder']")
	private WebElement contentAddFromLibraryPopup;

	@FindBy(how=How.XPATH,using="//strong[text()='Content is published']")
	private WebElement bookPublishedPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Content is sent for review']")
	private WebElement sendForReviewPopUp;
	
	@FindBy(how=How.XPATH,using="//h2[text()='You just completed']")
	private WebElement tvLessonCompleted;
	
	@FindBy(how=How.XPATH,using="//div[text()='You just completed']")
	private WebElement ETextbookCompleted;
	
	@FindBy(how=How.XPATH,using="//strong[text()='User preference updated successfully']")
	private WebElement bMCPopUp;
	
	@FindBy(how=How.XPATH,using="//strong[text()='Batch created successfully...']")
	private WebElement batchCreatedPopUp;
	
	
	public WebElement getBatchCreatedPopUp() {
		return batchCreatedPopUp;
	}

	public WebElement getbMCPopUp() {
		return bMCPopUp;
	}

	public WebElement getETextbookCompleted() {
		return ETextbookCompleted;
	}

	public WebElement getTvLessonCompleted() {
		return tvLessonCompleted;
	}

	public WebElement getSendForReviewPopUp() {
		return sendForReviewPopUp;
	}

	public WebElement getContentAddFromLibraryPopup() {
		return contentAddFromLibraryPopup;
	}

	public WebElement getCoursePublishedPopUp() {
		return coursePublishedPopUp;
	}

	public WebElement getBookPublishedPopUp() {
		return bookPublishedPopUp;
	}

	public WebElement getContentPublishedPopUp() {
		return contentPublishedPopUp;
	}

	public WebElement getSaveLessonPlanPopUp() {
		return saveLessonPlanPopUp;
	}

	public WebElement getSaveAsDraftPopUp() {
		return saveAsDraftPopUp;
	}
	
	
	
}
