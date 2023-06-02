package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class userProfile {

	@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
	private WebElement headerDropdown;
	
	@FindBy(how=How.XPATH,using="//li[text()=' Profile ']")
	private WebElement profilebutton;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Edit'])[1]")
	private WebElement locationeditbutton;
	
	@FindBy(how=How.XPATH,using="(//div[@role='list'])[3]")
	private WebElement Role;
	
	@FindBy(how=How.XPATH,using="//span[text()='Parent']")
	private WebElement parent;
	
	@FindBy(how=How.XPATH,using="//span[text()='Head teacher & Official']")
	private WebElement HTOfficial;
	
	@FindBy(how=How.XPATH,using="//span[text()='Teacher']")
	private WebElement teacher;
	
	@FindBy(how=How.XPATH,using="//span[text()='Student']")
	private WebElement student;
	
	@FindBy(how=How.XPATH,using="//*[@id='state']/div[1]")
	private WebElement State;
	
    @FindBy(how=How.XPATH,using="//span[text()='Andhra Pradesh']")
	private WebElement AndhraPradesh;
    
    @FindBy(how=How.XPATH,using="//*[@id='district']/div[1]")
	private WebElement District;
	
	@FindBy(how=How.XPATH,using="//span[text()='Alluri Sita Rama Raju']")
	private WebElement DistrictAlluriSitaRamaRaju;
	
	@FindBy(how=How.XPATH,using=" //div[text()='Parent']")
	private WebElement TextParent;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Alluri Sita Rama Raju ']")
	private WebElement TextDistrict;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Andhra Pradesh']")
	private WebElement TextAP;

	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement LocationSubmitButton;
	
   @FindBy(how=How.XPATH,using="(//button[text()='Edit'])[2]")
	private WebElement BMCeditbutton;
   
   @FindBy(how=How.XPATH,using="//mat-form-field[@id='board']")
	private WebElement Board;
	
	@FindBy(how=How.XPATH,using="//mat-option[@aria-label='CBSE/NCERT']")
	private WebElement Cbsc;
	
	@FindBy(how=How.XPATH,using="//span[text()='CBSE']")
	private WebElement CbscTab;
	
	@FindBy(how=How.XPATH,using="//span[text()='IGOT-Health']")
	private WebElement IGOT_Health;
	
	@FindBy(how=How.XPATH,using="//mat-form-field[@id='medium']")
	private WebElement Medium;
	
	@FindBy(how=How.XPATH,using="//span[text()='Hindi']")
	private WebElement Hindi;
	
	@FindBy(how=How.XPATH,using="(//span[text()='English'])[2]")
	private WebElement English;
	
	@FindBy(how=How.XPATH,using="//span[text()='Gujarati']")
	private WebElement Gujarati ;
	
	@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']")
	private WebElement Classs;
	
	@FindBy(how=How.XPATH,using="//span[text()='Pharmacist']")
	private WebElement Pharmacist;
	
	@FindBy(how=How.XPATH,using="//mat-option[@aria-label='Class 4']")
	private WebElement Class4;
	
	@FindBy(how=How.XPATH,using="//span[text()='Class 2']")
	private WebElement class2;
	
	@FindBy(how=How.XPATH,using="//span[text()='CBSE/NCERT']")
	private WebElement TextCbsc;
	
	@FindBy(how=How.XPATH,using="(//span[text()='English'])[2]")
	private WebElement TextEnglish;	
	
	@FindBy(how=How.XPATH,using="//span[text()='Class 2']")
	private WebElement TextClass2;	
	
	@FindBy(how=How.XPATH,using="//button[text()=' Submit details ']")
	private WebElement SubmitDetails;
	
	@FindBy(how=How.XPATH,using="//div[@aria-label='Select State/Institution']")
	private WebElement InstitutionTab;
	
    @FindBy(how=How.XPATH,using="//input[@placeholder='Enter ID']")
	private WebElement Id;
    
    @FindBy(how=How.XPATH,using="//span[@class='checkmark']")
	private WebElement SubmitDetailCheckbox;
    
    @FindBy(how=How.XPATH,using="//button[text()='Update']")
	private WebElement BeforeUpdateButton;
    
    @FindBy(how=How.XPATH,using="//button[text()=' Update ']")
	private WebElement AfterUpdateButton;
	
    @FindBy(how=How.XPATH,using="//div[text()=' Akash123']")
	private WebElement UpdateIdText;
	
    @FindBy(how=How.XPATH,using="//div[@aria-label='Principal, selected ,Select Subrole']")
	private WebElement SubRole;
	
	@FindBy(how=How.XPATH,using="//span[text()='Principal']")
	private WebElement principle;
	
	@FindBy(how=How.XPATH,using="//button[text()='Submit ']")
	private WebElement PersonalDetailSubmitButton;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='Back']")
	private WebElement BackButton;
	
	@FindBy(how=How.XPATH,using="//span[text()='Amravati']")
	private WebElement Amravati;
	
	
	@FindBy(how=How.XPATH,using="//div[text()=' Amravati ']")
	private WebElement TextAmravati;
	
	@FindBy(how=How.XPATH,using=" //div[text()=' Teacher']")
	private WebElement Teacherprofile;
	
	@FindBy(how=How.XPATH,using=" //button[@class='sb-btn sb-btn-normal sb-btn-primary']")
	private WebElement   BMCSubmit;
	
	@FindBy(how=How.XPATH,using="(//div[@role='list'])[1]")
	private WebElement guestRole;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Submit ']")
	private WebElement ProfileSubmitbutton;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Add another user ']")
	private WebElement AddMUATab;
	
	public WebElement getAddMUATab() {
		return AddMUATab;
	}
	
	public WebElement getProfileSubmitbutton() {
		return ProfileSubmitbutton;
	}
	
	public WebElement getguestRole() {
		return guestRole;
	}
	
	public WebElement getBMCSubmit() {
		return BMCSubmit;
	}
	
	
	public WebElement getTeacherprofile() {
		return Teacherprofile;
	}
	
	public WebElement getAmravati() {
		return Amravati;
	}


	public WebElement getTextAmravati() {
		return TextAmravati;
	}

	public WebElement headerDropdown() {
		return headerDropdown;
	}


	public WebElement getProfilebutton() {
		return profilebutton;
	}

	public void setProfilebutton(WebElement profilebutton) {
		this.profilebutton = profilebutton;
	}

	public WebElement getLocationeditbutton() {
		return locationeditbutton;
	}

	public void setLocationeditbutton(WebElement locationeditbutton) {
		this.locationeditbutton = locationeditbutton;
	}

	public WebElement getRole() {
		return Role;
	}

	public void setRole(WebElement role) {
		Role = role;
	}

	public WebElement getParent() {
		return parent;
	}

	public void setParent(WebElement parent) {
		this.parent = parent;
	}

	public WebElement getHTOfficial() {
		return HTOfficial;
	}

	public void setHTOfficial(WebElement hTOfficial) {
		HTOfficial = hTOfficial;
	}

	public WebElement getteacher() {
		return teacher;
	}

	public void setTeacher(WebElement teacher) {
		this.teacher = teacher;
	}

	public WebElement getStudent() {
		return student;
	}

	public void setStudent(WebElement student) {
		this.student = student;
	}

	public WebElement getState() {
		return State;
	}

	public void setState(WebElement state) {
		State = state;
	}

	public WebElement getAndhraPradesh() {
		return AndhraPradesh;
	}

	public void setAndhraPradesh(WebElement andhraPradesh) {
		AndhraPradesh = andhraPradesh;
	}

	public WebElement getDistrict() {
		return District;
	}

	public void setDistrict(WebElement district) {
		District = district;
	}

	public WebElement getDistrictAlluriSitaRamaRaju() {
		return DistrictAlluriSitaRamaRaju;
	}

	public void setDistrictAlluriSitaRamaRaju(WebElement districtAlluriSitaRamaRaju) {
		DistrictAlluriSitaRamaRaju = districtAlluriSitaRamaRaju;
	}

	public WebElement getTextParent() {
		return TextParent;
	}

	public void setTextParent(WebElement textParent) {
		TextParent = textParent;
	}

	public WebElement getTextDistrict() {
		return TextDistrict;
	}

	public void setTextDistrict(WebElement textDistrict) {
		TextDistrict = textDistrict;
	}

	public WebElement getTextAP() {
		return TextAP;
	}

	public void setTextAP(WebElement textAP) {
		TextAP = textAP;
	}

	public WebElement getLocationSubmitButton() {
		return LocationSubmitButton;
	}

	public void setLocationSubmitButton(WebElement locationSubmitButton) {
		LocationSubmitButton = locationSubmitButton;
	}

	public WebElement getBMCeditbutton() {
		return BMCeditbutton;
	}

	public void setBMCeditbutton(WebElement bMCeditbutton) {
		BMCeditbutton = bMCeditbutton;
	}

	public WebElement getBoard() {
		return Board;
	}

	public void setBoard(WebElement board) {
		Board = board;
	}

	public WebElement getCbsc() {
		return Cbsc;
	}

	public void setCbsc(WebElement cbsc) {
		Cbsc = cbsc;
	}

	public WebElement getCbscTab() {
		return CbscTab;
	}

	public void setCbscTab(WebElement cbscTab) {
		CbscTab = cbscTab;
	}

	public WebElement getIGOT_Health() {
		return IGOT_Health;
	}

	public void setIGOT_Health(WebElement iGOT_Health) {
		IGOT_Health = iGOT_Health;
	}

	public WebElement getMedium() {
		return Medium;
	}

	public void setMedium(WebElement medium) {
		Medium = medium;
	}

	public WebElement getHindi() {
		return Hindi;
	}

	public void setHindi(WebElement hindi) {
		Hindi = hindi;
	}

	public WebElement getEnglish() {
		return English;
	}

	public void setEnglish(WebElement english) {
		English = english;
	}

	public WebElement getGujarati() {
		return Gujarati;
	}

	public void setGujarati(WebElement gujarati) {
		Gujarati = gujarati;
	}

	public WebElement getClasss() {
		return Classs;
	}

	public void setClasss(WebElement classs) {
		Classs = classs;
	}

	public WebElement getPharmacist() {
		return Pharmacist;
	}

	public void setPharmacist(WebElement pharmacist) {
		Pharmacist = pharmacist;
	}

	public WebElement getClass4() {
		return Class4;
	}

	public void setClass4(WebElement class4) {
		Class4 = class4;
	}

	public WebElement getClass2() {
		return class2;
	}

	public void setClass2(WebElement class2) {
		this.class2 = class2;
	}

	public WebElement getTextCbsc() {
		return TextCbsc;
	}

	public void setTextCbsc(WebElement textCbsc) {
		TextCbsc = textCbsc;
	}

	public WebElement getTextEnglish() {
		return TextEnglish;
	}

	public void setTextEnglish(WebElement textEnglish) {
		TextEnglish = textEnglish;
	}

	public WebElement getTextClass2() {
		return TextClass2;
	}

	public void setTextClass2(WebElement textClass2) {
		TextClass2 = textClass2;
	}

	public WebElement getSubmitDetails() {
		return SubmitDetails;
	}

	public void setSubmitDetails(WebElement submitDetails) {
		SubmitDetails = submitDetails;
	}

	public WebElement getInstitutionTab() {
		return InstitutionTab;
	}

	public void setInstitutionTab(WebElement institutionTab) {
		InstitutionTab = institutionTab;
	}

	public WebElement getId() {
		return Id;
	}

	public void setId(WebElement id) {
		Id = id;
	}

	public WebElement getSubmitDetailCheckbox() {
		return SubmitDetailCheckbox;
	}

	public void setSubmitDetailCheckbox(WebElement submitDetailCheckbox) {
		SubmitDetailCheckbox = submitDetailCheckbox;
	}

	public WebElement getBeforeUpdateButton() {
		return BeforeUpdateButton;
	}

	public void setBeforeUpdateButton(WebElement beforeUpdateButton) {
		BeforeUpdateButton = beforeUpdateButton;
	}

	public WebElement getAfterUpdateButton() {
		return AfterUpdateButton;
	}

	public void setAfterUpdateButton(WebElement afterUpdateButton) {
		AfterUpdateButton = afterUpdateButton;
	}

	public WebElement getUpdateIdText() {
		return UpdateIdText;
	}

	public void setUpdateIdText(WebElement updateIdText) {
		UpdateIdText = updateIdText;
	}

	public WebElement getSubRole() {
		return SubRole;
	}

	public void setSubRole(WebElement subRole) {
		SubRole = subRole;
	}

	public WebElement getPrinciple() {
		return principle;
	}

	public void setPrinciple(WebElement principle) {
		this.principle = principle;
	}

	public WebElement getPersonalDetailSubmitButton() {
		return PersonalDetailSubmitButton;
	}

	public void setPersonalDetailSubmitButton(WebElement personalDetailSubmitButton) {
		PersonalDetailSubmitButton = personalDetailSubmitButton;
	}

	public WebElement getBackButton() {
		return BackButton;
	}

	public void setBackButton(WebElement backButton) {
		BackButton = backButton;
	}
	
	
	
	
	
	
	
	
	
	
}
