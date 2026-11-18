package com.StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddBusiness extends BaseClass {
	PomClass pm = new PomClass(driver);

	@Given("user sigin as business with {string} and {string}")
	public void user_sigin_as_business_with_and(String string, String string2) {
		click(pm.siginbtn);
		sendKeys(pm.bizemail, string);
		sendKeys(pm.bizpassword, string2);

	}

	@Given("user clicks signin button")
	public void user_clicks_signin_button() {
	click(pm.bizsignin);
	}

	@Given("user clicks add business and business details should be displayed")
	public void user_clicks_add_business_and_business_details_should_be_displayed() throws InterruptedException {

		implicitWait();;
		click(pm.profile);
		click(pm.bizdashboard);
		click(pm.addbusinessbtn);
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		sendKeys(pm.bizname, string);
		sendKeys(pm.bizdescrip, string2);
	}

	@Then("user had selected the {string} in category")
	public void user_had_selected_the_in_category(String string) throws InterruptedException {
	implicitWait();
		jsclick(pm.category);
		implicitWait();
		jsclick(pm.catres);
	    	}
	@When("user had given {string} in price")
	public void user_had_given_in_price(String string) throws InterruptedException {
	    implicitWait();
		jsclick(pm.bizpricing);
		jsclick(pm.clickprice);
	   }

	@Then("user entered  the {string}")
	public void user_entered_the(String string) {
		sendKeys(pm.bizcity, string);

	}

	@Then("user has entered the {string}")
	public void user_has_entered_the(String string) {
	   sendKeys(pm.bizaddress, string);
	}

	@Then("user is  entered the {string}")
	public void user_is_entered_the(String string) {
	sendKeys(pm.bizphone, string);
	}

	@Then("entered the {string} in email")
	public void entered_the_in_email(String string) throws InterruptedException {
	sendKeys(pm.bizaddemail, string);
	implicitWait();

	}
	

	@Then("user is giving the {string}")
	public void user_is_giving_the(String string) throws InterruptedException {
		moveToElement(pm.bizwebsite);
		implicitWait();
		sendKeys(pm.bizwebsite, string);
	}

	@Then("user filled the {string}")
	public void user_filled_the(String string) {
	sendKeys(pm.bizhours, string);

	}

	@Then("user filled in  the {string}")
	public void user_filled_in_the(String string) {
		sendKeys(pm.bizservices, string);
	}
	@Then("user has given the {string}")
	public void user_has_given_the(String string) {
		sendKeys(pm.bizhours, string);
	    	}
	
	@When("user clicks the create business button and business is created")
	public void user_clicks_the_create_business_button_and_business_is_created() {
		moveToElement(pm.createbiz);
		click(pm.createbiz);
		String act = gettext(pm.businesssucessmsg);
		Assert.assertEquals("Business submitted — awaiting admin approval", act);
	}
	@Then("user shoulbe logged out")
	public void user_shoulbe_logged_out() {
		click(pm.logout);
	}
   
	
   //Admin
	@Given("user clicked the signin")
	public void user_clicked_the_signin() {
		click(pm.siginbtn);
	
	}

	
	@Given("user loggedin as admin with {string} and {string}")
	public void user_loggedin_as_admin_with_and(String string, String string2) {
		sendKeys(pm.adminemail, string2);
		sendKeys(pm.adminpassword, string2);
		click(pm.adminsubmit);
	}

	@Given("user clicks admin button on menu")
	public void user_clicks_admin_button_on_menu() {
		click(pm.adminbtnmenu);
		
	}

	@When("user clicks pending button")
	public void user_clicks_pending_button() {
		
		click(pm.pendingbutton);
		}

	@When("user approves a pending business business shold be approved")
	public void user_approves_a_pending_business_business_shold_be_approved() {
		click(pm.approve);
		String act = gettext(pm.businesapprovedmsg);
		Assert.assertEquals("Listing approved", act);
		click(pm.adminlogout);
	}
	 
	//customer
	@Given("user signin as customer with {string} and {string}")
	public void user_signin_as_customer_with_and(String string, String string2) {
		sendKeys(pm.cusemail, string2);
		sendKeys(pm.cuspassword, string2);
		click(pm.cussubmit);
 		
	}

	@Given("customer clicks the explore")
	public void customer_clicks_the_explore() {
		click(pm.explorebtn);
		
	}

	@Then("customer verifies that approved business is displayed")
	public void customer_verifies_that_approved_business_is_displayed() {
		String act = gettext(pm.businessdisplayed);
		Assert.assertEquals("Abc hotel", act);
		
		
	}

	
	


}
