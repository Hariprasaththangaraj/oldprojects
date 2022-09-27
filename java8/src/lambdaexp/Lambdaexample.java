package lambdaexp;

public class Lambdaexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;
		
	
		inter a =new inter(){

			@Override
			public void testinterface() {
				System.out.println("Hellow how are you " + value);
			}
			
		};
	
		a.testinterface();
	}
	

}
