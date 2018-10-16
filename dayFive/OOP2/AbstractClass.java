package dayFive.OOP2;

public class AbstractClass extends Animal {
	
	//it starts with the name abstract, followed by class
	// You can't create an instance out of the abstract class.
	//
	public static void main(String[] args) {
		
		AbstractClass ab = new AbstractClass();
		ab.eat();
		ab.addAll(25, 32);
		
	}

	@Override
	public void sound() {
		System.out.println("Dog is eating");
	}

	@Override
	public int addAll(int num1, int num2) {
		System.out.println(num1 + num2);
		
	return 0;
	}

}

abstract class Animal {
	
	public abstract void sound();
	
	public abstract int addAll(int num1, int num2);
	
	void eat() {
		System.out.println("Animal is eating");
	
	}
	
}