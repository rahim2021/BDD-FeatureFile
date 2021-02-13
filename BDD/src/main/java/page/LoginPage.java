package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[10]/a/span[1]")
	WebElement bankAndCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\'side-menu\']/li[10]/ul/li[1]/a")
	WebElement newAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\'account\']")
	WebElement accountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\'description\']")
	WebElement description;
	@FindBy(how = How.XPATH, using = "//*[@id=\'balance\']")
	WebElement initialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\'account_number\']")
	WebElement accountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\'contact_person\']")
	WebElement contactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\'contact_phone\']")
	WebElement phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\'ib_url\']")
	WebElement url;
	@FindBy(how = How.XPATH, using = "//*[@id=\'page-wrapper\']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement submit;
	
	

	// Interactive method
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void enterCredentials(String userName, String password) {
		User_Name.sendKeys(userName);
		Password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnBankAndCash() {
		bankAndCash.click();	
	}
	public void clickOnNewAccountTap() throws InterruptedException {
		newAccount.click();
		Thread.sleep(2000);
	}
	public void entersAccountTitle() {
		accountTitle.sendKeys("College");
	}
	public void entersDescription() {
		description.sendKeys("SavingAccount");
	}
	public void entersInitialBalance() {
		initialBalance.sendKeys("$74565");
	}
	public void entersAccountNumber() {
		accountNumber.sendKeys("7654543209");
	}
	public void entersContactPerson() {
		contactPerson.sendKeys("Rahim");
	}
	public void entersPhone() {
		phone.sendKeys("2145638875");
	}
	public void entersInternetBankingURL() {
		url.sendKeys("www.BankOfAmerica.com");
	}
	public void clicksonTheSubmitbutton() {
		submit.click();
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		  String label = formatter.format(date);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  String currrentDir = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
		 }
		
}
