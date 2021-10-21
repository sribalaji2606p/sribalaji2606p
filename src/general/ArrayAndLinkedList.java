package general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);	
		//a.add("A");
		
		//Printing List A
		//System.out.println("List A :"+ a);
		
		List<Integer> b = new LinkedList<Integer>();
		
		b.add(10);
		b.add(20);
		b.add(30);
		
		List<String> d = new LinkedList<String>();
		d.add("Alpha");
		d.add("box");
		
		b.set(1, 200);
		
		List<Integer> c = new ArrayList<Integer>();
		
		c.add(100);
		c.add(20);
		c.add(30);
		
		System.out.println(a.get(2));
		b.retainAll(c);
		
	
		
		
		//Printing Both List A & B
		System.out.println("List A :"+ a);
		System.out.println("List B :" +b);
		

	}

}
