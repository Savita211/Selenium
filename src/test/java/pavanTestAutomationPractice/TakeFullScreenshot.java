package pavanTestAutomationPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeFullScreenshot {

	WebDriver driver;
	
	@Test
	public void takescreenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		//full screenshot
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screesnshots\\homepage.png");
		//src file we need to copy into target file
		FileUtils.copyFile(src, target);*/
		
		//screenshot of section/portion of page
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screesnshots\\homepage.png");
		//src file we need to copy into target file
		FileUtils.copyFile(src, target);
		
		driver.close();
		
	}
}
