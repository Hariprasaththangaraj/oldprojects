package StringMethods;

public class mintern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interm();
	}

	
	public static void interm() {
		
		String s1 = "Hariprasath"; //Created in String constant pool - SCP
		String s2 = new String("Hariprasath");
		String s3 = s2.intern();
		
		System.out.println(s1.equals(s2));//true - checks the string value
		System.out.println(s1==s2);//false - checks address Value
		System.out.println(s1==s3); //true - Because intern moved the value to SCP
		
		
		
	}
}
