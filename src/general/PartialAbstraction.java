package general;

import java.util.Scanner;

public abstract class PartialAbstraction {
	
	Scanner sc = new Scanner(System.in);
	
	public String a,b,c;
	
	protected abstract void welcome();
	
	protected abstract void secretCode();
	
	protected abstract void lockerStatus();
	
	public PartialAbstraction() {
	System.out.println("Constructor Triggered");
	}

}
