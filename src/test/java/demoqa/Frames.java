package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
WebDriver driver;
	@Test
	public void frame() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.findElement(By.id("frame1Wrapper"));
		driver.switchTo().frame("frame1");
	String msg=	driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(msg);
	driver.switchTo().defaultContent();
	WebElement frame=driver.findElement(By.id("frame2"));
	driver.switchTo().frame(frame);
	}
}
