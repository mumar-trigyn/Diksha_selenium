package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.XPATH,using="//a[text()=' Home ']")
	private WebElement HomeTab;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Observation ']")
	private WebElement ObservationTab;
	
	@FindBy(how=How.XPATH,using="//button[text()='CHANGE PREFERENCE']")
	private WebElement ChnagePreferences;
	
	@FindBy(how=How.XPATH,using="//span[text()='CBSE/NCERT']")
	private WebElement TextCbsc;
	
	
	@FindBy(how=How.XPATH,using="(//span[text()='English'])[2]")
	private WebElement TextEnglish;	
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Class 2']")
	private WebElement TextClass2;


	public WebElement getHomeTab() {
		return HomeTab;
	}

	public WebElement getObservationTab() {
		return ObservationTab;
	}

	public WebElement getChnagePreferences() {
		return ChnagePreferences;
	}



	public WebElement getTextCbsc() {
		return TextCbsc;
	}




	public WebElement getTextEnglish() {
		return TextEnglish;
	}



	public WebElement getTextClass2() {
		return TextClass2;
	}


	
}
