package general;

public class Constructor_Concept {
	
	int a; String b;
	
	public Constructor_Concept() {
		a=100;
	}
	
	public Constructor_Concept(int alpha,String beta) {
		this.a = alpha;
		this.b = beta;
	}
	
public static void main(String[] args) {
	Constructor_Concept A = new Constructor_Concept();
	Constructor_Concept B = new Constructor_Concept(10, "Balaji");

	System.out.println("Object A Values: a = " + A.a);
	System.out.println("Object B Values: a = " + B.a + " b = "+ B.b);
}
}
