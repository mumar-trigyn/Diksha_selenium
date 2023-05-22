package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Log;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.ExplorePage;
import pageObject.LoginPage;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	public static WebDriverWait wait;
	public static ExtendReportGenerator reporter;
	
	@BeforeClass
	public void BS() throws Exception {
		
		 config=new ConfigDataProvider();
		  excel=new ExcelDataProvider();
		  
	}
	
	
	@BeforeMethod
	public void Open() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(config.get_Env());
	    driver.manage().window().maximize();
//	    WebElement Explorebutton=driver.findElement(By.xpath("//button[@data-translate='btnExploreDiksha']"));
//	    Explorebutton.click();
	   
	      		
	    ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
	    explore.getExplorebutton().click();
	}


	//@AfterMethod	
	
	public void Close() {
		driver.close();
		
	}
	
}
