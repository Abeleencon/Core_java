package dayFive.OOP2;

public class Address {
	
	//in Java we have the "Has-A" relation and "Is-A" relationship
	// Aggregation is the Has-A relation.allows to determine HAS_A relationship with other class or object
	
	int streetNo;
	String city;
	String state;
	String country;
	
	public Address(int streetNo, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
