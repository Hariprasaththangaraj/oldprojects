package bankModel;

public class accountdetails {

	String accountName;
	String accountNumber;
	String branch;
	String IFSC;
	double accountBalance;
	double recentDeposit;
	Address address;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getRecentDeposit() {
		return recentDeposit;
	}

	public void setRecentDeposit(double recentDeposit) {
		this.recentDeposit = recentDeposit;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public accountdetails(String accountName, String accountNumber, String branch, String iFSC, double accountBalance,
			double recentDeposit, Address address) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.branch = branch;
		IFSC = iFSC;
		this.accountBalance = accountBalance;
		this.recentDeposit = recentDeposit;
		this.address = address;
	}

	public accountdetails() {

	}
	



	@Override
	public String toString() {
		return "accountdetails [accountName=" + accountName + ", accountNumber=" + accountNumber + ", branch=" + branch
				+ ", IFSC=" + IFSC + ", accountBalance=" + accountBalance + ", recentDeposit=" + recentDeposit
				+ ", address=" + address + "]";
	}

}
