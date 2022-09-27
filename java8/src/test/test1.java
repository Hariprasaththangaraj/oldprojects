package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test1 {

	public static void testmethod() {

		List<String> list = new ArrayList<String>();

		list.add("Hari prasath");
		list.add("Malar Vizhi");
		list.add("Hari Kumar");
		list.add("Prasath Hari");
		list.add("Vizhi Malar");
		list.add("Prem Kumar");
		list.add(null);

		List<String> Studentdetails = list.stream().filter(a -> a != null).map(b -> {
			String[] c = b.split("\\s");

			StudentOne studentOne = new StudentOne();

			studentOne.setFirstName(c[0]);
			studentOne.setLastName(c[1]);

			return studentOne;
		}).sorted(Comparator.comparing(StudentOne::getLastName))
				.map(d -> d.getFirstName().concat(" ").concat(d.getLastName())

				).collect(Collectors.toList());
		System.out.println(Studentdetails);
	}

}
