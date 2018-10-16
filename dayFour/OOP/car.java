package dayFour.OOP;

public class car {
	
	String color;
	int wheels;
	int door;
	
	public car() {
		this("white");
	}
	
	public car(String color) {
		this("white", 4);
	}
	
	public car(String color, int wheels) {
		this("white", 4 , 4);
	}
	
	public car(String color, int wheels, int door) {
		this.color = color;
		this.wheels = wheels;
		this.door = door;
	}
	
	void display() {
		System.out.println("Color of car: " + color);
		System.out.println("Number of wheels " + wheels);
		System.out.println("Number of doors " + door);
	}

	public static void main(String[] args) {
		car car1 = new car();
		
		car1.display();
		
	}
}
