package general;

public class InterfaceConcept implements Rectangle{
	
	public void print() {
		System.out.println("Printing Rectangle");
		
	}
	
	public void size() {
		System.out.println("L = 10cm B = 10cm C = 10cm");
		
	}
	
	
	public void shapes() {
	System.out.println("Rectangle, circle, square, sphere, etc");
		
	}
	
	public static void main(String[] args) {	
	
		InterfaceConcept launch = new InterfaceConcept();
		
		launch.shapes();
		launch.print();
		launch.size();
		
		System.out.println("Interface final variable value = " + a);
		
		
		
	}

	
	
	
	
	
	}


