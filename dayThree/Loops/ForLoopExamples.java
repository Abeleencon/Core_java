package dayThree.Loops;

public class ForLoopExamples {

	// for (initialized : condition: increment or decrement)

	public static void main(String[] args) {

		sumOfAll();
		descending();
		ascending();
		fibonacci();

		for (int i = 10; i > 1; i--) {

			// System.out.println("The value of I is : " i);
		}

	}

	public static void sumOfAll() {

		int num = 20;
		int count;
		int total = 0;

		for (count = 1; count <= num; count++) {
			total = total + count;
		}
		System.out.println(total);
	}

	public static void ascending() {
		
		for(int i = 10; i >1; i--) {
		System.out.println("The value of I is : " + i);
			}
	}
	public static void descending() {
		int num = 0;
		for(int i = 1;i <= 10; i++)
	{
		num = num++;
		System.out.println("The value of I is : " + num);
	}

	}
	
	public static void fibonacci() {
		int count = 9;
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 1; i <= count; ++i ) {
			System.out.println(num1 + "");
			int sumOfPrevTwo = num1 + num2;
			
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
	}
	
}