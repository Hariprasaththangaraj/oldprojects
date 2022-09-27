package javacollection.javaarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

public static void main(String[] args) {
		
		arraylist();
	}
	
	public static void arraylist(){
		
		//Creating list
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding list
		list.add("Hari");
		list.add("Malar");
		list.add("Malar");
		list.add("Lalli");
		list.add("Subbu");
		list.add("Neela");
		list.add("Manoj");
		list.add("Hari");
//		list.add(1111);
//		list.add(11);
//		list.add(111);
//		list.add(1);
		
//		//Printing list - It supports duplicate Value
//		System.out.println(list+"\n");
//		
		  //Sorting the list  
//		Collections.sort(list);
//		System.out.println(list);
//		
//		//Traversing the list through Iterator
//		Iterator order = list.iterator();
//		while(order.hasNext()) {
//		System.out.println(order.next()+"/n Next Iterator is ");
//	}
//		Iterator order1 = list.iterator();
//		while (order1.hasNext()) {
//			System.out.println(order1.next());
//		}
//	}
//	
//		
//		//Using for each method
//		list.forEach(games -> System.out.println(games));
//		
//		//Using for loop
//		for(String name : list) {
//			System.out.println(name);
//			System.out.println("Next Element:");
//		}
//		
//		
//		//Setting the value
//		list.set(1, "MalarVizhi");
//		System.out.println("\nTo sent element"+list); // Here the element "Malar" (list starts from 0) changed to "MalarVizhi"
//		
//	
//		//Getting the value
//		System.out.println("\nTo get and element: "+list.get(1));// Here the element "Malar" (list starts from 0)
//				for(String name : list)
//		{
//			System.out.println("\n"+name);
//		}
		
			/*
			 * Ways to iterate the elements of the collection in Java There are various ways
			 * to traverse the collection elements:
			 * 
			 * By Iterator interface. 
			 * By for-each loop. 
			 * By ListIterator interface. 
			 * By for loop. 
			 * By forEach() method. 
			 * By forEachRemaining() method.
			 */
		
		
        //Here, element iterates in reverse order  
//		ListIterator<String> list1 = list.listIterator(list.size());
//		while(list1.hasPrevious()) {
//			String str = list1.previous();
//			System.out.println(str);
//		}
		
		
		
		
//		//Traversing list through for loop:
//		for(int i=0; i<=list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
		
		
//		//Traversing list through forEach() method
//		list.forEach(a-> System.out.println(a));
		
//		//Traversing list through forEachRemaining() method:"
//		Iterator<String> itr = list.iterator();
//		itr.forEachRemaining(a->System.out.println(a));
		
	}			
}














