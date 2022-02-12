package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


import utilities.Utilities;

public class PageObjectsDesktop extends Base{

	public PageObjectsDesktop() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul/li/a[text()='Desktops']")
	private WebElement clickOnDesktopTab;
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement clickOnShowAllButton;
	@FindBy(xpath="//div[@id='content']//div[4]/div[3]/div[1]//button[1]")
	private WebElement clickOnAddTocartButton;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement enterQuantity1;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaIsDisplayed;
	
	//@FindBy(xpath ="//a[text()='Canon EOS 5D']")//this one has an error
	@FindBy(xpath= "//a[text()='Canon EOS 5D Camera']")
	private WebElement canon_EOS5DIsDisplayed;
	
	@FindBy(xpath ="//a[text()='HP LP3065']")
	private WebElement HP_LP3065IsDisplayed;
	
	@FindBy(xpath ="//a[text()='HTC Touch HD']")
	private WebElement HTC_Touch_HD_IsDisplayed;
	
	@FindBy(xpath ="//a[text()='iPhone']")
	private WebElement iPhoneIsDisplayed;
	
	@FindBy(xpath ="//a[text()='iPod Classic']")
	private WebElement iPodClassicIsDisplayed;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookIsDisplayed;
	
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement MacBookAirIsDisplayed;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement PalmTreoIsDisplayed;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement palmTreoIsDisplayed;
	
	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product8IsDisplayed;
	
	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterIsDisplayed;
	
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIOIsDisplayed;
	
	@FindBy(xpath ="//div[@id='content']//div[4]/div[2]//button[1]")
	private WebElement addToCartCanon_ESO_Button;
	@FindBy(xpath = "//select[@name='option[226]']")
	private WebElement clickOnColorDropdown;
	@FindBy(xpath = "//select[@name='option[226]']//option[2]")
	private WebElement selectRedColorDropdown;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement enterquantity1_Canan_ESO;
	@FindBy(xpath = "//div[@class='form-group']//button")
	private WebElement addToCartCanon;
	
	@FindBy(xpath ="//a[text()='Canon EOS 5D Camera']")
	private WebElement clickOnCanon_EOSItem;
	@FindBy(xpath= "//a[text()='Write a review']")
	private WebElement clickOnWrtieReview;
	@FindBy(xpath ="//input[@id='input-name']")
	private WebElement enterYourName;
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement writeYourReview;
	@FindBy(xpath = "//input[@value='5']")
	private WebElement clickRatingTo5;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")		
	private WebElement validateSuccessMessage;
	
	public void validateUserIsOnRetailPage() {
		
	
	}
	public  void clickOnDeskTop() {
		clickOnDesktopTab.click();
		
	}
	public void clickOnShowAll() {
		clickOnShowAllButton.click();
		
	}
	public void validateAllitemsPresentInDesktopPage() {
		Assert.assertEquals(true, appleCinemaIsDisplayed.isDisplayed());
		Utilities.compareText("Apple Cinema 30\"", appleCinemaIsDisplayed.getText());
		Assert.assertEquals(true,canon_EOS5DIsDisplayed.isDisplayed());
		
		Utilities.highlightelementRedBorder(appleCinemaIsDisplayed);
		Utilities.highlightelementRedBorder(canon_EOS5DIsDisplayed);
		
		Assert.assertEquals(true,HP_LP3065IsDisplayed.isDisplayed());
		Utilities.highlightelementRedBorder(HP_LP3065IsDisplayed);
		Assert.assertEquals(true,HTC_Touch_HD_IsDisplayed.isDisplayed());
		Utilities.screenShot();
		Utilities.highlightelementRedBorder(HTC_Touch_HD_IsDisplayed);
		
		Assert.assertEquals(true,iPhoneIsDisplayed.isDisplayed());
		Utilities.highlightelementRedBorder(iPhoneIsDisplayed);
		Assert.assertEquals(true,iPodClassicIsDisplayed.isDisplayed());
		Utilities.highlightelementBorderAndBackground(iPodClassicIsDisplayed);
		Assert.assertEquals(true,MacBookIsDisplayed.isDisplayed());
		Utilities.screenShot();
		Utilities.highlightelementBorderAndBackground(MacBookIsDisplayed);
		Assert.assertEquals(true,MacBookAirIsDisplayed.isDisplayed());
		Utilities.highlightelementBorderAndBackground(MacBookAirIsDisplayed);
		Utilities.screenShot();
		Assert.assertEquals(true,PalmTreoIsDisplayed.isDisplayed());
	
		Assert.assertEquals(true,samsungSyncMasterIsDisplayed.isDisplayed());
		Assert.assertEquals(true,sonyVAIOIsDisplayed.isDisplayed());
		Utilities.scrollPageDownWithJS();
		Utilities.screenShot();
		logger.info("All items are displayed");
		
	}

	public void clickAddToCartOnHP_LP3065() {
		clickOnAddTocartButton.click();
		
	}
	public void userEnterquqntity1(String quality) {
		enterQuantity1.clear();
		enterQuantity1.sendKeys(quality);
		
	}
	public void clickOnAddToCart() {
		addToCartButton.click();
	}
	public void validateSuccessMessage() {
		Utilities.compareText("Success: You have added HP LP3065 to your shopping cart!",validateSuccessMessage.getText());
	//	Utilities.compareText("Success: You have added HP LP3065 to your shopping cart!", validateSuccessMessage.getText());
		Utilities.highlightelementBorderAndBackground(validateSuccessMessage);
	
		
	}
	public void clicktoAddCanon_EOS_ToCart() {
		addToCartCanon_ESO_Button.click();
		
	}
	public void selectRedColorCanon_EOS() {
		clickOnColorDropdown.click();
		Utilities.highlightelementBackground(clickOnColorDropdown);
		selectRedColorDropdown.click();
		Utilities.highlightelementBackground(selectRedColorDropdown);
	}
	public void enter1QuantityCanon_EOS() {
		enterquantity1_Canan_ESO.sendKeys("1");
		
	}
	public void clickOnAddCartToAddCanonItem() {
		addToCartCanon.click();
	}
	public void validateSuccessMessageCanon_EOS_Added() {
		Utilities.compareText("Success: You have added Canon EOS 5D to your shopping cart! ", validateSuccessMessage.getText());
		Utilities.highlightelementBackground(validateSuccessMessage);
		
	}
	public void clickOnCanonItem() {
		clickOnCanon_EOSItem.click();
	}
	public void clickOnWriteYourReview() {
		clickOnWrtieReview.click();
	}
	public void enterYourName(String yourname) {
		enterYourName.sendKeys(yourname);
		Utilities.highlightelementBackground(enterYourName);
	}
	public void writeYourReview(String yourReview) {
		writeYourReview.sendKeys(yourReview);
		Utilities.highlightelementBorderAndBackground(writeYourReview);
	}
	public void selectRateTo5() {
		clickRatingTo5.click();
	}
	public void clickOnCanonContinueButton() {
		clickOnContinueButton.click();
	}
	public void validateSuccessMessageOfReview(){
		Utilities.compareWithAssertion("Thank you for your review. It has been submitted to the webmaster for approval.", validateSuccessMessage.getText());
		Utilities.highlightelementBackground(validateSuccessMessage);
	}
}


