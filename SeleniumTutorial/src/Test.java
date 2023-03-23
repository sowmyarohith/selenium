import java.io.File;
import java.io.IOException;


import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.reporters.Files;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sowmy\\\\Downloads\\\\Selenium\\\\new path\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01oaswx2a525ima9892szncqe5442368.node0");
		String title = driver.getTitle();
		System.out.println(title);
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\sowmy\\OneDrive\\Desktop\\selenium_files\\screennshot.png");
		
		FileHandler.copy(src, file);
		
		
		
		
		
	}}
