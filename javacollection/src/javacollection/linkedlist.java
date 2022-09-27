package javacollection;

import java.util.LinkedList;

public final class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist();
	}

	public static void linkedlist() {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("Ab");
		list.add("Abc");
		list.add("Abcd");
		list.add("Abcde");
		
		list.forEach(games -> System.out.println(games + "/n"));
		list.stream().forEach(games -> System.out.println(games));
		
		
	}
}
