package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


import utilities.Utilities;

public class LaptopPageObjects extends Base{

	public LaptopPageObjects() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a[1]")
	private WebElement clickOnLaptopNoteBooks;
	
	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement clickOnShowAllLaptopNoteBooks;
	@FindBy(xpath = "//div[@id='content']//div[4]/div[2]")
	private WebElement clickOnMacBookItem;
	@FindBy(xpath = "//div[@id='content']//div[4]/div[2]//button[1]")
	private WebElement clickOnAddToCartMacBook;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement validateSucceseMessage;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement inputQuanatityMacBook;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	//Requires time to load 
	private WebElement shoppingCart;

	@FindBy(xpath= "//button[@title='Remove']")
	private WebElement removeMacBookFromShoppingCart;
	@FindBy(xpath = "//div[@id='content']//div[4]/div[2]//button[3]")
	private WebElement clickOnComparisonMacBookButton;

	@FindBy(xpath ="//div[@id='content']//div[4]//div[3]//button[3]")
	private WebElement clickOnComparisonMacBookAirButton;
	
	@FindBy(linkText= "Product Compare (2)")
	private WebElement clinkProductComprisonLink;
	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement productChart;
	
	@FindBy(xpath ="//div[@id='content']//div[4]//div[5]//button[2]")
	private WebElement clickOnSonyVaIOHeartButton;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement clickOnMacBookProItem;
	@FindBy(xpath = "//div[@class='col-sm-4']//ul[2]//h2")
	private WebElement validateMacBookProPrice;
	
	
	public void validateUserIsInRetailPage() {
		
	}
	public void clickOnLaptopAndNoteBooksOption() {
		clickOnLaptopNoteBooks.click();
		Utilities.highlightelementBackground(clickOnLaptopNoteBooks);
	}
	public void clickOnShowAllLaptopAndNoteBooks() {
		clickOnShowAllLaptopNoteBooks.click();
	}
	public void clickOnMacBookItem() {
		clickOnMacBookItem.click();
	}
	public void clickOnAddToCartMacBookItem() {
		clickOnAddToCartMacBook.click();
		Utilities.highlightelementRedBorder(clickOnAddToCartMacBook);
		Utilities.screenShot();
	}
	public void successMessageOfMacBookAddedToCart() {

		Assert.assertEquals(true,validateSucceseMessage.isDisplayed());
		Utilities.highlightelementRedBorder(validateSucceseMessage);
	}
	public void validateTotalAmountInShoppingCart() throws InterruptedException {
		
		Utilities.wait(3000);
		Utilities.highlightelementRedBorder(shoppingCart);
		Utilities.compareText( "1 item(s) - $602.00", shoppingCart.getText());
		Utilities.screenShot();
	
	}
	public void clickOnShoppingCart() {
		shoppingCart.click();
		
	}
	public void removeItemFromShoppingCart() {
		removeMacBookFromShoppingCart.click();
		Utilities.highlightelementBackground(removeMacBookFromShoppingCart);
	}
	public void validateShoppingCartToZero() {
		Utilities.wait(3000);
	
		Utilities.compareText("0 item(s) - $0.00",shoppingCart.getText());
		Utilities.screenShot();
		
	}
	public void clickOnMacBookComparisonButton() {
		clickOnComparisonMacBookButton.click();
	
	}
	public void clickOnMacBookAirComparisonButton() {
		clickOnComparisonMacBookAirButton.click();
	
	}
	public void validateMessageYouHaveAddedMacBookAirToComparisonCart() {
		Assert.assertEquals(true,  validateSucceseMessage.isDisplayed());
		Utilities.highlightelementBorderAndBackground(validateSucceseMessage);
		Utilities.screenShot();
	}
	public void clickOnProductComparisonLink() {
		clinkProductComprisonLink.click();

	}
	public void validateProductCart() {
		productChart.getText();
		Utilities.highlightelementBackground(productChart);
		Utilities.screenShot();
	}
	public void clickOnSonyVaIOWishListButton() {
		clickOnSonyVaIOHeartButton.click();
		Utilities.highlightelementBorderAndBackground(clickOnSonyVaIOHeartButton);
	}
	public void validateMessageCreateAccountOrLogin() {
		
		Utilities.compareText( "You must login or create an account to save Sony VAIO to your wish list!", validateSucceseMessage.getText());
		Utilities.highlightelementRedBorder(validateSucceseMessage);
		Utilities.screenShot();
	}
	public void clickOnMacBookProItem() {
		clickOnMacBookProItem.click();
		
		
	}
	public void validateMacBookProPriceIsOnUI(double price) {
		
		Utilities.compareText("$2,000.00", validateMacBookProPrice.getText());
		Utilities.highlightelementRedBorder(validateMacBookProPrice);
		Utilities.screenShot();
	}
}




