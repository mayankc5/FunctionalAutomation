package pageobjects;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Base;
import utility.Elementvalidation;

public class Homepage {
	
	public WebDriver driver;
	
	By fullname=By.xpath("//input[@id='userName']");
	By email=By.xpath("//input[@id='userEmail']");
	By curraddress=By.xpath("//textarea[@id='currentAddress']");
	By permaddress=By.xpath("//textarea[@id='permanentAddress']");
	By submitBtn=By.xpath("//button[@id='submit']");
	By name_verify=By.xpath("//p[@id='name']");
	By email_verify=By.xpath("//p[@id='email']");
	By curradd_verify=By.xpath("//p[@id='currentAddress']");
	By permadd_verify=By.xpath("//p[@id='permanentAddress']");

//	public Homepage(WebDriver driver) {
//		
//		this.driver=driver;
//	
//	}
//	
	public void fillTextScreenData(String userfullname,String useremail,String usercurrAddr,String userpermAddr) {
		Elementvalidation.elemntVisibility(Base.driver,(Base.driver.findElement(fullname)));
		Base.driver.findElement(fullname).sendKeys(userfullname);
		Base.driver.findElement(email).sendKeys(useremail);
		Base.driver.findElement(curraddress).sendKeys(usercurrAddr);
		Base.driver.findElement(permaddress).sendKeys(userpermAddr);
		JavascriptExecutor js=(JavascriptExecutor)Base.driver;
		js.executeScript("arguments[0].scrollIntoView(true);",Base.driver.findElement(submitBtn));
		Base.driver.findElement(submitBtn).click();

		
	}
	
	public void validateTextScreendata() {
		String name=Base.driver.findElement(name_verify).getText();
		System.out.println(name);
		
	}
	

}
