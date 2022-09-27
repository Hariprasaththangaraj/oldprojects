package javacollection.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		linkedhashset();

	}

	public static void linkedhashset() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Hari");
		set.add("Malar");
		set.add("Lalli");
		set.add("Manoj");
		set.add("Subbu");
		set.add("Neela");
		set.add("Hari");
		set.add("Hari");
		
		System.out.println(set);
		
		
		Iterator<String> lit = set.iterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	}
}
