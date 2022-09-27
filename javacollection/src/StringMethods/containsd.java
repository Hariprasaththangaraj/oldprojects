package StringMethods;

public class containsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contans();
	}
	
	
	public static void contans() {
		String name = "Hello how are you hariprasath Thangaraj";
		
		System.out.println(name.contains("h"));
		System.out.println(name.contains("Hello"));
		System.out.println(name.contains("w"));
		System.out.println(name.contains("x"));
		System.out.println(name.contains("mama"));
		
		  // Case Sensitive  
		System.out.println(name.contains("Hariprasath"));// false "H" Capital
		
		// comparing a string to null  
		
		if(name.contains(null)) {
			System.out.println("Inside the if block");  
		}else {
			System.out.println("Inside the else block");  
		}
		
		
	}
	

}
