import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	String[][]  logindata = {
			
			{"chintu" ,"pandu"},
			{"chintu1" ,"pandu1"},
			{"chintu2" ,"pandu2"},
			{"chintu3" ,"pandu3"}
	};		
	
	
@DataProvider(name = "dataprovider")
	public  String[][] printingvalues(){
		
		return logindata;
		
	}
@Test(dataProvider = "dataprovider")	
public void printingvalues(String uname, String pword){
	
	System.out.println(uname);
	System.out.println(pword);
	
	
	
	
}
	
	
	
}
	
			
			
			
	


