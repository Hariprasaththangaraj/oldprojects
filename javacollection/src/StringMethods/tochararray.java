package StringMethods;

public class tochararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chartoarray() ;
	}
	
	public static void chartoarray() {
		
		String s1 = "Hari prasath";
		char [] s2 = s1.toCharArray();
		
		for(char a : s2) {
			System.out.println(a);
		}
	}
}
