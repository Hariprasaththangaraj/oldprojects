package String;

public class comparison {

	public static void main(String[] args) {
		comparison();

	}
	
	
	public static void comparison() {
		
		/*
		 * using equals compares the original content of the string. It compares values
		 * of string for equality.
		 */	
		
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Hari";
		String s5 = "SACHIN";
		
		
		//equals comparing the ASCII Values.
		
		System.out.println(s1.equals(s2));//true  
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equals(s5));//false
		
		
		// Ignoring the case senctive
		System.out.println("\nUsing the Equal mehtod : "+s1.equalsIgnoreCase(s5)) ; //True 
	
	
		//Using == operator comparing the Address of the Value
		System.out.println(s1==s2);
		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
	
	
		
		/*
		 * compareTo() method compares values lexicographically and returns an integer
		 * value that describes if first string is less than, equal to or greater than
		 * second string.
		 */
		//Based on Dictionary
	
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s5));
	
	
	
	
	
	
	
	}

}
