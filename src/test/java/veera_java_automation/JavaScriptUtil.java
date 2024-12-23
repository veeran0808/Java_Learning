package veera_java_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Utility class for performing various JavaScript-based actions in Selenium.
 * Provides methods for interacting with and manipulating web elements using
 * JavaScript.
 * 
 * @author Veera
 */
public class JavaScriptUtil {

	// WebDriver instance for executing JavaScript commands.
	private WebDriver driver;

	/**
	 * Constructor to initialize JavaScriptUtil with a WebDriver instance.
	 * 
	 * @param driver WebDriver instance used for JavaScript execution.
	 */
	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Flashes an element by changing its background color back and forth. Useful
	 * for highlighting elements during debugging or tests.
	 * 
	 * @param element WebElement to be flashed.
	 */
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor"); // Get the original background color.
		for (int i = 0; i < 7; i++) {
			changeColor("rgb(0,200,0)", element); // Change to green.
			changeColor(bgcolor, element); // Revert to original color.
		}
	}

	/**
	 * Changes the background color of an element using JavaScript.
	 * 
	 * @param color   Color to set as background.
	 * @param element WebElement whose background color is to be changed.
	 */
	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(20); // Pause briefly to visualize the color change.
		} catch (InterruptedException e) {
			// Handle interruption during sleep.
		}
	}

	/**
	 * Retrieves the title of the current page using JavaScript.
	 * 
	 * @return Page title as a String.
	 */
	public String getTitleByJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();
	}

	/**
	 * Refreshes the current browser window using JavaScript.
	 */
	public void refreshBrowserByJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	/**
	 * Navigates to the previous page in the browser's history using JavaScript.
	 */
	public void navigateToBackPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(-1)");
	}

	/**
	 * Navigates to the next page in the browser's history using JavaScript.
	 */
	public void navigateToForwardPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(1)");
	}

	/**
	 * Generates an alert popup with a custom message using JavaScript.
	 * 
	 * @param message Message to display in the alert popup.
	 */
	public void generateAlert(String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	/**
	 * Retrieves the inner text of the entire web page using JavaScript.
	 * 
	 * @return Inner text of the page as a String.
	 */
	public String getPageInnerText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}

	/**
	 * Clicks on a WebElement using JavaScript.
	 * 
	 * @param element WebElement to be clicked.
	 */
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * Sends text input to a field identified by its ID using JavaScript.
	 * 
	 * @param id    ID of the element to send keys to.
	 * @param value Text value to input into the element.
	 */
	public void sendKeysUsingWithId(String id, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
	}

	/**
	 * Scrolls the page to the bottom using JavaScript.
	 */
	public void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Scrolls the page down by a specific height using JavaScript.
	 * 
	 * @param height Height to scroll down (in pixels).
	 */
	public void scrollPageDown(String height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}

	/**
	 * Scrolls the page to the top using JavaScript.
	 */
	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	/**
	 * Scrolls to a specific element on the page using JavaScript.
	 * 
	 * @param element WebElement to scroll into view.
	 */
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * Draws a red border around a WebElement using JavaScript. Useful for visually
	 * highlighting elements during debugging or tests.
	 * 
	 * @param element WebElement to highlight with a border.
	 */
	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

}
