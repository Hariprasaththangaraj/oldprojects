package javacollection.javaarraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylistusingtheanotherbean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingtheotherbean();
	}

	public static void usingtheotherbean() {
		//Creating list of anotherbean  
		List<anotherbean> list = new ArrayList<anotherbean>();
		
		//Creating anotherbean  
		anotherbean s1 = new anotherbean(1,"Malar","author","Publisher",10274);
		anotherbean s2 = new anotherbean(2,"Hari","author","Publisher",1027564);
		anotherbean s3 = new anotherbean(3,"Lalli","author","Publisher",6541);
		anotherbean s4 = new anotherbean(4,"Neela","author","Publisher",6546461);
		anotherbean s5 = new anotherbean(5,"Subbu","author","Publisher",6549841);
		anotherbean s6 = new anotherbean(6,"Manoj","author","Publisher",512954);
		
		//Adding to the list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
	    //Traversing list  
		
		for(anotherbean creat : list) {
			System.out.println(creat.id+" "+creat.name+" "+creat.author+" "+creat.publisher+"  "+creat.qunty);
		}
	}
	
}
