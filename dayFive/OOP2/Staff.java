package dayFive.OOP2;

public class Staff {
	
	//Example of aggregation in Java
	
	Address empAdd;
	StudentClass stuInfo;
	public Staff(Address empAdd, StudentClass stuInfo) {
		super();
		this.empAdd = empAdd;
		this.stuInfo = stuInfo;
	}
	
	public static void main(String[] args) {
		Address ad = new Address(120, "Main Street", "VA", "USA");
		StudentClass stu1 = new StudentClass(123, "Milan", ad);
		
		Staff st = new Staff(ad, stu1);
		
		System.out.println(st.empAdd);
		System.out.println(st.stuInfo);
		
	}

	@Override
	public String toString() {
		return "Staff [empAdd=" + empAdd + ", stuInfo=" + stuInfo + "]";
	}
	
	

}
