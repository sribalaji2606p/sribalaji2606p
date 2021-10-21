package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcepts {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> DOB = new LinkedHashMap<>();
		DOB.put(26, "26");
		DOB.put(06, "June");
		DOB.put(1998, "1998");
		DOB.put(null, null);
		
		//Printing in Insertion Order
		System.out.println(DOB);
		
		
		Map<String, String> India = new TreeMap<String, String>();
		
		India.put("TamilNadu", "Chennai");
		India.put("Karnataka", "Bangalore");
		India.put("Andhra", "Hyderabad");
		//India.put("TamilNadu", null);
		India.put("Delhi", "Delhi");
		
		
		
		System.out.println(India);
		
		for (String string : India.keySet()) {
			System.out.println(string);
		}
			for (String string2 : India.values()) {
				System.out.println(string2);
				
			}
			
		
		
		}
		
		
	}


