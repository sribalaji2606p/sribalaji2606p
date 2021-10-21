package general;

public class Variables {
	int a =10;
	
	private void method() {
		int a =100;
		System.out.println("Local Variable Value " + a);
	}
	public static void main(String[] args) {
		Variables A = new Variables();
		System.out.println("Object Variable Value " + A.a);
		A.method();
		System.out.println("Object Variable Value " + A.a);
		
	}
	
}
