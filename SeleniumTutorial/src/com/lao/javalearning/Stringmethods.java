package com.lao.javalearning;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "agniprasath";
		System.out.println("lenght of name is  " +name.length());
System.out.println(name.equals("arul"));
System.out.println(name.equalsIgnoreCase("AGNIPRASATH"));
System.out.println(name.isEmpty());
System.out.println(name.substring(2));
System.out.println(name.contains("a"));
System.out.println(name.substring(1, 3));
System.out.println(name.concat("prasath"));
System.out.println(name.replace("g", "r"));
System.out.println(name.indexOf("a"));
System.out.println(name.trim());
System.out.println(name.toUpperCase());
System.out.println(String.join("-","learn","automation","online"));
System.out.println(name.split(","));

	}

}
