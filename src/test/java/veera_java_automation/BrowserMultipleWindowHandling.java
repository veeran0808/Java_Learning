package veera_java_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Demonstrates handling multiple browser windows using Selenium WebDriver.
 * Opens links in new windows, switches between them, and performs actions such as closing the child windows.
 */
public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the OrangeHRM trial page (parent window)
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String parentWindowId = driver.getWindowHandle(); // Store parent window ID

		// Locate footer links that open in new windows or tabs
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));

		// Use Actions class to click on links
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
		act.click(pressReleases).perform();
		act.click(newsArticles).perform();
		act.click(csSupport).perform();

		// Fetch all window IDs (handles)
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		// Iterate through window handles
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId); // Switch to the current window
			System.out.println("Window title: " + driver.getTitle()); // Print the title of the window

			// Close the child window if it's not the parent window
			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}

			// Pause briefly to observe actions
			Thread.sleep(1500);
		}

		// Switch back to the parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title: " + driver.getTitle());
	}

}
