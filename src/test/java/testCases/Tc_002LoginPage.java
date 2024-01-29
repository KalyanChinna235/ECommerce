package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc_002LoginPage extends BaseClass {

	@Test(priority = 1)
	public void llogin() throws InterruptedException {

		log.info("Login to the application.");

		LoginPage loginPage = new LoginPage(driver);
		Thread.sleep(2000);
		loginPage.enterEmail(p.getProperty("email"));
		loginPage.enterPassword(p.getProperty("password"));
		loginPage.clickOnLogin();
	}
}
