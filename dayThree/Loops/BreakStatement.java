package dayThree.Loops;

public class BreakStatement {
	
	

	public static void main(String[] args) {
		
		labelledBreakStatement() ;
		
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of variable is: " + num);
			
			if(num == 5) {
				break;
			}
			num++;
		}
		System.out.println("Out of While-loop");
	}
	
	public static void labelledBreakStatement() {
		first:
		for(int i = 1; i< 5; i++) {
			
			second:
				for(int j = 1; j < 3; j++) {
					System.out.println("i =" + i + "; j = " + j);
					
					if (i == 2)
						break second;
				}
		}
	}
}
