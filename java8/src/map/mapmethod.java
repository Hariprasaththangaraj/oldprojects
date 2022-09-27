package map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapmethod {

	private static final Function String = null;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maping();
		Smethod();
	}

	public static void maping() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
			

		//list.stream().map(i -> i*35).forEach(System.out::println);
		
		
		
		//Why cant this
		list.stream().map(i -> i*35).forEach(i -> System.out.println(i));
		
	}
	
	
	
	public static void Smethod() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Hari prasath");
		list.add("Malar Vizhi");
		list.add("Hari Kumar");
		list.add("Prasath Hari");
		list.add("Vizhi Malar");
		list.add("Prem Kumar");
	
		
		 List<String> resone = list.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		 
		 System.out.println(resone);
		
	}
}
