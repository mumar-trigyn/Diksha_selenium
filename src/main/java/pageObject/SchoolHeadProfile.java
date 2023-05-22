package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SchoolHeadProfile {

	@FindBy(how=How.XPATH,using="//img[@alt='School head OR Officials']")
	private WebElement schoolhead;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;

	public WebElement getSchoolhead() {
		return schoolhead;
	}
	
	public WebElement getContinueButton() {
		return ContinueButton;
	}	
}
