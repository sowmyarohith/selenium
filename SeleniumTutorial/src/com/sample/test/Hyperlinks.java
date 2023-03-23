package com.sample.test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml;jsessionid=node01lw8j8rpaatwx1fko5m0h3tsk7453139.node0");
WebElement link =  driver.findElement(By.linkText("Go to Dashboard"));
link.click();
driver.navigate().back();
WebElement wheretogolink =  driver.findElement(By.linkText("Find the URL without clicking me."));
 String destination =wheretogolink.getAttribute("href");
 System.out.println("the link is going to" +destination);
 WebElement brokenlink =  driver.findElement(By.linkText("Broken?"));
 brokenlink.click();
 String title = driver.getTitle();
 if(title.contains("404"))
 		
		 {
			 System.out.println("the link is broken");
		 }
		 else
		 {
			 System.out.println("the link is not broken");
		 }
 driver.navigate().back();
 
	
	  List <WebElement> nooflinks = driver.findElements(By.tagName("a")); 
	  int count = nooflinks.size();
	  System.out.println("count of links is "   +count);
	 
	}

}
