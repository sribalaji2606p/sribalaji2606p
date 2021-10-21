package def;

import abc.Employee;
public class Trigger {
	
	public Trigger() {
		System.out.println("Trigger Class Triggered from Def Package");
		Employee A = new Employee("Balaji");
		A.Employee_Designation("CEO"); System.out.println("Designation is " + A.Designation);
		A.Employee_Salary(2000000); System.out.println("Salary is " + A.Salary);
		A.Employee_Age(23); System.out.println(A.Name + " age is " + A.Age);
		}

	public static void main(String[] args) {
		Trigger A = new Trigger();
	}
}
