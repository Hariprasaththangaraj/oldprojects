package StringMethods;

public class getbytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getbyte();
	}

	
	public static void getbyte() {
		
		String s1 = "HARI prasath";
		byte [] s2 = s1.getBytes();
		for(byte a : s2) {
			System.out.println(a);
		}
		
		
        // Getting string back   
		
		String s3 = new String(s2);
		System.out.println(s3);
	}
}
