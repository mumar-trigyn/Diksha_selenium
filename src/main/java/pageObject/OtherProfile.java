package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OtherProfile {

	@FindBy(how=How.XPATH,using="//img[@alt='Parent']")
	private WebElement other;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;

	public WebElement getOther() {
		return other;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}
	
}
