package lambdaexp;

public class labdatestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		addinginterface ab1 = (a,b) -> (a+b);
		System.out.println(ab1.add(5, 7));
		
	      // Multiple parameters with data type in lambda expression  
		addinginterface ab2 = (int a, int b) -> (a+b);
		System.out.println(ab1.add(500, 7));
	}

}
