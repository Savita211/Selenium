package Q2Automationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LaunchBrowser {
WebDriver driver;
	public void launchapp() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	public void launchappvalidateTitle() {
		String actualTitle=driver.getTitle();
		String expectedtitle="Swag Labs";
		Assert.assertEquals(actualTitle, expectedtitle);
		Assert.assertEquals(actualTitle, expectedtitle);
	}
}
