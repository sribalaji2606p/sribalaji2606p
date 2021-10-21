package general;

public class String_Concepts {
	public static void main(String[] args) {
		
		String a = "Shri Balaji";
		System.out.println("String Var= " + a);
		
		StringBuffer sb = new StringBuffer();
		sb.append("RVR");
		System.out.println("String Buffer= " + sb);
		
		StringBuilder sbu = new StringBuilder();
		sbu.append("Believe the process");
		System.out.println("String Builder= " + sbu);
		
		StringBuilder abc = new StringBuilder();
		sb.append(sbu);
		System.out.println("After Append" + sb);
		
		//Same hashcode with String A
		String b = "Shri Balaji";
		b.concat(a);
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
		System.out.println("Hash code");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sbu));
		System.out.println(System.identityHashCode(b));
		
		
		System.out.println("\n" + "===============");
		
		String one = "Alpha ";
		String two = "Box";
		String three;
		
		three=one.concat(two);
		
		System.out.println("Post Concat ");
		System.out.println("One = " + one);
		System.out.println("Two = " + two);
		System.out.println("Three = " + three);
		
	}

}
