package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = new ArrayList<>();

		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);

//		for(Integer i : number) {
//			if(i%2==0) {
//					System.out.println(i);}}

		List<Integer> numberslist = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(numberslist);

	}

}
