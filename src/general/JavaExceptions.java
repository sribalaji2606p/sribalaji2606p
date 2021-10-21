package general;

public class JavaExceptions {
	
	static int [] a = {1,2,3,4,5};
	
	public void run() {
			
		int nw = 10;
		int old = 50;
		
		
		try {
			
			System.out.println(nw/0);
			
		}catch(Exception E) {
			
			System.out.println("Catch Block executed");
			
			try {
				System.out.println(old/0);
			} catch (Exception e2) {
				System.out.println("I'm tired");
			}
			
		}
		
		
		finally {
			System.out.println("Finally_Block");
		}
			
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		JavaExceptions obj = new JavaExceptions();
		try {
			obj.run();
		}catch(Exception E) {
			
			
		}
		System.out.println(obj.hashCode());
		obj.finalize();
		System.out.println(obj.hashCode());
		
		System.out.println(a[1]);
		
		}
	}



