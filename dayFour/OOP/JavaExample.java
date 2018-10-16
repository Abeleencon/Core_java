package dayFour.OOP;

public class JavaExample {
	
	// POJO Java alows you to create your own class/data type
	
	String web;
	
	public JavaExample(String web) {
		this.web = web;
	}
			//this class is our defined datatype - JavaExample
	public JavaExample(JavaExample je) {
		web = je.web;
	}
	
	void disp() {
		System.out.println("Website is:" + web);
	}
	
	public static void main(String[] args) {
		JavaExample obj1 = new JavaExample ("JavaLearningCenter"); //obj accepts string as defined by the constructor above
		JavaExample obj2 = new JavaExample(obj1); // obj2 only accepts data type JavaExample as defined by the constructor above
		obj1.disp();
		obj2.disp();
	
	}

}
