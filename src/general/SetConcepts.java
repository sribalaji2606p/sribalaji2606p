package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(2021);
		
		//Printing in random order
		System.out.println(a.size());System.out.println(a);
		
		Set<Object> b = new LinkedHashSet<Object>();
		b.add("Alpha Box");
		b.add("Will Launch Soon in ");
		b.add(2021);
		b.add(null);
		b.add(2021);
		b.add(null);
		
		//Printing in Insertion Order
		System.out.println(b);
		
		a.retainAll(b);
		System.out.println("Printing after Retaining" +"\n"+ a + "\n"+ b);
		
		Set<Object> c = new TreeSet<Object>();
		
		c.add("2021");
		//c.add(null);
		c.add("b");
		c.add("a");
		c.add("1998");
		
		
		//displaying set using for loop 
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
		
		//displaying set using for_each loop
		for (Object object : c) {
			System.out.println(object);
			
		}
		
		//Printing in Ascending Order
		System.out.println(c);
	}
	
	
	

}
