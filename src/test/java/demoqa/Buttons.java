package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons {
WebDriver driver;
	@Test
	public void buttons() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//double click
		Actions act=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).build().perform();
		String msg=driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(msg);
		
		//rigth click
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).build().perform();
		String msg1=driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(msg);
		
		//click
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	}
}
