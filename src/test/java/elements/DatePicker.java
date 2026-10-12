package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePicker {
	
WebDriver driver;
@Test
	public void table() {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		String month="November";
		String year="2027";
		String date="21";
		driver.findElement(By.id("first_date_picker")).click();
		while(true) {
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(currentyear);
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(currentmonth);
		if(currentyear.equals(year)  && currentmonth.equals(month)) {
			break;
		}
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		 WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Next']")));
//		 ele.click();
//		driver.findElement(By.xpath("//a[@title='Next']")).click();
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", next);
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td"));
		for(WebElement dt:dates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}
