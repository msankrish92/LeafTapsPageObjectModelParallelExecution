# LeafTapsPageObjectModelParallelExecution

Parallel exection is acheived by adding (parallel="methods") in testNG xml file at test level

The driver variable should be initalized as public in project specfic method and the driver
variable is passed to the test case class using the @Test anotation. From the @Test method 
it is passed to pages using the constructor

Example
In @Test method
```java
@Test(dataProvider = "excelDate")
  public void login(String userName, String password) {
		new LoginPage(this.driver).enterUserName(userName).enterPassword(password).clickLoginButton().clickLogoutButton();
	}
```
In Login page
```java
public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
}
 
