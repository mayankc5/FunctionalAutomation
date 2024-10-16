package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Homepage;
import pageobjects.Webtablepage;
import utility.Readconfig;

public class Base {
	
	 public static WebDriver driver;
	
	 Homepage homeObj=new Homepage();
	 Webtablepage webObj=new Webtablepage();
	 String drivertypes;
	 Readconfig confreader=null;
	 
	 public WebDriver setUP() throws IOException  {
			
			confreader=new Readconfig();
			drivertypes=confreader.getBrowser();
			//envtypes=confreader.getEnvironment();
			if(driver==null) driver=createDriver();
			
			return driver;
			
		}
		
		
		public WebDriver createDriver() {
			
			switch (drivertypes) {
			case "Chrome":driver=new ChromeDriver();
			 driver.get("https://demoqa.com/text-box");
	 	     driver.manage().window().maximize();
 	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
				break;

			default:
				break;
			}
			
			return driver;
		}
	 
		@AfterClass
	  public void tearDown() {
		  driver.quit();
		 
	  }

}
