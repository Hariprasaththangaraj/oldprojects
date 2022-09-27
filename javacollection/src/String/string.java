package String;

public class string {

	public static void main(String[] args) {
		string();
	}

	
	public static void string() {
		
		char[] ch = {'a','b','c','d','e'};
		System.out.println(ch);
		
		String s = new String(ch);;//converting char array to string    //creating Java string by new keyword    
		System.out.println(s);
		
		/*
		 * Note: String objects are stored in a special memory area known as the
		 * "string constant pool".
		 */
		
		//String Literals
		String s1 = "abcde";
		String s2 = "abcde";//It doesn't create a new instance  
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s3 = new String("abcde");//creates two objects and one reference variable  
		System.out.println(s3);
		
	}
}
