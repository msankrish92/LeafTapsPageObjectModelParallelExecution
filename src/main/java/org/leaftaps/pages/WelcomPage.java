package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WelcomPage extends ProjectSpecificMethods {

	public WelcomPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage clickLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver);
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElementByXPath("//div[@id=\"label\"]/a").click();
		return new MyHomePage(driver);
	}
	
}
