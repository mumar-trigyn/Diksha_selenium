package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateBook {
	
	@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
	private WebElement headerDropdown;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Workspace')]")
	private WebElement Workspace;
	
	@FindBy(how=How.XPATH,using="//div[@class='content']/..//span[.='Book']")
	private WebElement book;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement bookname;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Start creating')]")
	private WebElement startCreating;

	public WebElement getHeaderDropdown() {
		return headerDropdown;
	}

	public WebElement getWorkspace() {
		return Workspace;
	}

	public WebElement getBook() {
		return book;
	}


	public WebElement getBookname() {
		return bookname;
	}


	public WebElement getStartCreating() {
		return startCreating;
	}
	
	

}
