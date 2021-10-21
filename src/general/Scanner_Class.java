package general;

import java.util.Scanner;

public class Scanner_Class {
	
	Scanner sc = new Scanner(System.in);
	
	public void Basic1() {
		String Name ,Gender;
		String City;
		int Age, PinCode;
		Long Mobile;
		
		System.out.print("Enter ur Name: ");
		Name = sc.nextLine();
		
		System.out.print("Enter ur Age: ");
		Age = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter ur Gender: ");
		Gender = sc.nextLine();
		
		System.out.print("Enter ur Mobile No: ");
		Mobile = Long.parseLong(sc.nextLine());
				
		System.out.print("Enter ur pincode: ");
		PinCode = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter ur city: ");
		City = sc.nextLine();
		
		System.out.println(" ");
		System.out.println("Feeded Data");
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Mobile: " + Mobile);
		System.out.println("Gender: " + Gender);
		System.out.println("City: " + City);
		System.out.println("PinCode: " + PinCode);
	}

	public static void main(String[] args) {
		Scanner_Class A = new Scanner_Class();
		A.Basic1();
	}
}
