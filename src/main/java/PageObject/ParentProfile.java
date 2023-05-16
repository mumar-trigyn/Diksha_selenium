package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ParentProfile {

	@FindBy(how=How.XPATH,using="//img[@alt='Parent']")
	private WebElement parent;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;

	public WebElement getParent() {
		return parent;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}
}
