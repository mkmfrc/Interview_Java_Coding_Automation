package automation.challengesFinal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	
		//1. First I have to identify the element using xpath 
		//that need to drag and store in into a WebElement
	WebElement drag = driver.findElement(By.xpath("//*[text()=' BANK ']"));
	
		//2. Same way I have to identify the element using xpath 
		//where i want to drop and store in into another WebElement 
	WebElement drop = driver.findElement(By.xpath("//*[@id='bank']"));
	
		//Then I have to create an object using Actions Class and pass driver as parameter
	Actions ac = new Actions(driver);
	
		//Finally using the object i call the dragAndDrop() method 
		//and pass both the stored WebElements as parameters to perform the action.
	ac.dragAndDrop(drag, drop).build().perform();
	
	
	
	
	
	//No need (Same process)
	//Second Element
	//WebElement dragD = Driver.findElement(By.xpath("//*[text()=' 5000']"));
	
	//WebElement dropA = Driver.findElement(By.xpath("//*[@id='amt7']"));
	//ac.dragAndDrop(dragD, dropA).build().perform();
}
}