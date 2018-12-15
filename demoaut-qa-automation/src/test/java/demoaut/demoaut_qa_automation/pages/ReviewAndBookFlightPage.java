package demoaut.demoaut_qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReviewAndBookFlightPage extends Page {

	public ReviewAndBookFlightPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void setBookFlightPageInfo() throws InterruptedException {

		driver.findElement(By.name("passFirst0")).sendKeys("Rajshree");
		driver.findElement(By.name("passLast0")).sendKeys("Yadav");

		driver.findElement(By.name("passFirst1")).sendKeys("John");
		driver.findElement(By.name("passLast1")).sendKeys("Detro");

		driver.findElement(By.name("passFirst2")).sendKeys("Marry");
		driver.findElement(By.name("passLast2")).sendKeys("Mile");


		Select drp = new Select(driver.findElement(By.name("creditCard")));

		drp.selectByVisibleText("Visa");

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("4111111111111111");

		Select drpCCMonth = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[3]/select[1]")));
		drpCCMonth.selectByVisibleText("12");
		Select drpCCYear = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td/table/tbody/tr[2]/td[3]/select[2]")));
		drpCCYear.selectByVisibleText("2010");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Rajshree");
		driver.findElement(By.name("cc_last_name")).sendKeys("Yadav");
	}

	public void submitBookingFlightPage() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[25]/td/input"))
				.click();
	}

}
