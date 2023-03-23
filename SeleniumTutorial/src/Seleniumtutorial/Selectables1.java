package Seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		Thread.sleep(5000);
		List<WebElement> name = driver.findElements(By.xpath("//*[@id=\'form:j_idt89_data\']/tr"));
		 		
		int sizeoflist =name.size();
		Actions actions = new Actions(driver);
		actions.clickAndHold(name.get(4));
		actions.build().perform();
		String tabledata =name.get(5).getText();
		System.out.println(tabledata);
		}

}
