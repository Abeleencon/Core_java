package daysix.Exceptions;

public class ExampleTwo {

	public static void main(String[] args) {

		try {

			int a[] = new int[7];
			a[4] = 30 / 0;
			System.out.println("end of try block");

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exceptions");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out side of range of an array");
			
		} catch (Exception e) {
			System.out.println("Something went wrong");

		}
		System.out.println("Ouside of try catch block");
	}

}
