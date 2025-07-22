package Javaprograms;
import java.util.Scanner;

public class Calculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter first number: ");
	        double num1 = input.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = input.nextDouble();

	        // Performing operations
	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        double quotient = 0;

	        // Check for division by zero
	        if (num2 != 0) {
	            quotient = num1 / num2;
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }

	        // Displaying results
	        System.out.println("\nResults:");
	        System.out.println("Addition: " + sum);
	        System.out.println("Subtraction: " + difference);
	        System.out.println("Multiplication: " + product);
	        if (num2 != 0) {
	            System.out.println("Division: " + quotient);
	        }

	        input.close();
	    }
	


}
