package StringMethods;

public class mindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		indexofm();
	}
	
	
	public static void indexofm() {
		
		String s1 = "this is index of example";  
		
		//passing substring  
		int s2 = s1.indexOf("is");
		int s3 = s1.indexOf("this");
		
		System.out.println(s2+ "  " + s3);
		
	}
	
}
