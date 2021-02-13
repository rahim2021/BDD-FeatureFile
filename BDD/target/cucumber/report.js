$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 7990799700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 2820011100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on singin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on cash Bank and Cash menu tap",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on New Account tap",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters Account Title",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters Description",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters Initial Balance",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters Account Number",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters Contact Person",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters Phone",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enters Internet Banking URL",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user clicks on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user should land on Accounts page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepsDefinition.user_enter_username_as(String)"
});
formatter.result({
  "duration": 2266871600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepsDefinition.User_enters_password_as(String)"
});
formatter.result({
  "duration": 2127889500,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.User_clicks_on_singin_button()"
});
formatter.result({
  "duration": 3879775900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.User_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 601522800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_cash_Bank_and_Cash_menu_tap()"
});
formatter.result({
  "duration": 2120590800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_New_Account_tap()"
});
formatter.result({
  "duration": 2799117300,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Account_Title()"
});
formatter.result({
  "duration": 134931100,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Description()"
});
formatter.result({
  "duration": 134767500,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Initial_Balance()"
});
formatter.result({
  "duration": 164330700,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Account_Number()"
});
formatter.result({
  "duration": 121308700,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Contact_Person()"
});
formatter.result({
  "duration": 112296900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Phone()"
});
formatter.result({
  "duration": 166825300,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_enters_Internet_Banking_URL()"
});
formatter.result({
  "duration": 160165300,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_the_Submit_button()"
});
formatter.result({
  "duration": 1239180400,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_should_land_on_Accounts_page()"
});
formatter.result({
  "duration": 944233300,
  "status": "passed"
});
});