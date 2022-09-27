package menuControl;

import java.util.Scanner;

public class menu {

	public static void displaymenu() {

		System.out.println(
				"--------------------------------\n" + "	 BANK DETAILS\n" + "--------------------------------\n");
		menu();
	}
	
	public static void Accoutnumberprint() {
		System.out.println("Enter Your Account Number :");
		}

	public static void menu() {

		System.out.println("1. Account Name");
		System.out.println("2. Account Balance");
		System.out.println("3. Recently Deposited Amount");
		System.out.println("4. Do you want to Deposit ?");
		System.out.println("5. Do you want to Withdraw ?");
		System.out.println("6. Address details");
		System.out.println("7. Exit");
		System.out.println("\n Enter your choice :");

		int Choice = 0;
		while (Choice != 7) {

			Scanner scan = new Scanner(System.in);
			Choice = scan.nextInt();

			switch (Choice) {
			case 1:
				Accoutnumberprint();
				// Account Name();
				break;
			case 2:
				Accoutnumberprint();
				// Account Balance();
				break;
			case 3:
				Accoutnumberprint();
				// Recently Deposited Amount
				break;
			case 4:
				Accoutnumberprint();
				// Do you want to Deposit ?
				break;
			case 5:
				Accoutnumberprint();
				// Do you want to Withdraw ?
				break;
			case 6:
				Accoutnumberprint();
				//Address details
				break;
			case 7:
				System.out.println("You have Exited Successfully!!");
				break;
			default:
				System.out.println("Invalid entry... Please try again!!!!");
				break;

			}
		}

	}

}
