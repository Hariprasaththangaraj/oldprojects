package StringMethods;

public class mreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replacem();
	}
	
	public static void replacem() {
		
		String s = "This is Hariprasath";
		
		System.out.println(s.replace("Hariprasath", "Malar"));
		
		
		String s1 = s.replaceAll("\\s","");//Let's see an example to remove all the occurrences of white spaces.
	
		System.out.println(s1); //Removing the white space
	
	
	
	}

}
