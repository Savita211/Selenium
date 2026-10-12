package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DatePickerDemo {
	static WebDriver driver;
	@Test
public void datepick() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	
	//switch to frame
	driver.switchTo().frame(0);
	
	//using sendkeys
	driver.findElement(By.id("datepicker")).sendKeys("08/27/2026");
	
	//using datepicker
	//expected data
	String month="October";
	String date="20";
	String year="2026";
	driver.findElement(By.id("datepicker")).click();//open date picker
	while(true) {
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println("currentmonth:"+currentmonth);
		System.out.println("currentyear:"+currentyear);
		if(currentmonth.equals(month) && currentyear.equals(year)) {
			break; //if condition is true it will break if condition & also while loop
		}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
	}
	//select the date
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	for(WebElement dt:dates) {
		if(dt.getText().equals(date)) {
			dt.click();
			break;
		}
	}
}
	
}
