package pavanTestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DataForm {

	WebDriver driver;
	@Test
	public void form() {
		WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("name")).sendKeys("savita");
	driver.findElement(By.id("email")).sendKeys("savita@123gmail.com");
	driver.findElement(By.id("phone")).sendKeys("9843233489");
	driver.findElement(By.id("textarea")).sendKeys("12th,2nd main kaveripura");
            
	//radio button
	List<WebElement> radios1 = driver.findElements(By.xpath("//input[@name='gender']"));

	for (WebElement radio : radios1) {
	    radio.click();
	   
	    System.out.println(radio.isSelected());
	}
	
	
	
	}
}
