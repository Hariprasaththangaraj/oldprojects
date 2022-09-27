package javacollection.javalinkedlist;

import java.util.LinkedList;
import java.util.List;

public class usingotherbean {

	public static void main(String[] args) {
		anotherbean();
	}
	
	public static void anotherbean() {
		
		List<details> list = new LinkedList<details>();
		 
		//Creating Books  
		details s1 =new details(1,"Hari","Address",31);
		details s2 =new details(2,"Malar","Address",27);
		details s3 =new details(3,"Lalli","Address",56);
		details s4 =new details(4,"Manoj","Address",27);
		details s5 =new details(5,"subbu","Address",51);
		details s6 =new details(6,"Neela","Address",49);
		
		//adding in list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
	    //Traversing list  
		for(details store : list) {
		
			System.out.println(store.id+"  "+store.name+"  "+store.Address+"   "+store.age);
		}
	
	
	
	}

}
