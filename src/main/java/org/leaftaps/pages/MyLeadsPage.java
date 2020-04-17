package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElementByXPath("//a[text()=\"Create Lead\"]").click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLead() {
		driver.findElementByXPath("//a[text()=\"Find Leads\"]").click();
		return new FindLeadsPage(driver);
	}

}
