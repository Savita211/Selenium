package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	
WebDriver driver;
@Test
	public void checkbox() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		
String msg=driver.findElement(By.id("result")).getText();
System.out.println(msg);
}
}
