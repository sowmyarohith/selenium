package Seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompetent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node0ruhagmgbik2yf066e4j4ovcx450553.node0");
		Thread.sleep(4000);
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete\']/ul"));
		searchbox.click();
		Thread.sleep(2000);
		WebElement inputtext = driver.findElement(By.cssSelector("input[name='j_idt106:auto-complete_input']"));
		inputtext.sendKeys("s");
		Thread.sleep(2000);
		List<WebElement> listofoptions = driver
				.findElements(By.xpath("//*[@id=\'j_idt106:auto-complete_panel\']/ul/li"));
		Thread.sleep(4000);
		int size = listofoptions.size();
		System.out.println(size);

		for (WebElement webElement : listofoptions) {
			//System.out.println("selecting " + webElement.getText());

			if (webElement.getText().equals("s3")) {
				webElement.click();
				System.out.println("selecting " + webElement.getText());
				break;

			}

		}
	}
}
