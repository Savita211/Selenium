package pavanTestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ShadowDOM {
WebDriver driver;

@Test
	public void shadow() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement shadowhost=driver.findElement(By.id("shadow_content"));
		SearchContext shadowroot=shadowhost.getShadowRoot();
				WebElement ele=shadowroot.findElement(By.cssSelector("#info"));
	
	}

}