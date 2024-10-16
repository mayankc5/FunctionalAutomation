package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Webtablepagesteps extends Base {
	
	@And("I navigate to webtable page")
	public void i_navigate_to_webtable_page() {
		Base.driver.get("https://demoqa.com/webtables");
	}

	@When("I click on Edit action button")
	public void i_click_on_edit_action_button() {
	    
		webObj.getWebTableData();
	}

	@Then("I validate edit screen page")
	public void i_validate_edit_screen_page() {
		webObj.editscreenValidation();
	}

}
