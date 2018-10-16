package dayFour.OOP;

class Teacher {
	String designation = "Teacher";
	String nameOfDept = "Technical";

	void does() {
		System.out.println("Teach");
	}

	
													//parent constructor
	public Teacher() {		
		System.out.println("From Parent class");
	}
}

public class PhysicsTeacher extends Teacher {

	String mainSub = "Physics";
													//Child constructor
	public PhysicsTeacher() {	
		super();
	}

	public static void main(String[] args) {
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.designation);
		System.out.println(obj.nameOfDept);
		System.out.println(obj.mainSub);
		obj.does();
	}
}
