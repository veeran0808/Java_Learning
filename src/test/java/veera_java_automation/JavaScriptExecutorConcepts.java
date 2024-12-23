package veera_java_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) {
		// Java script Executor
		// Java -> JS Code -> JavaScript Executor(I) -- Execute Script code
		// executeScript is method
		// Implementation should be done RemoteWebDriver class

		// topcasting
		WebDriver driver = new ChromeDriver();
		// interface casting -> one interface to another interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

	}

}
