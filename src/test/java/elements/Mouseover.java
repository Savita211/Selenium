package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover {
WebDriver driver;
	@Test
	public void mouseover() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//doubleclick
WebElement doubleclick=	driver.findElement(By.id("doubleClickBtn"));
Actions act=new Actions(driver);
//act.doubleClick(doubleclick).perform();
act.doubleClick(doubleclick).build().perform();

String msg=driver.findElement(By.id("doubleClickMessage")).getText();
System.out.println(msg);

//rightclick
 WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
act.contextClick(rightclick).build().perform();
String msg1=driver.findElement(By.id("rightClickMessage")).getText();
System.out.println(msg1);

WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
act.click(click).perform();
String msg2=driver.findElement(By.id("dynamicClickMessage")).getText();
System.out.println(msg2);
	}
}
