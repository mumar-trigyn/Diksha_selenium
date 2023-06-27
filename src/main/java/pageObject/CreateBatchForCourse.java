package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateBatchForCourse {

	@FindBy(how=How.XPATH,using="//input[@title='Search or enter QR code']")
	private WebElement searchtextfield;
	
	@FindBy(how=How.XPATH,using="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'Course')]")
	private WebElement searchedcourse;
	
	@FindBy(how=How.XPATH,using="//bdi[contains(text(),'eTextbook')]")
	private WebElement searchedTextbook;
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Create Batch']")
	private WebElement createBatchButton;

	@FindBy(how=How.XPATH,using="//button[text()=' Edit ']")
	private WebElement editBatchButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement BatchName;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='startDate']")
	private WebElement startDate;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='endDate']")
	private WebElement endDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-2']")
	private WebElement enrollmentDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='yes']")
	private WebElement issueCertificateYes;
	
	@FindBy(how=How.XPATH,using="//input[@id='no']")
	private WebElement issueCertificateNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='true']/..")
	private WebElement enableDiscussionsButton;
	
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement courseterms;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitbutton']")
	private WebElement createButton;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-svg icon-svg--xxs icon-back mr-4']")
	private WebElement backAfterCreateBatchButton;

	@FindBy(how=How.XPATH,using="//button[text()=' View course dashboard ']")
	private WebElement viewDashboardButton;

	@FindBy(how=How.XPATH,using="//span[text()='Ongoing']")
	private WebElement ongoingBatchButton;

	@FindBy(how=How.XPATH,using="//span[text()='Upcoming']")
	private WebElement upcomingBatchButton;
	
	@FindBy(how=How.XPATH,using="//div[text()='No batches found']")
	private WebElement noBatchFoundMsg;
	
	@FindBy(how=How.XPATH,using="//span[text()='Expired']")
	private WebElement expiredBatchButton;
	
	@FindBy(how=How.XPATH,using="(//div[@class='mat-form-field-infix'])[2]//child::mat-select")
	private WebElement selectBatchDropdown;
	
	@FindBy(how=How.XPATH,using="//span[text()='Batch 1']")
	private WebElement BatchSelected;
	
	@FindBy(how=How.XPATH,using="//button[@title='Forum']")
	private WebElement discussionForumIcon;
	
	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-55']")
	private WebElement selectMentorDropdown;
	
	@FindBy(how=How.XPATH,using="//span[text()=' admin (ad********@gmail.com) ']")
	private WebElement MentorSelected;
	
	@FindBy(how=How.XPATH,using="//button[@id='add-certificate']")
	private WebElement BeforeAddCertificate;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Close ']")
	private WebElement ClosePopup;
	
	
	public WebElement getClosePopup() {
		return ClosePopup;
	}
	public WebElement getsearchedTextbook() {
		return searchedTextbook;
	}


	public WebElement getEditBatchButton() {
		return editBatchButton;
	}


	public WebElement getSelectMentorDropdown() {
		return selectMentorDropdown;
	}


	public WebElement getMentorSelected() {
		return MentorSelected;
	}


	public WebElement getDiscussionForumIcon() {
		return discussionForumIcon;
	}


	public WebElement getSelectBatchDropdown() {
		return selectBatchDropdown;
	}


	public WebElement getBatchSelected() {
		return BatchSelected;
	}


	public WebElement getOngoingBatchButton() {
		return ongoingBatchButton;
	}


	public WebElement getUpcomingBatchButton() {
		return upcomingBatchButton;
	}


	public WebElement getNoBatchFoundMsg() {
		return noBatchFoundMsg;
	}


	public WebElement getExpiredBatchButton() {
		return expiredBatchButton;
	}


	public WebElement getViewDashboardButton() {
		return viewDashboardButton;
	}


	public WebElement getBackAfterCreateBatchButton() {
		return backAfterCreateBatchButton;
	}


	public void setBackAfterCreateBatchButton(WebElement backAfterCreateBatchButton) {
		this.backAfterCreateBatchButton = backAfterCreateBatchButton;
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

	public WebElement getCreateBatchButton() {
		return createBatchButton;
	}

	public void setCreateBatchButton(WebElement createBatchButton) {
		this.createBatchButton = createBatchButton;
	}

	public WebElement getBatchName() {
		return BatchName;
	}

	public void setBatchName(WebElement batchName) {
		BatchName = batchName;
	}

	public WebElement getDescription() {
		return description;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public void setStartDate(WebElement startDate) {
		this.startDate = startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public void setEndDate(WebElement endDate) {
		this.endDate = endDate;
	}

	public WebElement getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(WebElement enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public WebElement getIssueCertificateYes() {
		return issueCertificateYes;
	}

	public void setIssueCertificateYes(WebElement issueCertificateYes) {
		this.issueCertificateYes = issueCertificateYes;
	}

	public WebElement getIssueCertificateNo() {
		return issueCertificateNo;
	}

	public void setIssueCertificateNo(WebElement issueCertificateNo) {
		this.issueCertificateNo = issueCertificateNo;
	}

	
	public WebElement getEnableDiscussionsButton() {
		return enableDiscussionsButton;
	}


	public WebElement getCourseterms() {
		return courseterms;
	}

	public void setCourseterms(WebElement courseterms) {
		this.courseterms = courseterms;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public void setCreateButton(WebElement createButton) {
		this.createButton = createButton;
	}

	
	
}
