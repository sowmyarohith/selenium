package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	public static WebElement username;
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	public static WebElement password;
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	public static WebElement login;
	

}
