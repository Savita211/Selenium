package demoqa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeFullScreeenshot {
WebDriver driver;
	@Test
	public void takefullscreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.id("username")).sendKeys("student");
//		driver.findElement(By.id("password")).sendKeys("student345");
//		driver.findElement(By.id("submit")).click();
		
//		TakesScreenshot ts =  (TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File target=new File(".\\screenshots\\loginpage.pgn");
//		FileUtils.copyFile(src, target);

		//take source level screenshot
		driver.get("https://practicetestautomation.com/practice-test-table/");
//		WebElement table=driver.findElement(By.id("courses_table"));
//		File src=table.getScreenshotAs(OutputType.FILE);
//		File target=new File(".\\screenshots\\table.png");
//		FileUtils.copyFile(src,target);
//		
		//element level screenshot
	WebElement heading=	driver.findElement(By.xpath("//h1[text()='Test Table']"));
		File src=heading.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screenshots\\heading.png");
		FileUtils.copyFile(src, target);
		
	}
}
