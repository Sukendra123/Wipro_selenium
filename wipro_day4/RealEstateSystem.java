package wipro_day4;
import java.util.Scanner;
//Abstract class for RentCalculator
abstract class RentCalculator {
abstract void tax(double rent);
}
class Apartment extends RentCalculator {
@Override
void tax(double r1) {
    double t = 10 * r1 / 100;
    double r2 = t + r1;
    System.out.println("Tax for Apartment (10% of " + r1 + "): " + t);
    System.out.println("Final Apartment Rent: " + r2);
}
}
class House extends RentCalculator {
@Override
void tax(double r1) {
    double t = 20 * r1 / 100;
    double r2 = t + r1;
    System.out.println("Tax for House (20% of " + r1 + "): " + t);
    System.out.println("Final House Rent: " + r2);
}
}

public class RealEstateSystem {
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter your category (Apartment/House): ");
	       String category = sc.next();
	       System.out.print("Enter base rent amount: ");
	       double rent = sc.nextDouble();
	       RentCalculator rc;
	       if (category.equalsIgnoreCase("Apartment")) {
	           rc = new Apartment();	
	       } else if (category.equalsIgnoreCase("House")) {
	           rc = new House();
	       } else {
	           System.out.println("Invalid category entered.");
	           sc.close();
	           return;
	       }
	       rc.tax(rent);
	       sc.close();
	   }
}
