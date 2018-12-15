package demoaut.demoaut_qa_automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import demoaut.demoaut_qa_automation.pages.FlightsPage;
import demoaut.demoaut_qa_automation.pages.HomePage;
import demoaut.demoaut_qa_automation.pages.RegistrationConfirmationPage;
import demoaut.demoaut_qa_automation.pages.RegistrationPage;
import demoaut.demoaut_qa_automation.pages.SignOnPage;

public class SignOnPageTest extends JUnitTestBase {

	private HomePage homePage;
    private SignOnPage signOnPage;
    private FlightsPage flightsPage;
	@Before
	public void initPageObjects() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		signOnPage = PageFactory.initElements(driver, SignOnPage.class);
		flightsPage = PageFactory.initElements(driver, FlightsPage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testSignOnProcess() throws InterruptedException {
		homePage.clickSignOnLink();
		signOnPage.setSignInInfo();
		signOnPage.submitSignOnPage();
		Assert.assertEquals(flightsPage.getSignOffText(), "SIGN-OFF");

	}
}
