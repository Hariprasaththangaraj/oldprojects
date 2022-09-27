package javacollection.listinterface;

import java.util.ArrayList;

public class GetandSetElementinList {

	public static void main(String[] args) {
		getandset();

	}
	
	
	public static void getandset() {
	
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
		
		 //accessing the element    
		System.out.println("\nGetting the element by position : " + list.get(1));
		
		 //changing the element  
		list.set(1, "MalarVizhi");
		System.out.println("\nSetting the element by position : "+ list.get(1));
		
		
		//Iterating the List element using for-each loop  
		
		for(String list1 : list) {
		System.out.println("\n"+list1+"  ");}
		
	}
	
	
}
