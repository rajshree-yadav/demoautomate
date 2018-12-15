package demoaut.demoaut_qa_automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import demoaut.demoaut_qa_automation.pages.BookingConfirmationPage;
import demoaut.demoaut_qa_automation.pages.FlightsPage;
import demoaut.demoaut_qa_automation.pages.FlightsSelectionPage;
import demoaut.demoaut_qa_automation.pages.HomePage;
import demoaut.demoaut_qa_automation.pages.ReviewAndBookFlightPage;
import demoaut.demoaut_qa_automation.pages.SignOnPage;

public class BookingConfirmationPageTest extends JUnitTestBase {

	private HomePage homePage;
    private SignOnPage signOnPage;
    private FlightsPage flightsPage;
    private FlightsSelectionPage flightsSelectionPage;
    private ReviewAndBookFlightPage reviewAndBookFlightPage;
    private BookingConfirmationPage bookingConfirmationPage;
    
	@Before
	public void initPageObjects() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		signOnPage = PageFactory.initElements(driver, SignOnPage.class);
		flightsPage = PageFactory.initElements(driver, FlightsPage.class);
		flightsSelectionPage = PageFactory.initElements(driver, FlightsSelectionPage.class);
		reviewAndBookFlightPage = PageFactory.initElements(driver, ReviewAndBookFlightPage.class);
		bookingConfirmationPage = PageFactory.initElements(driver, BookingConfirmationPage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testBookingConfirmationPage() throws InterruptedException {
		homePage.clickSignOnLink();
		signOnPage.setSignInInfo();
		signOnPage.submitSignOnPage();
		flightsPage.setFlightInfo();
		flightsPage.submitFlightInfoPage();
		flightsSelectionPage.selectLastDepartureFlight();
		flightsSelectionPage.selectLastReturnFlight();
		flightsSelectionPage.submitFlightSelectionPage();
		reviewAndBookFlightPage.setBookFlightPageInfo();
		reviewAndBookFlightPage.submitBookingFlightPage();
		Assert.assertTrue(bookingConfirmationPage.getConfirmationText().matches(" Flight Confirmation # \\d{4}\\-\\d{2}\\-\\d{8}$"));
	}
}
