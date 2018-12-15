package demoaut.demoaut_qa_automation.pages;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsSelectionPage extends Page {

	public FlightsSelectionPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void submitFlightSelectionPage() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"))
				.click();
	}
	
	public WebElement getSelectFlightImage() {
		return driver.findElement(By.xpath("//img[@src='/images/masts/mast_selectflight.gif']"));
	}
	
	public void selectLastDepartureFlight() {
		selectLastFlight("//table[1]/tbody/tr[*]/td[3]/font").click();
	}
	
	public void selectLastReturnFlight() {
		selectLastFlight("//table[2]/tbody/tr[*]/td[3]/font").click();
	}
	
	private WebElement selectLastFlight(String relativeXpath) {
		LocalTime time = null;
		LocalTime maxTime = null;
	    List<WebElement> innerLIElementList = driver.findElements(By.xpath(relativeXpath));  // e.g. - //table[2]/tbody/tr[*]/td[3]/font
	    WebElement lastFlightElement = null;
	    // iterate through the inner table rows
	    for (WebElement innerLIElement : innerLIElementList) {
	        try {
	        		time = LocalTime.parse(innerLIElement.getText());
	        } catch (DateTimeParseException dtpe) {
	        		//Do nothing
	        }
	        	
	        if(time != null && (maxTime == null || time.isAfter(maxTime))) {
	        		maxTime = time;
	        		lastFlightElement = innerLIElement;
	        }
	    }
	    return lastFlightElement.findElement(By.xpath("../../td[1]/input"));
	}
}
