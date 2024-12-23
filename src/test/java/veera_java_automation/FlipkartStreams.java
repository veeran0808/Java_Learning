package veera_java_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartStreams {

	public static void main(String[] args) {
		// https://www.flipkart.com/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> linksList = driver.findElements(By.id("a"));
		//e is variable no need to write type
		linksList.stream().forEach(e -> System.out.println(e.getText())); 
	}

}
