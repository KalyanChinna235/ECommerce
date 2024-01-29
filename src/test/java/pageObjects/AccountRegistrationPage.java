package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement male;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='register-button']")
	WebElement register_button;

	@FindBy(xpath = "//a[@class ='account'][1]")
	WebElement accountDetails;

	public void selectRadioButton() {

		male.click();
	}

	public void setFirstName(String name) {

		firstName.sendKeys(name);
	}

	public void setLastName(String lName) {

		lastName.sendKeys(lName);
	}

	public void setEMail(String mail) {

		email.sendKeys(mail);
	}

	public void setPassword(String pswd) {

		password.sendKeys(pswd);

	}

	public void conformPassword(String cnfmPswd) {

		confirmPassword.sendKeys(cnfmPswd);
	}

	public void submitRegister() {

		register_button.click();
	}

	public String verifyAccountDetails() {

		String acc = accountDetails.getText();
		return acc;

	}

}
