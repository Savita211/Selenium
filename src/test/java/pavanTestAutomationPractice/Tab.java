package pavanTestAutomationPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tab {

	WebDriver driver;
	@Test
	public void tab() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	String window1=driver.getWindowHandle();
Set<String> windows=driver.getWindowHandles();
for(String window:windows) {
	 if (!window.equals(window1)) {   
	        driver.switchTo().window(window); 
	     System.out.println(driver.getCurrentUrl());
	        
	    }  
	 driver.switchTo().window(window1);
}
}
}