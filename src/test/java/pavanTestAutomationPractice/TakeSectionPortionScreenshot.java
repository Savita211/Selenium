package pavanTestAutomationPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeSectionPortionScreenshot {
WebDriver driver;
	@Test
	public void takescreenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		/*WebElement ele=driver.findElement(By.xpath("//table[@name='BookTable']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screesnshots\\statictable.png");
		//src file we need to copy into target file
		FileUtils.copyFile(src, target);*/
		
		//screenshot for specific element
		WebElement ele1=driver.findElement(By.cssSelector("h1[class='title']"));
		File src=ele1.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screesnshots\\title.png");
		//src file we need to copy into target file
		FileUtils.copyFile(src, target);
		
	}
}
