package general;

public class Child extends Parent {
	
	@Override
	public void print() {
		System.out.println("Child Class Method");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = new Child();
		
		//UpCasting
		Parent upcasting = new Child();
		
		//ExplicitDownCasting using upcasted obj reference
		Child c1 = (Child) upcasting;
		
		upcasting.print();
		c1.print();
		
		Child a = (Child) p;
		a.print();
	}

}
