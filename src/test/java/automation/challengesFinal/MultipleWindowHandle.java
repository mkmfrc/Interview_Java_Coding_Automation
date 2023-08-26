package automation.challengesFinal;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
				
        //1st i can take a control main window with the help 
		//driver.getWindowHandle()method and store in a String object/variable
		String mainWindow = driver.getWindowHandle();

		// 2nd i can take a control all of the child window with help of 
		//driver.getWindowHandles()method and store in to the set interface instance 
		Set<String> childWindow = driver.getWindowHandles();

		
		// 3rd With the help set instance i can call iterator() method to go through all child windows 
		// and store into Iterator instance
		Iterator<String> iterator = childWindow.iterator();

		
		// 4th with help of while loop i can pass the hasNext() method
		// so that ignore the main window.
		while (iterator.hasNext()) {
			
			// 5th then i can call the next() method count all the child window
			// And store into the string variable.
			String child = iterator.next();

		// 6th i write down the if condition and pass the argument
			// to close the child window with the help of driver.switchTo() method
	
			if (!mainWindow.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}

		// 7th finally i can switch back main window with the help of
		//driver.switchTo().
		driver.switchTo().window(mainWindow);

	}
}