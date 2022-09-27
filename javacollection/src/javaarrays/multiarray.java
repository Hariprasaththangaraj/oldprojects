package javaarrays;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		//printing 2D array  
		for(int i=0;i<3;i++){  //row
		 for(int j=0;j<3;j++){  //column
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		
		arra();
		
	}
	
	public static void arra() {
		
		int array[][] = {{10,20,30,70,60,50},{654,645,41,20,30,70},{3,3,4}};
		
		for(int i=0;i<array.length;i++){		
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
