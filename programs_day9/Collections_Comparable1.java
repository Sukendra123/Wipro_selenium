package programs_day9;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Collections_Comparable1 {
	
	
	public static void main(String[] args) {
		Comparator<Integer> c1 = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i > j) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		
		
		
		List<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(40);
		marks.add(38);
		marks.add(70);
		marks.add(50);
		System.out.println("Before sorting=" +marks);
		
		Collections.sort(marks, c1);
		System.out.println("After sorting= " +marks);
		
		
		
	}
}

