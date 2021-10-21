package general;

import java.util.Arrays;
import java.util.Scanner;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		
		System.out.print("Enter length of the Array: ");
		Scanner sc = new Scanner(System.in);
		int arrayLength[] = new int [sc.nextInt()];
		System.out.println("Length of the array is " + arrayLength.length);
		int length=arrayLength.length;
		
		int a[]  = new int[length];
//		a[6]=1000;
	
		for(int i = 0; i < arrayLength.length; i++)
			{
//			if(i == 5)
//			{
//				break;
//			}
			
//			if(i == 6)
//			{
//				continue;
//			}
				System.out.print("Enter array value for" + "[" + i + "]");
				a[i] = sc.nextInt();
			}
		System.out.println(" ");
		
		if (length == 1) {
			System.out.println("Entered array value is " + Arrays.toString(a));
		} else {
			System.out.println("Entered array values are " + Arrays.toString(a));

		}
			
			}
				}