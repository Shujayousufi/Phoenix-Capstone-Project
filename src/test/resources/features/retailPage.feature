
@Retail @regression
Feature: Retail Page

 Background:
 
    Given User is on Retail website 
    And User click  on MyAccount
    When User click on Login 
    And User enter userName <username> and password<password> 
    | username | password |
    | R16gga@gmaill.com| kabul  |
    
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
  
 Scenario: Register as an Affiliate user with Cheque Payment Method
		When User click on ‘Register for an Affiliate Account’ link 
		And User fill affiliate form with below information
		|company|website|taxID|chequename|
		|Goiogle |GoigleSite|Google420|Daviea|
		And User check on About us check box 
		And User click on Continue button 
		Then User should see a success message 
 
 Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		When User click on ‘Edit your affiliate informationlink 
		And user click on Bank Transfer radio button
		And User fill Bank information with below information
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|Wellsfor|38774|HYP044| David| 1204567|
		And User click on Continue button to update 
		Then User should see a success message affiliate account update
		
	Scenario: Edit your account Information 
		When User click on ‘Edit your account information’ link 
		And User modify below information 
		|firstname|lastName|email|telephone|
		|Jac  | Smith| R16gga@gmaill.com| 9999922222|
		And User click on continue button info 
		Then User should see a message ‘Success: Your account has been successfully updated.’
	
		
		
		
		
 
