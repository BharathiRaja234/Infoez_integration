package com.StepDefinition;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ClaimIntegartion extends BaseClass {
   PomClass pm = new PomClass(driver);
   
   @Given("user is clicking the sigin button")
   public void user_is_clicking_the_sigin_button() {
	   click(pm.siginbtn);
   }

	@Given("user logs in to the customer panel")
	public void user_logs_in_to_the_customer_panel() {
		sendKeys(pm.claimemail, null);
		sendKeys(pm.claimpassword, null);
		click(pm.claimsigin);
	}
	@Given("user clicks the Explore button on header section")
	public void user_clicks_the_explore_button_on_header_section() throws InterruptedException {
	    implicitWait();
	    click(pm.clickExplore);
	    
	}
	@Given("user clicks first business in the page and respective page should be open")
	public void user_clicks_first_business_in_the_page_and_respective_page_should_be_open() {
	    click(pm.viewhotel);
	}
	@Given("user clicks claim button it displays claim ownership form")
	public void user_clicks_claim_button_it_displays_claim_ownership_form() {
		click(pm.claimbtn);
	    
	}
	@When("customer raises a claim with type Reason message")
	public void customer_raises_a_claim_with_type_reason_message() {
		sendKeys(pm.claimreason, null);
	    
	}
	@Then("claim is submitted successfully and claim id is captured")
	public void claim_is_submitted_successfully_and_claim_id_is_captured() {
		click(pm.claimsubmit);
		String act = gettext(pm.claimsuccess);
		Assert.assertEquals("Claim submitted. Our team will review shortly.", act);
	    
	}
	@Then("user clicks logout")
	public void user_clicks_logout() {
		click(pm.adminlogout);
	}

	//admin
	@Given("user logged in as admin")
	public void user_logged_in_as_admin() {
		sendKeys(pm.adminemail, null);
		sendKeys(pm.adminpassword, null);
		click(pm.adminsubmit);
	}

	@Given("the admin opens the account menu to reach the admin panel")
	public void the_admin_opens_the_account_menu_to_reach_the_admin_panel() {
		click(pm.adminmenubtn);
	    
	}
	
	@Given("clicks the claim module in the sidebar menu")
	public void clicks_the_claim_module_in_the_sidebar_menu() {
	    click(pm.claimsidebar);
	}
	@Given("user approves the claim in the admin panel")
	public void user_approves_the_claim_in_the_admin_panel() {
		click(pm.claimapprove);
	}

	@Then("claim approval success message is displayed in the admin panel")
	public void claim_approval_success_message_is_displayed_in_the_admin_panel() {
		String act = gettext(pm.claimsuccess);
		Assert.assertEquals("Approved", act);
	    
	}
	@Given("user login as customer with {string} and {string}")
	public void user_login_as_customer_with_and(String string, String string2) {
		sendKeys(pm.cusemail, string2);
		sendKeys(pm.cuspassword, string2);
		click(pm.cussubmit);
	}

	@Given("user selects notifications from menu bar")
	public void user_selects_notifications_from_menu_bar() {
		click(pm.menuprofile);
		click(pm.notifications);
	    	}

	@Then("claim status should be changed and displayed")
	public void claim_status_should_be_changed_and_displayed() {
		String exp ="Your claim for 'Mira Studio' was approved. You are now the owner.";
		Assert.assertEquals("Your claim for 'Mira Studio' was approved. You are now the owner.",exp);
		
	}


}
