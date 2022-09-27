package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	
	public static void method() {
		
		List<details> list = new ArrayList<details>();
		
		list.add(new details("Hari",1,Arrays.asList("Bat","Ball","Strump")));
		list.add(new details("Malar",2,Arrays.asList("Paper","pen","Bun")));
		list.add(new details("Lalitha",3,Arrays.asList("Soru","Kulambu","rasam")));
		list.add(new details("Manoj",4,Arrays.asList("Cricket","footBall","carrom")));
		list.add(new details("Subbu",5,Arrays.asList("Chicken","Matton","bron")));
				
		//System.out.println(list);
		
		List<String> result = list.stream().map(a -> a.getItem()).flatMap(b -> b.stream()).collect(Collectors.toList());
		
		System.out.println(result );
		
		
		String a = "Hari";
		
		String b = new String("Hari");
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
	}
	
}
