package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001AccountRegistrationPage extends BaseClass {
	AccountRegistrationPage accPage;

	@Test(priority = 1)
	public void rigisterButton() {
		HomePage hPage = new HomePage(driver);
		log.info("Clicking on register Page");
		hPage.clickOnRegister();
	}

	@Test(priority = 2)
	public void enterRegisterDetails() {
       log.info("Entering details for registration.");
		accPage = new AccountRegistrationPage(driver);
		accPage.selectRadioButton();
		accPage.setFirstName("Ajju");
		accPage.setLastName("Kudurupaka");
		accPage.setEMail("ajju37@gmail.com");
		accPage.setPassword("Ajju@123");
		accPage.conformPassword("Ajju@123");
		accPage.submitRegister();

	}

	@Test(priority = 3)
	public void verifyAccDetails() {
		log.info("Username verification.");

		String actual = accPage.verifyAccountDetails();
		System.out.println("This is Actual username: " + actual);
		String expected = "ajju37@gmail.com";
		System.out.println("This is Expected username: " + expected);
		Assert.assertEquals(actual, expected);
	}

}
