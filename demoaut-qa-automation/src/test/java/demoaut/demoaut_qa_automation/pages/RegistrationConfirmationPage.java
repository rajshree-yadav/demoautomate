package demoaut.demoaut_qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationConfirmationPage extends Page {

	public RegistrationConfirmationPage(WebDriver webDriver) {
		super(webDriver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getRegistrationConfirmationText() {
		return driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"))
				.getText();
	}

}
