import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class Collect {
	
	@Test
	public void collection() {
		ArrayList<String >  list = new ArrayList<String>();
		list.add("ravi");
		list.add("ajay");
		list.add("vijay");
		list.add("suresh");
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext() ) {
			
			System.out.println(itr.next());
			
		}
		System.out.println(list.contains("ravi"));
		System.out.println(list.indexOf("vijay"));
	System.out.println("-----------------------------------------------------------------------");	
		

	
		LinkedList<String >  llist = new LinkedList<String>();
		llist.add("raviiii");
		llist.add("ajayyyy");
		llist.add("vijayyyy");
		llist.add("sureshhhh");
		
		
		Iterator llitr = llist.iterator();
		while(llitr.hasNext() ) {
			
			System.out.println(llitr.next());
		}
		
		
		
	}
	
	
	

		
	}


