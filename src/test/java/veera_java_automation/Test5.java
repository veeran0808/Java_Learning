package veera_java_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	  public static void main(String[] args) throws InterruptedException {

	        // Create a new WebDriver instance (using Chrome in this case)
	        WebDriver driver = new ChromeDriver();

	        // Navigate to Google
	        driver.get("https://www.google.com/");
	        System.out.println("Page Title (Google): " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	        System.out.println("Page Title (Google): " + driver.getTitle());
	        //org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	        
	        driver.close();
	        System.out.println("Page Title (Google): " + driver.getTitle());
	        //org.openqa.selenium.NoSuchSessionException: invalid session id
	        
	       
	    }
}