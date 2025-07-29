package program_day8;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
		List<Integer> data =new ArrayList();
		//Collection data =new ArrayList();
		data.add(10);
		data.add(13);
		data.add(15);
		data.add(16);
		data.add(11);
		for(Object i:data) {
			//int data1 =(Integer) i;//autoboxing
			System.out.println(i);
			
		}
	}

}
