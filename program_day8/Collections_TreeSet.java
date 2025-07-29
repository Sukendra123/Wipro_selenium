package program_day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Collections_TreeSet {
	public static void main(String[] args) {
		Set<Integer> setData=new TreeSet<Integer>();
		setData.add(10);
		//setData.add("hello");
		setData.add(10);
		setData.add(98);
		//setData.add("hello");
		setData.add(16);
		System.out.println(setData);
		Iterator<Integer> iterator=setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

