package filehandling;

import java.util.Scanner;

public class Scannerrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String ans = " ";
/*
 * String name = input.next(); System.out.println(name); input.close();
 */
int n = input.nextInt();
if(n%2==1){
    ans = "Weird";
  }
  else {
      if (n >= 2 && n <= 5) {
          ans = "Not Weird";
      } else if (n >= 6 && n <= 20) {
          ans = "Weird";
      } else {
          ans = "Not Weird";
      }
  
     //Complete the code
      
  }
  System.out.println(ans);
  input.close();
	}
}


