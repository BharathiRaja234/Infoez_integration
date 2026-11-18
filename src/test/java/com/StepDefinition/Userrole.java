package com.StepDefinition;

import java.util.List;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Userrole extends BaseClass {
	
	PomClass pm = new PomClass(driver);
	
	@Given("user has clicked the signin button")
	public void user_has_clicked_the_signin_button() {
		click(pm.userrolesignin);
		
	    	}

	@Then("user clicks the create account button")
	public void user_clicks_the_create_account_button() {
		click(pm.createuser);
	    	}

	@Then("user log in as customer with email and password and name")
	public void user_log_in_as_customer_with_email_and_password_and_name(io.cucumber.datatable.DataTable dataTable) {
	    List<String> data = dataTable.asList();
	    sendKeys(pm.regname,data.get(0));
	    sendKeys(pm.regemail, data.get(1));
	    sendKeys(pm.regpass, data.get(2));
	}
	
	@Then("user clicks the button")
	public void user_clicks_the_button() {
		click(pm.createaccbtn);
		implicitWait();
		String act = gettext(pm.accountsuccestext);
		Assert.assertEquals("Welcome to Infoez!", act);
		implicitWait();
	}
	
	@Given("user verifies his role as customer and logs out")
	public void user_verifies_his_role_as_customer_and_logs_out() {
		implicitWait();
		String act = gettext(pm.custtext);
		Assert.assertEquals("customer", act);
		click(pm.menu);
		click(pm.logout);
	}
	

	//admin
	@Then("user clicked the header sigin")
	public void user_clicked_the_header_sigin() {
		click(pm.userrolesignin);
		
	    	}

	@Then("user switches his role to admin")
	public void user_switches_his_role_to_admin(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		sendKeys(pm.adminrolema, asList.get(0));
		sendKeys(pm.adminrolepassword, asList.get(1));
		click(pm.adminrolesubmit);
}

	@Then("user clicks profile menu and navigate to admin")
	public void user_clicks_profile_menu_and_navigate_to_admin() {
		click(pm.menu);
		click(pm.adminmenu);
	    
	}

	@Then("user clicks user")
	public void user_clicks_user() {
		click(pm.users);
	}
	@Then("user changes the role of customer to business")
	public void user_changes_the_role_of_customer_to_business() {
		click(pm.categoryusers);
		click(pm.rolechange);
	}
	@Then("user verifies that role is changed")
	public void user_verifies_that_role_is_changed() {
		String act = gettext(pm.roleupdate);
		Assert.assertEquals("Role updated", false);
	}
	@Then("user switches as customer")
	public void user_switches_as_customer(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		sendKeys(pm.regemail, asList.get(0));
		sendKeys(pm.regpass, asList.get(1));
	    
	}

	@Then("validate that role is changed")
	public void validate_that_role_is_changed() {
		String act = gettext(pm.rolecheck);
		Assert.assertEquals("business owner", act);
	}


}
