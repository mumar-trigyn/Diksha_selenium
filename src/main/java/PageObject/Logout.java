package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logout {
	@FindBy(how=How.XPATH,using="//a[text()=' Digital textbooks ']")
	private WebElement digitaltextbooktab;
	
	@FindBy(how=How.XPATH,using="(//div[text()=' C '])[2]")
	private WebElement creatorIcon;
	
	@FindBy(how=How.XPATH,using="//li[text()=' Logout ']")
	private WebElement logout;

	public WebElement getDigitaltextbooktab() {
		return digitaltextbooktab;
	}

	public void setDigitaltextbooktab(WebElement digitaltextbooktab) {
		this.digitaltextbooktab = digitaltextbooktab;
	}

	public WebElement getCreatorIcon() {
		return creatorIcon;
	}

	public void setCreatorIcon(WebElement creatorIcon) {
		this.creatorIcon = creatorIcon;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
	
}
