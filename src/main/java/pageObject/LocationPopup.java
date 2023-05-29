package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationPopup {
	
	@FindBy(how=How.XPATH,using="//input[@id='name']")
	private WebElement guestNameTextField;

	@FindBy(how=How.XPATH,using="//*[@id=\"persona\"]/div[1]")
	private WebElement Role;
	
	@FindBy(how=How.XPATH,using="//*[@id='state']/div[1]")
	private WebElement State;
	
	@FindBy(how=How.XPATH,using="//*[@id='state']//span[text()='Maharashtra']")
	private WebElement MaharashtraState;
	
	@FindBy(how=How.XPATH,using="//*[@id='district']/div[1]")
	private WebElement District;
	
	@FindBy(how=How.XPATH,using="//span[text()='Akola']")
	private WebElement AkolaDistrict;
	
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement SubmitButton;
	//ngx-avatar[@title='Welcome Guest, Click here to continue to your profile']
	
	@FindBy(how=How.XPATH,using="//ngx-avatar[@title='Welcome Guest, Click here to continue to your profile']")
	private WebElement Guesticon;
	
	
	
	
	public WebElement getGuestNameTextField() {
		return guestNameTextField;
	}



	public WebElement getGuesticon() {
		return Guesticon;
	}
	
	
	public WebElement getRole() {
		return Role;
	}
	
	
	public WebElement getState() {
		return State;
	}

	public WebElement getMaharashtraState() {
		return MaharashtraState;
	}

	public WebElement getDistrict() {
		return District;
	}

	public WebElement getAkolaDistrict() {
		return AkolaDistrict;
	}
	
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
}
