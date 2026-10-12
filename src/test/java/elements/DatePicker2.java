package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {
WebDriver driver;
	@Test
	public void datepicker() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("third_date_picker")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel=new Select(dropdown);
		sel.selectByValue("1");
		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel1=new Select(dropdown2);
		sel.selectByValue("2022");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		//dates
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td"));
		for(WebElement dt:dates) {
			if(dt.getText().equals(21)) {
				dt.click();
				break;
			}
		}
	}
}
