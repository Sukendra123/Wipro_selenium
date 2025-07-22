package Javaprograms;

public class Array_problems {
	public static void main(String[] args) {
		int[] arr = {5,6,15,20};
		int sum =0;
		for(int value : arr) {
			sum+=value;
		}
		System.out.println("Sum= " + sum);
		int[] arra = {25, 12, 48, 5, 60};

        int max = arra[0];
        int min = arra[0];

        for (int i = 1; i < arra.length; i++) {
            if (arra[i] > max) max = arra[i];
            if (arra[i] < min) min = arra[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
	}

}
