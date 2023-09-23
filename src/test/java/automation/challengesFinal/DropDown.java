package automation.challengesFinal;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	// 1st way and Easy Way
		
		//First I have to identify the dropDown using Locator 
				//and storing into a WebElement object
		
		WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
		
		//1. Now  declaring the Select Class Object
			//and on parameter I am passing the WebElement object
			
			Select obj = new Select(dropDown);
		
		//2. Now using Select class object I can call selectByIndex() and pass the index number
		//or selectByVisibleText() or selectByValue()
		
			obj.selectByIndex(1);
		
		//or 
			obj.selectByVisibleText("Blue"); 
		
		//or
			obj.selectByValue("1");
		
	
		 
		 
		 
	// 2nd way and important with creating dropdown function seperately
		//1. 
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		getDropDown(ele, "Blue");
		Thread.sleep(5000);
		getDropDown(ele, "Red");
		Thread.sleep(5000);
		getDropDown(ele, "Yellow");
		Thread.sleep(5000);

	}

	public static void getDropDown(List<WebElement> ele, String text) {
		ele = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		// System.out.println("Total size of vale : "+ele.size());
		for (WebElement newEle : ele) {
			// System.out.println("Value Name : "+newEle.getText());
			if (text.equals(newEle.getText())) {
				newEle.click();
				break;
			}
		}

	}
}
