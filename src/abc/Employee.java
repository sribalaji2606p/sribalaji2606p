package abc;

public class Employee {
	
	//Instance Variable Initialization
	public int Age; public String Name; public Double Salary; public String Designation;
	
	public Employee(String N)
	{
		Name = N ;
		System.out.println("Super Class Constructor");
		System.out.println("Employee Name is " + Name);	
	}
	

	public void Employee_Age(int A) 
	{
		Age = A;
	}
	
	public void Employee_Salary(double S) 
	{
		Salary = S ;
	}
	

	public void Employee_Designation(String D) 
	{
		Designation = D;
	}
}
