package general;

public class Parent {
	
	static int a;
	
	public void print() {
		System.out.println("Parent Class Method");
	}
	
	public static void main(String[] args) {
		
		
		Parent p = new Child();
		Child c = new Child();
		
		p.print();
		c.print();
		Parent a = new Parent();
		a.print();
		
	}
	

}
