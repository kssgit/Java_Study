package Collection_Framework;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
	//map:(key, value) �ߺ� x, ���� x
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "123");
		map.put("name", "molly");
		map.put("address", "la");
		map.put("address", "paris"); // address���� ���� ��������. address : paris
		
		System.out.println(map);
		System.out.println(map.get("name")); //key ���� �̿��Ͽ� value�� ������
		
		Set<String> keys = map.keySet(); // map�ȿ� ����ִ� Ű���� setŸ������ ������ ��
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
