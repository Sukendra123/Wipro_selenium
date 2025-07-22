package Javaprograms;

public class LargestOfThree {
	public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c)
            System.out.println("Largest is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
}



