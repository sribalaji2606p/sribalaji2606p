package general;

import java.util.Scanner;

public class Sum_and_Average {
	
	String StudName;
	int StudID, m1, m2, m3, m4, m5,sum;
	Scanner sc = new Scanner(System.in);
	
		public Sum_and_Average() {				
		System.out.print("Enter ur Name ");
		StudName = sc.nextLine();
		
		System.out.print("Enter ur ID ");
		StudID = sc.nextInt();
	
		System.out.println("Enter ur Marks from M1 to M5");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
	}

	private void sum() {
		sum= m1 + m2 + m3 + m4 +m5;
		System.out.println("Total Marks Scored: " + sum);
	}
	
	private void average() {
		int avg;
		avg = sum/5;
		System.out.println("Average scored Mark is: " + avg);
	}
	public static void main(String[] args) {
		Sum_and_Average A = new Sum_and_Average();
		A.sum();
		A.average();
	}
}
