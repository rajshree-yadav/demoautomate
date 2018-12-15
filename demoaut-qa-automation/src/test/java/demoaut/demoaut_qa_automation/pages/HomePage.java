package demoaut.demoaut_qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickRegistrationPageLink() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))
				.click();
	}

	public void clickFlightsPageLink() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"))
				.click();
	}

	public void clickSignOnLink() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"))
				.click();
	}
}
