package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.AllMyContentBucket;
import pageObject.CourseCreation;
import utility.BaseClass;
import utility.DikshaUtils;

public class AllMyContentMethods extends BaseClass {

	public static void searchContent(String value) {
		
		CourseCreation content=PageFactory.initElements(driver, CourseCreation.class);
		AllMyContentBucket allContent= PageFactory.initElements(driver, AllMyContentBucket.class);
		
		DikshaUtils.waitToBeClickableAndClick(content.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(content.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(allContent.getAllMyContentTab());
		
		
		DikshaUtils.waitToBeClickableAndSendKeys(allContent.getSearchContentTextfield(), value);
		DikshaUtils.waitToBeClickableAndClick(allContent.getSearchButton());
		
		Assert.assertTrue(allContent.getSearchedContent().isDisplayed());

		
	}
	
	
}
