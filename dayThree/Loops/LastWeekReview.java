package dayThree.Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LastWeekReview {

	public static void main(String[] args) {
		
		//findDuplicate();
		//printNumberOfRows();
		//floatingPoint();
		//checkEquality();
		findAndReplace();
	}
	
	public static void sortArray() {
		
		int numericArray [] = {1789, 2035, 1899, 1456, 2013, 1458, 
				2458, 1254, 1472, 2365, 1456, 2165, 14,57, 2456};
		String stringArray [] = {"Java", "Python", "PHP", 
				"C#", "C Programming", "C++"};
	System.out.println("Original numeric array : " + Arrays.toString(numericArray));
	Arrays.sort(numericArray);
	
	
	
	}
	
	public static void findDuplicate() {
		
		String[] my_array = {"bcd", "abd", "jude", "bcd", "olu", "gzw", "olu"};
		
		for(int i = 0 ; i < my_array.length - 1; i++) {
			for(int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i].equals(my_array[j]))&&(i !=j)) {
					System.out.println("Duplicate Elements are: " + my_array[j]);
				}
			}
		}
	}
	
	public static void printNumberOfRows() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input number of rows");
		int row = scan.nextInt();
		
		for (int i = 1; i<= row; i++) {
			for(int j = 1; j<=i; j++) 
				System.out.print(j);
			
			System.out.println(" ");
		}
		scan.close();
	}
	
	public static void floatingPoint() {
		Scanner in = new Scanner(System.in);
		float f = in.nextFloat();
		if (f == 0) {
			System.out.println("zero");
		}
		if(f > 0 ) {
			System.out.print("positive");
			if ((f > 0) && (f < 1)) {
				System.out.println(" small number");
			}
			else if(f > 100000) {
				System.out.println(" large number");
			}
			else {
				System.out.println("Positive number");
			}
		}
		else if (f < 0) {
			if(Math.abs(f) < 1) {
				System.out.println("Negative small number");
			}
			else if (Math.abs(f) > 100000) {
				System.out.println("Negative large number");
			}
			else {
				System.out.println("Negative number");
			}
				
		}
		
	}
	
	public static void checkEquality() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number:");
		int firstNUmber = in.nextInt();
		System.out.print("Input second number:");
		int secondNumber = in.nextInt();
		System.out.print("Input third number:");
		int thirdNumber = in.nextInt();
		System.out.print("Input fourth number:");
		int fourthNumber = in.nextInt();
		
		if ((firstNUmber == secondNumber) && (secondNumber == thirdNumber) && (thirdNumber == fourthNumber)) {
			System.out.println(" Numbers are equal");
		} 
		else {
			System.out.println("Numbers are not equal");
		}
			
	}
	
	public static void findAndReplace() {
		
		String str = "The quick brown fox jumps over the lazy dog.";
		
		System.out.println("Original String: " + str);
				
		str = str.replace("fox", "cat");
		
		System.out.println("New String: " + str);
	}
	
}
