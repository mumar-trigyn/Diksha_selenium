package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentProfile {

	@FindBy(how=How.XPATH,using="//img[@alt='Student']")
	private WebElement StudentIcon;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;

	public WebElement getStudentIcon() {
		return StudentIcon;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}
	
}
