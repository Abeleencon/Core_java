package dayThree.Loops;

public class ReturnStatements {
	
	public static void main(String[] args) {
		
		System.out.println(sumOfDouble(34.5, 78.8)); // the method returns the sum of the numbers
		
			}
	static double sumOfDouble(double a, double b) {
		
		double sum = a + b;
		
		return sum;		// a non-void method must returna n object after executing
	}
	static void someTest(int i) {
		if(i < 9) 
			return;  // a void statement can have a return but cannot return anything
		++i;
	}
}
