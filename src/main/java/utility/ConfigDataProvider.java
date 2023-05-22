package utility;

import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.markuputils.ExtentColor;

public class ConfigDataProvider extends BaseClass {

	Properties pro;
	String env = "";
	public ConfigDataProvider() throws Exception {

		String path = System.getProperty("user.dir") + "\\Config\\Config.Properties";

		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		pro.load(fis);

	}

	public String get_Env() {
		
		env= pro.getProperty("Env");
		String url="";	
		
		if(env.equalsIgnoreCase("PreProd")) {
			
		url= config.get_PreProd_app_url();
			
		}
		else if(env.equalsIgnoreCase("Prod")) {
			
			url=config.get_Prod_app_url();
		}
		return url;	
		
	 
	}

	public String get_PreProd_app_url() {

		return pro.getProperty("PreProd_app_url");

	}

	public String get_Prod_app_url() {

		return pro.getProperty("Prod_app_url");

	}

	public String get_PreProd_test_data() {

		return pro.getProperty("PreProd_test_data");
	}

	public String get_Prod_test_data() {

		return pro.getProperty("Prod_test_data");
	}

}
