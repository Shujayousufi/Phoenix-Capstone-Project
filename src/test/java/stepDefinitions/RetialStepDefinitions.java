package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObjects;
import utilities.Utilities;

public class RetialStepDefinitions extends Base{

	
	RetailPageObjects retail = new RetailPageObjects();

	@When("User click  on MyAccount")
	public void user_click_on_my_account() {
	  retail.clickOnMyAccountButton();
	  logger.info("My account was clicked.");
	}

	@And("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLogin();
		logger.info("Login was clicked successfully.");
	}

	@And("User enter userName <username> and password<password>")
	public void user_enter_user_name_username_and_password_password(DataTable dataTable) {
	    List<Map<String , String>> data = dataTable.asMaps(String.class, String.class);
	    retail.enterUserName(data.get(0).get("username"));
	    retail.enterPassword(data.get(0).get("password"));
	  //  logger.info("User name and password entered correctly.");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButton();
		logger.info("Login button was clicked.");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Utilities.screenShot();
		logger.info("User is in the my account dashboard");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickOnRegisterForAffiliateAccountLink();
		logger.info("Affiliateaccount link was clicked.");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    retail.enterCompanyName(data.get(0).get("company"));
	    retail.enterWebsite(data.get(0).get("website"));
	    retail.enterTaxID(data.get(0).get("taxID"));
	    retail.clickOnPaymentOption();
	    retail.enterChequeName(data.get(0).get("chequename"));
	    logger.info("data was entered successfully.");
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickOnAgreeBox();
		logger.info("User checked agree box.");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("Continue.");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    retail.validateSuccessMessage();
	    logger.info("Message was displayed.");
	    Utilities.screenShot();
	}
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retail.clickOnEditYourAffiliateInformationLink();
		logger.info("Edit affiliate account was clicked.");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnBankTransferRadioButton();
		logger.info("Transfer radio button was clicked.");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retail.enterBankName(data.get(0).get("bankName"));
		retail.enterbankBranchNumber(data.get(0).get("abaNumber"));
		retail.enterSwiftCode(data.get(0).get("swiftCode"));
		retail.enterAccountName(data.get(0).get("accountName"));
		retail.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("Data was  entered successfully.");
	}

	@When("User click on Continue button to update")
	public void user_click_on_continue_button_to_update() {
		retail.clickOnContinueButtonToSubmit();
		logger.info("Data was  submitted.");
	}

	@Then("User should see a success message affiliate account update")
	public void user_should_see_a_success_message_affiliate_account_update() {
		retail.validateMessageSuccessfullyAccountUpdated();
		logger.info("Message was  displayed successfully.");
		Utilities.screenShot();
	}
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickOnEditYourAccountInformation();
		logger.info("edit information link was clicked.");

	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String , String>>data = dataTable.asMaps(String.class, String.class);
	   retail.enterFirstName(data.get(0).get("firstname"));
	   retail.enterLastName(data.get(0).get("lastName"));
	   retail.enterEmail(data.get(0).get("email"));
	   retail.enterTelephoneNumber(data.get(0).get("telephone"));
	   logger.info("All data was entered correctly.");
	}
	@When("User click on continue button info")
	public void user_click_on_continue_button_info() {
		retail.clickOnContinueButtonInfo();
		logger.info("Continue button was clicked successfully.");
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	   retail.validateSuccessMessageYouEditAccountInformation();
	   logger.info("Message is displayed successfully.");
	   Utilities.screenShot();
	}
}
