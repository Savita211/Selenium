package pavanTestAutomationPractice;

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
		driver.get("https://dev.automationtesting.in/frames");
	WebElement parentframe=	driver.findElement(By.xpath("//div[@class='MuiBox-root css-13u7h2s']"));
		//single frame
		WebElement frame1=driver.findElement(By.id("single_iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("email")).sendKeys("savita@gamil.com");
		
		//switch back to main frame
		driver.switchTo().defaultContent();
		//nested iframe
		
		driver.findElement(By.xpath("//button[@id='vertical-tab-1']")).click();
	}
}
