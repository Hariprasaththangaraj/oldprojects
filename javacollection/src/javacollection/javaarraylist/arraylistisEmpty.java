package javacollection.javaarraylist;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistisEmpty{

	public static void main(String[] args) {
		removelists();

	}

	public static void removelists() {
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("When array list is Empty: "+list.isEmpty());
		
		//Adding list
		list.add("Hari");
		list.add("Malar");
		list.add("Malar");
		list.add("Lalli");
		list.add("Subbu");
		list.add("Neela");
		list.add("Manoj");
		list.add("Hari");
		
		System.out.println("When array list is Full: "+list.isEmpty());
	
     
	}
	
}
