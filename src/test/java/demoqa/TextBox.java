package demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TextBox {

	WebDriver driver;
	@Test
	public void textbox() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("john doe");
		driver.findElement(By.id("userEmail")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("12,3rd cross rd,govindraj nagar ward,kaveripura");
	driver.findElement(By.id("permanentAddress")).sendKeys("erfdf,erfosdfenefj");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement submit = wait.until(
	    ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[normalize-space()='Submit']")
	    )
	);

	((JavascriptExecutor) driver).executeScript(
	    "arguments[0].scrollIntoView({block:'center'});", submit
	);

	wait.until(ExpectedConditions.elementToBeClickable(submit));

	submit.click();
	}
}
