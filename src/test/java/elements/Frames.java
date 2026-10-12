package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;
	@Test
	public void frames() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
	List<WebElement> frame=	driver.findElements(By.id("frame1Wrapper"));
	for(int i=0;i<frame.size();i++) {
		driver.switchTo().frame(i);

		
	}
//	System.out.println(frame.size());
	}
}
