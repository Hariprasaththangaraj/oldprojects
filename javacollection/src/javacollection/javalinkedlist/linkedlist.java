package javacollection.javalinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

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
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
