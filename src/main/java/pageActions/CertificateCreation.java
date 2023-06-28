package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObject.CourseConsumption;
import pageObject.CreateCertificate;
import pageObject.Logout;
import utility.BaseClass;
import utility.DikshaUtils;

public class CertificateCreation extends BaseClass  {

	
	public static void AddCompletionCertificateToCourse() throws Exception {
		
		
		CreateCertificate certificate=PageFactory.initElements(driver, CreateCertificate.class);
		
		
		DikshaUtils.waitToBeClickableAndClick(certificate.getAddCertificateTab());
		Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",certificate.getBeforeAddCertificateTab());
		 js.executeScript("window.scrollBy(0, 500)");
		 Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(certificate.getBeforeAddCertificateTab());
	    DikshaUtils.waitToBeClickableAndClick(certificate.getCertificateRuleTab());
	    DikshaUtils.waitToBeClickableAndClick(certificate.getAllTab());
		
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectCheckbox());
	    Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(certificate.getOverTheCertificateTemplate()).perform();

	 // DikshaUtils.waitToBeVisibleAndClick(certificate.getOverTheCertificateTemplate());
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectCertificateTemplate());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectTemplate());
		
	    js.executeScript("arguments[0].scrollIntoView(true);",certificate.getFinalAddCertificateTab());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(certificate.getFinalAddCertificateTab());
		
		 Thread.sleep(1000);
		 WebElement CertificateAdded= driver.findElement(By.xpath("//strong[text()='Certificate added successfully']"));
         String ContentsuccessfullySavedPopup = CertificateAdded.getText();
         Assert.assertEquals(ContentsuccessfullySavedPopup, "Certificate added successfully");
         Thread.sleep(1000);
		 
		 
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(certificate.getCertificatePageBackButton());
		 DikshaUtils.waitToBeClickableAndClick(certificate.getBackButton());
	}
	
		
	public static void UserAbleToSeeCeritificateCriteriaAndBatchDetailsInCourseTOC(String coursename) throws Exception {
		
		
		CourseConsumption cc=PageFactory.initElements(driver, CourseConsumption.class);
		Logout log = PageFactory.initElements(driver, Logout.class);
		CreateCertificate certificate=PageFactory.initElements(driver, CreateCertificate.class);
	
		Thread.sleep(7000);
		

	     DikshaUtils.waitToBeVisibleAndClick(log.getDigitaltextbooktab());
		DikshaUtils.waitToBeClickableAndClick(cc.getSearchtextfield());
		cc.getSearchtextfield().sendKeys(coursename);
	    DikshaUtils.waitToBeClickableAndClick(cc.getSearchbutton());
	    Thread.sleep(2000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getSearchedcourse());
	    DikshaUtils.waitToBeClickableAndClick(cc.getJoincourse());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(cc.getConsentcheckbox());
		Thread.sleep(2000);
		DikshaUtils.waitToBeClickableAndClick(cc.getShareButton());
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(certificate.getCertificateCriteriaTab());
		Thread.sleep(1000);
		
		certificate.getCertificateCriteriaInfo().isDisplayed();
		Thread.sleep(1000);
		
		certificate.getBatchDetailTab().isDisplayed();
		Thread.sleep(1000);
		DikshaUtils.waitToBeClickableAndClick(certificate.getBatchDetailTab());
		
		
	}
	public static void AddMeritCertificateToCourse() throws Exception {
		
  CreateCertificate certificate=PageFactory.initElements(driver, CreateCertificate.class);
		
		
		DikshaUtils.waitToBeClickableAndClick(certificate.getAddCertificateTab());
		Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",certificate.getBeforeAddCertificateTab());
		 js.executeScript("window.scrollBy(0, 500)");
		 Thread.sleep(1000);
		DikshaUtils.waitToBeVisibleAndClick(certificate.getBeforeAddCertificateTab());
	    DikshaUtils.waitToBeClickableAndClick(certificate.getCertificateRuleTab());
	    DikshaUtils.waitToBeClickableAndClick(certificate.getAllTab());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getPlusIcon());
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectCriteria());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(certificate.getPercentCriteriaSelected());
		
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectCheckbox());
	    Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(certificate.getOverTheCertificateTemplate()).perform();
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectCertificateTemplate());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeVisibleAndClick(certificate.getSelectTemplate());
		
	    js.executeScript("arguments[0].scrollIntoView(true);",certificate.getFinalAddCertificateTab());
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(certificate.getFinalAddCertificateTab());
		
		 Thread.sleep(1000);
		 WebElement CertificateAdded= driver.findElement(By.xpath("//strong[text()='Certificate added successfully']"));
         String ContentsuccessfullySavedPopup = CertificateAdded.getText();
         Assert.assertEquals(ContentsuccessfullySavedPopup, "Certificate added successfully");
         Thread.sleep(1000);
		 
		 
		 js.executeScript("window.scrollTo(0, 0)");
		 Thread.sleep(1000);
		 DikshaUtils.waitToBeClickableAndClick(certificate.getCertificatePageBackButton());
		 DikshaUtils.waitToBeClickableAndClick(certificate.getBackButton());
	
	
		
		
	}
}
