package com.TestRunner;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\userrole.feature",glue={"com.StepDefinition"},
dryRun = !false,plugin = { "pretty" ,"summary","html:target/html/report.html"})


public class TestRunner extends BaseClass {
	@BeforeClass
	public static  void start() {
		BaseClass.browser_Launch();

	}
	
	@AfterClass
	
	public static void close() {
	//quit();

	}
	
	
	
	
	
	
}



