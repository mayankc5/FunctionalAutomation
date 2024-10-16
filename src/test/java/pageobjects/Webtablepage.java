package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import steps.Base;
import utility.Elementvalidation;

public class Webtablepage {
	
public WebDriver driver;
	
	By actionBtn=By.xpath("//span[@id='edit-record-1']");
	By editScreen=By.xpath("//div[text()='Registration Form']");
	

	
	public void getWebTableData() {
		
		WebElement tRow=Base.driver.findElement(By.xpath("//div[@class='rt-tr -odd' and @role='row']/div[1]"));
		
		List<WebElement>  tCol=Base.driver.findElements(By.xpath("//div[@class='rt-tr -odd']/div[@class='rt-td']"));
		System.out.println(tCol.size());
		
		Elementvalidation.scrollPage(Base.driver,Base.driver.findElement(actionBtn));
		
		Base.driver.findElement(actionBtn).click();
		
	
	}
	public void editscreenValidation() {
		Elementvalidation.scrollPage(Base.driver,Base.driver.findElement(editScreen));
		Assert.assertEquals("Edit screent not displayed", Base.driver.findElement(editScreen).isDisplayed(), true);
		
	}
	

}
