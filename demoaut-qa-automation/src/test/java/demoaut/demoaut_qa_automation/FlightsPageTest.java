package demoaut.demoaut_qa_automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import demoaut.demoaut_qa_automation.pages.FlightsPage;
import demoaut.demoaut_qa_automation.pages.FlightsSelectionPage;
import demoaut.demoaut_qa_automation.pages.HomePage;
import demoaut.demoaut_qa_automation.pages.SignOnPage;

public class FlightsPageTest extends JUnitTestBase {

	private HomePage homePage;
    private SignOnPage signOnPage;
    private FlightsPage flightsPage;
    private FlightsSelectionPage flightsSelectionPage;
    
	@Before
	public void initPageObjects() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		signOnPage = PageFactory.initElements(driver, SignOnPage.class);
		flightsPage = PageFactory.initElements(driver, FlightsPage.class);
		flightsSelectionPage = PageFactory.initElements(driver, FlightsSelectionPage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testHomePageTitle() throws InterruptedException {
		homePage.clickSignOnLink();
		signOnPage.setSignInInfo();
		signOnPage.submitSignOnPage();
		flightsPage.setFlightInfo();
		flightsPage.submitFlightInfoPage();
		Assert.assertNotNull(flightsSelectionPage.getSelectFlightImage());
	}
}
