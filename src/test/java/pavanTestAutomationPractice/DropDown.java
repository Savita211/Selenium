package pavanTestAutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	WebDriver driver;
	@Test
	public void dropdown() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement drop=driver.findElement(By.id("country"));
//		Select select=new Select(drop);
//		//select.selectByValue("india");
//		//select.selectByVisibleText("France");
//		select.selectByIndex(1);
		
		//without select tag
		WebElement dropdown=driver.findElement(By.id("comboBox"));
		dropdown.click();
    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);", dropdown);
		List<WebElement> lists=driver.findElements(By.xpath("//div[@id='dropdown']/div"));
		System.out.println(lists.size());
		for(WebElement list :lists) {
			if(list.getText().equals("Item 14")) {
				list.click();
				
			}
		}
	}
	
}
