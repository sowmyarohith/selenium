package filehandling;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("jaava.txt");



if(file.exists()) {
	System.out.println("file created " + file.getName());}
	else {
		System.out.println(" already deleted");
	}
	
}
	}


