package Methodreference;

public class methodmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodcallnig();
	}
	
	
	public static void methodcallnig() {
		
	     // Referring static method  
		methodinterface calling = classlevelmethod::printingmethod;
		
		// Calling interface method  
		calling.methodone();
		
		}
	
}
