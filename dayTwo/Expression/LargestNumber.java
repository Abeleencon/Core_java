package dayTwo.Expression;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int num3 = scan.nextInt();
	
	scan.close();
	
	int temp = (num1 > num2)? num1:num2;
	temp = (temp > num3)? temp:num3;
	
	System.out.println("The largest number is :" + temp);
	}

}
