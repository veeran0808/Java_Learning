package veera_java_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws InterruptedException {

        // Create a new WebDriver instance (using Chrome in this case)
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com/");
        System.out.println("Page Title (Google): " + driver.getTitle());

        // Wait for 1 second before the next action
        Thread.sleep(1000);

        // Navigate to Amazon using the navigate().to() method
        driver.navigate().to("https://www.amazon.com/");
        System.out.println("Page Title (Amazon): " + driver.getTitle());

        // Wait for 1 second
        Thread.sleep(1000);

        // Navigate back to Google
        driver.navigate().back();
        System.out.println("Page Title (Back to Google): " + driver.getTitle());

        // Wait for 1 second
        Thread.sleep(1000);

        // Navigate forward to Amazon
        driver.navigate().forward();
        System.out.println("Page Title (Forward to Amazon): " + driver.getTitle());

        // Wait for 1 second
        Thread.sleep(1000);

        // Refresh the current page (Amazon)
        driver.navigate().refresh();
        System.out.println("Page Title (After Refresh): " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
