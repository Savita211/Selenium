package demoqa;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinks {

	WebDriver driver;
	@Test
	public void alllinks() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
	List<WebElement> alllinks=	driver.findElements(By.tagName("a"));
	for(WebElement link : alllinks) {
		String url=link.getAttribute("href");
		//System.out.println(driver.Size());
		try {
			HttpURLConnection conn=(HttpURLConnection)  new URL(url).openConnection();
			conn.connect();
			int count=conn.getResponseCode();
			if(count>=400) {
				System.out.println("broken link:"+url);
			}else {
				System.out.println("valid link:"+url );
			}
		}catch(Exception e) {
			System.out.println("e.message");
		}
	}
	}
}
