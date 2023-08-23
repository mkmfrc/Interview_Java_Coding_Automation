package automation.challengesFinal;



	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertPopup {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://example.com");

	        
	        // Find and click a button/link that triggers the alert
	        driver.findElement(By.id("trigger-button")).click();

	        // Switch to the alert popup
	        Alert alert = driver.switchTo().alert();

	        // Get the text of the alert message
	        String alertMessage = alert.getText();
	        System.out.println("Alert Message: " + alertMessage);

	        // Accept the alert (click OK)
	        alert.accept();

	        // Close the WebDriver
	        driver.quit();
	    }
	}

	
	
	

