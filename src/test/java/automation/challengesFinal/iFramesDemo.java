 package automation.challengesFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class iFramesDemo {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");

		driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		
		
		//To handle the frame i have to use driver.switchTo().frame() method
		//and on the frame() parameter im locating the exact frame using xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
		
		//This is how i can skip the frame and locate my desired element.
		 
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
	}

}