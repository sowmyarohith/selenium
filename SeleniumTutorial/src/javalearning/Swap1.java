package javalearning;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b= 0;
		/*
		 * a=a-b; b=a+b; a=b-a;
		 */
		System.out.println( a );
		System.out.println(b);
		System.out.println(a+"   "+b);
System.out.println("---------------------------------------------");
try {
	while(a/b==1) {
		System.out.println("it is factor number");
		break;
		
	}
	
}
catch (Exception e) {
System.out.println("Please do not enter the value Zero");	
System.out.println("exception message"+e.getMessage());
}

	}

}
