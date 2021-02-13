package steps.stepsDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepsDefinition {

	LoginPage loginpage;
	WebDriver driver;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() throws InterruptedException {
		driver.get("http://techfios.com/billing/?ng=admin/");
		Thread.sleep(2000);

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enter_username_as(String username) throws InterruptedException {
		loginpage.enterUserName(username);
		Thread.sleep(2000);

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void User_enters_password_as(String password) throws InterruptedException {
		loginpage.enterPassword(password);
		Thread.sleep(2000);
	}

	@When("^User clicks on singin button$")
	public void User_clicks_on_singin_button() throws InterruptedException {
		loginpage.clickOnSignInButton();
		Thread.sleep(2000);
	}

	@Given("^User should land on Dashboard page$")
	public void User_should_land_on_Dashboard_page() throws IOException {
		Assert.assertEquals("Dashboard- iBilling", loginpage.getPageTitle());
		loginpage.takeScreenshotAtEndOfTest(driver);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) {
		loginpage.enterCredentials(userName, password);

	}

	@When("^user clicks on cash Bank and Cash menu tap$")
	public void user_clicks_on_cash_Bank_and_Cash_menu_tap() throws InterruptedException {
		loginpage.clickOnBankAndCash();
		Thread.sleep(2000);
	}

	@When("^user clicks on New Account tap$")
	public void user_clicks_on_New_Account_tap() throws InterruptedException {
		loginpage.clickOnNewAccountTap();
	}

	@When("^user enters Account Title$")
	public void user_enters_Account_Title() throws Throwable {
		loginpage.entersAccountTitle();
	}

	@When("^user enters Description$")
	public void user_enters_Description() throws Throwable {
		loginpage.entersDescription();
	}

	@When("^user enters Initial Balance$")
	public void user_enters_Initial_Balance() throws Throwable {
		loginpage.entersInitialBalance();
	}

	@When("^user enters Account Number$")
	public void user_enters_Account_Number() throws Throwable {
		loginpage.entersAccountNumber();
	}

	@When("^user enters Contact Person$")
	public void user_enters_Contact_Person() throws Throwable {
		loginpage.entersContactPerson();
	}

	@When("^user enters Phone$")
	public void user_enters_Phone() throws Throwable {
		loginpage.entersPhone();
	}

	@When("^user enters Internet Banking URL$")
	public void user_enters_Internet_Banking_URL() throws Throwable {
		loginpage.entersInternetBankingURL();
	}

	@Then("^user clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() throws Throwable {
		loginpage.clicksonTheSubmitbutton();
	}

	@Then("^user should land on Accounts page$")
	public void user_should_land_on_Accounts_page() throws IOException {
//	    Assert.assertEquals("Accounts-iBilling", Accounts);
		loginpage.takeScreenshotAtEndOfTest(driver);

	}

//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}
//	

}
