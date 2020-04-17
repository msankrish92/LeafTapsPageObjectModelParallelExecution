package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public EditLeadPage updateDepartment(String company) {
		driver.findElementById("updateLeadForm_departmentName").sendKeys(company);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElementByXPath("//input[@name=\"submitButton\"]").click();
		return new ViewLeadPage(driver);
	}
	
}
