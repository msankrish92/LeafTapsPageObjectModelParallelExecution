package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyLeadsPage clickLeadsTab() {
		driver.findElementByXPath("//a[text()=\"Leads\"]").click();
		return new MyLeadsPage(driver);
	}
	
	
}
