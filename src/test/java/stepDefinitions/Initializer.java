package stepDefinitions;

import core.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{

	@Before
	public void beforeHooks(Scenario scenario) {
		
		logger.info( "Scenario " + scenario.getName()+ " Started" );
		browserName();
		openBrowser();
	}
	@After
	public void afterHooks(Scenario scenario) throws InterruptedException {
		tearDownBrowser();
		logger.info("Scenario " +scenario.getName()+ " " + scenario.getStatus());
	}
}
