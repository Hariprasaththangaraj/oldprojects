package javacollection.javalinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class addelements {

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
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("Hari : added 1");
		list1.add("Malar : added 1");
		list1.add("Lalli : added 1");
		list1.add("Subbu : added 1");
		list1.add("Neela : added 1");
		
		
		list.addAll(list1);
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//		System.out.println("\n"+itr.next());}
		
//		list.forEach(a -> System.out.print("\n \n"+a));
		
		//using for loop
		for(String a : list) {
			System.out.println(a);
		}
		
		
			
		
		
		
	}
	
}
