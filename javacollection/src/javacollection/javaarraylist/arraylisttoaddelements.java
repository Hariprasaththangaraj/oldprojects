package javacollection.javaarraylist;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylisttoaddelements{

	public static void main(String[] args) {
		removelists();

	}

	public static void removelists() {
		
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
		//Removing the element based on position
		list.remove(1);
		
		System.out.println("\nAfter removing the list \n");
		
		System.out.println(list);
		
	    //Removing specific element
		
		System.out.println("\nRemoving specific element from arraylist  \n");
		
		list.remove("Hari");
	
		System.out.println(list);
		
        //Creating another arraylist  
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Hari in  list1");
		list1.add("Malar in  list1");
		list1.add("Malar in  list1");
		
		  //Adding new elements to arraylist 
		
		list.addAll(list1);
		
		System.out.println(list);
		
		 //Removing all the new elements from arraylist  
		
		list.removeAll(list1);
		System.out.println(list);
		
		System.out.println("\nAfter removing the element using Lambda expression: \n" + list);
		 //Removing elements on the basis of specified condition  
		list.removeIf(a -> a.contains("Hari"));
		System.out.println(list);
		
		//Remove using for loop
		
		
	}
	
}
