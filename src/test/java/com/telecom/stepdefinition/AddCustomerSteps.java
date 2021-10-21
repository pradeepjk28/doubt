package com.telecom.stepdefinition;
import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.CommonActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AddCustomerSteps extends CommonActions{
	AddCustomerPage cp = new AddCustomerPage();
	CommonActions ca = new CommonActions();
	@Given("user launches demo telecom application")
	public void user_launches_demo_telecom_application() {
	    
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		clickEle(cp.getCustomerButton());
	}

	@When("user enters all the fields")
	public void user_enters_all_the_fields() {
		clickEle(cp.getDoneButton());
		enterText(cp.getFname(), "pradeep");
		enterText(cp.getLname(),"kumar");
		enterText( cp.getEmail(),"pradeepkumarjk28@gmail.com");
		enterText(cp.getAddress(),"laptop irritating me for update");
		enterText(cp.getTelephone(),"9626922811");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		clickEle(cp.getSubmit());
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		 textPresent(cp.getCustomerID());
		 stringEquals(cp.getCustomerID(),"Please Note Down Your CustomerID");	
	   	}

}
