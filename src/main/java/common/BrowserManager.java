package common;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

public class BrowserManager {

	/**
	 * @author
	 */
	private WebDriver driver;

	public WebDriver openBrowser(String browser, String url) {
		if (!os().contains("mac")) {
			try {
				if (browser.toString().toLowerCase().contains("chrome")) {
					DesiredCapabilities cap = startChromeDriver();
					driver = new ChromeDriver(cap);
				} else if (browser.toString().toLowerCase().contains("ie")) {
					startIEDriver();
					driver = new InternetExplorerDriver();
				} else if (browser.toString().toLowerCase().contains("firefox")) {
					startFFDriver();
					driver = new FirefoxDriver();
				}
			} catch (Exception e) {
				System.out.println("No browser was found");
			}
		} else if (os().contains("mac")) {
			try {
				if (browser.toString().toLowerCase().contains("chrome")) {
					driver = new ChromeDriver();
				} else if (browser.toString().toLowerCase().contains("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.toString().toLowerCase().contains("safari")) {
					driver = new SafariDriver();
				}
			} catch (Exception e) {
				System.out.println("No browser was found");
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		try {
			Robot rb = new Robot();
			rb.mouseMove(0, 0);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.focus();");
		return driver;

	}

	/**
	 * @author
	 */
	public WebDriver openBrowserWithOldCookies(String browser, String url) {
		try {
			if (browser.toString().toLowerCase().contains("chrome")) {
				DesiredCapabilities cap = startChromeDriver();
				driver = new ChromeDriver(cap);
			} else if (browser.toString().toLowerCase().contains("ie")) {
				startIEDriver();
				driver = new InternetExplorerDriver();
			} else if (browser.toString().toLowerCase().contains("firefox")) {
				startFFDriver();
				driver = new FirefoxDriver();
			} else if (browser.toString().toLowerCase().contains("safari")) {
				startSafariDriver();
				driver = new SafariDriver();
			}

		} catch (Exception e) {
			System.out.println("No browser was found");
		}
		driver.manage().window().maximize();
		driver.get(url);
		try {
			Robot rb = new Robot();
			rb.mouseMove(0, 0);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.resizeTo(1368,768);");
		js.executeScript("window.focus();");

		System.out.println(driver);
		return driver;
	}

	public DesiredCapabilities startChromeDriver() {
		if (os().contains("win")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		} else if (os().contains("mac")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		}
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return capabilities;
	}

	public String os() {
		return System.getProperty("os.name").toLowerCase();
	}

	public void startIEDriver() {
		if (os().contains("win")) {
			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
		} else if (os().contains("mac")) {
			// driver for mac
		}
	}

	public void startFFDriver() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
	}

	public SafariOptions startSafariDriver() {
		SafariOptions options = new SafariOptions();
		options.setUseCleanSession(true);
		options.getUseTechnologyPreview();
		return options;
	}

	public SafariDriverService safariService() {
		SafariOptions options = startSafariDriver();
		SafariDriverService ser = SafariDriverService.createDefaultService(options);
		return ser;
	}

	public WebDriver getDriver() {
		return driver;
	}
}
