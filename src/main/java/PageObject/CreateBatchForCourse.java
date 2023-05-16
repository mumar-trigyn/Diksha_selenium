package PageObject;

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
	
	@FindBy(how=How.XPATH,using="//button[text()='Create Batch']")
	private WebElement createBatchButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement BatchName;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-0']")
	private WebElement startDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-1']")
	private WebElement endDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-2']")
	private WebElement enrollmentDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='yes']")
	private WebElement issueCertificateYes;
	
	@FindBy(how=How.XPATH,using="//input[@id='no']")
	private WebElement issueCertificateNo;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement courseterms;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitbutton']")
	private WebElement createButton;

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
