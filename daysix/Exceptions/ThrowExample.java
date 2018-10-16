package daysix.Exceptions;

import java.io.IOException;

public class ThrowExample {

	public static void main(String[] args) {
		
		checkEligibility(10, 39);
		Example ex = new Example();
		try {
			ex.myMethod(0);
		}
		catch 
		{
		
	}

	static void checkEligibility(int stuAge, int stuWeight) {

		if (stuAge < 12 && stuWeight < 40) {
			throw new ArithmeticException("Student is not eligiblle");
		} else {
			System.out.println("Student is eligible");
		}
	}

	public static void myMethod() throws ArithmeticException, ArrayIndexOutOfBoundsException {

	}

	class Example {
		void myMethod(int num) throws IOException, ClassNotFoundException {

			if (num == 1) {
				throw new IOException("IO Exceptions");
			} else
				throw new ClassNotFoundException("Class not found exceptions");
		}
	}
}
