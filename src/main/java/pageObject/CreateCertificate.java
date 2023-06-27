package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateCertificate {
	
	@FindBy(how=How.XPATH,using="(//div[@class='d-flex flex-ai-center flex-jc-center flex-dc overlay-buttons'])[1]")
	private WebElement OverTheCertificateTemplate;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add certificate']")
	private WebElement AddCertificateTab;
	
	@FindBy(how=How.XPATH,using="//button[@id='addNewCert']")
	private WebElement BeforeAddCertificateTab;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Add certificate ']")
	private WebElement AfterAddCertificateTab;
	
	@FindBy(how=How.XPATH,using="(//div[@class='mat-select-value'])[2]")
	private WebElement CertificateRuleTab;
	
	@FindBy(how=How.XPATH,using="//span[text()='All']")
	private WebElement AllTab;
	
	@FindBy(how=How.XPATH,using="//label[text()='All the elements and attributes are thoroughly verified']")
	private WebElement SelectCheckbox;
	
	@FindBy(how=How.XPATH,using="(//span[text()='Preview'])[1]")
	private WebElement SelectCertificateTemplate;
			
	@FindBy(how=How.XPATH,using="//button[text()=' Select template ']")
	private WebElement SelectTemplate;
			
	@FindBy(how=How.XPATH,using="//button[text()='Add certificate']")
	private WebElement FinalAddCertificateTab;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Back ']")
	private WebElement CertificatePageBackButton;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='Back']")
	private WebElement BackButton;
	
	@FindBy(how=How.XPATH,using="//span[text()='Certificate criteria']")
	private WebElement CertificateCriteriaTab;
	
	@FindBy(how=How.XPATH,using="//li[text()=' The completion certificate will be issued upon 100% completion']")
	private WebElement CertificateCriteriaInfo;
	
	@FindBy(how=How.XPATH,using="//mat-panel-title[text()=' Batch Details ']")
	private WebElement BatchDetailTab;
	

	@FindBy(how=How.XPATH,using="(//button[@type=\"button\"])[5]")
	private WebElement PlusIcon;
	
	@FindBy(how=How.XPATH,using="//i[@class='dropdown icon']")
	private WebElement SelectCriteria;
	
	@FindBy(how=How.XPATH,using="//span[text()='90%']")
	private WebElement PercentCriteriaSelected;
	//span[text()='90%']
	//(//span[contains(text(),'90%')])[2]
	public WebElement getPlusIcon() {
		return PlusIcon;
	}

	public void setPlusIcon(WebElement plusIcon) {
		PlusIcon = plusIcon;
	}

	public WebElement getSelectCriteria() {
		return SelectCriteria;
	}

	public void setSelectCriteria(WebElement selectCriteria) {
		SelectCriteria = selectCriteria;
	}

	public WebElement getPercentCriteriaSelected() {
		return PercentCriteriaSelected;
	}

	public void setPercentCriteriaSelected(WebElement percentCriteriaSelected) {
		PercentCriteriaSelected = percentCriteriaSelected;
	}

	public WebElement getBatchDetailTab() {
		return BatchDetailTab;
	}
	
	public WebElement getCertificateCriteriaTab() {
		return CertificateCriteriaTab;
	}
	
	public WebElement getCertificateCriteriaInfo() {
		return CertificateCriteriaInfo;
	}
	
	public WebElement getOverTheCertificateTemplate() {
		return OverTheCertificateTemplate;
	}
	
	public WebElement getAddCertificateTab() {
		return AddCertificateTab;
	}
	
	public WebElement getBackButton() {
		return BackButton;
	}
	
	public WebElement getCertificatePageBackButton() {
		return CertificatePageBackButton;
	}
	

	public WebElement getBeforeAddCertificateTab() {
		return BeforeAddCertificateTab;
	}

	public void setBeforeAddCertificateTab(WebElement beforeAddCertificateTab) {
		BeforeAddCertificateTab = beforeAddCertificateTab;
	}

	public WebElement getAfterAddCertificateTab() {
		return AfterAddCertificateTab;
	}

	public void setAfterAddCertificateTab(WebElement afterAddCertificateTab) {
		AfterAddCertificateTab = afterAddCertificateTab;
	}

	public WebElement getCertificateRuleTab() {
		return CertificateRuleTab;
	}

	public void setCertificateRuleTab(WebElement certificateRuleTab) {
		CertificateRuleTab = certificateRuleTab;
	}

	public WebElement getAllTab() {
		return AllTab;
	}

	public void setAllTab(WebElement allTab) {
		AllTab = allTab;
	}

	public WebElement getSelectCheckbox() {
		return SelectCheckbox;
	}

	public void setSelectCheckbox(WebElement selectCheckbox) {
		SelectCheckbox = selectCheckbox;
	}

	public WebElement getSelectCertificateTemplate() {
		return SelectCertificateTemplate;
	}

	public void setSelectCertificateTemplate(WebElement selectCertificateTemplate) {
		SelectCertificateTemplate = selectCertificateTemplate;
	}

	public WebElement getSelectTemplate() {
		return SelectTemplate;
	}

	public void setSelectTemplate(WebElement selectTemplate) {
		SelectTemplate = selectTemplate;
	}

	public WebElement getFinalAddCertificateTab() {
		return FinalAddCertificateTab;
	}

	public void setFinalAddCertificateTab(WebElement finalAddCertificateTab) {
		FinalAddCertificateTab = finalAddCertificateTab;
	}
			
	
			


}



