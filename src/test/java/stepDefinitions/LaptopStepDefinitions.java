package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopPageObjects;
import utilities.Utilities;

public class LaptopStepDefinitions extends Base{
	
	LaptopPageObjects laptopNoteBook = new LaptopPageObjects();
	
//	@Given ("User is on Retail website")
//	public void validateRetailWebsitePage() {
//		logger.info("User is in the web page.");
//	}
	@Given("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBook.clickOnLaptopAndNoteBooksOption();
		logger.info("Laptop and NoteBooks was clicked.");
	
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBook.clickOnShowAllLaptopAndNoteBooks();
		logger.info("Show all laptop and notebooks clicked.");
	}

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNoteBook.clickOnMacBookItem();
		logger.info("Mac was selected.");
	}

	@And("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart()  {
		laptopNoteBook.successMessageOfMacBookAddedToCart();
		logger.info("Message was displayed.");
	}

	@And("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, double amount) throws InterruptedException {
		laptopNoteBook.validateTotalAmountInShoppingCart();
		logger.info("The total amount of $602.00 was displayed.");
	
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBook.clickOnShoppingCart();
		logger.info("Cart");
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBook.removeItemFromShoppingCart();
		logger.info("Red X was clicked to remove item from cart.");
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopNoteBook.validateShoppingCartToZero();
		logger.info("Cart total  is zero now.");
	}
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNoteBook.clickOnMacBookComparisonButton();
		logger.info("Mac Comparison was clicked.");

	}

	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNoteBook.clickOnMacBookAirComparisonButton();
		logger.info("MacBook Air comparison was clicked.");
	}

	@And("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		laptopNoteBook.validateMessageYouHaveAddedMacBookAirToComparisonCart();
		logger.info("The message was validated.");

	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBook.clickOnProductComparisonLink();
		logger.info("Product comparison link was clicked.");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNoteBook.validateProductCart();
		logger.info("Chart was validated.");
	
	}
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopNoteBook.clickOnSonyVaIOWishListButton();
		logger.info("Sony VaIO was added to wish list.");
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		laptopNoteBook.validateMessageCreateAccountOrLogin();
		logger.info("The message was validated successfully.");
	}
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopNoteBook.clickOnMacBookProItem();
		logger.info("MacBook Pro item was clicked.");
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopNoteBook.validateMacBookProPriceIsOnUI(2000.00);
		logger.info("The price of $2000.00 is displayed.");
		
	}
}
