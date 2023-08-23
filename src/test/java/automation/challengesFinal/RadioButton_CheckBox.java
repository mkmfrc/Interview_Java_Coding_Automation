package automation.challengesFinal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_CheckBox {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	String URL = "https://selenium08.blogspot.com/2019/08/radio-buttons.html";
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//Option: one 
	
	// Locate the radio button "Green".
	WebElement green = driver.findElement(By.xpath("//input[@name='green']"));

	// Verify that radio button is not selected before clicking on it.
	if (!green.isSelected()) {
		green.click();

	} else {
		System.out.println("Something is wrong, 'Green' option is not selected");
	}

	

	
	//Option: 2
	// Locate the radio button "Green".
		WebElement green1 = driver.findElement(By.xpath("//input[@name='green']"));
		
	if (green1.isEnabled() && green1.isDisplayed()) {
		// Using System.out.println method, we will display a message that will indicate
		// whether the verification was successful or not.
		System.out.println("Radio button is enabled and visible");
	} else {
		System.out.println("Radio button is disabled and invisible");
	}
	
}
	}

