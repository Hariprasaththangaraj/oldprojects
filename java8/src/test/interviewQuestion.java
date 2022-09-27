package test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class interviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printingString();
	}

	public static void printingString() {

		String[] str = { "java", "JAVA", "JAVA", "India", "INDIA", "Aws", "Basketball", "TENNIS", "Badminton",
				"Tennis" };

//
//		for (String b : str) {
//			System.out.println(b);
//			
//					}

		Set<String> stream = Arrays.stream(str).map(a -> a.toLowerCase()).collect(Collectors.toSet());

		System.out.println(stream);

		// How to return Original value

//					set.add(data);
//					
//					for(String i: set) {
//						System.out.println(i);
//					}

	}

}
