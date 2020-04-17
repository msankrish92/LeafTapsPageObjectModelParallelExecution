package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public EditLeadPage clickEditLeadButton() {
		driver.findElementByXPath("//a[text()=\"Edit\"]").click();
		return new EditLeadPage(driver);
	}
	
	public MyLeadsPage clickDeleteLead() {
		driver.findElementByXPath("//a[text()=\"Delete\"]").click();
		return new MyLeadsPage(driver);
	}
	
	

}
