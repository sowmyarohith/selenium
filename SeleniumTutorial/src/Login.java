import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	String [][] data = {
			
			{"mngr479250","ejuqyge"},
			{"invalid","gEbYhYd"},
			{"mngr473017","invalid"},
			{"invalid","invalid"}
			
				
	};
@DataProvider(name = "dataprovider")
	public String[][] logindataprovider() {
		
		return data;
		
	}

	@Test(dataProvider = "dataprovider")
	public void loginwithuserandpassword(String uname, String pword) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4");
	driver.manage().window().maximize();
	WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	userid.click();
	userid.sendKeys(uname);
	WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	password.click();
	password.sendKeys(pword);
	WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	login.click();
	
	/* Thread.sleep(3000); */
	 
	  TakesScreenshot screenshot = (TakesScreenshot)driver;
	  File src = screenshot.getScreenshotAs(OutputType.FILE);
	  File destinyfile = new File("C:\\Users\\sowmy\\Downloads\\screenshot\\pic.png");
	  try {
		FileHandler.copy(src, destinyfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.close();
}
}