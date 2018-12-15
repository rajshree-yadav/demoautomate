package demoaut.demoaut_qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingConfirmationPage extends Page {

	public BookingConfirmationPage(WebDriver webDriver) {
		super(webDriver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getConfirmationText() {
		return driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]"))
        		.getText();
	}

}
