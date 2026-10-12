package demoqa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pavanTestAutomationPractice.Alerts;

public class WebTable {

	WebDriver driver;
	@Test
	public void webtable() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.id("addNewRecordButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement popup = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//div[@class='modal-content']")
		    )
		);
		driver.findElement(By.id("firstName")).sendKeys("john");
		driver.findElement(By.id("lastName")).sendKeys("doe");
		
		driver.findElement(By.id("userEmail")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.id("age")).sendKeys("21");
		driver.findElement(By.id("salary")).sendKeys("70000");
		driver.findElement(By.id("department")).sendKeys("testing");
		driver.findElement(By.id("submit")).click();
		
		//search
		

//		WebElement searchBox = wait.until(
//		    ExpectedConditions.visibilityOfElementLocated(By.id("searchBox"))
//		);
//		searchBox.clear();
//		searchBox.sendKeys("Kierra");
//		System.out.println("Before click: " + searchBox.getDomProperty("value"));
//		System.out.println("Value: " + searchBox.getAttribute("value"));
//		//driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("Kierra");
//		driver.findElement(By.id("basic-addon2")).click();
//		System.out.println("After click: " + searchBox.getDomProperty("value"));
//		
		//count total rows
		List<WebElement> countrows=driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']/tbody/tr"));
		System.out.println("countrows:"+countrows.size());
		
		//count columns
		List<WebElement> countcolumn=driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']/thead/tr/th"));
		System.out.println("countcolumn:"+countcolumn.size());
		
		//fetch all data present in table
		List<WebElement> alldata=driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']"));
		System.out.println(alldata.get(0).getText());
		
		//fetch salary of alden
		String email=driver.findElement(By.xpath("//td[text()='alden@example.com']")).getText();
		
	
		System.out.println("email of alden:"+email);
	}
}
