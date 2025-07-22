package Javaprograms;
import java.util.Scanner;

public class Factorial_number {
	
	
	    static int fact(int n) {
	    	//(n <= 1) ? 1 means: if n is 0 or 1, return 1.
	        return (n <= 1) ? 1 : n * fact(n - 1);
	        //n * fact(n - 1) means: multiply n with the factorial of n-1 (calls itself again).
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();
	        System.out.println("Factorial: " + fact(num));
	    }
	




}
