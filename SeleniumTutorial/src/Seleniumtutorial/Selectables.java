package Seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectables {
	
	public static void main(String[] args) throws InterruptedException {
		//int count =0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		Thread.sleep(5000);
		List<WebElement> name = driver.findElements(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr"));
		 		
		int sizeoflist =name.size();
		System.out.println(sizeoflist);
		for(WebElement element:name) {
			
		
			if(element.getText().contains("India")){
				
				System.out.println(element.getText());
					//break;
			
				}
	}
	
}
}