package com.sample.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dynamicgrid.xhtml;jsessionid=node0fzrte530x3t87k49qqkg428472767.node0");
		List<WebElement> columncount = driver.findElements(By.tagName("td"));
		int colcount = columncount.size();
		System.out.println("column count is" + colcount);
		List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
		int rocount = rowcount.size();
		System.out.println(" no of rows is" + rocount);
		
		//WebElement name = driver.findElement(By.xpath("//td[normalize-space()='James Arvin']//following::td[1]"));
		//String content = name.getText();
		//System.out.println(content);
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[4]"));
		List<Integer> numberlist = new ArrayList<Integer>();
		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText();
			numberlist.add(Integer.parseInt(individualvalue));
			
		}
		System.out.println(numberlist);
		int smallvalue = Collections.min(numberlist);
		System.out.println("smallest value is" + smallvalue);
			
		}

	}


