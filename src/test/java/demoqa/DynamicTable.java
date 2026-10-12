package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTable {
WebDriver driver;
	@Test
	public void dynamictable() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table/");
	//get no of rows
	List<WebElement> rows=	driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
	System.out.println(rows.size());
	for(int r=1;r<rows.size();r++) {
		WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
		if(name.getText().equals("Chrome")) {
			String cuload=driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::*[contains(text(),'%')]")).getText();
			String cpuvalue=driver.findElement(By.id("chrome-cpu")).getText();
			if(cpuvalue.contains(cuload)) {
				System.out.println("cpu is matching with chrome cupu");
			}else {
				System.out.println("cpu is not matching with chrome cpu");
			}
			break;
		}
	}
	}
}


