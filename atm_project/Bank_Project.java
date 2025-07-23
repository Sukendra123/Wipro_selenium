package atm_project;

public class Bank_Project {
	
		 public static void main(String[] args) {
		     // Creating an object (account)
		     BankAccount acc = new BankAccount("Sukendra Reddy", 1000);

		     acc.deposit(200);      // Deposit money
		     acc.withdraw(150);     // Withdraw money
		     acc.showDetails();     // Show account details
		     }
		}


