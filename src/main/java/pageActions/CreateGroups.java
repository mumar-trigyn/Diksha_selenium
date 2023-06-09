package pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.Groups;
import utility.BaseClass;
import utility.DikshaUtils;

public class CreateGroups extends BaseClass {
  
	public static void UserIsAbleTOCreateNewGroupsAndVerify() throws Exception {
		
		Groups groups=PageFactory.initElements(driver, Groups.class);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(groups.getMyGropus());
		DikshaUtils.waitToBeClickableAndClick(groups.getCrossTab());
		DikshaUtils.waitToBeClickableAndClick(groups.getBeforeCreateGroupsButton());
		DikshaUtils.waitToBeClickableAndClick(groups.getGroupName());
		String Groupname=DikshaUtils.set_Content_Name("GroupName_");
		groups.getGroupName().sendKeys(Groupname);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getIAgreeCheckbox());
		DikshaUtils.waitToBeClickableAndClick(groups.getAfterCreateGroupsButton());
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getSelectgroup());
		DikshaUtils.waitToBeClickableAndClick(groups.getAddActivity());
		DikshaUtils.waitToBeClickableAndClick(groups.getDigitalTextbook());
		DikshaUtils.waitToBeClickableAndClick(groups.getOverTheBook());
//		 Actions actions = new Actions(driver);
//		 actions.moveToElement(groups.getOverTheBook()).perform();
		DikshaUtils.waitToBeVisibleAndClick(groups.getSelectBook());
		
		System.out.println("Group Created and Successfully TextBook Added");
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getAddMember());
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(groups.getIdCrossTab());
		DikshaUtils.waitToBeClickableAndClick(groups.getSearchId());
		Thread.sleep(1000);
		groups.getSearchId().sendKeys("creatorprod_uvae");
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getVerifyId());
		DikshaUtils.waitToBeVisibleAndClick(groups.getIdSelected());
		
		System.out.println("Member Added Successfully");
		
		
	}
	
	public static void VerifyUserDisplayedEnableDiscussionsOption() throws Exception {
		
		Groups groups=PageFactory.initElements(driver, Groups.class);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(groups.getMyGropus());
		DikshaUtils.waitToBeClickableAndClick(groups.getCrossTab());
		DikshaUtils.waitToBeClickableAndClick(groups.getBeforeCreateGroupsButton());
		DikshaUtils.waitToBeClickableAndClick(groups.getGroupName());
		String Groupname=DikshaUtils.set_Content_Name("GroupName_");
		groups.getGroupName().sendKeys(Groupname);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getIAgreeCheckbox());
		DikshaUtils.waitToBeClickableAndClick(groups.getAfterCreateGroupsButton());
		Thread.sleep(2000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getSelectgroup());
		DikshaUtils.waitToBeVisibleAndClick(groups.getkababmenu());
		Thread.sleep(1000);
		Assert.assertTrue(groups.getEnableOption().isDisplayed());
		System.out.println("Enabled discussion option is Displayed");
		
		DikshaUtils.waitToBeVisibleAndClick(groups.getEnableOption());
        Actions act = new Actions(driver);
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getForumOption());
		Thread.sleep(1000);
		
		Assert.assertTrue(groups.getCategories().isDisplayed());
		Assert.assertTrue(groups.getTags().isDisplayed());
		Assert.assertTrue(groups.getMyDiscussion().isDisplayed());
		
		Thread.sleep(1000);
		
		DikshaUtils.waitToBeVisibleAndClick(groups.getMyDiscussion());
		Thread.sleep(1000);
		Assert.assertTrue(groups.getRecentposts().isDisplayed());
		Assert.assertTrue(groups.getBestposts().isDisplayed());
		Assert.assertTrue(groups.getSavedposts().isDisplayed());
		Assert.assertTrue(groups.getUpvoted().isDisplayed());
		Assert.assertTrue(groups.getDownvoted().isDisplayed());
		
		
		
	}
	
	public static void VerifyUserDisplayedDisableDiscussionsOption() throws Exception {
		
		
Groups groups=PageFactory.initElements(driver, Groups.class);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(groups.getMyGropus());
		DikshaUtils.waitToBeClickableAndClick(groups.getCrossTab());
		DikshaUtils.waitToBeClickableAndClick(groups.getBeforeCreateGroupsButton());
		DikshaUtils.waitToBeClickableAndClick(groups.getGroupName());
		String Groupname=DikshaUtils.set_Content_Name("GroupName_");
		groups.getGroupName().sendKeys(Groupname);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getIAgreeCheckbox());
		DikshaUtils.waitToBeClickableAndClick(groups.getAfterCreateGroupsButton());
		Thread.sleep(2000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getSelectgroup());
		DikshaUtils.waitToBeVisibleAndClick(groups.getkababmenu());
		Thread.sleep(1000);
		Assert.assertTrue(groups.getEnableOption().isDisplayed());
		System.out.println("Enabled discussion option is Displayed");
		
		DikshaUtils.waitToBeVisibleAndClick(groups.getEnableOption());
        Actions act = new Actions(driver);
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getkababmenu());
		DikshaUtils.waitToBeVisibleAndClick(groups.getDisableOption());
		DikshaUtils.waitToBeVisibleAndClick(groups.getDisableOptionPopup());
//		Thread.sleep(2000);
//		boolean ForumOptionNotDisplayed = !groups.getForumOption().isDisplayed();
//		if (ForumOptionNotDisplayed) {
//            System.out.println("Element is not displayed on the page.");
//		}
//		else {
//             System.out.println("Element is displayed on the page.");
//        }
//		Thread.sleep(2000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getkababmenu());
		DikshaUtils.waitToBeVisibleAndClick(groups.getEnableOption());
			
		
	}
	
	public static void VerifyCloseOptionIsDisplayed() throws Exception {
		
Groups groups=PageFactory.initElements(driver, Groups.class);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(groups.getMyGropus());
		DikshaUtils.waitToBeClickableAndClick(groups.getCrossTab());
		DikshaUtils.waitToBeClickableAndClick(groups.getBeforeCreateGroupsButton());
		DikshaUtils.waitToBeClickableAndClick(groups.getGroupName());
		String Groupname=DikshaUtils.set_Content_Name("GroupName_");
		groups.getGroupName().sendKeys(Groupname);
		
		DikshaUtils.waitToBeClickableAndClick(groups.getIAgreeCheckbox());
		DikshaUtils.waitToBeClickableAndClick(groups.getAfterCreateGroupsButton());
		Thread.sleep(2000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getSelectgroup());
		DikshaUtils.waitToBeVisibleAndClick(groups.getkababmenu());
		Thread.sleep(1000);
		Assert.assertTrue(groups.getEnableOption().isDisplayed());
		System.out.println("Enabled discussion option is Displayed");
		
		DikshaUtils.waitToBeVisibleAndClick(groups.getEnableOption());
        Actions act = new Actions(driver);
		act.moveByOffset(50, 100).click().build().perform();
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getForumOption());
		Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(groups.getDiscussionCloseButton());
		System.out.println("Successfully clicked on Close Button");
		Thread.sleep(1000);
		Assert.assertTrue(groups.getAddActivity().isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
