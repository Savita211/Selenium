package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Datepicker1 {
WebDriver driver;
	@Test
	public void datepicker() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		driver.findElement(By.id("txtDate")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Mar");
		WebElement dropdown2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel1=new Select(dropdown2);
		sel1.selectByIndex(7);
		
		List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement dt:date) {
			if(dt.getText().equals("21")) {
				dt.click();
				break;
			}
		}
		
	}
}
