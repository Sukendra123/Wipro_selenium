package programs_day5;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {
	public static void main(String[] args) {
		ArrayList<String> fruits = new  ArrayList<String>();
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("dragon");
		fruits.add("suki");
		
		Collections.sort(fruits);
		System.out.println(fruits.size());
		/*for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}*/
		//for each statement
		for(String i:fruits) {
			System.out.println(i);
		}
		
		ArrayList<Integer> marks = new  ArrayList<Integer>();
		marks.add(78);
		marks.add(89);
		marks.add(99);
		marks.add(56);
		marks.add(34);
		
		
		Collections.sort(marks);
		for(Integer i:marks) {
			System.out.println(i);
		}
		
		
		//System.out.println(fruits.get(1));
	/*	fruits.set(0, "grapes");
		System.out.println(fruits);
		
		fruits.remove(0);
		System.out.println(fruits);
		//fruits.clear();*/
		
		
	}

}
