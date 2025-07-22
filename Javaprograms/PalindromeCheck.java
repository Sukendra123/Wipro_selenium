package Javaprograms;
import java.util.Scanner;

public class PalindromeCheck {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String original = sc.nextLine();

	        // Convert original string to StringBuilder and reverse it
	        StringBuilder sb = new StringBuilder(original);
	        String reversed = sb.reverse().toString();

	        // Compare original and reversed strings (ignore case if needed)
	        if (original.equals(reversed)) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	    }

}
