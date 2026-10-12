package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tabs {

	WebDriver driver;
	@Test
	public void tab() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		
	}
}
