import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\chromedriver_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/dp/B07FZ8S74R/ref=ods_gw_tpr_d_h1_ha_ct_112922/?_encoding=UTF8&pd_rd_w=b5jy0&content-id=amzn1.sym.f1607191-0e07-43e2-bea5-17cc96c1b6f3&pf_rd_p=f1607191-0e07-43e2-bea5-17cc96c1b6f3&pf_rd_r=1YXKZFPMTR0PSRWQ9XTZ&pd_rd_wg=epOKr&pd_rd_r=b9f0fc59-db04-4276-980a-b5c97a5b52ea&ref_=pd_gw_unk");
		driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[5]")).click();
		driver.findElement(By.xpath("//*[@id=\'nav-cart-count-container\']/span[2]")).click();
	}
	

}
