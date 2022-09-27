package javacollection.javaarraylist;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylisttoretainall{

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
		
	
        //Creating another arraylist  
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Hari");
		list1.add("Malar in  list1");
		list1.add("Malar in  list1");
		
		//iterating the elements after retaining the elements of list1
		
		list.retainAll(list1);
		
		Iterator itr = list.iterator();
	
		while(itr.hasNext())
		{	
			System.out.println("\n"+itr.next());
			}
	}
	
}
