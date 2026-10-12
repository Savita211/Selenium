package demoqa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Links {
	WebDriver driver;
@Test
	public void buttons() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.id("simpleLink")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		for(String window:allwindow) {
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getCurrentUrl());
			}
			
			
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("bad-request")).click();
//		String msg=driver.findElement(By.xpath("//b[contains(text(),'400']")).getText();
//		System.out.println(msg);
		//Assert.assertEquals(expected, "actual");
}
}