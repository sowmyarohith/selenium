package com.lao.javalearning;

public class Constructor {
	int rollno;
	String name;
	Constructor()
	{
		rollno= 15;
		name= "sowmya";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor constructor = new Constructor();
System.out.println(constructor.name);
System.out.println(constructor.rollno);
	}

}
