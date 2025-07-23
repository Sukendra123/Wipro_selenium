package ProgramsDay4;


interface InterfaceEcommerce
{
	void makePayment() ;
	
}
abstract class PaymentSystems implements InterfaceEcommerce
{
	double amount ;
	
	PaymentSystems(double amount)
	{
		this.amount = amount ;
	}
	
	void showSuccessMessage()
	{
		System.out.println("Payment is SuccessFull "+amount);
	}
}
class DebitCardPayment extends PaymentSystems
{
	DebitCardPayment(double amount)
	{
		super(amount) ;
	}
	
	public void makePayment()
	{
		System.out.println("Debit Card Payment is Done...");
		showSuccessMessage();
	}
}
class NetBankingPayment extends PaymentSystems
{
	 NetBankingPayment(double amount)
	 {
		super(amount) ;
	}
	
	 public void makePayment()
	{
		System.out.println("Net Banking Payment is Done...");
		showSuccessMessage();
	}
}

