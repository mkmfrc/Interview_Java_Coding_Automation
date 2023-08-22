package automation.challengesFinal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownScrollUp {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement ele = driver.findElement(By.xpath(""));
		 //js.executeScript("arguments[0].scrollIntoView();", ele);
		 //js.executeScript("window.scrollBy(0,1500)");
		 
		//1. First creating an Actions class object and pass the driver as parameter
		 Actions ac = new Actions(driver);
		 
		 //Using the object i can call sendKeys() method
		 //and in parameter i can pass Keys.PAGE_DOWN to perform required action 
		 
		 ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		 
	}
}