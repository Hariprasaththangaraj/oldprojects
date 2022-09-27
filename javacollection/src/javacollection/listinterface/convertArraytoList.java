package javacollection.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArraytoList {

	public static void main(String[] args) {
		convert();

	}

	
	public static void convert() {
		//Creating Array  
		String[] array = {"Hari","Malar","Lalli"};
		System.out.println("\nPrinting Array : \n" +Arrays.toString(array));
		
		
		//Converting Array to List  
		List<String> list = new ArrayList<String>();
		for(String convert : array) {
		list.add(convert);}
		System.out.println("\nAfter convering to ArrayList \n"+list);
	}
	
}
