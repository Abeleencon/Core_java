package dayFour.OOP;

class Father {
	
	String son = "My son inherits my house";
	
	void Property() {
		
		System.out.println("House in Virginia and Atlanta");
	}
}

public class SingleInheritance extends Father {
	
	public static void main(String[] args) {
		
		SingleInheritance will1 = new SingleInheritance();

		System.out.println(will1.son);
		
		will1.Property();
	}

}
