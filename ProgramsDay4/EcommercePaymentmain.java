package ProgramsDay4;

public class EcommercePaymentmain {
	public static void main(String[] args)
	{
		PaymentSystems ep = new DebitCardPayment(34000) ;
		ep.makePayment();
		
		
		System.out.println();
		
		PaymentSystems ep2 = new NetBankingPayment(55000) ;
		ep2.makePayment();		
		
		
	}


}
