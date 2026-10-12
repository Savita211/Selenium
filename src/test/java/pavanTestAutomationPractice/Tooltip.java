package pavanTestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {
	WebDriver driver;
	@Test
public void tooltip() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/tooltip/");
	driver.switchTo().frame(0);
	WebElement inputbox=driver.findElement(By.xpath("//input[@id='age']"));
	String tooliptext=inputbox.getAttribute("title");
	System.out.println(tooliptext);
}
}
