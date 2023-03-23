package Seleniumtutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01oaswx2a525ima9892szncqe5442368.node0");
		WebElement openbutton = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		openbutton.click();
		String oldwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			
		}
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input"));
		searchbox.click();
		searchbox.sendKeys("home");
		
	}

}
