package programs_day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Collection_Comparable implements Comparable<Collection_Comparable>{
	private String name;
	private int age;
	public Collection_Comparable(String n, int a) {
		this.name=n;
		this.age=a;
	}
	public int compareTo(Collection_Comparable other) {
		return this.age-other.age;
		
	}
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		List<Collection_Comparable> a = Arrays.asList(new Collection_Comparable("Prabal",24),
				new Collection_Comparable("Sai",25));
		Collections.sort(a);
		System.out.println(a);
	}
}

