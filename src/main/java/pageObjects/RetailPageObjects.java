package pageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


import utilities.Utilities;

public class RetailPageObjects extends Base{

	public RetailPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement clickOnMyAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement clickOnLogin;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement enterUserName;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement eneterPassword;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement clickOnLoginButton;
	
	@FindBy(linkText = "Register for an affiliate account")
	private WebElement clickOnRegisterAffiliateAccoutLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement enterCompanyName;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement eneterWebsite;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement enterTaxID;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement clickOnPaymentOption;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement enterChequeName;
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement clickOnAgreeBox;
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement clickOnContinueButton;
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement validateSuccessMessage;
	
	@FindBy(linkText="Edit your affiliate information")
	private WebElement clickOnEditYourAffiliateInformationLink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement clickOnBankTransferRadioButton;
	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement enterBankName;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement enterBankBranchNumber;
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement enterBankSwiftCode;
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement enterAccountName;
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement enterAccountNumber;

	@FindBy(linkText="Edit your account information")
	private WebElement clickOnEditAccountInformation;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement entetFirstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement enterLastName;
	@FindBy(xpath="//input[@name='email']")
	private WebElement enterEmail;
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement enterTelephoneNumber;

	
	
	
	
	public void  clickOnMyAccountButton() {
		clickOnMyAccountButton.click();
	}
	public void clickOnLogin() {
		clickOnLogin.click();
	}
	public void enterUserName(String  username) {
		enterUserName.sendKeys(username);
		Utilities.highlightelementBackground(enterUserName);
	}
	public void enterPassword(String password) {
		eneterPassword.sendKeys(password);
		Utilities.highlightelementBackground(eneterPassword);
	}
	public void clickOnLoginButton() {
		clickOnLoginButton.click();
		//Utilities.highlightelementBorderAndBackground(clickOnLoginButton);
	}
	public void clickOnRegisterForAffiliateAccountLink() {
		clickOnRegisterAffiliateAccoutLink.click();
	}
	public void enterCompanyName(String companyname) {
		enterCompanyName.sendKeys(companyname);
		Utilities.highlightelementRedBorder(enterCompanyName);
	}
	public void enterWebsite(String website) {
		eneterWebsite.sendKeys(website);
		Utilities.highlightelementRedBorder(eneterWebsite);
	}
	public void enterTaxID(String taxID) {
		enterTaxID.sendKeys(taxID);
		Utilities.highlightelementBackground(enterTaxID);
	}
	public void clickOnPaymentOption() {
		clickOnPaymentOption.click();
	}
	public void enterChequeName(String chequename) {
		enterChequeName.sendKeys(chequename);
		Utilities.highlightelementRedBorder(enterChequeName);
	}
	public void clickOnAgreeBox() {
		clickOnAgreeBox.click();
	}
	public void clickOnContinueButton() {
		clickOnContinueButton.click();
	}
	public void validateSuccessMessage() {
		Utilities.compareWithAssertion("Success: Your account has been successfully updated.", validateSuccessMessage.getText());
		
		Utilities.highlightelementRedBorder(validateSuccessMessage);
	}
	public void clickOnEditYourAffiliateInformationLink() {
		clickOnEditYourAffiliateInformationLink.click();
	}
	public void clickOnBankTransferRadioButton() {
		clickOnBankTransferRadioButton.click();
	}
	public void enterBankName(String bankName) {
		enterBankName.sendKeys(bankName);
		Utilities.highlightelementBackground(enterBankName);
	}
	public void enterbankBranchNumber(String abaNumber) {
		enterBankBranchNumber.sendKeys(abaNumber);
		Utilities.highlightelementRedBorder(enterBankBranchNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		enterBankSwiftCode.sendKeys(swiftCode);
		Utilities.highlightelementBorderAndBackground(enterBankSwiftCode);
	}
	public void enterAccountName(String accountName) {
		enterAccountName.sendKeys(accountName);
		Utilities.highlightelementBorderAndBackground(enterAccountName);
	}
	public void  enterAccountNumber(String accountNumber) {
		enterAccountNumber.sendKeys(accountNumber);
		Utilities.highlightelementRedBorder(enterAccountNumber);
	}
	public void clickOnContinueButtonToSubmit() {
		Utilities.wait(2000);
		clickOnContinueButton.click();
	//	Utilities.highlightelementBackground(clickOnContinueButton);
	}
	public void validateMessageSuccessfullyAccountUpdated() {
		Utilities.compareWithAssertion("Success: Your account has been successfully updated.", validateSuccessMessage.getText());
		
		Utilities.highlightelementRedBorder(validateSuccessMessage);

	}
	public void clickOnEditYourAccountInformation() {
		clickOnEditAccountInformation.click();
	}
	public void enterFirstName(String firstname) {
		Utilities.clearText(entetFirstName);
		entetFirstName.sendKeys(firstname);
		Utilities.highlightelementRedBorder(entetFirstName);
	}
	public void enterLastName(String lastname) {
		Utilities.clearText(enterLastName);
		enterLastName.sendKeys(lastname);
		Utilities.highlightelementRedBorder(enterLastName);
	}
	public void enterEmail(String email) {
		Utilities.clearText(enterEmail);
		enterEmail.sendKeys(email);
		//Utilities.highlightelementRedBorder(enterEmail);
	}
	public void enterTelephoneNumber(String telephone) {
		Utilities.clearText(enterTelephoneNumber);
		enterTelephoneNumber.sendKeys(telephone);
		//Utilities.highlightelementRedBorder(enterTelephoneNumber);
	}
	public void clickOnContinueButtonInfo() {
		clickOnContinueButton.click();
	}
	public void validateSuccessMessageYouEditAccountInformation() {
	
		Utilities.compareWithAssertion("Success: Your account has been successfully updated.", validateSuccessMessage.getText());
		Utilities.highlightelementRedBorder(validateSuccessMessage);

	}
}









