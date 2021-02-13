@Test
Feature: Validate Techfios Login Functionality 

Background: 
	Given User is on the Techfios login page 
Scenario: User should be able to login with valid credentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	When User clicks on singin button 
	Then User should land on Dashboard page 
	And user clicks on cash Bank and Cash menu tap 
	And user clicks on New Account tap 
	And user enters Account Title 
	And user enters Description 
	And user enters Initial Balance 
	And user enters Account Number 
	And user enters Contact Person 
	And user enters Phone 
	And user enters Internet Banking URL 
	And user clicks on the Submit button
	Then user should land on Accounts page 
	
	