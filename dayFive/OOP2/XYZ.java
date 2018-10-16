package dayFive.OOP2;

public class XYZ {
	
	//Dynamic Polymorphism
	
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.myMethod();
		
		XYZ obj1 = new XYZ();
		obj1.myMethod();
		
	}

	public void myMethod() {
		System.out.println("From Child class");
	}
}

class ABC{
	
	public void myMethod() {
		System.out.println("From Super class");
	}
}