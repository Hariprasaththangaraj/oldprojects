package javaarrays;

public class jarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 marray();
//
//		int a[] = { 5, 10, 350, 1, 4 };
//		maar(a);
		
		printarray(new int[] {1,3,5,645,890});
	}

	
//		public static void marray() {
//	  
//			int array[] = new int[5];
//	  
//	  array[0] = 10; array[1] = 20; array[2] = 30; array[3] = 40; array[4] = 50;
//	  //array[5] = 60;
//	 
//	  for(int a : array) { System.out.println(a); }
//	 
//	  
//	  char s1[] = {'a','b','c','d'}; System.out.println(s1); for(char b : s1) {
//	  System.out.println(b); }
//	   
//	  }
//
//		//creating a method which receives an array as a parameter  	
//		public static void maar(int s2[]) {
//		// Passing Array to a Method in Java
//
//		int min = s2[0];
//		for (int i = 0; i < s2.length; i++) {
//			if (min > s2[i])
//				min = s2[i];
//				}
//		System.out.println(min);
//	}


		//creating a method which receives an array as a parameter  
		
		public static void printarray(int s3[]) {
			
			for(int i=0; i<=s3.length-1; i++)
				System.out.println(s3[i]);
		}

		








}
