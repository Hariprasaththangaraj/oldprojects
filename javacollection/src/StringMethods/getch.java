package StringMethods;

public class getch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mgetchar();
	}

	
	public static void mgetchar() {
		String s1 = new String("Hariprasath");
		
		char[] s2 = new char[10];
		try {
			s1.getChars(1, 10, s2, 1);
			System.out.println(s2);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
