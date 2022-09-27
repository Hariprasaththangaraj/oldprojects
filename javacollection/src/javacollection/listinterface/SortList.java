package javacollection.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		sortlist();

	}

	public static void sortlist() {
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
	
	  //Sorting the list  
	Collections.sort(list);
	//Traversing list through the for-each loop  
	for(String itr : list)
	{
		System.out.println("\n"+itr);
	}
	
	
	
	//Creating list
	List<Integer> list1 = new ArrayList<Integer>();
	
	//Adding list
	list1.add(1111);
	list1.add(12);
	list1.add(10);
	list1.add(31);
	list1.add(51);
	list1.add(19);
	
	Collections.sort(list1);
	for(Integer itr : list1)
	{
		System.out.println("\n"+itr);
	}
	
	
	}
	
	
}
