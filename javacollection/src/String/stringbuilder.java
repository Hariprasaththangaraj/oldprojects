package String;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringbuilder();
	}

	
	public static void stringbuilder() {
		
		
		StringBuilder s = new StringBuilder("Hari");
		s.append(" PRasath");
		System.out.println(s.toString());
		
		
		// insert() method
		s.insert(1, " Java ");
		System.out.println(s);
		
		//replace() method
		s.replace(1, 2, " Replaced the position ");
		System.out.println(s.toString());
		
		//delete() method
		 s.delete(1, 8);
		 System.out.println(s);
		 
		 //reverse() method
		 s.reverse();
		 System.out.println(s);
		 
		 //capacity() method
		 System.out.println(s.capacity());
	}
	
}
