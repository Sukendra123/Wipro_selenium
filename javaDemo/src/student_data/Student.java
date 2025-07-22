
package student_data;
import java.util.Scanner;

public class Student {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the name");
        char n = sc.next().charAt(0);
        System.out.println("Enter the age");
        int a = sc.nextInt();
        System.out.println("Enter the degree");
        char b = sc.next().charAt(0);
        System.out.println("Enter the stream");
        char c = sc.next().charAt(0);
        System.out.println("Enter the year of passsout");
        int v = sc.nextInt();
	}

}
