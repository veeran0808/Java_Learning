package veera_java_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates handling JavaScript popups (alerts, confirms, and prompts) using Selenium WebDriver.
 * It includes handling three types of JavaScript popups:
 * 1. Alert - A simple popup with an "OK" button.
 * 2. Confirm - A popup with "OK" and "Cancel" buttons.
 * 3. Prompt - A popup with a text field where the user can enter input.
 */
public class JSPopUpHandling {

    /**
     * Main method that demonstrates how to interact with JavaScript popups.
     * The method demonstrates handling alert, confirm, and prompt popups on a sample webpage.
     *
     * @param args Command line arguments (not used in this program).
     * @throws InterruptedException if the thread is interrupted during sleep.
     */
    public static void main(String[] args) throws InterruptedException {

        // Initialize the WebDriver and navigate to the webpage with JavaScript popups.
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1. Handling JavaScript Alert:
        //    JavaScript alert displays a simple message with an OK button.
        //    - We click the alert button, switch to the alert popup, get its text, and accept it.
        //    - Alternatively, you can dismiss the alert instead of accepting it.
        
        // Uncomment the following lines to test JavaScript Alert:
        /*
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert(); // Switch to the alert popup
        String text = alert.getText(); // Get text from the alert popup
        System.out.println(text); // Print the alert text to the console
        
        alert.accept(); // Accept the alert (click "OK")
        // alert.dismiss(); // Optionally dismiss the alert (click "Cancel" or close the alert)
        */

        // 2. Handling JavaScript Confirm:
        //    JavaScript confirm displays a message with OK and Cancel buttons.
        //    - After triggering the confirm popup, we can either accept or dismiss it.
        //    - Accepting the popup will click "OK", while dismissing it clicks "Cancel".
        
        // Uncomment the following lines to test JavaScript Confirm:
        /*
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);

        Alert confirmAlert = driver.switchTo().alert(); // Switch to the confirm popup
        String confirmText = confirmAlert.getText(); // Get text from the confirm popup
        System.out.println(confirmText); // Print the confirm popup text to the console
        
        // confirmAlert.accept(); // Accept the confirm popup (click "OK")
        confirmAlert.dismiss(); // Dismiss the confirm popup (click "Cancel")
        */

        // 3. Handling JavaScript Prompt:
        //    JavaScript prompt displays a message with a text input field, an OK button, and a Cancel button.
        //    - After triggering the prompt popup, we can send text to the input field, then accept or dismiss the prompt.
        
        // Test JavaScript Prompt:
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(); // Trigger the prompt popup
        Thread.sleep(3000);

        Alert promptAlert = driver.switchTo().alert(); // Switch to the prompt popup
        String promptText = promptAlert.getText(); // Get text from the prompt popup
        System.out.println(promptText); // Print the prompt text to the console
        
        // Send input text to the prompt (this is the text that will be entered in the input field)
        promptAlert.sendKeys("naveenautomationlabs");
        Thread.sleep(3000); // Wait for 3 seconds to observe the entered text

        promptAlert.accept(); // Accept the prompt (click "OK")
        // promptAlert.dismiss(); // Optionally dismiss the prompt (click "Cancel")

        // Note: NoAlertPresentException is thrown when there is no alert present on the page.
        // This can happen if you attempt to interact with an alert when one is not displayed.

        driver.quit(); // Close the browser window
    }
}
