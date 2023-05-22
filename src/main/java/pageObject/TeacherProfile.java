package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TeacherProfile {

	
	@FindBy(how=How.XPATH,using="//img[@alt='Teacher']")
	private WebElement Teacher;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;

	public WebElement getTeacher() {
		return Teacher;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}
	
}
