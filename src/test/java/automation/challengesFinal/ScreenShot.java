package automation.challengesFinal;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {

		// 1. Declare instance of TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;

		//2. Call getScreenshotAs() which captures a screenshot and stores as File object.
		File source = ts.getScreenshotAs(OutputType.FILE);

		//3. use FileHandler.copy() to save the screenshot to a file in desired location.
		FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
	}
}
