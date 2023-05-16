package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAsCustodian {

	@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
	private WebElement headerDropdown;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Login ']")
	private WebElement logintab;
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@id='login']")
	private WebElement login;

	public WebElement getHeaderDropdown() {
		return headerDropdown;
	}

	public WebElement getLogintab() {
		return logintab;
	}

	public void setLogintab(WebElement logintab) {
		this.logintab = logintab;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public void setHeaderDropdown(WebElement headerDropdown) {
		this.headerDropdown = headerDropdown;
	}
	
}
