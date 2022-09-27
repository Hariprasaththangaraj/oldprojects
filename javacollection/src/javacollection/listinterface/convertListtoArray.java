package javacollection.listinterface;

import java.util.ArrayList;
import java.util.Arrays;

public class convertListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert();
	}

	public static void convert() {
		
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
	
				 //Converting ArrayList to Array  
				
				String [] array = list.toArray(new String[list.size()]);
				System.out.println("\nPrinting Array :\n" + Arrays.toString(array));
				System.out.println("\nPrinting list :\n" + list );
				
	}
	
}
