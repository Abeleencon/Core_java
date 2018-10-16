package dayFour.OOP;

public class InheritanceTest extends child {

	//when u inherit a variable of an object from another class
	/*
	 * one to one inheritance
	 * one to many inheritance
	 * parents cannot inherit from child class
	 * only child can inherit from parent
	 * we use extends keyword 
	 * you can only inherit one class at a time
	 * multiple inheritance is not allowed in java
	 * 
	 * QUEstion
	 * write one or two class that demonstrates the following
	 * 1. Single Inheritance
	 * 2. Multiple Inheritance
	 * 3. Multilevel
	 * 4. Hybrid
	 * 5. What is Method Overloading and overriding, with example of code...
	 * 
	 */
	
	public static void main(String[] args) {
		InheritanceTest test = new InheritanceTest();	 
		test.sumOfall();		//The child class (InheritanceTest) inherits a method from the parent(child)
		
	}
	
}
// this is the parent class
class child {
	
	int num1 = 10;
	
	int num2 = 10;
	
	public int sumOfall() {
		int sum = num1 + num2;
		System.out.println(sum);
		
		return sum;
	}
}