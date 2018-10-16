package dayFour.OOP;

public class Constructor {
	
	// Constructor allows you initialize an object
	// It defines the behavior of an object
	/*
	 * Note
	 * 1. Constructor has same name as the class name
	 * 2. It can't be void or return any parameter
	 * 3. they are always public
	 * 4. It defines specific features/attributes an object should have when it wants to be created
	 * 
	 * By default java creates an empty constructor for every class created, 
	 * 
	 */
	
	int age;
	String name;
	String address;
	
	public Constructor() {
		System.out.println("We are calling no-arg const");
	}
	
	public Constructor(int num, String name) {
		System.out.println(num +" " + name);
	}
		
	Constructor( String str, int age, String add) {
		this.name = str;
		this.address = add;
		this.age = age;
		System.out.println(str + " " + add + " " + age);
		
	}
	
	public static void main(String[] args) {
		Constructor cont = new Constructor();
		Constructor cont2 = new Constructor(24, "Milan");
		Constructor cont3 = new Constructor("Milan", 24, "119 Rowel Ct");
	}

}
