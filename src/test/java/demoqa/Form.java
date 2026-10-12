package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Form {

	WebDriver driver;
	@Test
	public void form() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("john");
		driver.findElement(By.id("lastName")).sendKeys("doe");
		driver.findElement(By.id("userEmail")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/following::input[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9732521698");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement dropdown=driver.findElement(By.className("react-datepicker__month-select"));
		
		Select sel=new Select(dropdown);
	//	sel.selectByValue("8");
	sel.selectByVisibleText("September");
	dropdown.click();
//		sel.selectByIndex(5);
	
	//select date
	List<WebElement> dates=driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div/div"));
	
	for(WebElement dt:dates) {
		if(dt.getText().equals("17")) {
			dt.click();
			break;
		}
	}
	
	WebElement subj = driver.findElement(By.id("subjectsInput"));

	subj.sendKeys("Computer");
	List<WebElement> options = driver.findElements(
		    By.xpath("//div[contains(@class,'subjects-auto-complete__option')]")
		);

		for (WebElement option : options) {
		    if (option.getText().contains("Computer")) {
		        option.click();
		        break;
		    }
		}
	WebElement doc=driver.findElement(By.id("uploadPicture"));
	doc.click();
	doc.sendKeys("sampleFile (1).jpeg");
	
	
	}
}
