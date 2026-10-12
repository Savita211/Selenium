package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrames {
WebDriver driver;
@Test
	public void frames() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes/");
		driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		WebElement frame=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
	}
}
