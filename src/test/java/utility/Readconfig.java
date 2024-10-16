package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	FileInputStream fin=null;
	Properties prop;
	public Readconfig() throws IOException {
		
		try {
			prop=new Properties();
			String configpath=System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties";
			fin=new FileInputStream(configpath);
			prop.load(fin);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			fin.close();
		}
		
	}
	
	public String getAppURL() {
		String appurl=prop.getProperty("homepage");
		if(appurl!=null) return appurl;
		else throw new RuntimeException("Application URL is missing in config file");
					
	}
	
//	public String getEnvironment() {
//		String env=prop.getProperty("Environment");
//		if(env!=null) return env;
//		else throw new RuntimeException("Enviornment is missing in config file");
//					
//	}
	
	public String getBrowser() {
		String browser=prop.getProperty("browser");
		if(browser!=null) return browser;
		else throw new RuntimeException("Browser Type is missing in config file");
					
	}

}
