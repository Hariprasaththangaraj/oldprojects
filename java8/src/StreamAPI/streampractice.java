package StreamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streampractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		products();
	}

	public static void products() {

		List<Item> item = new ArrayList<>();

		// Adding Products
		item.add(new Item(1, "Laptop", 50000));
		item.add(new Item(2, "Mobile", 12000));
		item.add(new Item(3, "TV", 25000));
		item.add(new Item(4, "Bike", 150000));
		item.add(new Item(5, "Laptop", 500000));
		item.add(new Item(6, "Home", 5000000));

		// filtering data without using stream.

		Set<String> itemlist = new HashSet<>();

		for (Item iTem : item) {
			if (iTem.name.equals("Laptop")) {
				itemlist.add(iTem.name);
			}
		}
		// System.out.println(itemlist);

		// filtering data using stream.

		// filtering data // fetching price // collecting as list
		Set<String> item1 = item.stream().filter(a -> a.name.equals("Laptop")).map(a -> a.name)
				.collect(Collectors.toSet());
		// System.out.println(item1);

		// Laptop , 50000
		// item - laptop

		Set<Item> item2 = item.stream().filter(a -> a.name.equals("Laptop")).collect(Collectors.toSet());
		// System.out.println(item2.toString());

		Set<Item> items3 = item.stream().filter(a -> a.name.equals("Laptop")).map(items -> {
			return new Item(items.id, items.name.concat("HARI"), items.price);
		}).collect(Collectors.toSet());

		System.out.println(items3);
	}
}
