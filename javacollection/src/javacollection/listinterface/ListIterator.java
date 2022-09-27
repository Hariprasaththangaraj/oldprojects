package javacollection.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListIterator();
	}

	
	public static void ListIterator() {
		
		//Creating list
		List<String> list = new ArrayList<String>();
		
		//Adding list
		list.add("Hari");
		list.add("Malar");
		list.add("Malar");
		list.add("Lalli");
		list.add("Subbu");
		list.add("Neela");
		list.add("Manoj");
		list.add("Hari");
		
		
		
		ListIterator<String> list1 = list.listIterator();
		
		
		
	}
}
