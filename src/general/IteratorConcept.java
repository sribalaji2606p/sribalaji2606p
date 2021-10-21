package general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorConcept {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		
		a.add(8);
		a.add(11);
		a.add(7);
		a.add(18);
		
		Iterator<Integer> it = a.iterator();
				
		while (it.hasNext()) {
			Integer i = it.next();
			if(i<10)
			{
				it.remove();
			}
		}
		
		System.out.println(a);
		
		
	}

}
