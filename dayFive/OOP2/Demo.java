package dayFive.OOP2;

public class Demo {
	
	//Illustration of static and dynamic polymorphism
	//Static means the value/method is known before run time
	
	public static void main(String[] args) {
		SimpleCalculator obj = new SimpleCalculator();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 30, 50));   //This is illustration of static, our output is known
	}
}

class SimpleCalculator {
	
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}