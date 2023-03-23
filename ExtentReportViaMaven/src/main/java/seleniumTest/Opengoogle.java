package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Opengoogle {

	public static void main(String[] args) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("reporter.html");
		ExtentReports extentreport = new ExtentReports();
		extentreport.attachReporter(reporter);
		ExtentTest test = extentreport.createTest("helloooo duck");
		
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\chrome_drivers_selenium\\chromedriver_111V\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
ChromeOptions options =new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
options.addArguments("--disable notifications");
DesiredCapabilities cp=new DesiredCapabilities();
cp.setCapability(ChromeOptions.CAPABILITY, options);
options.merge(cp);
WebDriver driver = new ChromeDriver(options);
driver.get("http://www.google.com");
driver.quit();
extentreport.flush();
	}

}

