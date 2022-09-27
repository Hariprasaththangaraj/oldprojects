package testapplication.testapplication;

public class App {

	public static void main(String[] args) {

		Singleton oject = Singleton.getInstance();
	}
}


 class Singleton{
	
	static Singleton obj= new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance() {
		return obj;
	}
}