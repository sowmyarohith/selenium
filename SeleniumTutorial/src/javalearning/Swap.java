package javalearning;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=30;
int c=a;
System.out.println("before swaping values are" +a +b );
a=b;
b=c;
/* c=a; */
System.out.println("after swaping values are" +a +b );

System.out.println("--------------------------------------");
System.out.println("without using 3rd variable");
int d=10;
int e=20;
d= d-e;
e= d+e;
d= e-d;
System.out.println(d );
System.out.println(e);


	}

}
