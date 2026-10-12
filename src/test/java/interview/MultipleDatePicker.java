package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleDatePicker {
static WebDriver driver;
@Test
	public static void selectmonthandyear(WebDriver driver,String month,String year) {
		
		//select month & year
		
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
}
		static void selectdate(WebDriver driver,String date) {
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement dt:dates) {
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		}
		
	
public static void main(String[] args) {
	WebDriver driver1=new ChromeDriver();
//if i am not using @test in main method i shd use
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

selectmonthandyear(driver,month,year);
selectdate(driver,date);
}
}