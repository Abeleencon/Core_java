package dayFour.OOP;

public class Employee {

	String empName;
	int empSalary;
	String address;
		
	// Constructor chaining allows constructor to call other constructors
	//Constructing Overloading is a type of polymorphism,
	//toString is a string representation of your java object
	
	public Employee() {
		this("Steve Smith");
	}
	
	public Employee(String name) {
		this(name, 12000);
	}
	
	public Employee(String name, int sal) {
		this(name, sal, "120 Main st");
	}

	public Employee(String name, int sal, String address) {
		this.empName = name;
		this.empSalary = sal;
		this.address = address;
	}
	
	void disp() {
		System.out.println("Name of Employee " + empName);
		System.out.println("Employee Salary " + empSalary);
		System.out.println("Employee Address: " + address);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.disp();
	}
	
}
