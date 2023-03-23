import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import testNG.Extentreport;

public class PandaTest {
WebDriver driver;
ExtentReports extentreport; 
ExtentSparkReporter spark ;
ExtentTest testcase;
@BeforeTest
public void createhtml1() {
	extentreport = new ExtentReports();
	 spark = new ExtentSparkReporter("userlogin.html");
	 extentreport.attachReporter(spark);
	 testcase = extentreport.createTest(" click the signup link and login ");
		testcase.log(Status.FAIL, "Starting test case");
}

  @BeforeTest
  public void launchdriverTest() {

		
		 testcase = Extentreport.createTest("launch the  the chrome browser");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4");
		driver.manage().window().maximize();
		
  }
  
  @Test
  public void validdetails() {
	  WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userid.click();
	  userid.sendKeys("mngr473017");
		WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.click();
		password.sendKeys("gEbYhYd");
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
  }
  @Test
  public void invaliddetails() {
	  WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userid.click();
	  userid.sendKeys("mngr473018");
		WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.click();
		password.sendKeys("gEbYhYd");
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
    
  }
  @Test
  public void emptydetails() {
	  WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userid.click();
	  userid.sendKeys("");
		WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.click();
		password.sendKeys("");
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
    
  }

  @AfterTest
  void takescreenshot() {
	  
	  TakesScreenshot screenshot = (TakesScreenshot)driver;
	  File src = screenshot.getScreenshotAs(OutputType.FILE);
	  File destinyfile = new File("C:\\Users\\sowmy\\Downloads\\screenshot\\pic.png");
	  try {
		FileHandler.copy(src, destinyfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
    
  }
  @AfterTest
  public void createhtml() {
  	extentreport.flush();
  }
}
