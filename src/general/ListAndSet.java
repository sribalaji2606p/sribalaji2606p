package general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAndSet {
	
	public static void main(String[] args) {
		
	List<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add(20);
		a.add('a');
		a.add("Shri");
		a.add("Balaji");
		a.add("Beleive");
		a.add(10.50f);
		a.add(10);
		
	List<Object> b = new ArrayList<Object>();
	
		b.add("Balaji");
		b.add("Believe");
		b.add("The Process");
		b.add("This to shall pass");
		
		
		System.out.println("Before Retain ");
		System.out.println(a);
		System.out.println(b);
		
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		int indexOf = a.indexOf("Balaji");
		System.out.println(indexOf);
		
		a.set(1, 40.4); 
		System.out.println(a.get(1));
				
		a.set(3, "Shri");
		System.out.println(a.get(3));
		
		int size = a.size();
		System.out.println(size);
		
		boolean check = a.contains(10);
		System.out.println(check);
		
		a.remove(1);
		System.out.println(a);
		
		a.remove(a.get(1));
		System.out.println(a);
		
		b.retainAll(a);
		a.retainAll(b);
		
		System.out.println("After Retain ");
		System.out.println(a);
		System.out.println(b);
		
	
		ListAndSet obj = new ListAndSet();
		obj.LinkedListSnippet();
		
	}

	private void LinkedListSnippet() {
	
		
		List<String> L1 = new LinkedList<String>();
		
		L1.add(0, "Belive");
		L1.add(0, "Yourself");
		
		
		
		System.out.println(L1);
	}

}
