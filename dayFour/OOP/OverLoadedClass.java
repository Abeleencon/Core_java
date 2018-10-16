package dayFour.OOP;

public class OverLoadedClass {

	int num1;
	int num2;

	String str;

	// Illustration of overloaded constructor

	public OverLoadedClass() {

	}

	public OverLoadedClass(int num1) {

	}

	public OverLoadedClass(int num1, int num2) {

	}

	// Illustration of overloaded Method

	void add() {

	}

	void add(int num1, int num2) {

		System.out.println(num1 + num2);

	}
}

class OverRide extends OverLoadedClass {

	void add(double num1, double num2) {

		System.out.println(num1 + num2);
	}

	void add(int num1, int num2) {
		System.out.println(num1 + num2);

	}
}
