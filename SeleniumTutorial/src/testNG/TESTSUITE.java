package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class TESTSUITE {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;
	ExtentReports extentreport; 
	ExtentSparkReporter spark ;
	ExtentTest testcase;
	
	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		extentreport = new ExtentReports();
		 spark = new ExtentSparkReporter("report.html");
		 extentreport.attachReporter(spark);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public void opengoogle()
	{
		testcase = extentreport.createTest("verify google title");
		testcase.log(Status.INFO, "Starting test case");
		driver.get("https://www.google.com/");
	}
	@Test
	public void openbing()
	{
		testcase = extentreport.createTest("verify bing title");
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openyahoo()
	{
		testcase = extentreport.createTest("verify openyahoo title");
		driver.get("https://www.yahoo.com/");
	}
	@AfterSuite
	public void closebrowser() {
		endtime = System.currentTimeMillis();
		totaltime= starttime - endtime;
		System.out.println("the total execution time is" +totaltime);
		driver.quit();
	}
	@AfterTest
	public void endReport() {
		extentreport.flush();
	}
	}

