package Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectorsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectmethod();
	}

	public static void collectmethod() {

		List<City> list = new ArrayList<City>();

		list.add(new City("Tamilnadu", 100));
		list.add(new City("Kerala", 80));
		list.add(new City("Karnadaka", 90));
		list.add(new City("Andra", 200));
		list.add(new City("UP", 150));
		list.add(new City("AP", 80));

		Map<Double, String> citydetails = list.stream().filter(city -> city.getTemp() < 100)
				.collect(Collectors.toMap(City::getTemp, City::getCityName, (key, identicalKey) -> key));

		System.out.println(citydetails);
	}

}
