package javacollection.javalinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class removeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addingelements();
	}

	public static void addingelements() {
		
		List<String> list = new LinkedList<String>();
		
		//Adding list
		list.add("Hari");
		list.add("Malar");
		list.add("Malar");
		list.add("Lalli");
		list.add("Subbu");
		list.add("Neela");
		list.add("Manoj");
		list.add("Hari");
		
	       //Removing specific element from arraylist  
		list.remove("Hari");
		System.out.println(list);
		
		 //Removing element on the basis of specific position  
		
		list.remove(1);
		System.out.println(list);
		
		
		 // Adding new elements to arraylist  	List<String> list1 = new LinkedList<String>();
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("Hari : added 1");
		list1.add("Malar : added 1");
		list1.add("Lalli : added 1");
		list1.add("Subbu : added 1");
		list1.add("Neela : added 1");
		
		list.addAll(list1);
		
		System.out.println("\n Adding list + list1 : \n"+list);
		
		list.removeAll(list1);
		
		System.out.println("\n After removing list - list1 : \n"+list);
		
		   //Removing first occurrence of element from the list  
		
		list.remove("Hari");
		System.out.println("\n After removing the HARI : \n"+list);
		
		list.clear();
		System.out.println("\nAfter Clearing all the elements\n"+list);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
