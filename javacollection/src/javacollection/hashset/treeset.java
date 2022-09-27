package javacollection.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeset();
	}

	public static void treeset() {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Hari");
		set.add("Malar");
		set.add("Lalli");
		set.add("Manoj");
		set.add("Subbu");
		set.add("Neela");
		set.add("Hari");
		set.add("Hari");
		
		
		//Traversing element through Iterator in descending order
		Iterator<String> lit = set.descendingIterator();
		while(lit.hasNext()) {
		System.out.println(lit.next());}
		
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		
		set1.add(10);
		set1.add(125);
		set1.add(101);
		set1.add(10257);
		set1.add(10248);
		set1.add(101);
		set1.add(1);
		
		System.out.println("\nFirst Value :"+ set1.pollFirst());
		System.out.println("\nLast Value :"+ set1.pollFirst());
		
		
		//various NavigableSet operations.
		
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		set2.add("F");
		set2.add("G");
		
		
		System.out.println("\nInitial Set: "+set2);  
		System.out.println("\nReverse Set:"+set2.descendingSet());
		System.out.println("\nHead Set :"+ set2.headSet("D",true));
		System.out.println("\nSubset :"+set2.subSet("B", "F"));
		System.out.println("\nTailset"+set2.tailSet("C", false));
		
		
		Need to read omparable<Book>
		
	}
}
