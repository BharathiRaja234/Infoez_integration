package com.StepDefinition;

import java.util.List;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class AddCategory extends BaseClass {
	PomClass pm = new PomClass(driver);
	int beforeAdding;

	@Given("user has logged in as admin")
	public void user_has_logged_in_as_admin(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList();
		sendKeys(pm.adminemail, list.get(0));
		sendKeys(pm.adminpassword, list.get(1));
		click(pm.adminsubmit);
		implicitWait();
	}

	@Given("user clicks the profile menu and navigates to admin")
	public void user_clicks_the_profile_menu_and_navigates_to_admin() {
		click(pm.clickExplore);
	}
	

	@Then("user clicks the categories on admin dashboard")
	public void user_clicks_the_categories_on_admin_dashboard() {
		click(pm.allcategories);
	}

	@Then("user checks the count before adding a new category")
	public void user_checks_the_count_before_adding_a_new_category() {
		beforeAdding = pm.beforeadd.size();

	}

	@Then("user then enters category name and clicks the add button")
	public void user_then_enters_category_name_and_clicks_the_add_button(io.cucumber.datatable.DataTable dataTable) {
		List<String> data = dataTable.asList();
		sendKeys(pm.categoryname, data.get(0));
		click(pm.addcategory);
	}

	@Then("user checks the count after adding a category")
	public void user_checks_the_count_after_adding_a_category() {
		int afterAdding = pm.beforeadd.size();
		Assert.assertNotSame(beforeAdding, afterAdding);

	}

	@Then("admin logs out")
	public void admin_logs_out() {
		click(pm.adminlogout);
	}

	@Then("user switched as customer")
	public void user_switched_as_customer(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList();
		sendKeys(pm.cusemail, list.get(0));
		sendKeys(pm.cuspassword, list.get(1));
		click(pm.cussubmit);
		implicitWait();
	}

	@Then("user clicks explore on the header")
	public void user_clicks_explore_on_the_header() {
		click(pm.clickExplore);
	}

	@Then("clicks the all categories dropdown")
	public void clicks_the_all_categories_dropdown() {
		click(pm.allcategories);
	}

	@Then("verifies that new category {string} is displayed")
	public void verifies_that_new_category_is_displayed(String string) {
		boolean isPresent = Category(string);
		Assert.assertTrue(isPresent);
	}

}
