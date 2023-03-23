package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filepractise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String location = "filewriting1.txt";
String content = " writing in a file is very very easy";
FileWriter  filewrite = new FileWriter(location);
/*
 * filewrite.write(content); filewrite.close();
 */
BufferedWriter buffwrite = new BufferedWriter(filewrite);
buffwrite.write(content);
buffwrite.close();

FileReader fileread = new FileReader(location);
BufferedReader Buffread = new BufferedReader(fileread);
String data = Buffread.readLine();
System.out.println(data);





	}
}
