package Seleniumtutorial;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
				WebElement downloaded = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		Thread.sleep(3000);
		downloaded.click();
		File filelocation = new File("C:\\Users\\sowmy\\Downloads");
		File[] allfiles = filelocation.listFiles();
	//	FileUtils.copyFile(scrFile, new File(png));
		

		
		
	}

}
