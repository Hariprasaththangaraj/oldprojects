package StringMethods;

public class misempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isemptym();
	}
	
	
	public static void isemptym() {
		
		String s1 ="";
		String s2 ="Hariprasath";
		String s3 = " "; //its not Empty
		String s4 = null; // will show null pointer excpetion
		
		System.out.println(s1.isEmpty());//true
		System.out.println(s2.isEmpty());//false
		
		
		//Empty Vs. Null Strings
		if(s1.length()==0 || s1.isEmpty()) {
			System.out.println("The Field is Empty");
		}else System.out.println("The Field is Not Empty");
	
		if(s2.length()==0 || s2.isEmpty()) {
			System.out.println("The Field is Empty");
		}else System.out.println("The Field is Not Empty");
		
		if(s3.length()==0 || s3.isEmpty()) {
			System.out.println("The Field is Empty");
		}else System.out.println("The Field is Not Empty");
	
	
//		if(s4.length()==0 || s4.isEmpty()) {
//			System.out.println("The Field is Empty");
//		}else System.out.println("The Field is Not Empty");
	
		
		if(s4==null) {
			System.out.println("The Field is null");
		}else System.out.println("The Field is Not null");
		
		
		if(s3.trim().isEmpty()) {                               // Trim to empty the white space
			System.out.println("The Field is Empty");
		}else System.out.println("The Field is Not Empty");
	}
	

}
