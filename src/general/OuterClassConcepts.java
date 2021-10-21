package general;

public class OuterClassConcepts {
	
	protected void print() {
		System.out.println("OuterClassMethod");
	}
	
	
	
	public class InnerClass extends OuterClassConcepts{
		
		public void print1() {
			System.out.println("InnerClassMethod");

		}
	}
	
	public static void main(String[] args) {
		
		OuterClassConcepts outer = new OuterClassConcepts();
		OuterClassConcepts.InnerClass inner = outer.new InnerClass();
		
		inner.print(); inner.print1();//Inner obj can access both parent and child due to inheritance
		outer.print();//Parent can't access child class methods.
	
	}

}
