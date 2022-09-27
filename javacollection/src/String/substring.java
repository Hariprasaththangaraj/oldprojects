package String;

import java.util.Arrays;

public class substring {

	public static void main(String[] args) {
		substring();

	}
	
	public static void substring() {
		
		String s = "Hari prasath";
		System.out.println("Original String"+s);
		System.out.println("Substring starting from index 6:"+s.substring(6));
		System.out.println("Substring starting from index 0 to 6 : "+s.substring(0, 6));
		
		
		
		String text = "Hello, My name is Hari prasath";
		System.out.println(text.toString());//To show the difference
		
		 /* Splits the sentence by the delimeter passed as an argument */  
		
		String[] Senence = text.split("\\.");
		System.out.println(Arrays.toString(Senence));
		
		for(String a : Senence) {
			System.out.println("\n"+a+"\n");
		}
	}
}
