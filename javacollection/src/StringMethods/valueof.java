package StringMethods;

public class valueof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 mvlaueof();
	}
	
	/*
	 * By the help of string valueOf() method, you can convert int to string, long
	 * to string, boolean to string, character to string, float to string, double to
	 * string, object to string and char array to string.
	 */

	public static void mvlaueof() {
		
		char a ='a';
		int b = 123;
		
		String s1 = String.valueOf(a)+String.valueOf(b);
		
		System.out.println(s1); // combaining the char and int with out type convesion
		
	}
}
