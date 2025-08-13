package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readDatadfromPropertiesFile {
Properties prop;
	
	public readDatadfromPropertiesFile()
	{
		FileReader fr = null;
		try {
			fr = new FileReader("C:/Users/eryog/eclipse-workspace/Automation_FrameWork/Configuration/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop=new Properties();
		
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getapplicationurl()
	{
		String baseurl=prop.getProperty("baseurl");
		return baseurl;
		
		
	}
	public String getusername()
	{
		String username=prop.getProperty("username");
		return username;
		
		
	}
	public String getpassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
}
