 package automation.challengesFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class iFramesDemo {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");

		driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		
		//First I have to identify the Frame using Locator 
		//and storing into a WebElement object
		WebElement frameObj = driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]"));
		
		//To handle the frame i have to use driver.switchTo().frame() method
		//and on the frame() parameter i have to pass that WebElement object
		
		driver.switchTo().frame(frameObj);
		
		//To switch back to parent frame (if that frame is within another frame)
		// driver.switchTo().defaultContent();
		
		//This is how i take control of the frame and perform any action with my desired element.
		 
		// driver.findElement(By.xpath("//input[@name='name']")).sendKeys("fdfdf");
	}

}