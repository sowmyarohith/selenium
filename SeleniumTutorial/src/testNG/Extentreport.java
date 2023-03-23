package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	ExtentReports extentreport; 
	ExtentSparkReporter spark ;
	ExtentTest testcase;
WebDriver driver;
@BeforeSuite
	public void openbrowser() {
		
		extentreport = new ExtentReports();
		 spark = new ExtentSparkReporter("firstreport.html");
		 extentreport.attachReporter(spark);
		 testcase = extentreport.createTest("launch the  the chrome browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
@Test
	public void opengoogle() {
		testcase = extentreport.createTest("open the google search page");
		driver.get("https://www.google.com/");
	
		testcase = extentreport.createTest(" click the signup link and login ");
		testcase.log(Status.FAIL, "Starting test case");
		/*
		 * driver.findElement(By.partialLinkText(
		 * "https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
		 * )).click();
		 */
		 driver.findElement(By.xpath("//*[@id='gb']/div/div[2]/a")).click();
		 String oldwindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			
			/*
			 * for (String newwindow : handles) { driver.switchTo().window(newwindow);
			 * 
			 * } WebElement searchbox =
			 * driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input")
			 * ); searchbox.click(); searchbox.sendKeys("home");
			 */
	}

@AfterTest
public void createhtml() {
	extentreport.flush();
}
public static ExtentTest createTest(String string) {
	// TODO Auto-generated method stub
	return null;
}


}