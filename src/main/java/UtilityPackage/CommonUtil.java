package UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;


public class CommonUtil{

	static WebDriver driver;

	public static void getAssertions(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	
	}

	public static void hoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	
	
	public static void highLighterMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}

	public static String captureScreen() {
		String path;
		try {
			driver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			path = "./Screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
	}
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	 public static void getDropDown(List<WebElement> ele, String text) {
		   //System.out.println("Total size of vale : "+ele.size());
		   for(WebElement newEle : ele) {	
				//System.out.println("Value Name : "+newEle.getText());
				if (text.equals(newEle.getText())) {
					newEle.click();
					break;
				}
			}

	 }
	 
public static void scrollVeiwElements(WebElement ele) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", ele);
}


public static void getWindowHandles() {
	 //1st i can take a control main window with the help 
	//driver.getWindowHandle(); method and store in string variable
	String mainWindow = driver.getWindowHandle();
	// 2nd i can take a control all of the child window with help of 
	//driver.getWindowHandles();method and store in to the set interface instance 
	Set<String> childWindow = driver.getWindowHandles();
	// 3rd With the help set instance i can call iterator(); method to go through
	// all child window and store in to Iterator instance
	Iterator<String> it = childWindow.iterator();
	// 4th with help of while loop i can pass the hasNext() method
	// so that ignore the main window.
	while (it.hasNext()) {	
		// 5th then i can call the next(); method count all the child window
		// And store into the string variable.
		String child = it.next();
	// 6th i write down the if condition and pass the argument
		// to close the child window with the help of driver.switchTo() method
		if (!mainWindow.equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			driver.close();
		}}
	// 7th finally i can switch back main window with the help of
	//driver.switchTo().
	driver.switchTo().window(mainWindow);

}
}

