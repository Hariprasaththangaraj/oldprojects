package String;

public class withtostringbean {

	int id;
	String name,city,address;
	
	
	public withtostringbean(int id, String name, String city, String address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
		
	}


	@Override
	public String toString() {
		return "withtostringbean [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
	
}
