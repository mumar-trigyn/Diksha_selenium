package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.BMCPopup;
public class DikshaUtils extends BaseClass {

	
	
	
	public static String generate_Do_id() {
		
		
		String currentUrl = driver.getCurrentUrl(); 
        String do_id ="do_";
        
        int startIndex = currentUrl.indexOf(do_id);
        String parsedString = currentUrl.substring(startIndex);
     
        String end_id ="/";
        int endIndex = parsedString.indexOf(end_id);
        
        endIndex =startIndex+endIndex;
        
        String  DO_ID=currentUrl.substring(startIndex, endIndex);
        
        return DO_ID;
		
	}

	public static String set_Content_Name(String type){
		
	String content_name=type+RandomStringUtils.randomAlphabetic(6);
		
		return content_name;
	}
	
	public static void pdf_page_Count() {
		
		String pdfFilePath = "System.getProperty(\"user.dir\")+\"\\src\\main\\resources\\pdf_13.pdf\")";

        try {
            // Load the PDF document
            PDDocument document = PDDocument.load(new File(pdfFilePath));
            
            // Get the number of pages in the PDF
            int pageCount = document.getNumberOfPages();
            
            // Print the number of pages
            System.out.println("Number of Pages: " + pageCount);
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    
}
	
	public static WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

	public static WebElement waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	public static void waitToBeVisibleAndClick(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
       
    }

	public static void waitToBeClickableAndClick(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
		
    }
	
	public static void waitToBeVisibleAndSendKeys(WebElement element,String value) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
       
        
    }

	public static void waitToBeClickableAndSendKeys(WebElement element, String value) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);
        
    }
	
}





	
	
	

