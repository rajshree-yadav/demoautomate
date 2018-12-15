package demoaut.demoaut_qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage extends Page {

	public SignOnPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void setSignInInfo() {
		driver.findElement(By.name("userName")).sendKeys("adams.johns@rediff.com");
		driver.findElement(By.name("password")).sendKeys("secretPwd");
	}

	public void submitSignOnPage() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"))
				.click();
	}
}
