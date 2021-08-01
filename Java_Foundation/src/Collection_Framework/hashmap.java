package Collection_Framework;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
	//map:(key, value) 중복 x, 순서 x
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "123");
		map.put("name", "molly");
		map.put("address", "la");
		map.put("address", "paris"); // address값이 덮어 씌워진다. address : paris
		
		System.out.println(map);
		System.out.println(map.get("name")); //key 값을 이용하여 value를 꺼낸다
		
		Set<String> keys = map.keySet(); // map안에 들어있는 키들을 set타입으로 리턴해 줌
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
