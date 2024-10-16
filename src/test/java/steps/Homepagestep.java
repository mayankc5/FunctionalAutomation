package steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Homepage;
import pageobjects.Webtablepage;

public class Homepagestep extends Base {
	
	
	Base obj=new Base();
	@Given("I open toolsa portal")
	public void i_open_toolsa_portal() throws IOException {
	    obj.setUP();
		
	}

	@And("I navigate to textbox verification page")
	public void i_navigate_to_textbox_verification_page() {
	   
	}
	
	@When("I enter fullname as {string} email as {string} current address as {string} and permanent address as {string}")
	public void enterTextScreendata(String fullname, String email, String currAddr, String permAddr) {
		homeObj.fillTextScreenData(fullname,email,currAddr,permAddr);
	}

	
	@Then("I validate text verification")
	public void i_validate_text_verification() {
		homeObj.validateTextScreendata();
	}
	
	@AfterTest
	public void getScreenshotonFailure(Scenario scenario) {
		
		
		if(scenario.isFailed()) {
			
			final byte[] screenShots=((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShots, "image/png", scenario.getName());
			
		}
	}
	
	
	@Then("I close application")
	public void closeApp() {
		tearDown();
	}
	
//	@Test
//	public void verifyWebtable() {
//		Webtablepage webObj=new Webtablepage(driver);
//		driver.get("https://demoqa.com/webtables");
//		webObj.getWebTableData();
//		
//	}

}
