import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferfilereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location ="datafile.txt";
		FileReader  filereader = new FileReader(location);
		BufferedReader bufferreader = new BufferedReader(filereader);
		String line;
		
		
		
		
		  while((line =bufferreader.readLine())!= null ){
		 
		
System.out.println(line);
}
		  FileWriter filewriter = new FileWriter(location);
		  String content = "learning is soo simple";
		  filewriter.write(content);
		  filewriter.close();
}
}
