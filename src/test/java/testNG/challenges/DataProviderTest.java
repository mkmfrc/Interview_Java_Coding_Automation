package testNG.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	WebDriver driver;
	
	@DataProvider(name = "Verification")
	public static Object[][] credentials(){
		return new Object[][] {
			{ "tanvirpatwary16@gmail.com", "Tester01", "Valid Credentials" },
			{ "tanvirpatwary45@gmail.com", "Tester001", "Invalid Credentials"}, 
			{ "tanvirpatwary00@gmail.com", "Tester000", "Invalid Credentials" },
			{ "test123456565656@gmail.com", "dsfsf", "Invalid Credentials" } };
	}
	
	@Test(dataProvider = "Verification" )
	public void getLogin(String UserName, String Password, String ValidationCredential) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		if(ValidationCredential.contains("Invalid Credentials")) {
			String validationText = driver.findElement(By.xpath("//*[text()= 'Your email or password is incorrect!']")).getText();
			Assert.assertEquals(validationText, "Your email or password is incorrect!");
			//System.out.println("Validation Text : " + validationText );
		}else {
			String validationText = driver.findElement(By.xpath("//*[text()=' Home']")).getText();
			Assert.assertEquals(validationText.trim(), "Home");
			//System.out.println("Validation Text : " + validationText );
		}
		
		Thread.sleep(1000);
		driver.quit();
	}
}
