import bankController.bankcontroller;
import bankDB.bankDB;

public class bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankcontroller Bankcontroller = new bankcontroller();
		Bankcontroller.display();
		
		
		bankDB BankDB = new bankDB();
		
		BankDB.Bankdetails();
	}
}
