import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Practise {
WebDriver  driver;
ExtentReports extentreport; 
ExtentSparkReporter spark ;
ExtentTest testcase;


	@Test
	public void setUp() throws Exception {
		extentreport = new ExtentReports();
		 spark = new ExtentSparkReporter("pandareport.html");
		 extentreport.attachReporter(spark);
		 testcase = extentreport.createTest("launch the  the chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get( "http://live.techpanda.org/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    WebElement mobile = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
	    mobile.click();
	    WebElement fistmobile = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span"));
	    fistmobile.click();
	    
	    
	    Select dropdown = new Select(driver.findElement(By.xpath(
	  		  "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"
	  		  )));
	  		  
	  		  dropdown.selectByVisibleText("Name");
	  		 
	  		
	  	}
	  	
	  	@AfterTest
	  	public void createhtml() {
	  		extentreport.flush();
	  	}

	  }
	
	

