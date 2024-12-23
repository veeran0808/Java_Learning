package veera_java_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(3000);
		
		//Print Frame Count 
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		
		
		//iframe: w3c
		
		//frame: deprecated
		//1.Switch frame by index :
		driver.switchTo().frame(2);	
		
		//2.Switch frame by Name 
		driver.switchTo().frame("main");
		
		//3.Switch Frame by WebElement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		//Print header in frame
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
	}

}