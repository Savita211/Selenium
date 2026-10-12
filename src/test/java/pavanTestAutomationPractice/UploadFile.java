package pavanTestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	WebDriver driver;
	@Test
	public  void uploadfile() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\shara\\Downloads\\sampleFile (1).jpeg");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String msg=driver.findElement(By.id("singleFileStatus")).getText();
		System.out.println(msg);
//		if(msg.contains("Single file selected")) {
//			System.out.println("file is uploaded successfully");
//		}
	}
}
