package dayFour.OOP;

public class CarType {
	
	String wheel;
	static String color;
	String model;
	int door;
	String engineType;
	
	public static String getAll() {			// getter
		return color;
	}
	
	public static String setColor (String carColor) {		//setter
		color = carColor;
		return color;
	}
	
	public CarType(String wheel, String color, String model, int door, String engineType) {
		this.wheel = wheel;
		CarType.color = color;
		this.model = model;
		this.door = door;
		this.engineType = engineType;
		
	}
	
	public static void main(String[] args) {
		CarType car1 = new CarType("Four", "Blue", "Model Y", 4, "V6");
		CarType car2 = new CarType("six", "White", "Model X", 2, "V8");
		CarType car3 = new CarType("Four", "Silver", "Model Z", 4, "V12");
		
		System.out.println(setColor("Indigo"));
		System.out.println(car3.color);
		
	}

}
