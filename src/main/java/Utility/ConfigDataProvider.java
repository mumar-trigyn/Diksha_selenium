package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
	String path = System.getProperty("user.dir")+"\\Config\\Config.Properties";	
	
	FileInputStream fis =new  FileInputStream (path);
		 pro=new Properties();
		pro.load(fis);
		
		
	}
	
	public String get_preprod_url() {
		
		return pro.getProperty("preprod_url");
			
	}
	
	public  String get_sunbird_url() {
		
		return pro.getProperty("Sunbird_url");
		
	}
	public String get_preprod_data() {
		
		return pro.getProperty("preprod_data");
	}
	
       public String get_preprod() {
		
		return pro.getProperty("preprod");
	}
	
}
