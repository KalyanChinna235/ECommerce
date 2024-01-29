package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id = 'Email']")
	WebElement loginUserName;

	@FindBy(xpath = "//input[@id = 'Password']")
	WebElement loginPassword;

	@FindBy(xpath = "//input[@class = 'button-1 login-button']")
	WebElement clickOnLogin;

	public void enterEmail(String enterEmail) {

		loginUserName.sendKeys(enterEmail);
	}

	public void enterPassword(String enterPswd) {

		loginPassword.sendKeys(enterPswd);
	}

	public void clickOnLogin() {

		clickOnLogin.click();
	}
}
