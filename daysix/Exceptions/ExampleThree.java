package daysix.Exceptions;

public class ExampleThree {

	public static void main(String[] args) {

		int ab = 24;
		String xy = "lala";

		try {

			ab = ab + 0;
			try {

				ab = ab / 0;

			} catch (ArithmeticException e) {
				System.out.println("Inside block1");
				System.out.println("Exception: e1");
			}

		} catch (Exception e) {
			System.out.println("Inside parent try catch block");
			System.out.println("Next Statement");
		}
		try {

			ab = ab / 0;
			try {
				ab = ab / 0;
				
			} catch (ArithmeticException e) {
				System.out.println("Inside parent try catch block");
				System.out.println("Next Statement");
			}

		} catch (ArithmeticException e) {
			System.out.println("Inside  block2");
			System.out.println("Arithmetic Exception");
		}

	}
}
