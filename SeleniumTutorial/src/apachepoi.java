import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class apachepoi {

	
	static WebDriver driver;
	ExtentReports extentreport; 
	ExtentSparkReporter spark ;
	ExtentTest testcase;

	/*
	 * String actualtitle; String expectedtitle;
	 */
	
	@BeforeTest
	public void launchdriver() {

		extentreport = new ExtentReports();
		 spark = new ExtentSparkReporter("apachereport.html");
		 extentreport.attachReporter(spark);
		 testcase = extentreport.createTest("launch the  the chrome browser");
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
			 driver = new ChromeDriver();
				/* driver.get("https://www.demo.guru99.com/v4/"); */
	}
	
	@Test
	public void verifylogindetails() {
		 testcase = extentreport.createTest("to verify the login details");
		driver.get("https://www.demo.guru99.com/v4/");

String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			
			  String expectedtitle = "THIS IS DEMO SITE";
			  if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			  System.out.println("title is correct"); }
			  
			  else { System.out.println("title is not correct"); }
			 
	
		
		
		/*
		 * WebElement sorttable = driver.findElement(By.xpath(
		 * "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"
		 * )); sorttable.click(); Select dropdown = new Select(sorttable);
		 * dropdown.selectByVisibleText("Name");
		 */
		
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

	
	
	

