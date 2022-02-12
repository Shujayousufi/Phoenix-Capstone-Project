package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectsDesktop;
import utilities.Utilities;



public class StepDefinitionsDesktop extends Base{
	
	PageObjectsDesktop desktop = new PageObjectsDesktop();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		desktop.validateUserIsOnRetailPage();
		logger.info("User is in the Retail Page.");
		
	}
	@When("User click on Desktops tab")
	public void user_click_on_Desktop_tab() {
		desktop.clickOnDeskTop();
		logger.info("Desktop tab was clicked.");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	  desktop.clickOnShowAll();
	  logger.info("Show all item was clicked successfully.");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktop.validateAllitemsPresentInDesktopPage();
		
		logger.info("All items are present.");
	}

//	@Given("User click on Desktops tab")
//	public void user_click_on_desktops_tab1() {
//		desktop.clickOnDeskTop();
//		logger.info("desttop tab was clicked.");
//	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickAddToCartOnHP_LP3065();
		logger.info("HP was added to the cart.");
	}

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		String num = "1";
		desktop.userEnterquqntity1(num);
		logger.info("One item selected.");
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	  desktop.clickOnAddToCart();
	  logger.info("Item added to the cart.");
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		desktop.validateSuccessMessage();
		logger.info("Message reads.");
	}
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    desktop.clicktoAddCanon_EOS_ToCart();
	    logger.info("Clicked the Canon EOS cart.");
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	  
	   desktop.selectRedColorCanon_EOS();
	   logger.info("Red Canon EOS selected.");
	}
	 @When("User select quantity 1 ")
	 public void user_select_qualitiy1() {
		 desktop.enter1QuantityCanon_EOS();
		 logger.info("One Quantity selected.");
	}
	@When("User added to cart")
	public void addCanonToCart() {
		desktop.clickOnAddCartToAddCanonItem();
		logger.info("Canon EOS successfully added to the cart.");
	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	   desktop.validateSuccessMessageCanon_EOS_Added();
	   logger.info("Message is displayed");
	}
//	@Given ("User is on Retail website")
//	public void user_is_on_Retail_website() {
//		
//	}
//	@Given ("User click on Desktops tab")
//	public void user_click_on_Desktops_tab() {
//		desktop.clickOnDeskTop();
//		
//	}
//	@When ("User click on Show all desktops")
//	public void user_click_on_Show_all_desktops(){
//		desktop.clickOnShowAll();
//	}
	@Given ("User click on Canon EOS 5D item")
	public void user_click_on_Canon_EOS_5D_item() {
		desktop.clickOnCanonItem();
		logger.info("Canon was clicked Successfully.");
	}
	@When ("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnWriteYourReview();
		logger.info("Review link was clicked Successfully");
	}
	
	@And ("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(data.get(0).get("yourname"));
		desktop.writeYourReview(data.get(0).get("yourReview"));
		desktop.selectRateTo5();
		logger.info("Your Review was written");
		Utilities.screenShot();
	}
	@And ("User click on Continue Button")
	public void user_click_on_Continue_Button() {
		desktop.clickOnCanonContinueButton();
		logger.info("Your review was submitted");
	}
	
	@Then ("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message() {
		desktop.validateSuccessMessageOfReview();
		logger.info("You received successfull message of your review");
		Utilities.screenShot();
	}
}
