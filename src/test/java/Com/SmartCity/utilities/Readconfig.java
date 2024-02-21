package Com.SmartCity.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
   Properties pro;
	public Readconfig() {
		File src =new File("/home/iram/Desktop/KohimaEMS/KohimaEMS/Configurations/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
			
		}
	}
	public String getApplicationURL() {
		
		String url =pro.getProperty("Baseurl");
		return url;
	}
	
public String getUserName() {
		
		String username = pro.getProperty("UserName");
		return username;
		
	}
public String getpassword() {
		
		String password = pro.getProperty("password");
		return password;
	
}
/*public String getcommand() {
	String command = pro.getProperty("aqicommand");
	return command;
}*/
}
