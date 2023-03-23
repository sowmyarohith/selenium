package com.lao.javalearning;

import java.util.ArrayList;
import java.util.List;

public class Example4 extends Example2{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example4 fees = new Example4();
/*
 * fees.svSchool(); fees.davSchool();
 */
List svc = fees.svSchool();
int dav  = fees.davSchool();
int omr=fees.OmrSchool();

ArrayList list= new ArrayList();
list.add(svc);
//list.add(dav);
//list.add(omr);

for(Object schoolamt: list)
{
	
	List schooldetails= (List) schoolamt;
	/*if(schoolname.get(0).toString())*/
	String  schoolname=(String) schooldetails.get(0);
	Integer  discount=(Integer) schooldetails.get(1);
	//if(schoolname.get(1).toString().equals(1000))
	int amounts=discount.intValue();
	if(amounts>=800)
			
			{
		 float percentage=discount-500;
		  System.out.println("discount value is  "+percentage); 
		  System.out.println("school name is "+schoolname);
	}
	//System.out.println("Schoolname is"+discount);
	
	/*schoolamt.toString().
	List<String> schoolname =schoolamt.toString().
System.out.println("school name is"+name);

  if(schoolamt.equals(svc.get(0).equals(list))>=1000) {
  
  float discount=schoolamt-500;
  System.out.println("discount value is  "+discount); }
 
	
}*/
}
	}

/*if(svc<1000) {
	System.out.println("this is SVS");
}
else {
	System.out.println("this is dav");
}
	}*/

}
