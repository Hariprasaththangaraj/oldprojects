package lambdaexp;

public class Details {
	
	String firstName;
	String Amount;
	String lastName;
	
	public Details(String firstName, String amount, String lastName) {
		super();
		this.firstName = firstName;
		this.Amount = amount;
		this.lastName = lastName;
	}
	
	
	public Details() {
		
	}

	@Override
	public String toString() {
		return "Details [firstName=" + firstName + ", Amount=" + Amount + ", lastName=" + lastName + "]";
	}
	
	
	

}
