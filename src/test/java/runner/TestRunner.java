package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "classpath:features",
		glue = "stepDefinitions",
		tags = "@regression",
		dryRun  = false,
		strict = true,
		monochrome = true,
		plugin = {"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
		publish = true)

public class TestRunner extends Base {

	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
}
