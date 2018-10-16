package dayFour.OOP;

public class Animal {

	
		//The class is the blue print of an object 
	String color;
	int age;
	
	void eat() {
		
	}
	void run() {
		
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		
		dog.run();
		dog.eat();
		dog.age = 10;
		dog.color = "brown";
		
		Animal cat = new Animal();
		
		cat.run();
		cat.eat();
		cat.age = 14;
		cat.color = "white";
	}
	
	
}
