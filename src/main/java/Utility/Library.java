package Utility;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObject.BMCPopup;
import PageObject.ParentProfile;
import PageObject.SchoolHeadProfile;
import PageObject.TeacherProfile;
import lombok.var;

public class Library  {
 
	static ExtentTest test;
	public static WebDriver driver;

     public static void custom_click(WebElement element,String Fieldname) {
    	 
    	 try
    	 {
    		   element.click();
    		   test.log(Status.PASS, " Succesfully Clicked On "+ Fieldname);
    	 }catch(Exception e) {
    		 test.log(Status.FAIL,e.getMessage());
    	 }
     }
     
 public static void custom_sendkeys(WebElement element,String value,String fieldname) {
    	 
    	 try
    	 {
    		   element.sendKeys(value);
    		   test.log(Status.PASS, value + "Value Succesfully send "+ fieldname );
    		    }catch(Exception e) {
    		    	test.log(Status.FAIL,e.getMessage());
    		
    	 }
 }
    		   public static void explicitWait(WebDriver driver, Duration timeout, ExpectedCondition condition) {
    		     WebDriverWait wait = new WebDriverWait(driver, timeout);
    		      wait.until(condition);
    		    }
}
 

 

 
 
 
 
 
 

