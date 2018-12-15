package demoaut.demoaut_qa_automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import demoaut.demoaut_qa_automation.pages.HomePage;

public class HomePageTest extends JUnitTestBase {

	private HomePage homePage;

	@Before
	public void initPageObjects() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testHomePageTitle() throws InterruptedException {
		Assert.assertEquals(homePage.getTitle(), "Welcome: Mercury Tours");
	}
}
