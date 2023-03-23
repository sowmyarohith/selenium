package com.lao.javalearning;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
	
	public void vehicle() {
	
	List <String> anotherlist = new ArrayList <String>();
	anotherlist.add("car");
		anotherlist.add("bus");
	anotherlist.add("auto");
	anotherlist.add("cycle");
	anotherlist.add("van");
	System.out.println(anotherlist);
	for (String string : anotherlist) {
		System.out.println(string.charAt(0));
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
Foreach veh = new Foreach();


veh.vehicle();
	}

}
