package interview;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
@DataProvider(name="loginData")
public Object[][] getdata(){
	return new Object[][] {
		{"admin","admin123"},
		{"user1","pwd1"}
	};
	
}
@Test(dataProvider="loginData")
public void test(String username,String password) {
	System.out.println("username"+username);
	System.out.println("password"+password);
}
}

