package javacollection.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class javamap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getmap();
	}

	
	public static void getmap() {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		   //Adding elements to map  
		map.put(1, "Hariprasatj");
		map.put(2, "Malar");
		map.put(3, "Lalli");
		map.put(4, "Neela");
		map.put(5, "subbu");
		map.put(6, "Manoj");
		
//		 //Elements can traverse in any order  
//		for(Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey()+ "   " + m.getValue());
//			}	
			
			
		    //Traversing Map  
			
			Set set = map.entrySet();//Converting to Set so that we can traverse  
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				Map.Entry entry = (Map.Entry)itr.next();
						System.out.println(entry.getKey()+"   " + entry.getValue());
			}
		}
		
	}

