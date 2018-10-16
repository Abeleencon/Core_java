package dayThree.Loops;

public class ContinueStatement {

	public static void main(String[] args) {
		
		//ContinueExample2();
		ContinueDoWhile();
		
		for(int i = 0; i < 6; i++) {
			
			if(i == 3) {
				System.out.println("Break in transmission");
				continue;		// This action takes the iteration 3, so it doesnt carry out the below operation of printing 3
			}
			
			System.out.println(i);
			
		}
	}
	
	public static void ContinueExample2() {
		
		int counter = 10;
		while (counter >= 0)
		{
			if (counter == 7) {
				counter--;
				continue;				
			}
			System.out.println(counter + " ");
			counter--;
		}
	}
	
	public static void ContinueDoWhile() {
		int counter = 10;
		do {
			System.out.println(counter);
			counter--;
			if(counter == 7) {
				counter--;
				continue;
			}
		}
		while (counter > 0);
	}
	
}
