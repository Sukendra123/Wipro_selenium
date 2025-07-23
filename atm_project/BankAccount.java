package atm_project;

public class BankAccount {
	private String name;
	 private double balance;

	 // Constructor
	 public BankAccount(String name, double balance) {
	     this.name = name;
	     this.balance = balance;
	 }

	 // Deposit method
	 public void deposit(double amount) {
	     balance += amount;
	     System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
	 }

	 // Withdraw method
	 public void withdraw(double amount) {
	     if (amount > balance) {
	         System.out.println("Insufficient balance!");
	     } else {
	         balance -= amount;
	         System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
	     }
	 }

	 // Show account details
	 public void showDetails() {
	     System.out.println("\n--- Account Summary ---");
	     System.out.println("Account Holder: " + name);
	     System.out.println("Current Balance: ₹" + balance);
	 }
	}


