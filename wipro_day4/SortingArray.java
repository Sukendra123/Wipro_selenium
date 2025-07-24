package wipro_day4;



import java.util.Arrays;
import java.util.Scanner;

interface NameSorter {
    void sortAndDisplay();
}

class NameSortingApp implements NameSorter {
    public void sortAndDisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total count : ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the person " + (i + 1) + " name :");
            names[i] = sc.next();
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String str : names) {
            System.out.println(str);
        }
    }
}

public class SortingArray{
    public static void main(String[] args) {
        NameSorter sorter = new NameSortingApp();  // Polymorphism
        sorter.sortAndDisplay();
    }
}
