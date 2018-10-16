package dayFour.OOP;

class AnimalOne {
	
	public void eat() {
		System.out.println("Animal is eating");
	}
}

public class OverRideTest extends Animal {

	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public static void main(String[] args) {
		OverRideTest obj = new OverRideTest();
		obj.eat();
		
		AnimalOne obj1 = new AnimalOne();
		
		obj1.eat();
	}
}
