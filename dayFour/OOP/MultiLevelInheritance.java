package dayFour.OOP;

class Grandfather {
	
	String Property = "My cars are for my grandchild";
	String Property1 = "My house is for my son";
	
	public void inherit() {
		System.out.println("Property Inherited");
	}
	
}

class Mother extends Grandfather {
	
	String House = "Inheritance passed to child";
	 
	public void inherit() {
		
		System.out.println("Property Inherited by child");
	
	}
}

public class MultiLevelInheritance extends Mother {
	
	public static void main(String[] args) {
		MultiLevelInheritance mul = new MultiLevelInheritance();
		Mother mul1 = new Mother();
		
		System.out.println(mul.House);
		
		mul.inherit();
		
		System.out.println(mul.Property);
				
		mul1.inherit();
		
	}

}
