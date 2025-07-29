package program_day8;


import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Collections_List {

	public static void main(String[] args) {
		
		List<Integer> data=new ArrayList<Integer>();
		data.add(10);
		data.add(11);
		data.add(12);
		data.add(13);
		System.out.println(data.get(3));
		System.out.println(data.indexOf(13));
		
		//data.add("50");
		/*for(int i=0;i<data.size();i++) {
			System.out.print(data.get(i)+" ");
		}*/
		for(Object i:data) {
			
			int data1=(Integer) i;
			System.out.println(data1);
		}
		
	}

}

