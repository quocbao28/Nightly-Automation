package page;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;

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
		switchOtherWindow(driver);
	}
	
	public void clickBrexxButton() {
		waitForElement(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON, timeWaits);
		scrollToBottom();
		sleep(10000);
		moveMouseToElementAndClick(driver, interfaces.HomePage.BRIXX_TIP_REPORT_BUTTON);
		scrollToTop();
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
