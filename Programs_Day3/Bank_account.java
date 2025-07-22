package Programs_Day3;

public class Bank_account {
	private String AccHolderName;
	private double balance;
	public Bank_account(String AccHoldername, double balance) {
		this.AccHolderName = AccHolderName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("New Balance :" +balance);
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("in sufficient balance ");
		}else {
			balance =balance - amount;
			System.out.println("Withdraw remaining balance :" +balance);
		}
	}
	public void displayDetails() {
		System.out.println("Account Holder Name :" +AccHolderName);
		System.out.println("Current Balance :" +balance);
	}

}
