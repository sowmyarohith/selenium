package com.sample.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dynamicgrid.xhtml;jsessionid=node0fzrte530x3t87k49qqkg428472767.node0");

		//WebElement name = driver.findElement(By.xpath("//td[normalize-space()='Lionel Antonio']//following::td[1]"));
		//String content = name.getText();
		//System.out.println(content);
		List<WebElement> progress = driver.findElements(By.xpath("//td[4]"));
		List<Integer> allno = new ArrayList<Integer>();
		for (WebElement webElement : progress) {
			String indvidualno = webElement.getText();
			allno.add(Integer.parseInt(indvidualno));
			
		}
		System.out.println(allno);
		int bigno = Collections.max(allno);
		System.out.println("the max no is" + bigno);
		
		
		
	}
}