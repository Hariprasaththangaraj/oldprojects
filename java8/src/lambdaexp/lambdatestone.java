package lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class lambdatestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testingon();
	}

	
	public static void testingon() {
		
		List<Details> listadd = new ArrayList<Details>();
		
        //Adding Products  
		listadd.add(new Details("hari","100","Prasath"));
		listadd.add(new Details("Malar","200","Vizhi"));
		listadd.add(new Details("hari","300","Malar"));
		listadd.add(new Details("Malar","400","hari"));
		listadd.add(new Details("his","500","Prasath"));
		listadd.add(new Details("her","600","malar"));
		listadd.add(new Details("malar","420","bibi"));
		
		

        // implementing lambda expression with comparator
		
		Collections.sort(listadd,(a1,a2)->{return a1.firstName.compareTo(a2.firstName);});
		
		//listadd.forEach(ab -> System.out.println(ab));
		
		
		
		
		 // using lambda to filter data  
			Stream<Details> filtering = listadd.stream().filter(ha->ha.Amount.equals("420"));
		 
			filtering.forEach(details -> System.out.println(details.Amount));
		
		
		
		
		
	}
}
