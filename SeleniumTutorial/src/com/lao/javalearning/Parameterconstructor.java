package com.lao.javalearning;

public class Parameterconstructor 
{
	int sturollno;
	String stuname;
	Parameterconstructor(int rollno, String name)
	{
		
		sturollno = rollno;
		stuname = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parameterconstructor constructor = new Parameterconstructor(15,"sowmya");
System.out.println(constructor.sturollno);
System.out.println(constructor.stuname);
	}




	

	}


