package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class HomeStepSefinitions extends Base{
			
	HomePageObject home =  new HomePageObject();
	
//	@Given("User is on Retail website")
//	public  void user_is_on_Retail_website() {
//		logger.info("User is in home page.");
//	}
	@When("User click on Currency")
	public void user_click_on_currency() {
	   home.clickOnCurrencyOption();
	   logger.info("Currency wasclicked.");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	    home.clickOnEURCurrency();
	   // home.clickOnUSDCurrency();
	    logger.info("Euro was selected");
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	   home.validateCurrencyAsEURO();
	   logger.info("The currency was change to Euro.");
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    home.clickOnShoppingCart();
	    logger.info("shopping cart was clicked.");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	   home.validateEmptyShoppingCartMessage();
	   logger.info("The Message is shows that shopping cart is empty.");
	   Utilities.screenShot();
	}
	
}
