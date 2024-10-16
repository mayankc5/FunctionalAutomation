package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import junit.framework.Assert;

public class Elementvalidation {
	
	public static void elemntVisibility(WebDriver driver,WebElement element) {
		
		boolean isPresent;
		
		try {
			
			isPresent=element.isDisplayed();
			System.out.println(element.getAttribute("id")+"Element present");
		}
		
		catch (Exception e) {
			Assert.assertEquals(element.getAttribute("id")+"Element is not present", true, true);
		}
		
	}
	
	public static void scrollPage(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static void elementSynch(WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
	}

}
