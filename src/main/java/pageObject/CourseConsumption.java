package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CourseConsumption {
    
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'eTextbook')]")
	private WebElement searchedTextbook;
	
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
	

	@FindBy(how=How.XPATH,using="//a[text()=' Courses ']")
	private WebElement coursetab;

	@FindBy(how=How.XPATH,using="//img[@alt='Navigate to Next']")
	private WebElement clickNextButton;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Batch expiring in')]")
	private WebElement batchExpiryMsg;

	
	@FindBy(how=How.XPATH,using="//button[text()=' View all ']")
	private WebElement viewall;
	
	@FindBy(how=How.XPATH,using="//button[text()='Close ']")
	private WebElement closetab;
	
	@FindBy(how=How.XPATH,using="//bdi[text()='बहुकक्षीय-बहुस्तरीय शिक्षण (KGBV उत्तर प्रदेश)']")
	private WebElement coursetitle;
	
	@FindBy(how=How.XPATH,using="//span[text()='Hindi']")
	private WebElement coursemedium;
	
	@FindBy(how=How.XPATH,using="(//span[@title='सहज | SAHAJ'])[2]")
	private WebElement coursepublisher;
	
	@FindBy(how=How.XPATH,using="/html/body/app-root/div[1]/div/main/app-view-all/div/div/div[2]/div/div/div[2]/div/div[1]/sb-library-card/span/sb-library-card-v2/div/div[1]/div[1]/div/img")
	private WebElement courseimg;
	
	@FindBy(how=How.XPATH,using="//span[text()='Training']")
	private WebElement coursesubject;
	
	@FindBy(how=How.XPATH,using="//span[text()='Class 1']")
	private WebElement courseclass;
	
	public WebElement getcourseclass() {
		return courseclass;
	}
	
	public WebElement getCoursetab() {
		return coursetab;
	}



	public void setCoursetab(WebElement coursetab) {
		this.coursetab = coursetab;
	}



	public WebElement getViewall() {
		return viewall;
	}



	public void setViewall(WebElement viewall) {
		this.viewall = viewall;
	}



	public WebElement getClosetab() {
		return closetab;
	}



	public void setClosetab(WebElement closetab) {
		this.closetab = closetab;
	}



	public WebElement getCoursetitle() {
		return coursetitle;
	}



	public void setCoursetitle(WebElement coursetitle) {
		this.coursetitle = coursetitle;
	}



	public WebElement getCoursemedium() {
		return coursemedium;
	}



	public void setCoursemedium(WebElement coursemedium) {
		this.coursemedium = coursemedium;
	}



	public WebElement getCoursepublisher() {
		return coursepublisher;
	}



	public void setCoursepublisher(WebElement coursepublisher) {
		this.coursepublisher = coursepublisher;
	}



	public WebElement getCourseimg() {
		return courseimg;
	}



	public void setCourseimg(WebElement courseimg) {
		this.courseimg = courseimg;
	}



	public WebElement getCoursesubject() {
		return coursesubject;
	}



	public void setCoursesubject(WebElement coursesubject) {
		this.coursesubject = coursesubject;
	}



	public WebElement getSearchedTextbook() {
		return searchedTextbook;
	}



	public WebElement getsearchedTextbook() {
		return searchedTextbook;
	}


	
	
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
