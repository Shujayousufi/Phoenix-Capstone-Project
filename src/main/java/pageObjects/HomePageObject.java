package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

import utilities.Utilities;

public class HomePageObject extends  Base{

	public HomePageObject() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement clickOnCurrencyButton;
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement clickOnEUR;
	@FindBy(xpath = "//button[@name='USD']")
	private WebElement clickOnDollar;
	@FindBy(xpath = "//button[@name='GBP']")
	private WebElement clickOnPound;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement clickOnShoppingCart;
	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement validateShoppingCartIsEmpty;
	
	public void clickOnCurrencyOption() {
	
		clickOnCurrencyButton.click();
		//Utilities.clickElementWithJS(clickOnCurrencyButton);
		
	}
	public void clickOnEURCurrency() {
		clickOnEUR.click();
	}
	public void clickOnUSDCurrency() {
		clickOnDollar.click();
	}
	public void clickOnPoundCurrency() {
		clickOnPound.click();
	}
	public void validateCurrencyAsEURO() {
		Utilities.compareWithAssertion("€ Currency ", clickOnCurrencyButton.getText());
		
	}
	
	public void clickOnShoppingCart() {
		clickOnShoppingCart.click();
	}
	public void validateEmptyShoppingCartMessage() {
	
		Utilities.compareWithAssertion("Your shopping cart is empty!", validateShoppingCartIsEmpty.getText());
		Utilities.highlightelementRedBorder(validateShoppingCartIsEmpty);
		
		
	}
}
