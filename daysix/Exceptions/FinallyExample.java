package daysix.Exceptions;

import java.util.Scanner;

public class FinallyExample {

	// any time we use final for either a variable or method, we must declare it,
	// and it cant be altered later in the program

	// Finally thread can not execute if we use the System.exit(0) in the try block

	public static void main(String[] args) {

		// System.out.println(FinallyExample.myMethod());
		System.out.println(FinallyExample.testFinally());

		try {

			int num = 121 / 0;

		} catch (Exception e) {

			System.out.println("Arithmentic exception caught");

		} finally {
			System.out.println("This is finally block");
		}

		System.out.println("Out of try catch block");
	}

	public static int myMethod() {
		Scanner scan = new Scanner(System.in);
		try {

			// System.exit(0); this line of code will not allow you get to the finally block
			return 112;
		} finally {
			scan.close();
			System.out.println("This is Finally block");
			System.out.println("Finally block ran even after return statement");
		}
	}

	public static int testFinally() {

		try {

			System.out.println("First Statement of try block");

			int num = 121 / 0;

		} finally {
			System.out.println("finally block");
		}
		try {

		} catch (Exception e) {

			System.out.println("Exceptionn ");

		}

		return 0;
	}
}
