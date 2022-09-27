package StringMethods;

public class mformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mfomatt();
	}

	
	public static void mfomatt() {
		
		String name = "Hariprasath";
		
		String s1= String.format("Name  is : %s ", name);
		String s2 = String.format("Value is : %f ", 32.12548);
		String s3 = String.format("Value is : %.12f ", 32.12548);//returns 12 char fractional part filling with 0  
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
