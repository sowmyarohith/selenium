package Seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		WebElement from = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		Actions actions = new Actions(driver);
		// actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();

	}
}