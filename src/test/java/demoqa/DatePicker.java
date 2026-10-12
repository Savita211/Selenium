package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
WebDriver driver;
	@Test
	public void datepicker() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	String month="October";
	String year="2026";
	String date="21";
	driver.findElement(By.id("datepicker")).click();
	
	while(true) {
	String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	System.out.println(currentyear);
	String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	System.out.println(currentmonth);
	if(currentmonth.equals(month) && currentyear.equals(year)) {
		break;
		}
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
}
	List<WebElement> date1=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	for(WebElement dt:date1) {
		if(dt.getText().equals(date)) {
		dt.click();
		break;
	}
	
	}
	}
}