package general;

public class ChildAbstractClass extends PartialAbstraction{

	protected void welcome() {
		System.out.println("Hey, Hope you are doing good." + "\n" + "Do you want to open the locker ??");
		a = sc.nextLine();
		secretCode();
	}

	protected void secretCode() {
		if (a.equalsIgnoreCase("Yes")) {
			
			System.out.println("\n"+"Enter the shared secret code");
			b = sc.nextLine();
			lockerStatus();
		} else {
			System.out.println("\n"+"Thanks for your response, Good Day!!");
		}
	}

	protected void lockerStatus() {
		if (b.isBlank()) {
			System.out.println("\n"+"Secret Code not matched."+"\n"+ "Go run, to save your life");
		} else {
			
			System.out.println("\n"+"Locker Opened !!");			
		}
		
	}
	
	public ChildAbstractClass() {
		System.out.println("Child Class Constructor Triggered");
	}
	
	public static void main(String[] args) {
		
		PartialAbstraction locker = new ChildAbstractClass();
		
		locker.welcome();
		
	}

}
