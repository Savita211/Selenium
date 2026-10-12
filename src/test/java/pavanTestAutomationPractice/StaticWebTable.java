package pavanTestAutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class StaticWebTable {

	WebDriver driver;
	@Test
	public void statictable() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://testautomationpractice.blogspot.com/");
	//no of columns
	List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
	System.out.println("no of columns:"+columns.size());
	
	//no of rows
	List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	System.out.println("no of rows:"+rows.size());
	
	//bookname of amod
	WebElement bookname=driver.findElement(By.xpath("//td[text()='Amod']/preceding-sibling::td[1]"));
	String book=bookname.getText();
	System.out.println("bookname of amod="+book);
}
}