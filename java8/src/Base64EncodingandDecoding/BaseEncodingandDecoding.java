package Base64EncodingandDecoding;

import java.util.Base64;

public class BaseEncodingandDecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enCoding();
	}

	public static void enCoding() {

		// create a sample String to encode
		String name = "Hariprasath";

		// print actual String
		System.out.println("Entered Name : "+name);

		// Encode into Base64 format
		String name1 = Base64.getEncoder().encodeToString(name.getBytes());

		System.out.println("After Encoding : "+name1);
		
		
	      // decode into String from encoded format
		byte[] name2 = Base64.getDecoder().decode(name1);
		
		String name3 = new String(name2);
		
		System.out.println("After Decoding : " + name3);
		
	}
}
