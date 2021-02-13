Feature: Validate Login 

Background: 
	Given User is on the Techfios login page 
	
Scenario Outline: Login different way 
	When User enters "<userName>" and "<password>" 
	
	Examples: 
	|userName|password|
	|demo@techfios.com|abc123|
	|www.google.com|abc123|
	

	
#	And User clicks on singin button 
#	Then User should land on Dashboard page 
#	When user clicks on cash Bank and Cash menu tap 
#	When user clicks on New Account tap 
#	When user enters "<Account Title>" and "<Description>" and "<Initial Balance>" and "<Account Number>" and "<Contact Person>" and "<Phone>" and "<Internet Banking URL>" 
#	When clicks on the Submit button 
#	Then user should land on Accounts page 
#	
#	
#	
#	Examples: 
#		|userName|password|Account Title|Description|Initial Balance|Account Number|Contact Person|Phone|Internet Banking URL|
#		|demo@techfios.com|abc123|Rahim|Bank Account|7,598,00|765490082|Rahim Halili|2147652345|www.BankOfAmerica.com|
#		