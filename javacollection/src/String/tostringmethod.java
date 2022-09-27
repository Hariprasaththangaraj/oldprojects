package String;

public class tostringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 method();
		
	}
	
	
	public static void method() {
		
		withoutotstringbean s = new withoutotstringbean(1,"Hari","City","Address");
		withoutotstringbean s1 = new withoutotstringbean(2,"Malar","City","Address");
		
		
		System.out.println("Without using tostring method : \n\n"+s+"\n\n"+s1);
		
		
		withtostringbean s2 = new withtostringbean(1,"Hari","City","Address");
		withtostringbean s3 = new withtostringbean(2,"Malar","City","Address");
		
		System.out.println("\n------------------------------------\n"
		+"\nWith using tostring method : \n\n"+s2+"\n\n"+s3);
		
	}
	
			
}
