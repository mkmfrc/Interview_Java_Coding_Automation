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
	      driver.findElement(By.id("trigger-button")).click();

	      //Alert Handle
	      
	        // First Creating the Alert Interface instance 
	        //than driver.switchTo() & alert() methods I will take control of the alert popup
	        Alert alert = driver.switchTo().alert();

	        // By calling getText() method to get the text of the alert message
	        String alertMessage = alert.getText();
	       // System.out.println("Alert Message: " + alertMessage);
	        
	        alert.sendKeys("7989");
	        
	        // Finally Accept or Dismiss the alert 
	        alert.accept(); // alert.dismiss();

	        // Close the WebDriver
	        driver.quit();
	    }
	}

	
	
	

