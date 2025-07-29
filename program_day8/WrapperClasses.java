package program_day8;

import java.util.ArrayList;

public class WrapperClasses {
	public static void main(String[] args) {
		int i =24;
		WrapperClasses wc = new WrapperClasses();
		//Integer i2 =new Integer(i);//boxing
		Integer i2 =Integer.valueOf(i); //boxing
		//Integer i2 =i;  //autoboxing
		System.out.println(i2);
		
		Integer i3 = Integer.valueOf(55);
		int ii =i3.intValue(); //unboxing
		//int ii =i3; //auto-unboxing
		System.out.println(ii);
		
		ArrayList<Integer> al =new ArrayList<>();
		al.add(34);//auto-boxing
		al.add(45);
		al.add(Integer.valueOf(56));
		
		int age = al.get(0);
		String s ="23";
		int age1 =Integer.parseInt(s);
		System.out.println(age1);
		
		}

}
