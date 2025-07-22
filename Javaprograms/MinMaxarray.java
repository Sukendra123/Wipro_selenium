package Javaprograms;

public class MinMaxarray {
	 public static void main(String[] args) {
	        int[] arr = {25, 12, 48, 5, 60};

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) max = arr[i];
	            if (arr[i] < min) min = arr[i];
	        }

	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	    }
	}



