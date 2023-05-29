package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BMCPopup {

	@FindBy(how=How.XPATH,using="//mat-form-field[@id='board']")
	private WebElement Board;
	
	@FindBy(how=How.XPATH,using="//mat-option[@aria-label='CBSE/NCERT']")
	private WebElement Cbsc;
	//span[text()='CBSE']
	//mat-option[@aria-label='CBSE/NCERT']
	
	@FindBy(how=How.XPATH,using="//mat-form-field[@id='medium']")
	private WebElement Medium;
	
	@FindBy(how=How.XPATH,using="(//span[text()='English'])[2]")
	private WebElement English;
	
	
    @FindBy(how=How.XPATH,using="//span[text()='Hindi']")
	private WebElement Hindi;
	
	@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']")
	private WebElement Classs;
	
	@FindBy(how=How.XPATH,using=" //*[contains(@aria-label,'Class 1')]//following::span[2]")
	private WebElement  Class2;
	
	@FindBy(how=How.XPATH,using="//mat-option[@aria-label='Class 4']")
	private WebElement Class4;
	
	@FindBy(how=How.XPATH,using=" //button[@class='sb-btn sb-btn-normal sb-btn-primary']")
	private WebElement   BMCSubmit;

	public WebElement getClass4() {
		return Class4;
	}
	
	public WebElement getHindi() {
		return Hindi;
	}
	
	
	public WebElement getBoard() {
		return Board;
	}

    public WebElement getCbsc() {
		return Cbsc;
	}

	public WebElement getMedium() {
		return Medium;
	}

	public WebElement getEnglish() {
		return English;
	}

	public WebElement getClasss() {
		return Classs;
	}

    public WebElement getClass2() {
		return Class2;
	}

	public WebElement getBMCSubmit() {
		return BMCSubmit;
	}	
	
}
