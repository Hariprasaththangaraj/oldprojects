package javacollection.javaarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Userdefinedclassobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classobject();
		
	}
	
	public static void classobject() {
		
		  //Creating user-defined class objects  
		student s1 = new student("Hari",001,1001);
		student s2 = new student("Malar",2,1002);
		student s3 = new student("Lalli",3,1003);
		student s4 = new student("Manoj",4,1004);
		student s5 = new student("Subbu",5,1005);
		student s6 = new student("Neela",6,1006);
		
		
		  //creating arraylist  
		List<student> list = new ArrayList<student>();
		
		//Adding list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		System.out.println(list);
		
		 //Getting Iterator  
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			student st = (student)itr.next();
			System.out.println(st.id+"   "+st.name+"    " + st.rollno);
		}
	}

}

