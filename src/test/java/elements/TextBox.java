package elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {

	WebDriver driver;
	@Test
	public void alert() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
