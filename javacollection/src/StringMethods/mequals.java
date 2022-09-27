package StringMethods;

import java.util.ArrayList;
import java.util.List;

public class mequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mequeals();
	}

	public static void mequeals() {
		
		String s = "Hariprasath";
		String s1 = "Hariprasath";
		String s2 = "HARIPRASATH";
		String s3 = "MAlar";
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
		
		List<String> list = new ArrayList<String>();
		list.add("Hariprasath");
		list.add("MAlar");
		list.add("Malar");
		list.add("MAla");
		list.add("Hari");
		
		
		for(String a : list) {
			if(s.equals(a)) {
				System.out.println("Match found : "+ a);
			}else {
				System.out.println("Match not found");
			}
		}
		
		
		String S4 = "H";
		String s5 = "123";
		String s6 = "14.25";
		String s7 = "false";
		
		Character s8 = new Character('H');
		Integer s9 = new Integer(123);
		Float s10 = new Float (14.25);
		Boolean s11 = new Boolean(false);
		
		
		// reference of the Character object is passed  
		System.out.println(S4.equals(s8));  //false
		System.out.println(S4.equals(s8.toString())); //true
		
		
		
		// reference of the Integer object is passed  
		System.out.println(s5.equals(s9));//false
		System.out.println(s5.equals(s9.toString()));//true
		
		// reference of the Float object is passed  
		System.out.println(s6.equals(s10));//false
		System.out.println(s6.equals(s10.toString()));//true
		
		// reference of the Boolean object is passed  
			System.out.println(s7.equals(s11));//false
			System.out.println(s7.equals(s11.toString()));//true
	}
}
