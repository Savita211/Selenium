package pavanTestAutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	
	WebDriver driver;
	@Test
	public void checkbox() {
		
		WebDriver driver=new ChromeDriver();
	//checkbox
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//select all checkboxes
		for(WebElement checkbox:checkboxes) {
			
			checkbox.click();
		}
		
		//selecting first 3 checkboxes
		List<WebElement> checkboxes1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
		for (int i = 0; i < 3; i++) {
		    checkboxes.get(i).click();
		}
		
		
		//select last 2 checkbox
		List<WebElement> checkboxes2 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = checkboxes2.size() - 2; i < checkboxes2.size(); i++) {
		    checkboxes.get(i).click();
		}
		
		//selecting monday and friday
		List<WebElement> checkboxes3= driver.findElements(By.xpath("//input[@type='checkbox']"));

		checkboxes3.get(1).click(); // Monday
		checkboxes3.get(5).click(); // Friday
		
		//selecting all except wensday
		List<WebElement> checkboxes4 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkbox : checkboxes) {
		    if (!checkbox.getAttribute("id").equals("wednesday")) {
		        checkbox.click();
		    }
		}
		
		//print the name of all checkboxes
		List<WebElement> checkboxes5 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkbox : checkboxes) {
		    System.out.println(checkbox.getAttribute("id"));
		}
		
		//select only if not already selected 
		List<WebElement> checkboxes6= driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkbox : checkboxes) {
		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    }
		}
	}
}
