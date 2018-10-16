package dayFive.OOP2;

public class TestEncapsulate {
	
	
	public static void main(String[] args) {
		
		Encapsulate encap = new Encapsulate();
		
		encap.setName("Milan");
		encap.setAge(34);
		
		System.out.println(encap.getName());
		System.out.println(encap.getAge());
		System.out.println(encap.getRollNumber());
	}

}
