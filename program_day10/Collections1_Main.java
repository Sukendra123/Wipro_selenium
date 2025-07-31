package program_day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections1_Main {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a =new ArrayList<>(Arrays.asList(4000,3000,5000,1000));
		a.add(6000);
		a.add(7000);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("sorted:"+a);
		int  b =Collections.binarySearch(a,5000);
		System.out.println("Index of 5000 in sorted list: "+b);
		Collections.reverse(a);
		System.out.println(a);
		
	}
}

