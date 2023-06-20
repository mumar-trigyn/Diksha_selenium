package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CreateBook;
import pageObject.Published;
import pageObject.ResourcesPom;
import utility.BaseClass;
import utility.DikshaUtils;

public class PublishedMethods extends BaseClass {

	
public static void AddCollaboratorInPublished_eTextbook(String fullname) throws Exception {
		
	Published published=PageFactory.initElements(driver, Published.class);
	CreateBook create=PageFactory.initElements(driver, CreateBook.class);
	
	DikshaUtils.waitToBeClickableAndClick(published.getHeaderDropdown());
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",published.getWorkspace());
	Thread.sleep(1000);
	DikshaUtils.waitToBeClickableAndClick(published.getWorkspace());
	DikshaUtils.waitToBeClickableAndClick(published.getPublished());
	DikshaUtils.waitToBeClickableAndClick(published.getSearchForPublished());
	published.getSearchForPublished().sendKeys(fullname);
	DikshaUtils.waitToBeClickableAndClick(published.getSearchIcon());
	DikshaUtils.waitToBeClickableAndClick(published.getClickSearchContent());
	Thread.sleep(2000);
	
	DikshaUtils.waitToBeClickableAndClick(create.getAddCollaborator());
	DikshaUtils.waitToBeClickableAndSendKeys(create.getSearchCollaborator(),"democontentcreator1");
	Thread.sleep(1000);
	create.getSearchCollaborator().sendKeys(Keys.ENTER);
	DikshaUtils.waitToBeVisibleAndClick(create.getSelectDemoCollaborator());
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView(true);", create.getDoneButton());
	DikshaUtils.waitToBeVisibleAndClick(create.getDoneButton());
	Thread.sleep(2000);
	
	WebElement CollaboratorPopup= driver.findElement(By.xpath("//strong[text()='Collaborators updated successfully']"));
	String CollaboratorssuccessfullyPopup = CollaboratorPopup.getText();
	Assert.assertEquals(CollaboratorssuccessfullyPopup, "Collaborators updated successfully");
	Thread.sleep(1000);

	
}

public static void VerifyContentIsInPublishedBucket(String fullname) throws Exception {
	
	Published published=PageFactory.initElements(driver, Published.class);
	CreateBook create=PageFactory.initElements(driver, CreateBook.class);
	
	DikshaUtils.waitToBeClickableAndClick(published.getHeaderDropdown());
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",published.getWorkspace());
	Thread.sleep(1000);
	DikshaUtils.waitToBeClickableAndClick(published.getWorkspace());
	DikshaUtils.waitToBeClickableAndClick(published.getPublished());
	DikshaUtils.waitToBeClickableAndClick(published.getSearchForPublished());
	published.getSearchForPublished().sendKeys(fullname);
	DikshaUtils.waitToBeClickableAndClick(published.getSearchIcon());
	DikshaUtils.waitToBeClickableAndClick(published.getClickSearchContent());

	
	
	
	
	
	
	
	
	
	
	
}

















}
