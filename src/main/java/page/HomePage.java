package page;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickLogInButton() {
		waitForElement(driver, interfaces.HomePage.LOGINN_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.LOGINN_BUTTON);
	}
	
	public void inputUsername(String username) {
		waitForElement(driver, interfaces.HomePage.USERNAME_FIELD, timeWaits);
		type(driver, interfaces.HomePage.USERNAME_FIELD, username);
	}
	
	public void inputPasswrod(String password) {
		waitForElement(driver, interfaces.HomePage.PASSWORD_FIELD, timeWaits);
		type(driver, interfaces.HomePage.PASSWORD_FIELD, password);
	}
	
	public void clickSignInButton() {
		waitForElement(driver, interfaces.HomePage.SIGNIN_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.SIGNIN_BUTTON);
	}
	
	public void logIn(String username, String password){
		String currentHandle = getCurrentDriver(driver);
		switchOtherWindow(driver);
		inputUsername(username);
		inputPasswrod(password);
		clickSignInButton();
		switchCurrentDriver(driver, currentHandle);
	}
	
	public void clickBrexxButton() {
		waitForElement(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON);
	}
	WebDriver driver;
}
