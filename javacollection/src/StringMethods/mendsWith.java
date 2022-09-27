package StringMethods;

public class mendsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meedswith();
	}

	public static void meedswith() {
		String s = "Hellow how are you";
		String s1 ="hariprasath@gmail.com";
		
		System.out.println(s.endsWith("u"));
		System.out.println(s.endsWith("you"));
		
		System.out.println(s1.endsWith(".com"));
		
		
		// prints true  
		System.out.println(s.endsWith(""));
		
		// prints false as there is no white space after the string  
		System.out.println(s.endsWith(" "));  
		
		
		//Null pointer Exception
		
		//System.out.println(s1.endsWith(null));
		
		// invoking the method endsWith() using the string literal  
		
		if("Hi My name is Hariprasath Thangaraj".endsWith("Thangaraj")) {
			System.out.println("Literal is working");
			} else {
				System.out.println("Literal not working");
			}
	}
}
