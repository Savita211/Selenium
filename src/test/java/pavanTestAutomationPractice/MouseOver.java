package pavanTestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	WebDriver driver;
	@Test
	public void mouseover() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://testautomationpractice.blogspot.com/");
	//mouseover
	WebElement mouseovr=driver.findElement(By.xpath("//button[text()='Point Me']"));
	Actions act=new Actions(driver);
	act.moveToElement(mouseovr).build().perform();
	
	//doubleclick
	WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	Actions act1=new Actions(driver);
	act1.doubleClick(doubleclick).build().perform();
	
	//drag and srop
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Actions act2=new Actions(driver);
	act2.dragAndDrop(drag, drop).build().perform();
}
}