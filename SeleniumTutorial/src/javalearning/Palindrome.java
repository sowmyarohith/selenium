package javalearning;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter  the number to check palindrome or not");
		String  num = s.nextLine();
		
		
		
		String reverse = "";
		
		int length = num.length();
		
		for(int i=length-1; i>=0;i--)
		{
			reverse = reverse + num.charAt(i);
		}
		
		if(num.equals(reverse))
		{System.out.println(" the no is palindrome");}
		
		else {
			System.out.println("its not palindrome");
		}
	
	}

}
