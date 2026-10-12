package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTable2 {
WebDriver driver;
	@Test
	public void dynamictable() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//get no of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		System.out.println(rows.size());
		for(int r=1;r<=rows.size();r++) {
		WebElement name=	driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+r+"]//td[1]"));
		if(name.getText().equals("System")) {
			String systemvalue=driver.findElement(By.xpath("//td[text()='System']/following-sibling::td[4]")).getText();
			System.out.println(systemvalue);
		}
	
	
		}
		
	}
}