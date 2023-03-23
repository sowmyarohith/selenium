package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Execute {
	@Test
	public void Execute() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4");
	
	
	PageFactory.initElements(driver,Loginpage.class);
	
	Loginpage.username.sendKeys("mngr479250");
	Loginpage.password.sendKeys("ejuqyge");
	Loginpage.login.click();
	}
}
