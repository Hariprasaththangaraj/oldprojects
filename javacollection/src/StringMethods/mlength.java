package StringMethods;

public class mlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lebngthm();
		
	}

	public static void lebngthm() {
		
		String s1 = "Welcome to Great Kirikala show";
		
		System.out.println(s1);
		
		for(int i=s1.length(); i>=0; i=s1.length()-1) {
			System.out.println(s1.length());
		}
	}
}
