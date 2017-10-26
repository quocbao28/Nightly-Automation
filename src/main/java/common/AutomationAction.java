package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationAction {
	/**
	 * findElement
	 * @param driver
	 * @param yourLocator
	 * @return element
	 */
	public static WebElement findElement(WebDriver driver, String yourLocator){
		WebElement element = driver.findElement(By.xpath(yourLocator));
		return element;
	}
	
	/**
	 * findElement
	 * @param driver
	 * @param yourLocator
	 * @return element
	 */
	public static WebElement findElement(WebDriver driver, String yourLocator, String value1){
		yourLocator = String.format(yourLocator, value1);
		WebElement element = driver.findElement(By.xpath(yourLocator));
		return element;
	}
	
	/**
	 * click on element
	 * @param driver
	 * @param yourLocator
	 */
	public static void click(WebDriver driver, String yourLocator){
		waitForControl(driver, yourLocator, 30);
		WebElement element = findElement(driver, yourLocator);
		element.click();
	}
	
	/**
	 * click on element
	 * @param driver
	 * @param yourLocator
	 */
	public static void click(WebDriver driver, String yourLocator, String value1){
		waitForControl(driver, yourLocator, 30);
		WebElement element = findElement(driver, yourLocator, value1);
		element.click();
	}
	
	/**
	 * Wait for element present
	 * @param driver
	 * @param yourLocator
	 * @param time
	 */
	public static void waitForControl(WebDriver driver, final String yourLocator,long time){
		try{
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(yourLocator)));
		}catch(Exception e){
			System.out.println("No such element found");
		}
	}
	
	/**
	 * Wait for element present
	 * @param driver
	 * @param yourLocator
	 * @param time
	 */
	public static void waitForControl(WebDriver driver, final String yourLocator, String value1,long time){
		try{
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = findElement(driver, yourLocator, value1);
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e){
			System.out.println("No such element found");
		}
	}
	
	/**
	 * Enter data
	 * @param driver
	 * @param yourLocator
	 * @param yourText
	 */
	public static void type(WebDriver driver, String yourLocator, String yourText) {
		waitForControl(driver, yourLocator, 30);
		WebElement element = findElement(driver, yourLocator);
		element.clear();
		element.sendKeys(yourText);
	}
	
	/**
	 * Enter data
	 * @param driver
	 * @param yourLocator
	 * @param yourText
	 */
	public static void type(WebDriver driver, String yourLocator, String value1, String yourText) {
		waitForControl(driver, yourLocator, 30);
		WebElement element = findElement(driver, yourLocator, value1);
		element.clear();
		element.sendKeys(yourText);
	}
	
	/**
	 * Check for element displaying
	 * @param driver
	 * @param yourLocator
	 * @return
	 */
	public static boolean isElementDisplayed(WebDriver driver, String yourLocator) {
		try {
			WebElement element = driver.findElement(By.xpath(yourLocator));
			element.isDisplayed();
		} catch (Exception e) {
			System.out.println("No element was found");
		}
		return false;
	}
	
	/**
	 * Check for element selecting
	 * @param driver
	 * @param yourLocator
	 * @return
	 */
	public static boolean isElementSelected(WebDriver driver, String yourLocator) {
		try {
			WebElement element = driver.findElement(By.xpath(yourLocator));
			element.isSelected();
		} catch (Exception e) {
			System.out.println("No Element was found");
		}
		return false;
	}
	
	public static String getText(WebDriver driver, String yourLocator) {
		waitForControl(driver, yourLocator, 30);
		String yourText = driver.findElement(By.xpath(yourLocator)).getText();
		return yourText;
	}
	

	
	public long time = 30;
}
