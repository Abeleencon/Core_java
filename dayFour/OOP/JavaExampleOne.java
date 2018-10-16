package dayFour.OOP;

class SuperClass {
	
	public SuperClass() {
		System.out.println("This is from super class constructor");
	}
	
	void disp() {
		System.out.println("Super class method");
	}
}

public class JavaExampleOne extends SuperClass {

	public JavaExampleOne() {
		System.out.println("Child class constructor");
	}
	void disp() {
		System.out.println("Child class method");
		
		super.disp();
	}
	
	public static void main(String[] args) {
		JavaExampleOne obj = new JavaExampleOne();
		obj.disp();
		
	}
}
