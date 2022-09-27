package StringMethods;

public class concatto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat();
	}

	public static void concat() {
	
		String s1 = "Hari prasath";
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here. 
		
		s1.concat(" Malar Vizhi");
		System.out.println(s1);
		
		s1 = s1.concat(" Malar");	
		System.out.println(s1);
	}
}
