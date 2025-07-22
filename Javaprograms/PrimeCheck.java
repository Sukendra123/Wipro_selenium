package Javaprograms;
import java.util.Scanner;
public class PrimeCheck {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = sc.nextInt();
	        boolean isPrime = n > 1;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        System.out.println(n + (isPrime ? " is prime." : " is not prime."));
	    }
	


}
