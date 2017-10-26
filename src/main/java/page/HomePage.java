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
		switchOtherWindow(driver);
		inputUsername(username);
		inputPasswrod(password);
		clickSignInButton();
	}
	
	public void clickBrexxButton() {
		switchOtherWindow(driver);
		sleep(15);
		waitForElementInvisible(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON);
	}
	
	public void clickDownloadDataButton() {
		waitForElement(driver, interfaces.HomePage.DOWNLOAD_DATA_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.DOWNLOAD_DATA_BUTTON);
	}
	
	public void clickTemplatesButton() {
		waitForElement(driver, interfaces.HomePage.TEMPLATES_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.TEMPLATES_BUTTON);
	}
	
	public void clickUseTemplatesButton() {
		waitForElement(driver, interfaces.HomePage.USE_TEMPLATES_BUTTON, timeWaits);
		click(driver, interfaces.HomePage.USE_TEMPLATES_BUTTON);
	}
	WebDriver driver;
	String currentHandle;
}
