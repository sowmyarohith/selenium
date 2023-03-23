package com.lao.javalearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collections {
	
	public void collect() {
		
	
	
	List <String> arraylist = new ArrayList <String>();
	arraylist.add("Benz");
	arraylist.add("BMW");
	arraylist.add("AUDI");
	arraylist.add("ford");
	arraylist.add("Jaguar");
	System.out.println(arraylist);
	System.out.println(arraylist.get(0));
	System.out.println(arraylist.get(1));
	System.out.println(arraylist.indexOf("ford"));
	List <String> anotherlist = new ArrayList<String>();
	anotherlist.addAll(arraylist);
	System.out.println(anotherlist);
	arraylist.remove(0);
	System.out.println(arraylist);
	arraylist.set(0, "Ambasador");
	System.out.println(arraylist);
	System.out.println(arraylist.isEmpty());
	//iterate
	
	  for (String string : anotherlist) { System.out.println(string);
	  
	  }
	 System.out.println("---------------------------------");
	for(int i=0;i<arraylist.size();i++) {
		System.out.println(arraylist.get(i));
	}
	System.out.println("---------------------------------");
	ListIterator<String> iterator = arraylist.listIterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("---------------------------------");
	while(iterator.hasPrevious()) {
		System.out.println(iterator.previous());
	}
	System.out.println("---------------------------------");
	Iterator<String> iter = arraylist.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collections coll = new Collections();
coll.collect();
	}

}
