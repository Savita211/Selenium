package testng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyClass implements ITestListener{
	
	WebDriver driver;
	public void onTestFailure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			try {
				TakesScreenshot ts1=null;
				TakesScreenshot ts= (TakesScreenshot) driver;
				 File src=ts.getScreenshotAs(OutputType.FILE);
				File target=new File("./screenshots/"+result.getName()+".png");
				FileUtils.copyFile(src, target);
				System.out.println("screenshot captured successfully");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	}


