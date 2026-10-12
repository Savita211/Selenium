package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
WebDriver driver;
	@Test
	@Parameters({"browser","env"})
		public void launchapp(String browser,String env) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			String url="";
			if(env.equalsIgnoreCase("qa")) {
				url="https://ajayautomates.com";
			}else if(env.equalsIgnoreCase("prod")) {
				url="https://prodenviroment.com";
			}
			driver.get(url);
		}
	
		
	}

