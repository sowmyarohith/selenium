package Seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4");
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userid.click();
		userid.sendKeys("mngr473017");
		WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.click();
		password.sendKeys("gEbYhYd");
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
		String oldwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		
		 
		WebElement newcustomer = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
		newcustomer.click();
		
		WebElement customername=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
		customername.sendKeys("ramu");
		WebElement calendar = driver.findElement(By.xpath("//input[@id='dob']"));
		calendar.click();
		calendar.sendKeys(Keys.TAB);
		calendar.sendKeys("10122000"+Keys.TAB);
		/*
		 * calendar.sendKeys("12"+Keys.TAB); calendar.sendKeys("2000"+Keys.TAB);
		 */
		WebElement address = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea"));
		address.sendKeys("1006 kirkland road");
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"));
		city.sendKeys("chennai");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement state = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"));
		state.sendKeys("Andhrapradesh");
		Thread.sleep(3000);
		WebElement pin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input"));
		pin.sendKeys("517501");
		WebElement phoneno = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input"));
		phoneno.sendKeys("#249671");
		Thread.sleep(3000);
		WebElement id = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"));
		id.sendKeys("sowmya1258@gmail.com");
		WebElement pw = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input"));
		pw.sendKeys("guru123#");
		WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]"));
		submit.click();
		
		
		/* js.executeScript("window.scrollBy(0,250)", ""); */
		
		
		
		
	}
	
}
