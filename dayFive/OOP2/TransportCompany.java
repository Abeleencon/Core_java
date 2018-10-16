package dayFive.OOP2;

public class TransportCompany {

	// Illustration of Association in Java

	public static void main(String[] args) {
		
		Driver obj = new Driver("Ford", 12, "Sanya");
		System.out.println(obj.driverName + " is Driver of car number: " +obj.carID + " which is a " + obj.carName);

	}
}

class CarClass {
	
	String carName;
	int carID;
	public CarClass(String carName, int carID) {
		super();
		this.carName = carName;
		this.carID = carID;
	}
	

}

class Driver extends CarClass {
	
	String driverName;

	public Driver(String carName, int carID, String driverName) {
		super(carName, carID);
		this.driverName = driverName;
	}
	
	
}