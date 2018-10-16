package dayTwo.ControlFlow;

import java.util.Scanner;

public class ControlFlow {

	/*
	 * a) if statement
	 * b) nested if statement
	 * c) if-else statement
	 * d) if-else-if statement
	 */
	
	public static void main(String[] args) {
		ControlFlow cf = new ControlFlow();
		//cf.getOne();
		//cf.nestedIf();
		//cf.ifElseStatement();
		cf.LargestNumber();
		cf.EverOrOdd();
		cf.PositiveOrNegative();
	}
	
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
	public void getOne() {
		
		int num = 70;
		if(num < 100) {
			System.out.println("Number is less than 100");
		}
	}
	public void nestedIf() {
		int num = 70;
		if (num<100) {
			System.out.println("Number is less than 100");
			
			if(num>50) {
				System.out.println("Number is greater than 50");
			}
		}
	}
	
	public void ifElseStatement( ) {
		int num = 120;
		if(num<50) {
			System.out.println("Number is less than 50");
		}
		else {
			System.out.println("Number is greater than or equal to 50");
		}
	}
	/*public void IfElseIfExample() {
		int num = 1234;
		
		if (num < 100)
				
	}*/
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

		//scan.close();
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

		//scan.close();

	}

	public void EverOrOdd() {
		System.out.println("Please enter a valid number");

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		if (n1%2 == 0) {
			System.out.println(n1 + " is an even number");
		} else {
			System.out.println(n1 + " is an odd number");
		}

		//scan.close();

	}
}
