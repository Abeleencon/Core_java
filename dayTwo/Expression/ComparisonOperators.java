package dayTwo.Expression;

public class ComparisonOperators {
	
	//We have six relational operators in Java: ==, !=, <, >, <=, >=

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 50;
		
		if (num1 == num2) {
			System.out.println("Num1 and num2 are the same");
		}
		else {
			System.out.println("Num1 and Num2 are not the same");
		}
		if (num1 != num2) {
			System.out.println("Num1 and num2 are not the same");
		}
		else {
			System.out.println("Num1 and Num2 are the same");
		}
		if (num1 >= num2) {
			System.out.println("Num1 is greater or equal to num2 ");
		}
		else {
			System.out.println("Num1 is less than Num2");
		}
	}

}
