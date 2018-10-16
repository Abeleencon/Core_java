package dayTwo.ControlFlow;

import java.util.Scanner;

public class ControlFlowTest {

	public static void main(String[] args) {

		ControlFlowTest cf = new ControlFlowTest();
		
		cf.LargestNumber();
		cf.EverOrOdd();
		cf.PositiveOrNegative();

	}

	public void LargestNumber() {
		int largest = 0;
		int temp = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three valid numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
			temp = n1;
		} else {
			System.out.println(n2 + " is greater than " + n1);
			temp = n2;
		}

		if (n3 > temp) {
			System.out.println(n3 + " is greater than " + n1 + " and " + n2);
			largest = n3;
		} else {
			System.out.println(temp + " is the largest number");
			temp = largest;
		}

	}

	public void PositiveOrNegative() {

		System.out.println("Please enter a valid number");

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		if (n1 > 0) {
			System.out.println(n1 + " is a postive number");
		} else {
			System.out.println(n1 + " is a negative number");
		}

	}

	public void EverOrOdd() {
		System.out.println("Please enter a valid number");

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		if (n1 % 2 == 0) {
			System.out.println(n1 + " is an even number");
		} else {
			System.out.println(n1 + " is an odd number");
		}

		
	}
	

}
