package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import sun.net.www.protocol.http.HttpURLConnection;

public class AllLinks {

	List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement link : links) {
		System.out.println(link.getText());
	}
	if(link.getText().contains("Login")) {
		System.out.println("login is present:"+link.getText());
	}
}

WebElement element=driver.findElement(By.id("light"));

JavaScriptExecutor js =  (JavaScriptExecutor) driver;
js.ExecuteScript(argumets[0].Style.Border='red 3px',element);

List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println(links.size());
String url=links.getAttribute("href");
for(WebElement link :links) {
	HttpURLConnection conn=(HttpURLConnection) new URL(url).openconnection();
	conn.connect();
	int count=conn.getResponseCode();
	if(count>=400) {
		System.out.println("link is broken");
	}else {
		System.out.println("link is not broken");
	}
	}