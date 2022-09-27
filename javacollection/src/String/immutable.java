package String;

public class immutable {

	public static void main(String[] args) {
		test();

	}

	
	public static void test() {
		
		String s = "Hari";
		s.concat("Prasath");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects  
		
		
		s=s.concat("Prasath");
		System.out.println(s);
		
	}
}
