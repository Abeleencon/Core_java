package dayThree.Loops;

public class WhileLoops {
	
	/*
	 * while(condition)
	 * 	{
	 * 	statement(s);
	 * 	}
	 */
	public static void main(String[] args) {
		int i = 10;
		while (i>1) {
			System.out.println(i);
			i--;
		}
		whileLoopWithArray();
	}
	
	public static void whileLoopWithArray() {
		
		int arr[] = {23,32,56,78};
		 int i = 0;
		 while(i < arr.length) {
			 System.out.println(arr[i]);
			 i++;
		 }
	}
}
