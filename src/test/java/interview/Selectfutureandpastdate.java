package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectfutureandpastdate {

	public class SelectFutureAndPastDate {

	    public void selectFutureDate(WebDriver driver,
	                                 String year,
	                                 String month,
	                                 String date) {

	        while (true) {

	            String currentMonth = driver
	                    .findElement(By.xpath("//span[@class='ui-datepicker-month']"))
	                    .getText();

	            String currentYear = driver
	                    .findElement(By.xpath("//span[@class='ui-datepicker-year']"))
	                    .getText();

	            System.out.println("Current Month: " + currentMonth);
	            System.out.println("Current Year: " + currentYear);

	            if (currentMonth.equals(month) &&
	                currentYear.equals(year)) {

	                break;
	            }

	            driver.findElement(
	                    By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")
	            ).click();
	        }

	        List<WebElement> dates = driver.findElements(
	                By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	        );

	        for (WebElement dt : dates) {

	            if (dt.getText().equals(date)) {
	                dt.click();
	                break;
	            }
	        }
	    }


	    public void selectPastDate(WebDriver driver,
	                               String year,
	                               String month,
	                               String date) {

	        while (true) {

	            String currentMonth = driver
	                    .findElement(By.xpath("//span[@class='ui-datepicker-month']"))
	                    .getText();

	            String currentYear = driver
	                    .findElement(By.xpath("//span[@class='ui-datepicker-year']"))
	                    .getText();

	            System.out.println("Current Month: " + currentMonth);
	            System.out.println("Current Year: " + currentYear);

	            if (currentMonth.equals(month) &&
	                currentYear.equals(year)) {

	                break;
	            }

	            driver.findElement(
	                    By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")
	            ).click();
	        }

	        List<WebElement> dates = driver.findElements(
	                By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	        );

	        for (WebElement dt : dates) {

	            if (dt.getText().equals(date)) {
	                dt.click();
	                break;
	            }
	        }
	    }


	    public void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://jqueryui.com/datepicker/");

	        // Switch to iframe
	        driver.switchTo().frame(0);

	        // Open datepicker
	        driver.findElement(By.id("datepicker")).click();

	        // Select future date
	        SelectFutureAndPastDate obj = new SelectFutureAndPastDate();

	        obj.selectFutureDate(driver, "2026", "October", "20");
	    }
	}
}