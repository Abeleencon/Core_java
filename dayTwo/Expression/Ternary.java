package dayTwo.Expression;

public class Ternary {

	// variable num1 = (expression) ? value if true : value if false

	public static void main(String[] args) {
		
	int num1 = 25;
	int num2;
	
	num2 = (num1 == 10)? 100:200;
	System.out.println(num2);
	
	num2 = (num1 == 25)? 100:200;
	System.out.println(num2);
	
	}

}
