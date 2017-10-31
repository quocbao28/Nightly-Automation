package common;

import org.openqa.selenium.WebDriver;

import common.CommonAction;

public class Constant extends CommonAction{
	//---------------------------------Oevent------------------------------------//
	public static final String URL = "http://customer-service.zuppler.com/";
	public static final String USERNAME = "01lug60u@robot.zapier.com";
	public static final String PASSWORD = "zuppleruser";

	
	//---------------------------------Driver pack------------------------------------//
	public static WebDriver driver = null;
	public static int TimeWait = 30;
	public static final String email = "Automation";
	public static final String DRIVER_PATH = "..\\Oevent\\src\\test\\resources\\";
	public static final String CHROME_DRIVER_SERVER = "chromedriver";
	public static final String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	public static final String GECKO_DRIVER_SERVER = "geckodriver";
	public static final String IE_WEBDRIVER = "webdriver.ie.driver";
	public static final String IE_SERVER_DRIVER = "IEDriverServer";


	

	
}
