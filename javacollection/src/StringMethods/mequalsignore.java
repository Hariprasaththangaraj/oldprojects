package StringMethods;

import java.util.ArrayList;
import java.util.List;

public class mequalsignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mequalsignores();
	}

	
	public static void mequalsignores() {
		
		String s1 = "Hariprasath";
		String s2 = "HARIPRASATH";
		String s3 = "Malar";
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//false
		
		
		List<String> list = new ArrayList<String>();
		list.add("Hariprasath");
		list.add("HARIPRASATH");
		list.add("Hari");
		list.add("lalli");
		
		for(String a : list) {
			if(s1.equalsIgnoreCase(a)) {
				System.out.println("Match found : "+a);
			}else {
				System.out.println("Match not found !!");
			}
		}
		
	}
}
