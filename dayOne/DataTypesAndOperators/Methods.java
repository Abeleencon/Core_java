package dayOne.DataTypesAndOperators;

public class Methods {

	//Methods
	
	/*Components of a method
	 * 1. Access modifier e.g Public, Private, default, protected
	 * 2. Return type = primitive or reference
	 * 3. Name = Method name
	 * 4. Parameters = List of parameters
	 */
	
	public static void main(String[] args) {
		
		System.out.println(minfunction(10,20,30));
		
		Methods m1 = new Methods();  // This is calling a non-static method by first declaring 
		m1.getNumbers();
		
	}
	
	public static int minfunction(int n1, int n2, int n3) {
		
		programHeader();
		int sum = n1+n2+n3;
		
		return sum;
	}
	
	public static void programHeader() {
		
		System.out.println("Find the sum of three numbers");
		
	}
	public void getNumbers() { // A method that is not static is called by using the main class to call it
		System.out.println(24);
		
	}
	
}
