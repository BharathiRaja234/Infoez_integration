package com.StepDefinition;

import java.util.List;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Verify extends BaseClass{

	PomClass pm = new PomClass(driver);
	
	@Given("user launches by clicking signin")
	public void user_launches_by_clicking_signin() {
		click(pm.userrolesignin);
	}

	@Given("user launched the application as admin")
	public void user_launched_the_application_as_admin(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> asList = dataTable.asList();
		sendKeys(pm.adminemail, asList.get(0));
		sendKeys(pm.adminpassword, asList.get(1));
		click(pm.adminsubmit);
		Thread.sleep(3000);
	}
	

	@Then("user navigates to admin in the profile menu")
	public void user_navigates_to_admin_in_the_profile_menu() throws InterruptedException {
	    Thread.sleep(3000);
		click(pm.menudropprofile);
		click(pm.admindropmenu);
	}

	@Then("clicks the business")
	public void clicks_the_business() {
		click(pm.businessbtn);
		
	    	}

	@Then("changes the verify status")
	public void changes_the_verify_status() {
		click(pm.verifybtn);
		click(pm.adminlogout);
		
	}

	@Then("user switches role as customer")
	public void user_switches_role_as_customer(io.cucumber.datatable.DataTable dataTable) {
		List<String> data= dataTable.asList();
		sendKeys(pm.cusemail, data.get(0));
		sendKeys(pm.cuspassword, data.get(1));
		click(pm.cussubmit);
		implicitWait();
	}

	@Then("user clicks explore and selects a business")
	public void user_clicks_explore_and_selects_a_business() {
		click(pm.clickExplore);
		
	    	}

	@Then("checks the card for verifiation status")
	public void checks_the_card_for_verifiation_status() {
		click(pm.viewhotel);
		String act = gettext(pm.verifyconfrm);
		Assert.assertEquals(act, "Verified");
	}

	
	
	
	
	
	
	
	
	
	
	
}
