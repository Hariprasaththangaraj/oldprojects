package javacollection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		hashset();

	}
	
	public static void hashset() {
		
		
		// ignoring duplicate elements
		HashSet<String> set = new HashSet();
		
		set.add("Hari");
		set.add("Malar");
		set.add("Lalli");
		set.add("Manoj");
		set.add("Subbu");
		set.add("Neela");
		set.add("Hari");
		set.add("Hari");
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//different ways to remove an element.
		
		set.remove("Manoj");
		System.out.println("After removing the element Manoj:"+set);
		
		

		//Adding another set
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Hari1");
		set1.add("Malar1");
		set1.add("Lalli1");
		set1.add("Manoj1");
		set1.add("Subbu1");
		set1.add("Neela1");
		set1.add("Hari1");
		set1.add("Hari");
		
		
		set.addAll(set1);
		
		System.out.println("\n Adding the set + set1 : \n" + set);
		
		
		 //Removing all the new elements from HashSet  
		
		set.removeAll(set1);
		System.out.println("\n Removing the set - set1 : \n" + set);
		
		  //Removing elements on the basis of specified condition  
		set.removeIf(a -> a.contains("Malar"));
		System.out.println("\n Removing the set based on condition : \n"+set);
		
		
		
		
	}
	
	

}
