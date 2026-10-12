package demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToolTips {

	WebDriver driver;
	@Test
	public void ttoltip() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
	
	WebElement btn=driver.findElement(By.id("toolTipTextField"));
	String tooltiptext=btn.getAttribute("title");
	System.out.println(tooltiptext);
}
}