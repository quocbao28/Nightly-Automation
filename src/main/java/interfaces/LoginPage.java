package interfaces;

public class LoginPage {
	//Login Locator
	public static final String EMAIL_TEXTBOX = "//input[@name='email']";
	public static final String PASSWORD_TEXTBOX = "//input[@name='password']";
	public static final String EMAIL_VALIDATING_MESSAGE = "//input[@type = 'email']/../div[contains(.,'Valid email is required.')]";
	public static final String PASSWORD_VALIDATING_MESSAGE = "//input[@type = 'password']/../div[contains(.,'Password is required.')]";
	public static final String ACCOUNT_INVALID_MESSAGE = "//div[@class = 'error-text login-error' and contains(.,'Username and password are invalid')]";
	public static final String EMAIL_FORMAT_MESSAGE = "//div[@class = 'validation-error-text' and contains(.,'Valid email is required.')]";
	public static final String SUBMIT_BUTTON = "//button[@type='submit']";
	public static final String JOIN_NOW_BUTTON = "//form/a[contains(.,'Join Now')]";
	public static final String FORGOT_PASSWORD_BUTTON = "//a[contains(.,'Forgot Password')]";
	
	//Register Locator
	public static final String DYNAMIC_REGISTER_TEXTBOX = "//label[contains(.,'%s')]/../input";
	public static final String DYNAMIC_REGISTER_ERROR = "//span[contains(.,'%s')]";
	public static final String TIMEZONE_SELECT = "//select[@id = 'timeZone']";
	public static final String SUBMIT_REGISTER_BUTTON = "//button[contains(.,'Join Now')]";
	
	//Forgot Password Form
	public static final String EMAIL_FORGOT_PASSWORD_TEXTBOX = "//fl-forgot-password//input[@type = 'email']";
	public static final String SEND_FORGOT_PASSWORD_BUTTON = "//button[contains(.,'Send')]";
	public static final String EMAIL_FORGOT_PASSWORD_ERROR = "//form/div[contains(.,'Valid email is required.')]";
	
	
}
