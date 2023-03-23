import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guruday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Guru99 Bank Home Page";
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("title is correct");
		}
		
		else {
			System.out.println("title is not correct");
		}
	}

}
