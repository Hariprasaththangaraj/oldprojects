package String;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringbuffer();
	}
	
	public static void stringbuffer() {
		
		//Mutable
		StringBuffer s = new StringBuffer("Hari");
		s.append(" Prasath");//now original string is changed  
		System.out.println(s);
		
		//insert() Method
		s.insert(4, " Here I have inserted ");//now original string is changed  
		System.out.println(s);
		
		
		//replace() Method
		s.replace(0, 5, " Replaced ");
		
		System.out.println(s);
		
		//delete() Method
		
		s.delete(1, 10);
		System.out.println(s);
		
		
		//reverse() Method
		
		s.reverse();
		System.out.println(s);
		
		//capacity() Method
		
		/*
		 * The capacity() method of the StringBuffer class returns the current capacity
		 * of the buffer. The default capacity of the buffer is 16. If the number of
		 * character increases from its current capacity, it increases the capacity by
		 * (oldcapacity*2)+2. For example if your current capacity is 16, it will be
		 * (16*2)+2=34.
		 */
		
		System.out.println(s.capacity());
		
		
	
		//ensureCapacity() method
		
		
		
		
		
	}

}
