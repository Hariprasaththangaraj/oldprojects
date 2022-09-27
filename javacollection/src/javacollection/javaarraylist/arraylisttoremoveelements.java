package javacollection.javaarraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylisttoremoveelements{

	public static void main(String[] args) {
		addinglists();

	}

	public static void addinglists() {
		
		List<String> list = new ArrayList<String>();
		System.out.println("Below are the List: \n");
		
		//Adding list
		list.add("Hari");
		list.add("Malar");
		list.add("Malar");
		list.add("Lalli");
		list.add("Subbu");
		list.add("Neela");
		list.add("Manoj");
		list.add("Hari");
		
		System.out.println(list);
		
		//Adding list1
		List<String> list1 = new ArrayList<String>();
		System.out.println("\nBelow are the List1: \n");
		
		//Adding list1
		list1.add("Hari=1");
		list1.add("Malar=1");
		list1.add("Malar=1");
		list1.add("Lalli=1");
		list1.add("Subbu=1");
		list1.add("Neela=1");
		list1.add("Manoj=1");
		list1.add("Hari=1");
		
		System.out.println(list1);
		
		System.out.println("\nAfter adding List and List1 \n");
		
		list.addAll(list1);
		
		System.out.println(list);
		
		
		//Adding list2
				List<String> list2 = new ArrayList<String>();
				System.out.println("\nBelow are the List1: \n");
				
				//Adding list1
				list2.add("Hari=2");
				list2.add("Malar=2");
				list2.add("Malar=2");
				list2.add("Lalli=2");
				list2.add("Subbu=2");
				list2.add("Neela=2");
				list2.add("Manoj=2");
				list2.add("Hari=2");
				
				System.out.println(list2);
				
				System.out.println("\nAfter adding List1 and List2 \n");
				
				list.addAll(list2);
				
				System.out.println(list);
				
				
				 //Adding second list elements to the first list at specific position  
	
				System.out.println("\nAdding Specific position\n");
	
				list1.addAll(1,list2);
				
				System.out.println(list1);
	}
	
	
}
