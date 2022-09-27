package StreamAPI;

import java.util.List;
import java.util.stream.Stream;

public class streamiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iteratoring();
	}

	public static void iteratoring() {

		List<Integer> details = Stream.iterate(1, a -> a + 1).filter(a -> a %2 ==0).limit(1000).toList();
		System.out.println(details);
	}
}


