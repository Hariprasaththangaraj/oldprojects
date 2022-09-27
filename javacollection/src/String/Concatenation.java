package String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat();
	}

	public static void concat() {
		
		String s = 20+25+"Hari"+" Prasath"+50+90 ;
		System.out.println(s);

		
		String s1 = "Hari";
		String s2 = "Prasath";
	
	//concat() method
		
		String s3 =s1.concat(s2);
		System.out.println(s3);
	
	
	// String concatenation using StringBuilder class
		
		StringBuilder s4 = new StringBuilder("Malar");    //String 1  
		StringBuilder s5 = new StringBuilder("Vizhi");	   //String 2  
	
		StringBuilder s6 = s4.append(s5); //String 3 to store the result  
		System.out.println(s6.toString());//Displays result  
	
	//concatenation using format() method
		
		String s7 = new String("Hari");
		String s8 = new String("Prasath");
		String s9 = String.format("%s%s%s",s7,s8," format method");
		System.out.println(s9.toString());
		
		
		//String.join() method (Java Version 8+)
		
		String s10 = String.join("",s7,s8," Join method");
		System.out.println(s10);
		
		
		//using StringJoiner class (Java Version 8+)
		
		StringJoiner s11 = new StringJoiner("Hari");//StringeJoiner object
		s11.add("Hari");
		s11.add("PRasath in using joiner class");
		System.out.println(s11);
		
		
		//concatenation using Collectors.joining() method (Java (Java Version 8+)
		List<String> s12 = Arrays.asList("Hari","Prasath","  Collections as joining class");
		String str = s12.stream().collect(Collectors.joining(",")); //performs joining operation  
		System.out.println(str.toString());
		
	}
	
	
}
