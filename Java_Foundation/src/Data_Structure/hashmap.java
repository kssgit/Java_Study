package Data_Structure;

import java.util.HashMap;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "123");
		map.put("name", "molly");
		map.put("address", "la");
		map.put("address", "paris"); 
		
		System.out.println(map);
		System.out.println(map.get("name")); 
		
		Set<String> keys = map.keySet(); 
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
