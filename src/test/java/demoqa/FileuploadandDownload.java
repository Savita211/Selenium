package demoqa;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileuploadandDownload {
WebDriver driver;
	@Test
	public void fileuploadnddownload() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.id("downloadButton")).click();
		String src="C:\\Users\\shara\\Downloads";
		File file=new File(src+"\\sampleFile.jpeg");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(d -> file.exists());
		System.out.println(file.exists());
		
		//upload
		driver.findElement(By.id("uploadFile")).sendKeys("\"C:\\Users\\shara\\Downloads\\sampleFile (1).jpeg\"");
	}
}
