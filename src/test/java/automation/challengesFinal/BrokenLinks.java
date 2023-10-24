package automation.challengesFinal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.google.co.in/");

	//1. Identifying the link element and store into List of WebElement
		List<WebElement> links = driver.findElements(By.tagName("a"));

	//2. Use the loop to go through all the links
		for (int i = 0; i < links.size(); i++) {

	//2. Retrieve the WebElement at index 'i' using get() method
			WebElement ele = links.get(i);
			
	//3. Call getAttribute("href")method to identify the exact link 
			String linkUrl = ele.getAttribute("href");

	//4. 
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrl = (HttpURLConnection) url.openConnection();
			httpUrl.connect();

			if (httpUrl.getResponseCode() == 200) {
				System.out.println(linkUrl + "-" + httpUrl.getResponseMessage());
			}

			if (httpUrl.getResponseCode() == httpUrl.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + "-" + httpUrl.getResponseMessage() + "-" + httpUrl.HTTP_NOT_FOUND);
			}

		}
	}

	//Second: Directly from URL
	public static void verifyLinkActive(String linkUrl) {
		try {

			// In oder to validate the brokenlink first I need to create an object with the
			// help of URL Class
			// and pass the Link elements
		URL url = new URL(linkUrl);

			// 2. Now have to create an instance of HttpURLConnection interface
			// and pass the arg with the help of URL object call the
			// url.openConnection()method
			// It will connect all the URLs
		HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
		httpURLConnect.connect();

			// With the help of IF/ELSE condition we can validate the links
			// Condition example: with help of HTTP Instance i call getResponseCode() method
			// ==200
			// which returns success link

		if (httpURLConnect.getResponseCode() == 200) {
			System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}

			// ANother condition: with help of HTTP Instance
			// i call getResponseCode() method ==HttpURLConnection.HTTP_NOT_FOUND
			// which returns failed links
			// Then with the failed link i check manually in Postman using HTTP get methods
			// to double check.
		if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
		}
	}
}
