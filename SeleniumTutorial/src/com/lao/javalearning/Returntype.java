package com.lao.javalearning;

public  class Returntype {
	public int collectedamount= 1000;
	
	public int returntype()
	{
		System.out.println("collect amount is"+ collectedamount);
		return collectedamount;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Returntype amount = new Returntype();
amount.returntype();
int returnedamount = amount.returntype();
System.out.println("returned amount is"+returnedamount);
	}

}
