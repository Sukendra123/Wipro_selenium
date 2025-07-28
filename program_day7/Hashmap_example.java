package program_day7;
import java.util.HashMap;

public class Hashmap_example {
	public static void main(String[] args) {
		HashMap<String, String> capitalcities = new HashMap<String, String>();
		capitalcities.put("England","London");
		capitalcities.put("Germany","berlin");
		capitalcities.put("india","delhi");
		capitalcities.put("norway","oslo");
		//Capitalcities.clear();
		
		//System.out.println(capitalcities.size());
		
		//keyset() -to get only keys
		//values() to get only values
		for(String i:capitalcities.keySet()) {
			System.out.println(i);
			
		}
		for(String i:capitalcities.values()) {
			System.out.println(i);
			
			
		//System.out.println(capitalcities);
	}
		for(String i:capitalcities.keySet()) {
			System.out.println("key: "+i+ "  values:"+capitalcities.get(i));
			
		}
	}
	}
