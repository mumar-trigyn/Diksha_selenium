package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseConsumption {
    

	
	@FindBy(how=How.XPATH,using="//input[@title='Search or enter QR code']")
	private WebElement searchtextfield;
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'Course')]")
	private WebElement searchedcourse;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'Tv_Lesson')]")
	private WebElement searchedTvLesson;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'eTextbook')]")
	private WebElement searchedETextbook;
	
	@FindBy(how=How.XPATH,using="//button[text()='Join Course']")
	private WebElement joincourse;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement consentcheckbox;
	
	@FindBy(how=How.XPATH,using="//button[text()='Share']")
	private WebElement shareButton;
	
	@FindBy(how=How.XPATH,using="//button[text()='Start learning']")
	private WebElement startLearning;
	
	@FindBy(how=How.XPATH,using="//span[@class='pageNumberFullcount']")
	private WebElement pagecount;
	
	@FindBy(how=How.XPATH,using="//div[@class='d-flex player-slides ml-8']/sb-player-next-navigation/button")
	private WebElement nextButton;
	
	@FindBy(how=How.XPATH,using="//i[@class='close icon']")
	private WebElement closeRatingPopup;
	
	@FindBy(how=How.XPATH,using="//button[@class='close-btn']")
	private WebElement closeCongratulations;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-svg icon-svg--xxs icon-back mr-4']")
	private WebElement backButton;
	
	@FindBy(how=How.XPATH,using="")
	private WebElement courseCompleted;
	
	@FindBy(how=How.XPATH,using="//button[text()='Continue learning']")
	private WebElement continuelearningtab;

	@FindBy(how=How.XPATH,using="//button[text()='Leave course']")
	private WebElement leaveCoursetab;

	@FindBy(how=How.XPATH,using="//button[text()=' Leave course ']")
	private WebElement confirmLeavebutton;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Navigate to Next']")
	private WebElement clickNextButton;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Batch expiring in')]")
	private WebElement batchExpiryMsg;
	
	
	
	public WebElement getBatchExpiryMsg() {
		return batchExpiryMsg;
	}


	public WebElement getClickNextButton() {
		return clickNextButton;
	}


	public WebElement getSearchedETextbook() {
		return searchedETextbook;
	}





	public WebElement getSearchedTvLesson() {
		return searchedTvLesson;
	}


	public WebElement getConfirmLeavebutton() {
		return confirmLeavebutton;
	}


	public WebElement getContinuelearningtab() {
		return continuelearningtab;
	}


	public WebElement getLeaveCoursetab() {
		return leaveCoursetab;
	}


	public WebElement getcontinuelearningtab() {
		return continuelearningtab;
	}
	
	
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public void setSearchtextfield(WebElement searchtextfield) {
		this.searchtextfield = searchtextfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}

	public WebElement getSearchedcourse() {
		return searchedcourse;
	}

	public void setSearchedcourse(WebElement searchedcourse) {
		this.searchedcourse = searchedcourse;
	}

	public WebElement getJoincourse() {
		return joincourse;
	}

	public void setJoincourse(WebElement joincourse) {
		this.joincourse = joincourse;
	}

	public WebElement getConsentcheckbox() {
		return consentcheckbox;
	}

	public void setConsentcheckbox(WebElement consentcheckbox) {
		this.consentcheckbox = consentcheckbox;
	}

	public WebElement getShareButton() {
		return shareButton;
	}

	public void setShareButton(WebElement shareButton) {
		this.shareButton = shareButton;
	}

	public WebElement getStartLearning() {
		return startLearning;
	}
	public void setStartLearning(WebElement startLearning) {
		this.startLearning = startLearning;
	}

	public WebElement getPagecount() {
		return pagecount;
	}

	public void setPagecount(WebElement pagecount) {
		this.pagecount = pagecount;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}

	public WebElement getCloseRatingPopup() {
		return closeRatingPopup;
	}

	public void setCloseRatingPopup(WebElement closeRatingPopup) {
		this.closeRatingPopup = closeRatingPopup;
	}

	public WebElement getCloseCongratulations() {
		return closeCongratulations;
	}

	public void setCloseCongratulations(WebElement closeCongratulations) {
		this.closeCongratulations = closeCongratulations;
	}

	public WebElement getBackButton() {
		return backButton;
	}

	public void setBackButton(WebElement backButton) {
		this.backButton = backButton;
	}

	public WebElement getCourseCompleted() {
		return courseCompleted;
	}

	public void setCourseCompleted(WebElement courseCompleted) {
		this.courseCompleted = courseCompleted;
	}
	
	
}
