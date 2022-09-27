package javacollection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class combaininglistandheshset {

	public static void main(String[] args) {
		listandset();

	}

	public static void listandset() {
		
		
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
				list.add("PerumalSamy");
		
				//Creating set and passing the list value
				HashSet<String> set = new HashSet(list);
				
				//Adding set
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
				
	}
}
