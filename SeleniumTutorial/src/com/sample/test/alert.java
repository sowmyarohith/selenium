package com.sample.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://leafground.com/alert.xhtml;jsessionid=node01mpg6lo433gpivr0p7wa7qq24455270.node0");
				WebElement button1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
				button1.click();
				Alert alert = driver.switchTo().alert();
				Thread.sleep(3000);
				alert.accept();
				WebElement button2 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
				button2.click();
				Alert alert2 = driver.switchTo().alert();
				Thread.sleep(3000);
				alert2.dismiss();
				
				
				
				
				
	}

}
//*[@id="j_idt88:j_idt98"]/span[2]