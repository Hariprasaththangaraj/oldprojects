package StringMethods;

public class compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareto();
	}

	
	public static void compareto() {
		String s1 = "Hari";
		String s2 = new String("Hari");
		String s3 = "Hari";
		String s4 = "Malar";
		String s5 = "";
		String s6 = "HARI";
		
		String s7 = null;
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.compareToIgnoreCase(s6));
		
		//The NullPointerException is thrown when a null object invokes the compareTo() method. 
		System.out.println(s1.compareTo(s7));
		
		
	}
}
