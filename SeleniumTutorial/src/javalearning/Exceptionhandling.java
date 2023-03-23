package javalearning;

public class Exceptionhandling {
	
	
	static String name = "gowtham";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(name.length());
StringBuffer buffer = new StringBuffer();
buffer.append(name);
System.out.println(buffer.reverse());
System.out.println("--------------------------------------");
String given = "agni";
char[] array = given.toCharArray();
String reversed ="";
for(int i = array.length-1; i>=0; i--) {
	
	reversed=reversed+array[i];
	
	}


}
}
