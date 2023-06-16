package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FiltersInDiffrentTabs {

	@FindBy(how=How.XPATH,using="//a[text()=' Digital textbooks ']")
	private WebElement digitalTextbookTab;
	
	@FindBy(how=How.XPATH,using="//a[text()=' TV classes ']")
	private WebElement TvClassesTab;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Courses ']")
	private WebElement coursesTab;
	
	@FindBy(how=How.XPATH,using="//label[text()='Board']")
	private WebElement board;
	
	@FindBy(how=How.XPATH,using="//label[text()='Medium']")
	private WebElement medium;
	
	
	
	@FindBy(how=How.XPATH,using="//span[text()=' Hindi ']")
	private WebElement mediumhindi;
	
	@FindBy(how=How.XPATH,using="//span[text()=' English ']")
	private WebElement mediumenglish;
	
	@FindBy(how=How.XPATH,using="//label[text()='Class']")
	private WebElement classs;
	
	@FindBy(how=How.XPATH,using="//label[text()='Class']")
	private WebElement Selectclasss1;
	
	@FindBy(how=How.XPATH,using="//span[text()=' Class 2 ']")
	private WebElement Selectclasss2;
	
	public WebElement getMediumhindi() {
		return mediumhindi;
	}

	public void setMediumhindi(WebElement mediumhindi) {
		this.mediumhindi = mediumhindi;
	}

	public WebElement getMediumenglish() {
		return mediumenglish;
	}

	public void setMediumenglish(WebElement mediumenglish) {
		this.mediumenglish = mediumenglish;
	}

	public WebElement getSelectclasss1() {
		return Selectclasss1;
	}

	public void setSelectclasss1(WebElement selectclasss1) {
		Selectclasss1 = selectclasss1;
	}

	public WebElement getSelectclasss2() {
		return Selectclasss2;
	}

	public void setSelectclasss2(WebElement selectclasss2) {
		Selectclasss2 = selectclasss2;
	}

	@FindBy(how=How.XPATH,using="//label[text()='Subject']")
	private WebElement subject;
	
	@FindBy(how=How.XPATH,using="//label[text()='Published user type']")
	private WebElement Publishedusertype;

	public WebElement getDigitalTextbookTab() {
		return digitalTextbookTab;
	}

	public WebElement getTvClassesTab() {
		return TvClassesTab;
	}

	public WebElement getCoursesTab() {
		return coursesTab;
	}

	public WebElement getBoard() {
		return board;
	}

	public WebElement getMedium() {
		return medium;
	}

	public WebElement getClasss() {
		return classs;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getPublishedusertype() {
		return Publishedusertype;
	}
 
	
}
