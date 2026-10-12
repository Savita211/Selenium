package pavanTestAutomationPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Brokenlink {

	WebDriver driver;
	@Test
	public void brokenlinks() throws Exception, Exception {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://testautomationpractice.blogspot.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no of link"+links.size());
	
	for(WebElement link:links) {
		String url=link.getAttribute("href");
		try {
		    HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		    conn.setRequestMethod("GET");
		    conn.connect();

		    int code = conn.getResponseCode();

		    if(code >= 400) {
		        System.out.println(url + " --> Broken Link (" + code + ")");
		    } else {
		        System.out.println(url + " --> Valid Link (" + code + ")");
		    }
		}catch(Exception e) {
			System.out.println("url +"+e.getMessage());
		}
		
	}
}
}