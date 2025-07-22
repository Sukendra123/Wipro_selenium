package Programs_Day3;

public class Bankaccmain {
	public static void main(String[] args) {
		Bank_account b = new Bank_account("suki",10000);
		b.deposit(2000);
		b.withdraw(500);
		b.displayDetails();
	}

}
