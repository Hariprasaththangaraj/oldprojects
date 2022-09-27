package String;

import java.util.StringTokenizer;

public class StringTkenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tokenzier();
	}
	
	
	public static void tokenzier() {
		
		
		//It will split the String based on condition Eg - (:)
		StringTokenizer s = new StringTokenizer("My Name is  : Hariprasath : ",":");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());}
			
			
			StringTokenizer s1 = new StringTokenizer("My ,Name, is , :, Hariprasath ,: ,",",");
			while(s1.hasMoreTokens()) {
				System.out.println(s1.nextToken());}
			
				
			StringTokenizer s2 = new StringTokenizer("My ,Name, is , :, Hariprasath ,: ,"," ");
			while(s2.hasMoreElements()) {
				System.out.println(s2.nextToken());}
			
			
			//counting token
			
			StringTokenizer s3 = new StringTokenizer("My ,Name, is , :, Hariprasath ,: ,"," ");
				System.out.println("\nTotal count of the Token : "+s3.countTokens());
			
			
		}
		
	
}
