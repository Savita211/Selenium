package pavanTestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alerts {

	WebDriver driver;
	@Test
	public void alerts() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.id("alertBtn")).click();
	
	//alert.accept();
	
	//confirmation alert
//	driver.findElement(By.id("confirmBtn")).click();
//	Alert alert=	driver.switchTo().alert();
//	alert.accept();
//	String msg=driver.findElement(By.id("demo")).getText();
//	System.out.println(msg);
//	
	//prompt alert
		driver.findElement(By.id("promptBtn")).click();
		Alert alert=	driver.switchTo().alert();
		alert.sendKeys("savita");
		alert.accept();
		String msg=driver.findElement(By.id("demo")).getText();
		System.out.println(msg);
		}
}
