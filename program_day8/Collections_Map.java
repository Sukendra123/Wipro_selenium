package program_day8;

import java.util.HashMap;
import java.util.Map;
public class Collections_Map {
	public static void main(String[] args) {
		
		Map<String,Integer> mapData=new HashMap<String,Integer>();
		mapData.put("A",68);
		mapData.put("B",69);
		mapData.put("C",65);
		mapData.put("D",66);
		System.out.println(mapData.keySet());
		System.out.println(mapData.values());
		for(String key:mapData.keySet()) {
			System.out.println(key+":"+mapData.get(key));
		}
		
	}
}

