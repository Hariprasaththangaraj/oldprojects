package lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class labdawithforeachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	
	public static void test() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Hari prasath");
		list.add("Malar Vizhi");
		list.add("Lalli");
		
		list.forEach(a->System.out.println(a));
	}

}
