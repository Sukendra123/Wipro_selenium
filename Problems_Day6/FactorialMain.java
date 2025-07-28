package Problems_Day6;





//Custom exception for invalid input
class InvalidValueException extends Exception {
 public InvalidValueException(String message) {
     super(message);
 }
}

public class FactorialMain {

 // Method to calculate factorial
 public static int calculateFactorial(int number) throws InvalidValueException {
     if (number < 0) {
         throw new InvalidValueException("Factorial is not defined for negative numbers.");
     }

     int result = 1;
     for (int i = 2; i <= number; i++) {
         result *= i;
     }

     return result;
 }

 public static void main(String[] args) {
     int number = 5; // You can change this number to test

     try {
         int factorial = calculateFactorial(number);
         System.out.println("Factorial of " + number + " is " + factorial);
     } catch (InvalidValueException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

