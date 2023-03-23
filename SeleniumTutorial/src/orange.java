import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class orange {

			String data[][];
		String testdata[][];
		
	@DataProvider(name = "dataprovider")
		public String[][] logindataprovider() throws BiffException, IOException {
			data = excelsheet();
			
			return data;
			
		}
	
	public String[][] excelsheet()throws BiffException,IOException  { 
						
				FileInputStream file = new FileInputStream("C:\\Users\\sowmy\\Downloads\\gurude\\guru demo.xls");
					
				jxl.Workbook workbook = jxl.Workbook.getWorkbook(file);
				Sheet sheet=workbook.getSheet(0);
				int rowCount =sheet.getRows();
				int coloumns=sheet.getColumns();
			
			
			System.out.println("row count "+rowCount +"-------"+"Column count "+ coloumns);
		String testdata[][] = new String[rowCount-1][coloumns];
		
		for(int i=1;i<rowCount ;i++){
			for(int j=0;j<coloumns;j++) {
				 testdata[i-1][j] = sheet.getCell(j, i).getContents();
				
				
			}
		}
			return testdata;
		}
	

		@Test(dataProvider = "dataprovider")
		public void loginwithuserandpassword(String uname, String pword)
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sowmy\\Downloads\\Selenium\\new path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4");
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userid.click();
		userid.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.click();
		password.sendKeys(pword);
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
		 
		  
		} 
	}
	


	
	
	
	
	
	
