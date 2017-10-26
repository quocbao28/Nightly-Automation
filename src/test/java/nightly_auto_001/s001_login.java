package nightly_auto_001;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import common.AbstractTest;
import common.Constant;
import page.HomePage;
import page.PageFactory;

public class s001_login extends AbstractTest {

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) {
		driver = openBrowser(browser, Constant.URL);
		home = PageFactory.getPageFactory().getHomePage(driver);	
		validEmail = "sangmai350@gmail.com";
		validPassword = "Abcd123!@";
	}

	@Test
	public void login_TC001() {
		log.info("Login");
		home.clickLogInButton();
		home.logIn(Constant.USERNAME, Constant.PASSWORD);
		home.clickBrexxButton();
		home.clickDownloadDataButton();
		home.clickTemplatesButton();
		home.clickUseTemplatesButton();
		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearsDown() {
		closeBrowser();
	}

	HomePage home;
	String validEmail, validPassword;
}
