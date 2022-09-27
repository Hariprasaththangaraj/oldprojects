package javacollection.javaarraylist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationandDeserialization {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		serialization();
	}

	
	public static void serialization()  {
		
		//Creating array list
			List<String> list = new ArrayList<String>();
				
	
				//Adding list
				list.add("Hari");
				list.add("Malar");
				list.add("Malar");
				list.add("Lalli");
				list.add("Subbu");
				list.add("Neela");
				list.add("Manoj");
				list.add("Hari");
		
		
		
		System.out.println(list);
		
	      //Serialization  
	
			try {
				FileOutputStream fos = new FileOutputStream("details.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				fos.close();
				oos.close();
				System.out.println("namesList serialized");
				
				//DeSerialization
				FileInputStream fis = new FileInputStream("details.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ArrayList list1 = (ArrayList)ois.readObject();
				System.out.println(list1);			
				System.out.println("namesList Deserialized");
				
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			
			
		
	}
}
