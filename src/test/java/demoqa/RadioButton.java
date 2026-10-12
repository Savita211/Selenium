package demoqa;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
WebDriver  driver;
	@Test
	public void radiobutton() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		List<WebElement> radiobtn = driver.findElements(
			    By.xpath("//div[@class='col-auto form-check']")
			);

		radiobtn.get(1).click();//select either one of two
		String msg=driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(msg);
//			for(int i = 0; i < 2; i++) {
//
//			    if(i==0) {
//			    	radiobtn.get(i).click();
//			    	break;
//			    }
//			}
	}
}
