package bankDB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bankModel.Address;
import bankModel.accountdetails;

public class bankDB {

	public static List<accountdetails> Bankdetails() {

		List<accountdetails> accountDetails = new ArrayList<>();

		List<accountdetails> accountDetailsone = new ArrayList<>();

		accountDetails.add(new accountdetails("Hari prasath", "10000000001", "Saibaba colony", "IFSC01", 1000334.00,
				1000.00, new Address("TAMIL NADU", "COIMBATORE", 641025)));
		accountDetails.add(new accountdetails("Malar vizhi", "10000000002", "saravanampatty", "IFSC02", 5000000.00,
				1000.00, new Address("KERALA", "TRIPUR", 541021)));
		accountDetails.add(new accountdetails("Lalitha Thangaraj", "10000000003", "Edayarpalayam", "IFSC03", 1000000.00,
				6000.00, new Address("UP", "ERODE", 741028)));
		accountDetails.add(new accountdetails("Subra mani", "10000000007", "Ammankovil", "IFSC04", 10000056.00, 8000.00,
				new Address("AP", "SELAM", 241020)));
		accountDetails.add(new accountdetails("Neelavathi subramani", "100000000021", "Vinayagapuram", "IFSC05",
				10000087.00, 1000.00, new Address("MP", "NAMAKKAL", 541026)));
		accountDetails.add(new accountdetails("Manoj kumar", "100000000071", "Annur", "IFSC06", 800000.00, 1005.00,
				new Address("KARNATAKA", "COIMBATORE", 741020)));
		accountDetails.add(new accountdetails("Deepak kumar", "100000000091", "Puliampatti", "IFSC07", 100000.00,
				1001.00, new Address("TAMIL NADU", "ERODE", 641025)));
		accountDetails.add(new accountdetails("Ganesh kumar", "100000000016", "Ambothi", "IFSC08", 1100000.00, 3007.00,
				new Address("RAJASTHAN", "SELAM", 441028)));
		accountDetails.add(new accountdetails("Saran kumar", "100000000051", "Sevur", "IFSC09", 903000.00, 4009.00,
				new Address("PP", "GUDALORE", 541027)));
		accountDetails.add(new accountdetails("Priya dharshini", "100000000021", "Kaikaatti", " ", 100000.00, 8001.00,
				new Address("AUSTRALIA", "CHENNAI", 141020)));
		accountdetails acc = new accountdetails();
		acc.setAddress(new Address("AUSTRALIA", "CHENNAI", 141020));
		accountDetails.add(acc);

//		for (accountdetails Accountdetails : accountDetails) {			
//			System.out.println(Accountdetails.getAddress().getState());			
//			accountDetailsone.add(Accountdetails); //contains all elements									
//		}
//			return accountDetailsone; // Contains all the methods

		accountDetailsone = accountDetails.stream().collect(Collectors.toList());

		System.out.println(accountDetailsone);

		return accountDetailsone;

	}
}
