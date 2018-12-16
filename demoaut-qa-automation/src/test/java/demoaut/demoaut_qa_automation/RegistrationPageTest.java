package demoaut.demoaut_qa_automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import demoaut.demoaut_qa_automation.pages.HomePage;
import demoaut.demoaut_qa_automation.pages.RegistrationConfirmationPage;
import demoaut.demoaut_qa_automation.pages.RegistrationPage;

public class RegisterPafeTest extends JUnitTestBase {

	private HomePage homePage;
	private RegistrationPage registrationPage;
	private RegistrationConfirmationPage registrationConfirmationPage;

	@Before
	public void initPageObjects() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
		registrationConfirmationPage = PageFactory.initElements(driver, RegistrationConfirmationPage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testRegistrationProcess() throws InterruptedException {
		homePage.clickRegistrationPageLink();
		registrationPage.setRegistrationDetails();
		registrationPage.submitRegistrationPage();

		Assert.assertTrue(registrationConfirmationPage.getRegistrationConfirmationText().contains("Note: Your user name is"));

	}
}
