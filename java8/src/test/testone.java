package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;





public class testone {
	
	public static void testmet() {

		List<String> list = new ArrayList<String>();
		
		List<StudentOne> studentOneList = new ArrayList<StudentOne>();
		
			
		list.add("Hari prasath");
		list.add("Malar Vizhi");
		list.add("Hari Kumar");
		list.add("prasath Hari");
		list.add("Vizhi Malar");
		list.add("Prem Kumar");

		for(String a : list)
		{
			//Iterating the list
			//System.out.println(a);
			
			//Changing to Array
			String[] spliting  =a.split("\\s");
			
			
			StudentOne studentOne  = new StudentOne(); 
			

			studentOne.setFirstName(spliting[0]);
			studentOne.setLastName(spliting[1]);
			
			studentOneList.add(studentOne);
			
			//System.out.println(studentOneList);
			
			
			
			//how to access the a out side the block
			//how to access on the other class
		}
		
		//	System.out.println(studentOneList);
		
			
			Collections.sort(studentOneList, new compimpl());
			
			for (StudentOne st : studentOneList) {
			//	System.out.println(st);
			String s1 = st.getFirstName().concat(st.getLastName())	;
			
				System.out.println(s1);
								
						}
			
	}
}
