import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creatingcopyfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("entering omto main method");
		File file = new File("/Users/sowmy/filelist/SAIKALYAN_VATTEM-1.pdf");
		File opfile = new File("/Users/sowmy/filelist/sample_copy.pdf");
		
		FileInputStream fileinputstream = null;
		FileOutputStream fileoutputstream = null;
		
		try {
			fileinputstream = new FileInputStream(file);
			fileoutputstream = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(fileinputstream.available());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 int i=0;
		 try {
			while((i = fileinputstream.read())!= -1)
			 {
				 fileoutputstream.write(i);
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
}
