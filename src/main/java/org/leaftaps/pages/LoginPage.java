package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String userName) {
		driver.findElementById("username").sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public WelcomPage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new WelcomPage(driver);
	}
	
}
