package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdownwithoutselecttag {

	WebDriver driver;
	@Test
	public void dropdown() {
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php");
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		List<WebElement> options=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
		        By.xpath("//a[text()='Dropdown']")
		));
		
	
	for(WebElement option:options) {
		if(option.getText().equals("Action")) {
			option.click();
			break;
		}
				}
}
}